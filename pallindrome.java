package samplePrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pallindrome {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("enter any name here");
		String str =br.readLine();
		
		String temp=str;
		StringBuffer sb=new StringBuffer(str);
		sb.reverse();
		str = sb.toString();
		
		
		if(temp.equalsIgnoreCase(str))
			System.out.println(temp+"is pallindrome");
		else
			System.out.println(temp+"is not pallindrome");
		}

	}