package examLab;

public class MyLinkedList {
	/** Pointers to the first MyNodes in this linked list */
	private MyNode head;

	public MyLinkedList() {
		// the following code builds the list.

		this.head = new MyNode("donut");
		MyNode temp1 = new MyNode("pie");
		MyNode temp2 = new MyNode("iceCream");
		MyNode temp3 = new MyNode("iceCream");
		MyNode temp4 = new MyNode("pair");
		MyNode temp5 = new MyNode("donut");
		temp1.setPrev(head);
		temp2.setPrev(temp1);
		temp3.setPrev(temp2);
		temp4.setPrev(temp3);
		temp5.setPrev(temp4);
		head.setNext(temp1);
		temp1.setNext(temp2);
		temp2.setNext(temp3);
		temp3.setNext(temp4);
		temp4.setNext(temp5);
	}

	/**
	 * A function to duplicate all elements at an index divisible by the
	 * parameter num. In other words, if a node is at an index that is
	 * divisible by num, then it should appear twice in a row in the
	 * linked list. If num is 0 or 1, simply duplicate the element at
	 * that index (i.e., at index 0 or 1); do not duplicate any other
	 * elements. Throw an IndexOutOfBoundsException if num does not
	 * match an index in the linked list.
	 *
	 * NOTE: The code must work for all list inputs-- not just the list
	 * I am testing it with.
	 * 
	 * Examples: See JUnits
	 *
	 */
	public void duplicateAll(int num) {
		// TODO: Complete this method to make the JUnits pass
	}


	/**
	 * A method to create a String representation of this linked
	 * list.  DO NOT MODIFY THIS METHOD!
	 *
	 * @return String that is the String representation of this
	 * 		linked list
	 */
	@Override
	public String toString() {

		// Show the linked list forward
		String string = "Forward: ";
		MyNode currentNode = this.head;
		while (currentNode != null) {
			string += currentNode.getElement()  + " ";
			currentNode = currentNode.getNext();
		}

		currentNode = this.head;
		while (currentNode != null && currentNode.getNext() != null) {
			currentNode = currentNode.getNext();
		}


		// Show the linked list backward
		string += "\nBackward: ";
		while (currentNode != null) {
			string += currentNode.getElement() + " ";
			currentNode = currentNode.getPrev();
		}
		// Return the String representation that shows the linked list
		// both forward and backward
		return string;
	}
}