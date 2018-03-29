package JavaBasics;

public class IfElseConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a =30,b=20;
	if(b>a){
		System.out.println("b is greater than a");
	}
	else{
	System.out.println("a is greater than b");
	}
	//compariosn operator
	//> < >= <=
	int c=40,d=50;
	
	if(c==d){
		System.out.println("c and d are equal");
	}
	else{
		System.out.println("c and d are not equal");
	}
	//writing a logic to find out highest number
	int a1=100,b1=200,c1=300;
	
	//nested ifelse
	if(a1>b1 & a1>c1){
		System.out.println("a1 is greatest");
	}
	else if(b1>c1){
		System.out.println("b1 is greatest");
	}
	else{
		System.out.println("c1 is grestest");
	}
	}
	}
