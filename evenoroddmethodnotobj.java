package samplePrograms;

import java.util.Scanner;

public class evenoroddmethodnotobj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter value");
		
		evenoroddmethodnotobj.evenodd();
	}
		  public static int evenodd() {
				Scanner sc = new Scanner(System.in);
		        int  i = sc.nextInt();
				if( i%2==0){
					System.out.println("even");
				}
				else
					System.out.println("odd");
				// TODO Auto-generated method stub
				
				return 0;
			}


	}


