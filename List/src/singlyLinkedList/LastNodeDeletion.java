package listImplementation;

public class LastNodeDeletion {
	private ListNode head;
	//defining singly linked list
	private static class ListNode {
		
		private int data;
		private ListNode next;
		
		public ListNode(int data) {	
		this.data=data;
		this.next=null;
		}	
	}
	//printing of list in console
	public void display() {
		ListNode current=head;
		while(current!=null) {
			System.out.print(current.data+" --> ");
			current=current.next;
		}
		System.out.println("null");
	}
	
	public ListNode LastNodeDelete() {
		if(head == null || head.next==null) {
			return head;
		}
		ListNode current= head;
		ListNode previous = null;
		while (current.next != null) {
			previous=current;
			current=current.next;
		}
		
		previous.next = null;
		return current;
	}
public static void main(String[] args) {
	LastNodeDeletion lastNodeDeletion= new LastNodeDeletion();
	lastNodeDeletion.head=new ListNode(10);
	ListNode second= new ListNode(15);
	ListNode third= new ListNode(7);
	ListNode fourth= new ListNode(99);
	
	//connection of nodes
	lastNodeDeletion.head.next=second;
	second.next=third;
	third.next=fourth;
	
	//display of singly linked list
	lastNodeDeletion.display();
	System.out.println(lastNodeDeletion.LastNodeDelete().data);
	lastNodeDeletion.display();
}
}
