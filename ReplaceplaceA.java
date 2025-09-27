package String;

public class ReplaceplaceA {

	public static void main(String[] args) {
		
		String str="banana";
		
		String Result="";
		
		boolean firstFoundA=false;
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			
			if(ch=='a')
			{
				if(!firstFoundA)
				{
					Result+=ch;
					firstFoundA=true;
				}
				else
				{
					Result+="@";
				}	
			}
				else
				{
					Result+=ch;
				}
			}
			
			System.out.println(Result);
			
		}

	}


