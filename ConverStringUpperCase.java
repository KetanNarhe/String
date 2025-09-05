package String;

public class ConverStringUpperCase {

    public static void main(String[] args) {

        String str = "Toomarrow is Last Day Of Ganpati bappa ";
        String upperStr = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            
            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - ('a' - 'A'));
            }

            upperStr += ch;
        }

        System.out.println("Original String: " + str);
        System.out.println("Uppercase String: " + upperStr);
    }
}
