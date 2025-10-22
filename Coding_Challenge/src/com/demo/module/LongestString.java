package com.demo.module;

public class LongestString {

	    public int findLongestLength(String[] arr) {
	        int maxLength = 0;

	        for (String s : arr) {
	            if (s.length() > maxLength) {
	                maxLength = s.length();
	            }
	        }

	        return maxLength;
	    }
	}



