package String;

public class PrintAllOccurrencesLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String str = "122334556667899";
		 
		 boolean[] visited=new boolean[str.length()];
		 
		 for(int i=0;i<str.length();i++)
		 {
			 if(visited[i])
			 
				 continue;
			 
			 char ch=str.charAt(i);
			 
			 int count=1;
			 
			 for(int j=i+1;j<str.length();j++)
			 {
				 if(str.charAt(j)==ch)
				 {
					 count++;
					 
					 visited[j]=true;
				 }
			 }
			   System.out.println(ch+ "occurs "+count+ "Times");
		 }
	}

}
