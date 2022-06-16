import src.main.java.Counter;

public class Driver {

	public static void main(String[] args) {
		
		Counter counter = new Counter();
		
		System.out.println("Current count:" + counter.getCount());
		
		counter.increaseBy(4);
		
		System.out.println("Current count:" + counter.getCount());
		
		counter.decreaseBy(6);
		
		System.out.println("Current count:" + counter.getCount());
		
		counter.multipleBy(8);
	}

}
