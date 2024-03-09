package FirstPackage;
import java.util.*;


//Java program to implement 
//a Singly Linked List 
public class LinkedList { 
	
	Node head; // head of list 
	Node tail;
	// Linked list Node. 
	// This inner class is made static 
	// so that main() can access it 
	static class Node { 
		int iter;
		Book data;
		Node next; 
		
		// Constructor 
		Node(Book d) 
		{ 
			iter = 0;
			data = d; 
			next = null; 
		} 
	}
	
	// Method to insert a new node
	public static LinkedList insert(LinkedList list, Book data) 
	{
		// Create a new node with given data 
		Node new_node = new Node(data); 
		

		// If the Linked List is empty, 
		// then make the new node as head 
		if (list.head == null) { 
			list.head = new_node;
		} 
		else { 
			// Else traverse till the last node 
			// and insert the new_node there 
			Node last = list.head;
			int i0 = 0;
			while (last.next != null) { 
				last = last.next;
				i0++;
			} 
			
			// Insert the new_node at last node 
			last.iter = i0;
			last.next = new_node;
			list.tail = new_node;
		} 

		// Return the list by head 
		return list; 
	} 
	
	public static LinkedList delete(LinkedList list, int delIter) {
        // Check if list is empty
        if (list.head == null) {
            return null;
        }

        // Traverse and find the node to delete
        Node prev = null;
        Node curr = list.head;
        while (curr != null && curr.iter < delIter) {
            prev = curr;
            curr = curr.next;
        }

        // If node not found, return the list
        if (curr == null) {
            return list;
        }

        // If deleting head node
        if (prev == null) {
            list.head = curr.next;
        } else {
            // Delete the node by skipping it
            prev.next = curr.next;
        }

        // Return the modified list
        return list;
    }
	// Method to print the LinkedList. 
	public static void printList(LinkedList list) 
	{ 
		Node currNode = list.head; 
	
		System.out.print("LinkedList: "); 
	
		// Traverse through the LinkedList 
		while (currNode != null) {
			// Print the data at current node 
			System.out.print(currNode.data.printBook() + " "); 
			
			// Go to next node 
			currNode = currNode.next; 
		}
	}
	
	// Driver code 
	public static void main(String[] args) 
	{ 
		/* Start with the empty list. */
		LinkedList list = new LinkedList(); 

		// 
		// ******INSERTION****** 
		// 

		// Insert the values 
		String[] names = {"Romeo and Juliet", "Crime and punishment", "Harry potter and the phylospher's stone"};
		Random rand = new Random();
		for(int i=0;i<5;i++) {
			Book rand_book = new Book(200+rand.nextInt(200), names[rand.nextInt(3)], "Yellow");
			list = insert(list, rand_book);
		}
		
		
		
		printList(list);
		System.out.println();
		System.out.println(list.tail.data);
		}
}

