//Header
//Program Name: Chapter Exercise 2A
//Author: Andrew Burke
//Date: 10/03/2019
//Description: A program to showcase data 
//				types(primitive and non-primitive)
package edu.cgcc.cs160;

public class MainEntry {
	public static void main(String[] args) {
		//primitive data types
		int i = 10;
		boolean b = false;
		char c = 'h';
		//float f = 10.5;
		double d = 10.5;
		
		//non-primitive data types
		String str = "string";
		char[] cArray = new char[] {'h', 'e', 'l', 'l','o'};

		System.out.println("int value is: " + i);
		System.out.println("boolean value is: " + b);
		System.out.println("char value is: " + c);
		System.out.println("d value is: " + d);
		System.out.println("str value is: " + str);
		//System.out.println("cArray value is: " + cArray);
		System.out.println(cArray.length);
		
		
		//Loop
		for(int index = cArray.length - 1; index >= 0 ; index = index - 1) {
			System.out.println(cArray[index]);
		}
		
	}
}

/*FOOTER
 * int value is: 10
boolean value is: false
char value is: h
d value is: 10.5
str value is: string
5
o
l
l
e
h
 */
