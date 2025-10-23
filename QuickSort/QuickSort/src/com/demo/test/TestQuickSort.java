package com.demo.test;

import java.util.Arrays;

import com.demo.quicksort.QuickSort;

public class TestQuickSort {

	public static void main(String[] args) {
		
		String[] arr = {"vaibhav","Raj","vishal","Ram","sham"};
		QuickSort.partition(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

}
