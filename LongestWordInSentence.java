package String;

public class LongestWordInSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sentence="I love learning Java programming";
		
		 String[] words=sentence.split(" ");
		 
		 String longest="";
		 
		 for(int i=0;i<words.length;i++)
		 {
			 if(words[i].length()> longest.length()) 
			 {
				 longest=words[i];
			 }
		 }
		 
		 System.out.println("Longest word: "+longest);
		 System.out.println("Longest length "+longest.length());
	}

}
