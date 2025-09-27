package String;

public class ReplaceChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="banana";
		
		String Result="";
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			
			if(Result.indexOf(ch)!=-1)
			{
				Result+="@";
			
			}
			else
			{
				Result+=ch;
			}
		}
		System.out.println(Result);
	}

}
