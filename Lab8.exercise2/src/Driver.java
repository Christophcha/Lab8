
public class Driver {

	public static void main(String[] args) {

		LinkedQueue object2 = new LinkedQueue();

		// LinkedQueue
		object2.enqueue(1);
		object2.enqueue(7);
		object2.enqueue(3);
		object2.enqueue(4);
		object2.enqueue(9);
		object2.enqueue(2);

		System.out.println("Queued " + object2.size() + " ints to LinkedStack");
		System.out.println(object2);

		object2.removeMiddle(); // removes middle

		System.out.println("After removing the middle element, we're left with: " + object2);

	}

}
/* 
 	THIS IS THE METHOD I USED IN LinkedQueue to remove the middle element
  
 	public void removeMiddle() {

	LinkedNode current = front;

	int middle = size() / 2-1;

	for (int i = 0; i < middle-1; i++) {
		current = current.next;
	}
	current.next = current.next.next;
	}
	Time complexity is O(n)
*/

