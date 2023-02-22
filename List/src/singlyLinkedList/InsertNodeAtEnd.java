package listImplementation;


public class InsertNodeAtEnd {

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
		//insert a node at end
		public void insertNode(int value) {
			ListNode listNode=new ListNode(value);
			if(head==null) {
			head = listNode;	
			return;
			}
			ListNode current=head;//basic instance is created of the list
			while(current.next!= null) {//list is gone through this loop
				current=current.next;
			}
			current.next=listNode;//at end after the last value the new value is added in the list
		}
		
		public static void main(String[] args) {
			
			InsertNodeAtEnd insertNodeAtEnd = new InsertNodeAtEnd();
			insertNodeAtEnd.head=new ListNode(10);
			ListNode second= new ListNode(15);
			ListNode third= new ListNode(7);
			ListNode fourth= new ListNode(99);
			
			//connection of nodes
			insertNodeAtEnd.head.next=second;
			second.next=third;
			third.next=fourth;
			
			insertNodeAtEnd.insertNode(852);
			insertNodeAtEnd.display();
			}
}
