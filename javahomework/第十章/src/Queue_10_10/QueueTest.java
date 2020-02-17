package Queue_10_10;

public class QueueTest {
	public static void main(String[] args) {
		Queue q = new Queue();
		for(int i = 1; i <= 20; ++i) {
			q.enqueue(i);
		}
		for(int i = 0; i < 20; ++i) {
			System.out.print(q.dequeue() + "  ");
		}
		System.out.println();
	}
}
