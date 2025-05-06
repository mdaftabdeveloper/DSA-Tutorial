package LinkedLists;

@SuppressWarnings("unused")
public class DoubleList {
    private Node head;

    class Node {
        Node next;
        Node prev;
        String data;

        Node(String data) {
            this.data = data;
            Node next = null;
            Node prev = null;
        }
    }

    // method to display list
    void displayList() {
        if (head == null) {
            System.out.println("List is empty..");
            return;
        }
        Node itr = head;
        while (itr != null) {
            System.out.print(itr.data + " <-> ");
            itr = itr.next;
        }
        System.out.print("NULL");
    }

    // method to count the number of nodes
    private int countNode() {
        int count = 0;
        Node itr = head;
        while (itr != null) {
            count++;
            itr = itr.next;
        }
        return count;
    }

    // method to insert a node at the begining
    private void insertAtFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = null;
            head.prev = null;
        } else {
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
            head.prev = null;
        }

    }

    // method to insert a node at the last
    private void insertAtLast(String data) {
        Node itr = head;
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = null;
            head.prev = null;
        } else {
            while (itr.next != null) {
                itr = itr.next;
            }
            itr.next = newNode;
            newNode.prev = itr;
            newNode.next = null;
        }
    }

    // method to insert a node at a given position
    private void insertAtPosition(String data, int position) {
        Node newNode = new Node(data);
        // handle the exception of position
        int count = countNode();
        if (position <= 0 || position > count + 1) {
            System.out.println("Invalid position..");
        }
        // handle the special case for postion == 1
        else if (position == 1) {
            insertAtFirst(data);
        }
        // handle the special case where position == count + 1
        else if (position == count + 1) {
            insertAtLast(data);
        } else {
            Node itr = head;
            for (int i = 1; i <= position - 1 - 1; i++) {
                itr = itr.next;
            }
            newNode.next = itr.next;
            newNode.prev = itr;
            itr.next = newNode;
            newNode.next.prev = newNode;
        }
    }

    // method to delete first node
    private void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty..");
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    // method to delete last node
    private void deleteLast() {
        if (head == null) {
            System.out.println("List is empty..");
        } else if (head.next == null) {
            head = null;
        } else {
            Node itr = head;
            while (itr.next != null) {
                itr = itr.next;
            }
            itr.prev.next = null;
        }
    }

    // method to delete the node of a given position
    private void deleteAtPosition(int position) {
        if (position <= 1 || position > countNode() + 1) {
            System.out.println("Enter a valid position");
            return;
        }
        if (head == null) {
            System.out.println("No list exist..");
            return;
        }
        // handle the special case if position == 1
        if (position == 1) {
            deleteFirst();
            return;
        }
        if (position == countNode()) {
            deleteLast();
            return;
        }
        Node itr = head;
        for (int i = 1; i < position - 1; i++) {
            
        }
    }

    public static void main(String[] args) {
        DoubleList list = new DoubleList();
        list.insertAtFirst("Aftab");
        list.insertAtFirst("Suhel");
        list.insertAtFirst("Nafis");
        list.insertAtFirst("Khajamu");
        list.insertAtFirst("Dadan");
        list.insertAtLast("Tathagat");
        list.insertAtLast("Nadim");
        list.insertAtLast("Danish");
        list.insertAtPosition("Naddy", 8);

        System.out.println("Before deletion");
        System.out.println("---------------------------------------------------------");
        list.displayList();
        // list.deleteFirst();
        // list.deleteLast();
        list.deleteAtPosition(4);
        System.out.println();
        System.out.println("After deletion");
        System.out.println("---------------------------------------------------------");
        list.displayList();
    }

}
