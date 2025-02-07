class LL {
    Node head;
    private int size;

    LL() {
        this.size = 0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // add - first, last
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // add Last
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }
    // print

    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }

    // delete first
    public void deleteFirst() {
        if (head == null) {// corner case
            System.out.println("This list is empty");
            return;
        }
        size--;
        head = head.next;
    }

    // delete last
    public void deleteLast() {
        if (head == null) {// corner case
            System.out.println("This list is empty");
            return;
        }
        size--;
        if (head.next == null) {// corner case
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next; // head.next = null || lastNode = null
        while (lastNode.next != null) { // null.next = error
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    public int getSize() {
        return size;
    }
    public void reverseIterate(){
        if(head == null || head.next == null){
            return ;
        }
        Node prevNode = head;
        Node currNode = head.next;

        while(currNode!=null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    public static void main(String args[]) {
       /*  LL list = new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("this");
        list.addLast("list");

        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();

        System.out.println(list.getSize());*/ 

        LL list = new LL();
        list.addLast("a");
        list.addLast("b");
        list.addLast("c");
        list.addLast("d");
        list.printList();

        list.reverseIterate();
        list.printList();
    }
}

/* 
//---Collection Framework
import java.util.*;

class LL {
    public static void main(String args[]) {
        LinkedList<String> list = new LinkedList<>();

        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("this");

        list.add("list");// addLast
        System.out.println(list);

        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println("null");
        

        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);

        list.remove(1);
        System.out.println(list);
    }
}*/