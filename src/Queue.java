public class Queue {

    private int arr[];
    private int front;
    private int rear;
    private int capacity;
    private int count;

    public Queue(int size) {
        arr = new int[size];
        capacity = size;
        front = 0;
        rear = -1;
        count = 0;
    }

    public int peek() {
        if(isEmpty()) {
            System.out.println("empty");
            System.exit(1);
        }
        return arr[front];
    }

    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("full");
            System.exit(1);
        }
        System.out.println(item);

        rear = (rear + 1) % capacity;
        arr[rear] = item;
        count++;
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("empty");
            System.exit(1);
        }
        System.out.println(arr[front]);
        front = (front + 1) % capacity;
        count--;
    }

    public void writeQueue() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public int size() {
        return count;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean isFull() {
        return size() == capacity;
    }
}
