package String;

public class ConcatString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1="Narhe";
		String str2="Ketan";
		
		//String merged=str1+str2;
		//String merged=str1.concat(str2);
		//String merged=String.join(" ",str1,str2);
		//System.out.println(merged);
		
		StringBuilder sb=new StringBuilder();
		sb.append(str1);
		sb.append(str2);
		
		System.out.println(sb.toString());
	}

}


  