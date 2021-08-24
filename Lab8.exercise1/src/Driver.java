
public class Driver {

	public static void main(String[] args) {
		ArrayQ object1 = new ArrayQ();
		LinkedQueue object2 = new LinkedQueue();
		
		//ArrayQ
		object1.enqueue(1);
		object1.enqueue(7);
		object1.enqueue(3);
		object1.enqueue(4);
		object1.enqueue(9);
		object1.enqueue(2);
	
		System.out.println("Queued " + object1.size() + " ints to ArrayQ");
		
		System.out.println("First dequeue:  " + object1.dequeue());
		System.out.println("Second dequeue: " + object1.dequeue());
		System.out.println("Third dequeue:  " + object1.dequeue());
		System.out.println("Fourth dequeue: " + object1.dequeue());
		System.out.println("Fifth dequeue:  " + object1.dequeue());
		System.out.println("Sixth dequeue:  " + object1.dequeue());
		System.out.println("");
		
		//LinkedQueue
		object2.enqueue(1);
		object2.enqueue(7);
		object2.enqueue(3);
		object2.enqueue(4);
		object2.enqueue(9);
		object2.enqueue(2);
	
		System.out.println("Queued " + object2.size() + " ints to LinkedStack");
		
		System.out.println("First dequeue:  " + object2.dequeue());
		System.out.println("Second dequeue: " + object2.dequeue());
		System.out.println("Third dequeue:  " + object2.dequeue());
		System.out.println("Fourth dequeue: " + object2.dequeue());
		System.out.println("Fifth dequeue:  " + object2.dequeue());
		System.out.println("Sixth dequeue:  " + object2.dequeue());
		
		
	}

}

	


