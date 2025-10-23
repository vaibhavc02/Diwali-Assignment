package com.demo.CircularLinkedList;

import org.w3c.dom.Node;

public class CircularLinkedList {
		Node head;
		class Node{
			int data;
			Node next;
			public Node(int value) {
				this.data = value;
				this.next = null;
			}
		}
		public void addNode(int value) {
   		 Node newNode=new Node(value);
   		 if(head==null) {
   			 head=newNode;
   			
   		 }else {
	    		 Node temp=head;
	    		 while(temp.next!=head) {
	    			 temp=temp.next;
	    		 }
	    		 temp.next=newNode;
	    		 
   		 }
   		 newNode.next=head;
   	 }
    
		
		public void addByPosition(int pos, int val) {
			if(head==null) {
   			 System.out.println("list is empty");
   		 }else {
   			 Node newNode=new Node(val);
   			 if(pos==1) {
   				 Node temp=head;
   				 
   				 while(temp.next!=head) {
   					 temp=temp.next;
   				 }
   				 newNode.next=head;
   				 head=newNode;
   				 temp.next=head;
   				 
   			 }else {
   				 Node temp=head;
   				 int count=0;
   				 for(int i=0;temp.next!=head && i<pos-2;i++) {
   					 temp=temp.next;
   					 count++;
   				 }
   				 if(count==pos-2) {
   					 newNode.next=temp.next;
   					 temp.next=newNode;
   				 }else {
   					 System.out.println("position is out of bounds");
   				 }
		      }
   		  }
	}
		public void displayData() {
	    	 if(head==null) {
	    		 System.out.println("list is empty");
	    	 }else {
	    		 Node temp=head;
	    		 do{
	    			 System.out.print(temp.data+",");
	    			 temp=temp.next;
	    		 }while(temp!=head);
	    		 System.out.println();
	    	 }
	     }
		
		public void deleteByData(int val) {
		    if (head == null) {
		        System.out.println("List is empty");
		        return;
		    }

		    Node temp = head, prev = null;

		    if (head.data == val) {
		        while (temp.next != head) {
		            temp = temp.next;
		        }
		        temp.next = head.next;
		        head = head.next;
		        return;
		    }

		    temp = head;
		    do {
		        prev = temp;
		        temp = temp.next;
		        if (temp.data == val) {
		            prev.next = temp.next;
		            return;
		        }
		    } while (temp != head);

		    System.out.println("Value not found: " + val);
		}
		public void modifyNode(int oldVal, int newVal) {
		    if (head == null) {
		        System.out.println("List is empty");
		        return;
		    }

		    Node temp = head;
		    do {
		        if (temp.data == oldVal) {
		            temp.data = newVal;
		            System.out.println("Modified: " + oldVal + " -> " + newVal);
		            return;
		        }
		        temp = temp.next;
		    } while (temp != head);

		    System.out.println("Value not found: " + oldVal);
		}


}
