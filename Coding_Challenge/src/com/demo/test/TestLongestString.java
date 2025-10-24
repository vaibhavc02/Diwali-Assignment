package com.demo.test;

import com.demo.module.LongestString;

public class TestLongestString {

	public static void main(String[] args) {
		String[] arr = {"vaibhav", "vishal", "raj", "nilesh"};

        LongestString finder = new LongestString();
        int res = finder.findLongestLength(arr);

        System.out.println("longest string is: " + res);

	}

}
