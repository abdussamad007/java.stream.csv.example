package com.abdus.practice.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCreate {
public static void main(String[] args) {
	List<String> myList = Arrays.asList("a1","a1","b1","b1","c1","c1");
	//create the stream of Array
	
	Stream<String> arrStream = myList.stream();
	System.out.println(arrStream.distinct().count());
	
	//create  an int stream
	IntStream.range(1, 20)
			.forEach(System.out::println);
	System.out.println();
	System.out.println("Print with Skip");
	//Interger stream with a skip
	IntStream.range(1, 10)
			.skip(7) //skip first 7 element.
			.forEach(x->System.out.println(x));
	//Integer stream with sum
	System.out.println("Sum of 10 numbers");
	System.out.println(IntStream.range(1, 10)
			.sum());
	//Stream of sorted and find first
	
	Stream.of("Ramma","Ava","Stev","Tom","Monalisa","Bill")
			.sorted()
			.findFirst()
			.ifPresent(System.out::println);
	
	//Stream with Filter
	System.out.println("After adding filter");
	
	List<String> people = Arrays.asList("Ramma","Ava","Stev","Tom","Monalisa","Bill");
	
	people.stream()
			.map(String::toLowerCase)
			.filter(x->x.startsWith("a"))
			.forEach(System.out::println);
	
			
}
}
