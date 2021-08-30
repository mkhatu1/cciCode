public class cci1_8 {
    
    
    // define a print matrix function

    static void printMatrix(int[][] m){

        for(int i = 0; i< m.length; i++){

            for(int j = 0; j < m[0].length; j++){

                System.out.print(m[i][j] + "\t");
            }

            System.out.println();
        }
    }

    // Program takes a matrix as input. Checks if one element of a row or a column is zero then, makes all the elements in that row/columen zero.
    void zeroMatrix(int[][] matrix){
        boolean[] row = new boolean[matrix.length]; // by default false.
        boolean[] column = new boolean [matrix[0].length];

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){

                if(matrix[i][j] == 0){
                    row[i] = true;
                    column[j] = true;
                }
            }
        }

        // nullify row
        for(int i = 0; i < row.length ; i++){
            if(row[i]) nullifyRow(matrix, i);
        }

        // nullify column
        for(int j = 0; j < column.length; j++){
            if(column[j]) nullifyColumn(matrix, j);
        }

        System.out.println("Return zero matrix: ");
        printMatrix(matrix);

    }
    // define nullifyColumn function
     private void nullifyColumn(int[][] matrix, int column) {
         for(int i = 0; i < matrix.length; i++){
             matrix[i][column] = 0;
         }

    }
    // define nullifyRow fucntion
    private void nullifyRow(int[][] matrix, int row) {
        for(int j = 0; j < matrix[0].length; j++){
            matrix[row][j] = 0;
        }
    }

    
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 0}, {2, 3, 4, 1}, {1, 0, 2, 6}};
        System.out.println("Print the input matrix: ");
        printMatrix(matrix);

        cci1_8 obj = new cci1_8();

        obj.zeroMatrix(matrix);
       
        
    }
}
