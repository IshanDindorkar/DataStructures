/**
 * 
 */
package com.pract.linkedlist;

/**
 * @author Data
 *
 */
public class StackImpl {

	public static CharStackNode insertNode(CharStackNode head, CharStackNode node){
		
		if(head.getNext() == null){
			
			head.setNext(node);
			node.setPrev(head);
		}
		else{
			CharStackNode temp = new CharStackNode();
			temp = head.getNext();
			node.setPrev(head);
			node.setNext(temp);
			temp.setPrev(node);
			head.setNext(node);
		}
		
		return head;
			
	}
	
	public static void print(CharStackNode head){
		
		CharStackNode temp = head;
		if(temp == null)
			return;
		
		print(temp.getNext());
		System.out.print(temp.getLetter()+" ");
		
		/*temp = head;
		while(temp.getNext()!=null){
			
			temp = temp.getNext();
			System.out.print(temp.getData()+" ");
			
			
		}*/
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		CharStackNode cNode1 = new CharStackNode('H');
		CharStackNode cNode2 = new CharStackNode('e');
		CharStackNode cNode3 = new CharStackNode('l');
		CharStackNode cNode4 = new CharStackNode('l');
		CharStackNode cNode5 = new CharStackNode('o');
		CharStackNode head = new CharStackNode();
		head = insertNode(head, cNode1);
		head = insertNode(head, cNode2);
		head = insertNode(head, cNode3);
		head = insertNode(head, cNode4);
		head = insertNode(head, cNode5);
		print(head);
		
	}

}
