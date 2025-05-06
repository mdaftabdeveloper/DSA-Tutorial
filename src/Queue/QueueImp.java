package Queue;

import java.util.LinkedList;
import java.util.Queue;

class MyQueue {

}

public class QueueImp {
    public void show() {
        Queue q = new LinkedList<>();
        q.offer(43);
        q.offer(65);
        q.offer(12);
        q.offer(87);
        System.out.println(q);
    }

    public static void main(String[] args) {
        QueueImp i = new QueueImp();
        i.show();
    }
}
