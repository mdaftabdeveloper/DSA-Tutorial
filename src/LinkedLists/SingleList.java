package LinkedLists;

import java.util.Scanner;

@SuppressWarnings("unused")
class SingleList {
    Scanner sc = new Scanner(System.in);
    private Node head;

    class Node {
        Node next;
        String data;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // method to insert a node a begining
    private void insertAtFirst(String data) {
        Node tempNode = new Node(data);
        if (head == null) {
            head = tempNode;
            head.next = null;
        } else {
            tempNode.next = head;
            head = tempNode;
        }
    }

    // method to insert a node at last
    private void insertAtLast(String data) {
        Node tempNode = new Node(data);
        if (head == null) {
            head = tempNode;
            head.next = null;
        } else {
            Node currNode = head;
            while (currNode.next != null) {
                currNode = currNode.next;
            }
            currNode.next = tempNode;
        }
    }

    // method to print all the nodes
    private void printList() {
        if (head == null) {
            System.out.println("List is empty..");
            return;
        }
        Node tempNode = head;
        while (tempNode != null) {
            System.out.print(tempNode.data + "-> ");
            tempNode = tempNode.next;
        }
        System.out.print("NULL");

    }

    // method to delete first node of the list
    // @SuppressWarnings("unused")
    private void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty..");
        } else {
            head = head.next;
        }
    }

    // method to delete last node of the list
    private void deleteLast() {
        Node itr = new Node(null);
        if (head == null) {
            System.out.println("List is empty..");
        } else {
            itr = head;
            while (itr.next.next != null) {
                itr = itr.next;
            }
            itr.next = null;

        }
    }

    private int countNodes() {
        int count = 0;
        Node itr;
        itr = head;
        while (itr != null) {
            count++;
            itr = itr.next;
        }
        return count;
    }

    // method to insert node at any position
    private void insertAtPosition(String data) {
        Node newNode = new Node(data);
        Node itr; // = new Node(null);
        int count = 0;
        System.out.println("\nEnter the position: ");
        int position = sc.nextInt();

        // incase no list exits
        if (head == null) {
            head = newNode;
            head.next = null;
        }
        itr = head;
        // count the number of notes
        while (itr != null) {
            count++;
            itr = itr.next;
        }

        // handle the exception for invalid position
        if (position < 1 || position > count + 1) {
            System.out.println("Invalid postion..");
        }
        itr = head;
        if (position == 1) {
            newNode.next = head;
            head = newNode;
        } else {
            for (int i = 1; i < position - 1; i++) {
                itr = itr.next;
            }
            newNode.next = itr.next;
            itr.next = newNode;
        }
    }

    // method to delete node of any postion
    private void deleteAtPosition(int position) {
        Node itr;
        if (head == null) {
            System.out.println("No list exists.");
        } else {
            itr = head;
            int count = countNodes();
            if (position <= 0 || position > count + 1) {
                System.out.println("Enter a valid position");
            } else if (position == 1) {
                head = head.next;
            } else {
                for (int i = 1; i < position - 1; i++) {
                    itr = itr.next;
                }
                itr.next = itr.next.next;
            }
        }
    }

    //method to reverse the list
    void reverseList() {
        Node previous = null;
        Node next = null;
        Node current = head;
        while(current!=null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
    }
    public static void main(String[] args) {
        SingleList list = new SingleList();
        list.insertAtFirst("Aftab");
        list.insertAtLast("Danish");
        list.insertAtLast("Nafis");
        list.insertAtLast("Khajamu");
        list.printList();
        // list.deleteFirst();
        // list.deleteLast();
        // list.insertAtPosition("Tathagat");
        // list.insertAtFirst("Suhel");
        // list.deleteAtPosition(2);
        list.reverseList();
        System.out.println("\n");
        list.printList();
        int count = list.countNodes();
        System.out.println("\nCount = " + count);

    }
}
