/*
*
*N Sunil 
*
*/

package com.sunil.myStudy.java11;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StringImpl
{
	
	private static final Logger log = LoggerFactory.getLogger(StringImpl.class);
	
	public static void main(String[] args) throws InterruptedException
	{
		String[] strArray = {"Sunil", "Naveen", "    ", "", "Raj", "Kalyan"};
		List<String> strList = Arrays.asList(strArray);
		strArray = strList.toArray(String[]::new);
		for(String str : strArray)
		{
//			Thread.sleep(100);
			log.info(str);
		}
		log.info("-----------------------------------------------------------------------");
		for(String str : strList)
		{
//			Thread.sleep(100);
			log.info(str);
		}
		log.info("-----------------------------------------------------------------------");
		
		strList = strList.stream().filter(Predicate.not(String :: isBlank)).collect(Collectors.toList());
		for(String str : strList)
		{
//			Thread.sleep(100);
			log.info(str);
		}
	}

}
