package String;

public class CountofWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str= "  Java   is  a powerful language  "; 
		
		int count=0;
		
		 boolean inword=false;

		 
		 for(int i=0;i<str.length();i++)
		 {
			 char ch=str.charAt(i);
			 
			 if(ch!=' ' && !inword)
			 { 
				 inword=true;
				 count++;
				 
			 }
			 else if(ch==' ')
			 {
                inword=false;
			 }
				 
		 }
		 System.out.println("Number of words "+count);
	}

}
