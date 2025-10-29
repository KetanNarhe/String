package String;

public class AnagramString {

	public static void main(String[] args) {
		
		String str1="listen";
	    String str2 ="silent";

	    str1.replaceAll("\\s", "").toLowerCase();
	    str2.replaceAll("\\s", "").toLowerCase();
	    
	    if(str1.length()!=str2.length())
	    {
	    	System.out.println("Not an Anagaram");
	    	
	    	return;
	    }
	    
	     int sum1=0, sum2=0;
	    
	     for(int i=0;i<str1.length();i++)
	     {
	     
	       sum1+=str1.charAt(i);
	       sum2+=str2.charAt(i);
	     }
	
	    	if(sum1==sum2)
     	{
	      System.out.println("The String are Anagram");	 
	    }
	     else
	  	{
	  	  System.out.println("The String is not Anagram");	
	  	}
	  	}

}
