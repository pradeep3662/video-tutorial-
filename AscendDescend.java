package samplePrograms;
import java.util.*;

public class AscendDescend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner s=new Scanner(System.in);// create obj
 System.out.println("enter number");// enter value
 	int n=s.nextInt();
 	//declare and initialize array
 	int[] a=new int[n];
 	int i,j,temp=0;
 	//now get all array elements 
 	System.out.println("enter "+n+" Array Elements");
 	for(i=0;i<n;i++){
 		a[i]=s.nextInt();}
 	//print all array elements..........
 	System.out.println("\nArray elements are..a.clone()...........");
 	for(i=0;i<=n;i++){
 		System.out.println(""+a[i]);
 	}
 	//now arrange 
 	for(i=0;i<n;i++){
 		for(j=i+1;j<n;j++){
 			if(a[i]>a[j]){
 				temp=a[i];
 				a[i]=a[j];
 				a[j]=temp;
 		
 				}
 			}
 	}
 	System.out.println("array elements ascending order");
 	for(i=0;i<n;i++){
 	System.out.println(""+a[i]);
               	
 	}
        	
	}

}
