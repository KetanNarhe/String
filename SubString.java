package String;

public class SubString {

	public static String Substring(String str,int start,int end)
	{
		 String result="";
		 
		 for(int i=start;i<end;i++)
		 {
			 result+=str.charAt(i);
		 }
		 
		 return result;
	}
	 
	 public static void main(String args[])
	 {
		 String name="JavaProgramming";
		 
		 String part=Substring(name,4,11);
		 
		 System.out.println("Substring:"+part);
	 }
       
}
