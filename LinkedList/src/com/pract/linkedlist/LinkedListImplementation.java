// Code showing first implementation of a Linked List
// Created by Ishan D

package com.pract.linkedlist;

class Node{
	
	private int data;
	private Node next;
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
	public static Node create(int data){
		Node n = new Node();
		n.setData(data);
		n.setNext(null);
		return n;
	}
	
	public static Node insert(Node head, Node node, int pos){
		if(pos == 1){
			head.setNext(node);
		}
		else{
			Node temp = new Node();
			temp = head;
			for(int i = 0; i < pos-1; i++){
				temp = temp.getNext();
			}
			temp.setNext(node);			
			node.setNext(null);
		}
		return head;
	}
	
	public static int delete(Node head, Node node){
		
		if(head == null)
			return -1; // linked list is empty
		else{
			
			Node temp = new Node();
			Node prev = new Node();
			temp = head;
			while(temp.getNext()!=null){
				prev = temp;
				temp = temp.getNext();
				if(temp.getData() == node.getData()){
					prev.setNext(temp.getNext());
				}	
			}
			return 0;
		}
	}
	
	public static void print(Node head){
		
		Node temp = new Node();
		temp = head;
		while(temp.getNext()!=null){
			temp = temp.getNext();
			System.out.print(temp.getData() + " ");
		}
	}
	
}

public class LinkedListImplementation {

	public static void main(String[] args) {
		Node head = new Node();
		Node node1 = Node.create(15);
		head = Node.insert(head, node1, 1);
		Node node2 = Node.create(10);
		head = Node.insert(head, node2, 2);
		Node node3 = Node.create(25);
		head = Node.insert(head, node3, 3);
		Node node4 = Node.create(45);
		head = Node.insert(head, node4, 4);
		Node node5 = Node.create(55);
		head = Node.insert(head, node5, 5);
		Node.print(head);
		Node.delete(head, node3);
		System.out.println("\n After delete ...\n");
		Node.print(head);
	}

}
