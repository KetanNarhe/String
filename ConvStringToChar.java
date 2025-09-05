package String;

import java.util.Arrays;

public class ConvStringToChar {

	public static void main(String[] args) {
		
		String s="ketan";
		
		char[] ch=new char[s.length()];
		
		for(int i=0;i<ch.length;i++)
		{
		   ch[i]=s.charAt(i);
		}
          System.out.println(Arrays.toString(ch));
	}
}
