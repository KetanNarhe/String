package String;

public class CocateStringAlternatively {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1="narhe";
		String str2="ketan";
		
		String Result="";
		
		int len1=str1.length();
		int len2=str2.length();
		
		int max=Math.max(len1, len2);
		
		for(int i=0;i<max;i++)
		{
			if(i<len1)
			{
				Result+=str1.charAt(i);
			}
			if(i<len2)
			{
				Result+=str2.charAt(i);
			}
		}
		System.out.println(Result);
	}

}
