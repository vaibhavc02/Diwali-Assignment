package com.demo.test;

import com.demo.CircularQueue.CircularQueue;

public class TestCircularQueue {

	public static void main(String[] args) {
		CircularQueue ob=new CircularQueue();
		ob.enqueue(11);
		ob.enqueue(22);
		ob.enqueue(33);
		ob.enqueue(45);
		ob.enqueue(48);
		ob.enqueue(99);
		
		System.out.println(ob.dequeue());
		ob.enqueue(55);
		ob.enqueue(66);
		System.out.println("dequeue :" +ob.dequeue());

		
		
	}

}
