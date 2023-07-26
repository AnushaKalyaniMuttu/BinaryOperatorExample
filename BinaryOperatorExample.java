package com.biconsumer;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperaterExample {
	static Comparator<Integer> comparator=(a,b)->a.compareTo(b);

	public static void main (String [] args) {
		
		BinaryOperator<Integer> binaryOperator=(a,b)->a*b;
		System.out.println(binaryOperator.apply(3,4));
		
		BinaryOperator<Integer> maxBy=BinaryOperator.maxBy(comparator);
	System.out.println("Max value:"+maxBy.apply(1, 2));	
	
	BinaryOperator<Integer> minBy=BinaryOperator.minBy(comparator);
	System.out.println("Min Value:"+minBy.apply(1, 2));	
	}
}

