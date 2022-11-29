import java.util.Scanner;

public class permutationOfAString {
    //Function for swapping the characters at position i with character at position j
    public static String swapString(String a, int i, int j) {
        char[] b =a.toCharArray();
        char ch;
        ch = b[i];
        b[i] = b[j];
        b[j] = ch;
        return String.valueOf(b);
    }

    //Function for generating different permutations of the string
    public static void generatePermutation(String inputString, int start, int end) {
        //Prints the permutations
        if (start == end-1)
            System.out.println(inputString);
        else {
            for (int i = start; i < end; i++) {
                //Swapping the string by fixing a character
                inputString = swapString(inputString,start,i);
                //Recursively calling function generatePermutation() for rest of the characters
                generatePermutation(inputString,start+1,end);
                //Backtracking and swapping the characters again.
                inputString = swapString(inputString,start,i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the String you want to permute: ");
        String inputString = scanner.nextLine();
        System.out.println("All the permutations of the string are: ");
        generatePermutation(inputString, 0, inputString.length());
    }
}