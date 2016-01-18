/**
 * 
 */
package com.pract.linkedlist;

/**
 * @author IshanD
 *
 */
public class ListNode{
	
	private int data;
	private ListNode next;
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public ListNode getNext() {
		return next;
	}
	public void setNext(ListNode next) {
		this.next = next;
	}
	
	public static ListNode create(int data){
		ListNode n = new ListNode();
		n.setData(data);
		n.setNext(null);
		return n;
	}
	
	public static ListNode insert(ListNode head, ListNode ListNode, int pos){
		if(pos == 1){
			head.setNext(ListNode);
		}
		else{
			ListNode temp = new ListNode();
			temp = head;
			for(int i = 0; i < pos-1; i++){
				temp = temp.getNext();
			}
			temp.setNext(ListNode);			
			ListNode.setNext(null);
		}
		return head;
	}
	
	public static int delete(ListNode head, ListNode ListNode){
		
		if(head == null)
			return -1; // linked list is empty
		else{
			
			ListNode temp = new ListNode();
			ListNode prev = new ListNode();
			temp = head;
			while(temp.getNext()!=null){
				prev = temp;
				temp = temp.getNext();
				if(temp.getData() == ListNode.getData()){
					prev.setNext(temp.getNext());
				}	
			}
			return 0;
		}
	}
	
	public static ListNode reverseList(ListNode head){
		
		ListNode prev = new ListNode();
		ListNode current = new ListNode();
		ListNode next = new ListNode();
		
		
		current = head;
		
		while(current!=null){
			
			next = current.getNext();
			current.next = prev;
			prev = current;
			current = next;
			
		}
		head = prev;
		return head;
	}
	
	public static void print(ListNode head){
		
		ListNode temp = new ListNode();
		temp = head;
		while(temp!=null){
			System.out.print(temp.getData() + " ");
			temp = temp.getNext();
			
		}
	}
	
}

