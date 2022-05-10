package md2.stack_queue.queue_node;

public class MyLinkedListQeue {
    private Node head;
    private Node Tail;
    //phương thức khởi tạo
    public MyLinkedListQeue() {
        this.head = null;
        this.Tail = null;
    }
    //phương thức thêm enqueue
    public void enqueue(int key) {
        Node temp = new Node(key);
        if (this.Tail==null){
            this.head = this.Tail = temp;
            return;
        }
        this.Tail.next = temp;
        this.Tail = temp;
    }
    // phương thức xoá dequeue
    public Node dequeue(){
        if (this.head==null)
            return null;
        Node temp = this.head;
        this.head = this.head.next;
        if (this.head == null)
            this.Tail = null;
        return temp;
    }
}
