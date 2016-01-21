/** 
 * Class representing node in stack
 */
package com.pract.linkedlist;

/**
 * @author IshanD
 *
 */
public class CharStackNode {
	
	char letter;
	CharStackNode next;
	CharStackNode prev;
	/**
	 * 
	 */
	public CharStackNode() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param letter
	 */
	public CharStackNode(char letter) {
		super();
		this.letter = letter;
	}
	/**
	 * @return the letter
	 */
	public char getLetter() {
		return letter;
	}
	/**
	 * @param letter the letter to set
	 */
	public void setLetter(char letter) {
		this.letter = letter;
	}
	/**
	 * @return the next
	 */
	public CharStackNode getNext() {
		return next;
	}
	/**
	 * @param next the next to set
	 */
	public void setNext(CharStackNode next) {
		this.next = next;
	}
	/**
	 * @return the prev
	 */
	public CharStackNode getPrev() {
		return prev;
	}
	/**
	 * @param prev the prev to set
	 */
	public void setPrev(CharStackNode prev) {
		this.prev = prev;
	}
	
	
}
