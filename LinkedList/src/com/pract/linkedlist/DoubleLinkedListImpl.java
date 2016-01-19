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
	
	public static void print(DoubleLinkedListNode head){
		
		DoubleLinkedListNode temp = new DoubleLinkedListNode();
		temp = head.getNext();
		while(temp!=null){
			System.out.print(temp.getData()+" ");
			temp = temp.getNext();
		}
		
	}
	
	public static void main(String[] args) {
		DoubleLinkedListNode node1 = new DoubleLinkedListNode(5);
		DoubleLinkedListNode node2 = new DoubleLinkedListNode(10);
		DoubleLinkedListNode node3 = new DoubleLinkedListNode(2);
		DoubleLinkedListNode head = new DoubleLinkedListNode();
		head = DoubleLinkedListImpl.insertNode(head, node1);
		head = DoubleLinkedListImpl.insertNode(head, node2);
		head = DoubleLinkedListImpl.insertNode(head, node3);
		DoubleLinkedListImpl.print(head);
	}

}
