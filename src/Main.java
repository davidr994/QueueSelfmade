import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        Queue q1 = new Queue(size);

        q1.enqueue(34);
        q1.enqueue(12);

        q1.writeQueue();


    }

}
