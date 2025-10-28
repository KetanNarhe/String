package String;

public class CharDigitSum {

	public static void main(String[] args) {
		
      String str="ket@123narhe#456";
      int digitSum=0;
       int SepcCount=0;
       int lettercount=0;
      for(int i=0;i<str.length();i++)
      {
    	   char ch=str.charAt(i);
    	   
    	   if (ch >= '0' && ch <= '9') {
               digitSum += ch - '0';
           } 
    	   
    	   else if(ch>='a'&& ch<='z'||(ch>='A'&& ch<='Z') )
    	   {
    		   lettercount++;
    		                    
    	   } 
    	   else
    		   {
    			   SepcCount++;
    		   }
    	   }
     
        
          System.out.println(digitSum);
          System.out.println(SepcCount);
          System.out.println(lettercount);
	}

}
