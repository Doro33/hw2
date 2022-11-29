import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //no means number of.
        int noRowsMatrixA;
        int noColumnsMatrixA;
        int noRowsMatrixB;
        int noColumnsMatrixB;
        System.out.println("This program was made to help you in Matrix multiplication.");
        System.out.print("Please enter the number of the rows of the first matrix: ");
        noRowsMatrixA=scanner.nextInt();
        System.out.print("Please enter the number of the columns of the first matrix: ");
        noColumnsMatrixA=scanner.nextInt();
        System.out.print("Please enter the number of the rows of the second matrix: ");
        noRowsMatrixB=scanner.nextInt();
        System.out.print("Please enter the number of the columns of the second matrix: ");
        noColumnsMatrixB=scanner.nextInt();

        if(noColumnsMatrixA != noRowsMatrixB )
            System.out.println("These two matrices cannot be multiplied.");
        else {
            int[][] matrixA = new int[noRowsMatrixA][noColumnsMatrixA];
            int[][] matrixB = new int[noRowsMatrixB][noColumnsMatrixB];
            int[][] matrixC = new int[noRowsMatrixA][noColumnsMatrixB];
            int temp=0;
            System.out.println("Please enter the variables of the first matrix linearly.");
            for(int i = 0 ; i < noRowsMatrixA ; i++){
                for(int j = 0 ; j < noColumnsMatrixA; j++ ){
                    matrixA[i][j] = scanner.nextInt();
                }
            }
            System.out.println("Your first matrix is:");
            for(int i = 0 ; i < noRowsMatrixA ; i++){
                for(int j = 0 ; j < noColumnsMatrixA; j++ ){
                    System.out.print(matrixA[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("Please enter the variables of the second matrix linearly.");
            for(int i = 0 ; i < noRowsMatrixB ; i++){
                for(int j = 0 ; j < noColumnsMatrixB; j++ ){
                    matrixB[i][j] = scanner.nextInt();
                }
            }
            System.out.println("Your second matrix is:");
            for(int i = 0 ; i < noRowsMatrixB ; i++){
                for(int j = 0 ; j < noColumnsMatrixB; j++ ){
                    System.out.print(matrixB[i][j] + " ");
                }
                System.out.println();
            }

            for (int i = 0 ; i<noRowsMatrixA ; i++){
                for(int j = 0 ; j<noColumnsMatrixB ; j++){
                    for(int k = 0; k<noColumnsMatrixA ; k++){
                        matrixC[i][j]+=matrixA[i][k]*matrixB[k][j];
                    }
                }
            }

            System.out.println("The product of these two matrices is:");
            for (int i = 0 ; i<noRowsMatrixA ; i++){
                for(int j = 0 ; j<noColumnsMatrixB ; j++){
                    System.out.print(matrixC[i][j]+ " ");;
                }
                System.out.println();
            }
        }
    }
}

