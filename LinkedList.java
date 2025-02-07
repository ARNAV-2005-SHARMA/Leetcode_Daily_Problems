//-1).Reverse Linked List by using collection method(Collection Framework)
//--without using extra space
/* 
import java.util.*;
public class ReverseLL {
    public static void main(String args[]){
        LinkedList<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        
        Collections.reverse(list);
        System.out.println(list);
        System.out.println(list.get(2));
    }
}*/



// Java program for reversing the linked list
/* 
class LinkedList {

	static ListNode head;

	static class ListNode {

		int data;
		ListNode next;

		ListNode(int d)
		{
			data = d;
			next = null;
		}
	}

	// Function to reverse the linked list //
	ListNode reverse(ListNode head)
	{
		ListNode prev = null;
		ListNode current = head;
		while (current != null) {
			ListNode next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
		return head;
	}

	// prints content of Linked List
	void printList(ListNode head)
	{
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}

	// Driver Code
	public static void main(String[] args)
	{
		LinkedList list = new LinkedList();
		list.head = new ListNode(85);
		list.head.next = new ListNode(15);
		list.head.next.next = new ListNode(4);
		list.head.next.next.next = new ListNode(20);

		System.out.println("Given linked list");
		list.printList(head);

		head = list.reverse(head);
		System.out.println("");
		System.out.println("Reversed linked list ");
		list.printList(head);
	}
}*/

/*
public class Main {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }*/


//--2).Java Ptogram to Detect loop in the Linked List

class LinkedList {

  // create an object of Node class
  // represent the head of the linked list
  Node head;

  // static inner class
  static class Node {
    int value;

    // connect each node to next node
    Node next;

    Node(int d) {
      value = d;
      next = null;
    }
  }

  // check if loop is present
  public boolean checkLoop() {

    // create two references at start of LinkedList
    Node first = head;
    Node second = head;

    while(first != null && first.next !=null) {

      // move first reference by 2 nodes
      first = first.next.next;

      // move second reference by 1 node
      second = second.next;

      // if two references meet
      // then there is a loop
      if(first == second) {
        return true;
      }
    }

    return false;
  }

  public static void main(String[] args) {

    // create an object of LinkedList
    LinkedList linkedList = new LinkedList();

    // assign values to each linked list node
    linkedList.head = new Node(1);
    Node second = new Node(2);
    Node third = new Node(3);
    Node fourth = new Node(4);

    // connect each node of linked list to next node
    linkedList.head.next = second;
    second.next = third;
    third.next = fourth;

    // make loop in LinkedList
    fourth.next = second;
	

    // printing node-value
    System.out.print("Linked List : ");
    int i = 1;
    while (i <= 4) {
      System.out.print(linkedList.head.value + " ");
      linkedList.head = linkedList.head.next;
      i++;
    }

    // call method to check loop
    boolean Loop = linkedList.checkLoop();
    if(Loop) {
		System.out.println();
        System.out.println("There is a loop in Linked List.");
    }
    else {
      System.out.println("\nThere is no loop in Linked List.");
    }
  }
}


