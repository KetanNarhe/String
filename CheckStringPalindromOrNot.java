package String;

public class CheckStringPalindromOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		String str="madam";
		
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			rev+=str.charAt(i);

		}
       if(str.equals(rev))
       {
    	   System.out.println("Is Palindrome");
       }
       else
       {
    	   System.out.println("Is Not Palindrome");
       }
		
	}

}
