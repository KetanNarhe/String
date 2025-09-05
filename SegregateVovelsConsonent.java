package String;

public class SegregateVovelsConsonent {

	public static void main(String[] args) {
		
		
		String name="Ketannarhe02@gmail.com";
		
		String Vovels=" ";
		String Conson=" ";    
		String Numb=" "; 
		String spec=" ";  
		
		for(int i=0;i<name.length();i++) 
		{
			char ch=name.charAt(i);       
		    
			if(ch=='a'||ch=='A'||ch=='e'||ch=='E'|| ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
			{
			   Vovels=Vovels+ch;
			}
			else if( ch>='0'&& ch<='9')
			{
			  Numb=Numb+ch;	
			}
			
			else if((ch>='a'&& ch<='z')||(ch>='A'&& ch<='Z'))
			{
				Conson=Conson+ch;
			}
			else
			{
				spec=spec+ch;
			}
			
			
		}
		System.out.println(Vovels);
		System.out.println(Conson);
		System.out.println(Numb);
		System.out.println(spec);

	}

}
