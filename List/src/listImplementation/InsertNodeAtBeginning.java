package listImplementation;;

public class InsertNodeAtBeginning {
//creation of singly linked list
private ListNode head;
	
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
	//new node insertion at beginning
	public void insertNode(int value) {
		ListNode listNode=new ListNode(value);
		listNode.next=head;
		head= listNode;
	}
	public static void main(String[] args) {
		
	InsertNodeAtBeginning insertNodeAtBeginning = new InsertNodeAtBeginning();
	insertNodeAtBeginning.head=new ListNode(10);
	ListNode second= new ListNode(15);
	ListNode third= new ListNode(7);
	ListNode fourth= new ListNode(99);
	
	//connection of nodes
	insertNodeAtBeginning.head.next=second;
	second.next=third;
	third.next=fourth;
	
	//display of singly linked list
	insertNodeAtBeginning.insertNode(555);
	insertNodeAtBeginning.insertNode(5);
	insertNodeAtBeginning.display();
	}
}
