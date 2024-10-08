package zohopractice;


class NodeList3{
	int data;
	NodeList3 next;
	NodeList3(int data){
		this.data=data;
		this.next=null;
	}
}
public class ReverseLinkedList {

    public static void main(String[] args) {
       NodeList3 head = new NodeList3(1);
       head.next = new NodeList3(2);
       head.next.next = new NodeList3(3);
       head.next.next.next = new NodeList3(4);
       head.next.next.next.next = new NodeList3(5);
       System.out.println("Original List");
       printList(head);
       NodeList3 result=reverseLinkedList(head);
       System.out.println(" Reversed Lisr");
       printList(result);
    }
    
    public static void printList(NodeList3 head) {
    	while(head!=null) {
    		System.out.print(head.data +" -> ");
    		head = head.next;
    	}
    	System.out.println("NULL");
    }
    
    public static NodeList3 reverseLinkedList(NodeList3 head){
    	NodeList3 curr = head;
    	NodeList3 nextN = null;
    	NodeList3 prevN = null;
    	while(curr!=null) {
    		nextN = curr.next;
    		curr.next =prevN;
    		prevN = curr;
    		curr = nextN;
    	}
    	return prevN;
    }
    
}

