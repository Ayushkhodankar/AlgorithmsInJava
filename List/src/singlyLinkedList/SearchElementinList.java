package singlyLinkedList;

import java.util.Scanner;
public class SearchElementinList {

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

		//search elementy function
		public boolean search(ListNode head,int key) {
			if(head==null) {
		return false;
			}
			ListNode current=head;
			while(current != null) {
				if(current.data == key) {
					return true;
				}
				current = current.next;
			}
			return false;
			
		}
		public static void main(String[] args) {
			SearchElementinList searchElementinList= new SearchElementinList();
			searchElementinList.head=new ListNode(10);
			ListNode second= new ListNode(15);
			ListNode third= new ListNode(7);
			ListNode fourth= new ListNode(99);
			
			//connection of nodes
			searchElementinList.head.next=second;
			second.next=third;
			third.next=fourth;
			
			//display of singly linked list
			Scanner sc= new Scanner(System.in);
			searchElementinList.display();
			System.out.println("Enter the key to search :");
			int n=sc.nextInt();
			if(searchElementinList.search(searchElementinList.head, n)){
				System.out.println("Key found");
			}else {
				System.out.println("key not found");
			}
			
			
		}
}
