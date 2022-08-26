package com.maths.service;

public class MathsService {

	public static int add(int i, int j) {
		System.out.println("i:"+i+", j:"+j+", i+j:"+(i+j));
		return i+j;
	}
	public static int substract(int i, int j) {
		System.out.println("i:"+i+", j:"+j+", i-j:"+(i-j));
		return i-j;
	}
	public static int multiPly(int i, int j) {
		System.out.println("i:"+i+", j:"+j+", i*j:"+(i*j));
		return i*j;
	}
}
