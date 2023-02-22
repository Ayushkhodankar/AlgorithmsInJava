package singlyLinkedList;

import java.util.Scanner;


public class DeleteNodeAtNthPosition {
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
	
	public void deleteNth(int position) {
		if(position== 1) {
			head= head.next;
		}
		else {
			ListNode previous=head;
			int count=1;
			while(count<position-1) {
				previous=previous.next;
				count++;
			}
			ListNode current= previous.next;
			previous.next=current.next;
			
		}
	}
	
	
	public static void main(String[] args) {
		DeleteNodeAtNthPosition deleteNodeAtNthPosition= new DeleteNodeAtNthPosition();
		deleteNodeAtNthPosition.head=new ListNode(10);
		ListNode second= new ListNode(15);
		ListNode third= new ListNode(7);
		ListNode fourth= new ListNode(99);
		
		//connection of nodes
		deleteNodeAtNthPosition.head.next=second;
		second.next=third;
		third.next=fourth;
		
		//display of singly linked list
		Scanner sc= new Scanner(System.in);
		deleteNodeAtNthPosition.display();
		System.out.println("Enter the position to delete :");
		int n=sc.nextInt();
		deleteNodeAtNthPosition.deleteNth(n);
		deleteNodeAtNthPosition.display();
	}
	
}
