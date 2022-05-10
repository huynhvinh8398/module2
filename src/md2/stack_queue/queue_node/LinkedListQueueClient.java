package md2.stack_queue.queue_node;

public class LinkedListQueueClient {
    public static void main(String[] args) {
        MyLinkedListQeue qeue = new MyLinkedListQeue();
        qeue.enqueue(10);
        qeue.enqueue(20);
        qeue.dequeue();
        qeue.dequeue();
        qeue.enqueue(30);
        qeue.enqueue(40);
        qeue.enqueue(50);
        System.out.println("dequeued item is" + qeue.dequeue().key);
    }
}
