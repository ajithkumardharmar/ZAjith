package zohopractice;

class NodeList2{
	int data;
	NodeList2 next;
	
	NodeList2(int data){
		this.data =data;
		this.next =null;
	}
}

public class LinkedListCycle {
	public static void main(String[] args) {
		System.out.println(" is Linked list cycle : "+findLinkedListCycle());
	}
	public static boolean findLinkedListCycle() {
		NodeList2 head = new NodeList2(1);
		head.next = new NodeList2(3);
		head.next.next = new NodeList2(6);
		head.next.next.next = new NodeList2 (5);
		head.next.next.next.next = new NodeList2 (7);
		head.next.next.next.next.next = head.next;
		NodeList2 fast = head;
		NodeList2 slow = head;
		while(fast!=null && fast.next!=null) {
			fast = fast.next.next;
			slow = slow.next;
			if(slow==fast) {
				return true;
			}
		}
		return false;
	}
}
