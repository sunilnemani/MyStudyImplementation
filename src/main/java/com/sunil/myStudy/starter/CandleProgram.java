/*
*
*@author N Sunil 
*
*/

package com.sunil.myStudy.starter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CandleProgram
{

	public static void main(String[] args)
	{
//		System.out.print(nonRepeativeChar_1("aabbccddefg"));
//		System.out.println(getMaxFullCandles(7, 3));
		
		List<String> listOfElements = new ArrayList<String>();
		listOfElements.add("Apple");
		listOfElements.add("Sunil");
		
		List<String> result = listOfElements.stream().filter( str -> (str.length()<3)).collect(Collectors.toList());
		System.out.println(result);
	}
	
	public static int getMaxBurnCandles(int unburntCandles, int burntCandles)
	{
		burntCandles+=unburntCandles;
		while(true)
		{
			int unburn=burntCandles/4;
			unburntCandles+=unburn;
			burntCandles = (burntCandles%4)+unburn;
			if(burntCandles<4)
			{
				break;
			}
		}
		return unburntCandles;
	}
	
	public static int getMaxFullCandles(int candles, int ratio)
	{
		int burntCandles = candles;
		while(true)
		{
			int unburn = burntCandles/ratio;
			candles+=unburn;
			burntCandles = (burntCandles%ratio)+unburn;
			if(burntCandles<ratio)
			{
				break;
			}
		}
		return candles;
	}
	
	/**
	 * @param input that cannot be null
	 * 
	 * @return return index of non-repeative character, Otherwise -1
	 * 
	 * @throws NullPointerException if input is null
	 * 
	*/
	public static int nonRepeativeChar_1(String input)
	{
		int result = -1;
		String temp = new String(input);
		int currentLength = temp.length();
		System.out.println(temp);
		for(int i = 0; i < input.length(); i++)
		{
			temp = temp.replace(input.charAt(i)+"", "");
			System.out.println(temp);
			int diff = currentLength-temp.length();
			if(diff==1)
			{
				return i;
			}
			currentLength = temp.length();
		}
		return result;
	}
	
	
	/**
	 * @param input that cannot be null
	 * 
	 * @return return index of non-repeative character, Otherwise -1
	 * 
	 * @throws NullPointerException if input is null
	 * 
	*/
	public static int nonRepeativeChar_2(String input)
	{
		String temp = new String(input);
		System.out.println(temp);
		int currentLength = temp.length();
		char currentChar;
		while(true)
		{
			currentChar = temp.charAt(0);
			temp = temp.replace(currentChar+"", "");
			System.out.println(temp);
			int diff = currentLength-temp.length();
			if(diff==1)
			{
				return input.indexOf(currentChar);
			}
			currentLength = temp.length();
		}
	}
	
	
}
