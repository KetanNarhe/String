package String;

import java.util.Arrays;

public class RemoveDup {

	public static void main(String[] args) {
		
		String s1="programming";

		String res=" ";
		
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			
		     if(res.indexOf(ch)==-1)
		     {
		    	 res+=ch;                    
		     }                   
		   }           
		System.out.println(res);      
	}                                                                             

}
