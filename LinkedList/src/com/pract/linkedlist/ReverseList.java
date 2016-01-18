/**
 * 
 */
package com.pract.linkedlist;

/**
 * @author IshanD
 *
 */
public class ReverseList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ListNode head = new ListNode();
		ListNode ListNode1 = ListNode.create(15);
		head = ListNode.insert(head, ListNode1, 1);
		ListNode ListNode2 = ListNode.create(10);
		head = ListNode.insert(head, ListNode2, 2);
		ListNode ListNode3 = ListNode.create(25);
		head = ListNode.insert(head, ListNode3, 3);
		ListNode ListNode4 = ListNode.create(45);
		head = ListNode.insert(head, ListNode4, 4);
		ListNode ListNode5 = ListNode.create(55);
		head = ListNode.insert(head, ListNode5, 5);
		ListNode.print(head);
		head = ListNode.reverseList(head);
		System.out.println("\n After reverse ... \n");
		ListNode.print(head);

	}

}
