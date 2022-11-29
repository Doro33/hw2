import java.util.Arrays;
import java.util.Scanner;
public class ShiftArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the length of the array: ");
        int lengthOfArray = scanner.nextInt();
        int[] array =new int[lengthOfArray];
        System.out.println("Please enter the arrays, you can use the space key to get into the next cell.");
        for (int i = 0 ; i<array.length;i++){
            array[i]=scanner.nextInt();
        }
        System.out.println(Arrays.toString(array));

        System.out.print("Please enter how many cells do you want to shift: ");
        int shiftNumber = scanner.nextInt();

        int[] shiftArray = new int[array.length];
        for (int i = 0; i < array.length ; i++) {
            shiftArray[i] = array[(i + shiftNumber) % array.length];
        }
        System.out.println(Arrays.toString(shiftArray));
    }
}