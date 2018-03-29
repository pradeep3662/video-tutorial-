
public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading obj=new MethodOverloading();
		obj.sum();
		obj.sum(10);
		obj.sum(10,5);
		
	}

public void sum(){
	System.out.println("sum method...zero param");
}
public void sum(int i){
	System.out.println("sum method");
	System.out.println(i);
}
public void sum(int k,int l){
	System.out.println("sum method");
	System.out.println(k+l);
}} 