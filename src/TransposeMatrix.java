import java.util.Scanner;
public class TransposeMatrix {
    public static void main(String[] args){
        Scanner matrixTranspose = new Scanner(System.in);
        int[][] matrix = new int[2][3];
//       fill the original matrix
        for (int row = 0; row < matrix.length ;row++){
           System.out.println(" row" +(row + 1));
           for (int  col = 0 ; col < matrix[row].length; col++){
               System.out.print("Enter number for column" + (col + 1) +":");
               matrix[row][col] = matrixTranspose.nextInt();
           }
        }
        matrixTranspose.close();
        int[][] transposed = transpose(matrix);
        System.out.println("Transposed matrix is: ");
        for (int[] row : transposed){
            for ( int val : row ){
                System.out.print(val +" ");
            }
            System.out.println();
        }

    }
    public  static int[][] transpose(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] transposed = new int[col][row];
        for (int i = 0; i < row  ;i++){
            for (int  c = 0 ; c < col; c++){
                 transposed[c][i] = matrix[i][c];
            }
        }
        return transposed;
    }
}
//Given a 2D array int[][] matrix, write a method transpose(int[][] arr) that returns the transpose of the matrix.
