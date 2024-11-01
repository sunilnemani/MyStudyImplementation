/*
*
*N Sunil 
*
*/

package com.sunil.myStudy.java8.streams;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

public class Running
{
	public static void main(String[] args) 
	{
		Runnable helloRunnable = new Runnable() 
		{
			@SuppressWarnings("deprecation")
			public void run() 
			{
//				int x = 1280;
//				int y = 720;
				try
				{
			        Robot robot = new Robot();
			        robot.mousePress(InputEvent.BUTTON1_MASK);
//			        robot.mouseMove(150, 300);
			        robot.mouseRelease(InputEvent.BUTTON1_MASK);
//			        robot.mouseMove(300, 150);
			        
//			        String format = "png";
//					String fileName = "E:\\Sunil\\Pic\\scr.png";
//					Rectangle rect = new Rectangle();
//			        rect.width=x;
//			        rect.height=y;
//			        BufferedImage bufferImage = robot.createScreenCapture(rect);
//			        ImageIO.write(bufferImage, format, new File(fileName));
			        
			        System.out.println("Clicked");
			        
//					generateOTP("1234567890", 6);
					
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		};
		System.out.println("Clicking starts");
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
		executor.scheduleAtFixedRate(helloRunnable, 0, 60, TimeUnit.SECONDS);
	}
	
	public static String generateOTP(String possibleChars, int otpLength) throws Exception
	{
		final String chars = possibleChars;
		final int length = otpLength;
		String otp = null;

		final StringBuilder buffer = new StringBuilder(length);
		final Random rnd = new Random();

		for (int i = 0; i < length; i++)
		{
			int l = rnd.nextInt(chars.length());
			buffer.append(chars.charAt(l));
		}
		otp = buffer.toString();
		System.out.println(otp);
		return otp;
	}
}
