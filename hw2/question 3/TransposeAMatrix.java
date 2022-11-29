import java.util.Scanner;
public class TransposeAMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // no means number of.
        int noRowsMatrixA;
        int noColumnsMatrixA;
        System.out.println("This program was made to help you in transposing a matrix.");
        System.out.print("Please enter the number of the rows of the matrix: ");
        noRowsMatrixA=scanner.nextInt();
        System.out.print("Please enter the number of the columns of the matrix: ");
        noColumnsMatrixA=scanner.nextInt();
        int[][] matrixA = new int[noRowsMatrixA][noColumnsMatrixA];
        int[][] transposeOfMatrixA = new int[noColumnsMatrixA][noRowsMatrixA];

        System.out.println("Please enter the variables of the matrix linearly.");
        for(int i = 0 ; i < noRowsMatrixA ; i++){
            for(int j = 0 ; j < noColumnsMatrixA; j++ ){
                matrixA[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Your matrix is:");
        for(int i = 0 ; i < noRowsMatrixA ; i++){
            for(int j = 0 ; j < noColumnsMatrixA; j++ ){
                System.out.print(matrixA[i][j] + " ");
            }
            System.out.println();
        }

        // This loop will transpose the matrix.
        for (int j = 0 ; j<noColumnsMatrixA ; j++){
            for(int i = 0 ; i<noRowsMatrixA ; i++){
                transposeOfMatrixA[j][i]=matrixA[i][j];
            }
        }

        System.out.println("The transpose Matrix of this Matrix is:");
        for (int j = 0 ; j<noColumnsMatrixA ; j++){
            for(int i = 0 ; i<noRowsMatrixA ; i++){
                System.out.print(transposeOfMatrixA[j][i]+ " ");
            }
            System.out.println();
        }
    }
}
