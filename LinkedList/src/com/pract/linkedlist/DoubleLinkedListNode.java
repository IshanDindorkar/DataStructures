package com.pract.linkedlist;

public class DoubleLinkedListNode {
	
	private int data;
	private DoubleLinkedListNode prev;
	private DoubleLinkedListNode next;
	
	public DoubleLinkedListNode() {
		super();
	}
	
	public DoubleLinkedListNode(int data) {
		super();
		this.data = data;
	}
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public DoubleLinkedListNode getPrev() {
		return prev;
	}
	public void setPrev(DoubleLinkedListNode prev) {
		this.prev = prev;
	}
	public DoubleLinkedListNode getNext() {
		return next;
	}
	public void setNext(DoubleLinkedListNode next) {
		this.next = next;
	}
}
