package com.demo.test;

import com.demo.CircularLinkedList.CircularLinkedList;

public class TestCircularLinkedList {

	public static void main(String[] args) {
		CircularLinkedList clist=new CircularLinkedList();
		clist.addNode(11);
		clist.addNode(8);
		clist.addNode(7);
		clist.addNode(17);
		clist.addNode(4);
		
		clist.displayData();
		
		clist.addByPosition(2, 22);
		clist.addByPosition(3, 33);
		clist.displayData();
		
		clist.deleteByData(22);
		clist.deleteByData(33);
		clist.displayData();

		


		

	}

}
