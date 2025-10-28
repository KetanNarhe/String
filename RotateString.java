package String;

public class RotateString {

	public static void main(String[] args) {
		
		String str="ABCDE";
		int n=2;
		
		int len=str.length();
		
		char[]arr=str.toCharArray();
		
		System.out.println("Original String "+str);
		
		
		for(int i=0;i<n;i++)
		{
			char first=arr[0];
            		
		 for(int j=0;j<len-1;j++)
		 {
			 arr[j]=arr[j+1];
		 }
			
		 arr[len-1]=first;
		}
		
		 for(char c:arr)
		 {
		    System.out.print(c);
		 }
	}
		
		

	}


