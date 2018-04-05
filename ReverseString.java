package samplePrograms;

import java.util.Scanner;



public class ReverseString {//clas name reverseString
	public static void main(String[] args)//static means it is shared between all instances of class
	//void it wil not return any thing 
	//main method
	//we can arguments 
	{
		String original;//string is for stoorng storing a word
		String rev ="";
		
System.out.println("Enter String to reverse: ");//sop is for printing o/p
Scanner sc = new Scanner(System.in);//in java libraries we have package called scanner(system.in)access input values
original = sc.nextLine();//to rad strings we use nextLine()


	int len = original.length();//original.length wil show the number of characters present in the string
	for(int i =len-1;i>=0;i--){//for is used for executing repeatedly for(initialisation,condition,inc/dec)syntax;
		rev=rev+original.charAt(i);//charAt returns  char at speciific index 
	 
		System.out.println("original string is:"+original);//priniting original string
				// TODO Auto-generated constructor stub
				System.out.println("reverse string :"+rev);//printing reverse string
	}
	}
}
		