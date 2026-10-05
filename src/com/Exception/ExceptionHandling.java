package com.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
	
	void check()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Age:");
		int age=sc.nextInt();
		
		if(age<18)
		{
			throw new AgeNotValidException("Age is not eligible");
		}
		else {
			System.out.println("Eligible for voting...");
		}
	}
	public static void main(String[] args) {
		
		ExceptionHandling e=new ExceptionHandling();
		try {
		e.check();
		}
		catch(AgeNotValidException a)
		{
			System.out.println(a.getMessage());
		}
//		System.out.println("Ramm");
//		System.out.println(10+10);
//		try {
//		System.out.println(10/0);
//		}
//		catch(ArithmeticException a)
//		{
//			System.out.println(a.getMessage());
//			//a.printStackTrace();
//			
//		}
//		System.out.println("Hinummm");
//		System.out.println("Rahul");
//		System.out.println(10/3.0);
		
		
//		
//		//InputMismatchException
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the age:");
//		
//		try {
//		int age=sc.nextInt();
//		System.out.println("Age is:"+age);
//		}
//		catch(InputMismatchException e)
//		{
//			e.printStackTrace();
//		}
//		System.out.println("Handledddd......");
		
//		
//		try {
//		int[]arr=new int[10];
//		arr[0]=1;
//		arr[2]=30;
//		arr[20]=100;
//		}
//		catch(NegativeArraySizeException | ArrayIndexOutOfBoundsException e)
//		{
//			System.out.println(e.getMessage());
//		}
//		
//		System.out.println("Exception Checkrd..");
		
		
		
		
	}

}
