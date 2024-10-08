package zohopractice;
class NodeList{
	int data;
	NodeList next;
	NodeList(int data){
		this.data = data;
		this.next = null;
	}
}
public class MergeNodeList {
	public static void main(String[] args) {
		NodeList h1  = new NodeList(1);
		h1.next = new NodeList(3);
		h1.next.next = new NodeList(5);
		NodeList h2 = new NodeList(2);
		h2.next = new NodeList(4);
		h2.next.next = new NodeList(6);
		NodeList mergeList=mergeNodeList(h1,h2);
		while(mergeList!=null) {
			System.out.println(mergeList.data);
			mergeList = mergeList.next;
		}
	}
	public static NodeList mergeNodeList(NodeList h1, NodeList h2) {
		if(h1==null) {
			return h2;
		}
		if(h2==null) {
			return h1;
		}
		if(h1.data<h2.data) {
			h1.next = mergeNodeList(h1.next,h2);
			return h1;
		}else {
			h2.next = mergeNodeList(h1,h2.next);
			return h2;
		}
	}
}	
