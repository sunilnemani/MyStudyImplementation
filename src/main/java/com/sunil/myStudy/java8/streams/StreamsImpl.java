/*
*
*N Sunil 
*
*/

package com.sunil.myStudy.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

public class StreamsImpl
{

	public static void main(String[] args)
	{
		
		Integer[] intArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		Stream<Integer> stream = Stream.of(intArray);
		stream.forEach(i -> System.out.print(i+","));
		System.out.println();
		//or
		stream = Arrays.stream(intArray);
		stream.forEach(i -> System.out.print(i+","));
		System.out.println();
		
		List<Integer> intList = Arrays.asList(intArray);
		stream = intList.stream();
		stream.forEach(i -> System.out.print(i+","));
		System.out.println();
		
		int[] intArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		IntStream intStream = IntStream.of(intArr);
		intStream = Arrays.stream(intArr);
		intStream.forEach(data -> {if(data%2==0) System.out.print(data+",");});
		System.out.println();
		
		IntStream intRangeStream = IntStream.range(1, 10);	//1-9
		intRangeStream.forEach(data -> System.out.print(data+","));
		System.out.println();
		
		IntStream intRangeCloseStream = IntStream.rangeClosed(1, 10);	//1-10
		intRangeCloseStream.forEach(data -> System.out.print(data+","));
		System.out.println();
		
		Builder<String> builder = Stream.<String>builder();
		for(int i=1; i<=10; i++)
		{
			builder.add(i+"-");
		}
		Stream<String> strStream = builder.build();
		strStream.forEach(data -> System.out.print(data));
//		strStream.filter(
	}
}
