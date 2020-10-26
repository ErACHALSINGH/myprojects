import java.util.Queue;
import java.util.LinkedList;
public class HelloWorld {

	public static void main(String[] args) {
		Queue<String> q = new LinkedList<String>();
		q.add("Raju");
		q.add("Shyam");
		q.add("Babu Bhaiya");
		q.add("Anuradha");
		q.add("Kachra Seth");
		q.add("Nanji Bhai");
		q.add("Munna Bhai");
		System.out.println("Elements in queue:"+q);
		System.out.println("Removed Elements :"+q.remove());
		System.out.println("Head:"+q.element());
		System.out.println("poll():"+q.poll());
		System.out.println("peek():"+q.peek());
		System.out.println("Elements in queue:"+q);
	}

}
