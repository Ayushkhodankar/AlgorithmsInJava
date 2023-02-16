package listImplementation;

public class SinglyLinkedList {

	private ListNode head;
	
	private static class ListNode {
		
		private int data;
		private ListNode next;
		
		public ListNode(int data) {	
		this.data=data;
		this.next=null;
		}	
	}
	
	public void display() {
		ListNode current=head;
		while(current!=null) {
			System.out.print(current.data+" ");
			current=current.next;
		}
		System.out.println("null");
		
	}
	
	public int length() {
		if(head==null){
			return 0;
		}
		int count=0;
		ListNode current = head;
		while (current!=null) {
			count++;
			current=current.next;	
		}
		return count;
	}
	public static void main(String[] args) {
		
	SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
	singlyLinkedList.head=new ListNode(10);
	ListNode second= new ListNode(15);
	ListNode third= new ListNode(7);
	ListNode fourth= new ListNode(99);
	
	//connection of nodes
	singlyLinkedList.head.next=second;
	second.next=third;
	third.next=fourth;
	
	//display of singly linked list
	singlyLinkedList.display();
	System.out.println("Length of singly linked list is:" + singlyLinkedList.length());
	
	}

}
