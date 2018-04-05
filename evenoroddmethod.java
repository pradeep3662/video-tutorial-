package samplePrograms;

import java.util.Scanner;

public class evenoroddmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the value");
	

evenoroddmethod obj=new evenoroddmethod();		
		int j= obj.evenodd();
		
		
		
	}

	
	

	public int evenodd() {
		

 Scanner sc = new Scanner(System.in);
 int i = sc.nextInt();
		if( i%2==0){
			System.out.println("even");
		}
		else
			System.out.println("odd");
		// TODO Auto-generated method stub
		return 0;
		
	}

}
