package zohopractice;

class Node{
	int data;
	Node next;
	Node(int data){
		this.data = data;
		this.next = null;
	}
}
public class MiddleOfLinkedList{
	public static void main(String[] args){
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		
		Node middle = getMiddleNode(head);
		System.out.println("middle element : "+ middle.data);
		
	}
	
	public static Node getMiddleNode(Node head) {
		Node fast = head;
		Node slow = head;
		
		while(fast!=null && fast.next!=null){
			slow = slow.next;
			fast = fast.next.next;
			System.out.println(slow.data+" "+fast.data );
		}
		return slow;
	}
	
}