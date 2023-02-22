package listImplementation;


public class FirstNodeDeletion {

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
	//first node deletion syntax for the singly linked list
	public ListNode deleteFirstNode() {
		if(head== null) {
			return null;
		}
		ListNode temp=head;
		head= head.next;
		temp.next=null;
		return temp;
	}
	
	public static void main(String[] args) {
		
		FirstNodeDeletion firstNodeDeletion= new FirstNodeDeletion();
		firstNodeDeletion.head=new ListNode(10);
		ListNode second= new ListNode(15);
		ListNode third= new ListNode(7);
		ListNode fourth= new ListNode(99);
		
		//connection of nodes
		firstNodeDeletion.head.next=second;
		second.next=third;
		third.next=fourth;
		
		//display of singly linked list
		firstNodeDeletion.display();
		System.out.println(firstNodeDeletion.deleteFirstNode().data);
		firstNodeDeletion.display();
	}
}
