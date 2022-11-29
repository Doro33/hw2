import java.util.Scanner;
public class TrappingRainWater {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
       System.out.print("Please enter the length of the array: ");
        int lengthOfArray=scanner.nextInt();
        int[] inputArray = new int[lengthOfArray];
       System.out.print("Please enter the variable of the array: ");
        for (int i = 0 ; i<lengthOfArray;i++){
            inputArray[i]=scanner.nextInt();
        }
        int sigmaOfWater = 0;
        for (int i = 0; i < inputArray.length - 1; i++) {
            firstpoint:
            if (inputArray[i] > inputArray[i + 1]) {
                for (int height = inputArray[i]; 0 < height; height--) {
                    for (int j = i + 1; j < inputArray.length; j++) {
                        if (height <= inputArray[j]) {
                            sigmaOfWater += (j - i - 1) * height;
                            for (int k = i + 1; k < j; k++) {
                                sigmaOfWater -= inputArray[k];
                            }
                            i = j-1;
                            break firstpoint;
                        }
                    }
                }
            }
        }
        System.out.println("Maximum water that can be stored is: " + sigmaOfWater);
    }
}