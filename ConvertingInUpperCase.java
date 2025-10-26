package String;

public class ConvertingInUpperCase {

	public static void main(String[] args) {
		 
		String str="Hello world";
		                                       
		String UpprCase="";
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
		
			
		if(ch>='a' && ch<='z')
		{
			ch=(char)(ch-32);
		    
		}
		
		UpprCase=UpprCase+ch;		
   }
	
	  System.out.println("Original String "+str);
	  System.out.println("UpperCase String"+UpprCase);
}
}
