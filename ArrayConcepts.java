
public class ArrayConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     // int array;
    //lower index=0
		//upper bound=n-1;
		int i[]=new int[4];
      i[0]=10;
      i[1]=20;
      i[2]=30;
      i[3]=40;
      System.out.println(i[2]);
      System.out.println(i[3]);
     //syso System.out.println(i[4]);//ArrayIndexOutOfBoundsException
      System.out.println(i.length);//size/length of array
      //print all values of array
      for(int j=0;j<i.length;j++){
    	  System.out.println(i[j]);
    
      }
      double d[]=new double[3];
      d[0]=12.33;
      d[1]=13.44;
      d[2]=45.55;
      System.out.println(d[2]);
      
	}
	

}
