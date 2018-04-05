package samplePrograms;

import java.util.HashSet;
import java.util.Set;

public class RemoveDublicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="pavan";
	System.out.println(RemoveDublicate(str));
	}
public static String RemoveDublicate(String str){
Set<Character> set=new  HashSet<Character>();
StringBuffer sf=new StringBuffer();


for(int i=0;i<str.length();i++){
	char c=str.charAt(i);
	if(!set.contains(c)){
		set.add(c);
		sf.append(c);
	}
}
return sf.toString();
}

}
