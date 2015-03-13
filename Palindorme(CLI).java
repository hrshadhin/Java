
/**
 * Created by 0xeAX on 3/13/15.
 */
import java.util.Scanner;
public class palindorme {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Declare and initialize scanner and string variable
        Scanner scanme = new Scanner(System.in);
        String inputString;
        //output message
        System.out.print("Enter a string:");
        inputString= scanme.nextLine();//scan input
        //check Palindrome by calling function
        boolean isPldrome=isPalindrome(inputString);
        if(isPldrome)//check is it palindrome or not
        // Display the result
        {
            System.out.println("'"+inputString+"' is Palindrome.");
        }
        else {
            System.out.println("'"+inputString+"' is not Palindrome.");
        }

    }
    /** Return true if a string is a palindrome or return false*/
    public static boolean isPalindrome(String str) {
        // Create a new string by eliminating nonalphanumeric chars
        String tempStr = filter(str);
        // Create a new string that is the reversal of tempStr
        String tempStr2 = reverse(tempStr);

        /* Compare if the reversal is the same as the original string
        and return as true or false*/
        return tempStr2.equals(tempStr);
    }

    /** Create a new string by eliminating nonalphanumeric chars */
    public static String filter(String str) {
        // Create a string buffer
        StringBuffer strBuf = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetterOrDigit(str.charAt(i)))
            // Examine each char in the string for alphanumeric char
            {
                strBuf.append(str.charAt(i));//add char to string buffer
            }
        }

        // Return a new filtered string
        return strBuf.toString();
    }

    /** Create a new string by reversing a specified string */
    public static String reverse(String str) {
        StringBuffer strBuf = new StringBuffer(str);
        strBuf.reverse();
        // Use the reverse method for reverse StringBuffer object
        return strBuf.toString();
        //return reverse string
    }
}
