package com.pract.linkedlist;

public class DoubleLinkedListImpl {
	
	public static DoubleLinkedListNode createNode(int data){
		
		DoubleLinkedListNode node = new DoubleLinkedListNode();
		node.setData(data);
		node.setPrev(null);
		node.setNext(null);
		
		return node;
	}
	
	public static DoubleLinkedListNode insertNode(DoubleLinkedListNode head, DoubleLinkedListNode node){
		
		if(head.getNext() == null){
			
			head.setNext(node);
			node.setPrev(head);
		}
		else{
			DoubleLinkedListNode temp = new DoubleLinkedListNode();
			temp = head;
			while(temp.getNext()!=null)
				temp = temp.getNext();
			temp.setNext(node);
			node.setPrev(temp);
			
		}
		return head;
			
	}
	
	public static DoubleLinkedListNode deleteNode(DoubleLinkedListNode head, int data){
		
		DoubleLinkedListNode temp = head;
		DoubleLinkedListNode prev = null;
		DoubleLinkedListNode next = null;
		temp = head.getNext();
		while(temp!=null){
			prev = temp.getPrev();
			next = temp.getNext();
			if(temp.getData() == data){
				prev.setNext(next);
				next.setPrev(prev);
			}
			temp = temp.getNext();
		}
		
		return head;
		
	}
	
	public static void reversePrint(DoubleLinkedListNode head){
		
		DoubleLinkedListNode temp = head;
		if(temp == null)
			return;
		reversePrint(temp.getNext());
		System.out.print(temp.getData()+" ");
	}
	
	public static void print(DoubleLinkedListNode head){
		
		DoubleLinkedListNode temp = head;
		if(temp == null)
			return;
		System.out.print(temp.getData()+" ");
		print(temp.getNext());
		
		/*temp = head;
		while(temp.getNext()!=null){
			
			temp = temp.getNext();
			System.out.print(temp.getData()+" ");
			
			
		}*/
		
	}
	
	public static void main(String[] args) {
		DoubleLinkedListNode node1 = new DoubleLinkedListNode(5);
		DoubleLinkedListNode node2 = new DoubleLinkedListNode(10);
		DoubleLinkedListNode node3 = new DoubleLinkedListNode(2);
		DoubleLinkedListNode node4 = new DoubleLinkedListNode(14);
		DoubleLinkedListNode node5 = new DoubleLinkedListNode(22);
		DoubleLinkedListNode node6 = new DoubleLinkedListNode(1);
		DoubleLinkedListNode node7 = new DoubleLinkedListNode(7);
		DoubleLinkedListNode node8 = new DoubleLinkedListNode(18);
		DoubleLinkedListNode head = new DoubleLinkedListNode();
		head = DoubleLinkedListImpl.insertNode(head, node1);
		head = DoubleLinkedListImpl.insertNode(head, node2);
		head = DoubleLinkedListImpl.insertNode(head, node3);
		head = DoubleLinkedListImpl.insertNode(head, node4);
		head = DoubleLinkedListImpl.insertNode(head, node5);
		head = DoubleLinkedListImpl.insertNode(head, node6);
		head = DoubleLinkedListImpl.insertNode(head, node7);
		head = DoubleLinkedListImpl.insertNode(head, node8);
		DoubleLinkedListImpl.print(head);
		System.out.println("\n After deleting ....");
		DoubleLinkedListImpl.deleteNode(head, 10);
		DoubleLinkedListImpl.print(head);
		System.out.println("\n Reverse print ....");
		DoubleLinkedListImpl.reversePrint(head);
	}

}
