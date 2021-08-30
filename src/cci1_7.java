public class cci1_7 {


    static void printMatrix(int[][] m){

        for(int i = 0; i< m.length; i++){

            for(int j = 0; j < m[0].length; j++){

                System.out.print(m[i][j] + "\t");
            }

            System.out.println();
        }
    }

    boolean rotate(int[][] matrix){

        if(matrix.length == 0 || matrix.length != matrix[0].length){
            return false;
        }

        // print given original matrix
        System.out.println("Given matrix: ");
        printMatrix(matrix);
    

        int n = matrix.length; //# of rows
        for(int layer = 0; layer < n/2; layer++){
            int first = layer;
            int last = n - 1 - layer; // last = n-(1+layer); as it starts at 0.

            for(int i = 0; i < last; i++){
                int offset = i - first;
                int top = matrix[first][i]; //save top.

                // left-->top
                matrix[first][i] = matrix[last - offset][first];

                // bottom-->left
                matrix[last - offset][first] = matrix[last][last - offset];

                // right-->bottom
                matrix[last][last - offset] = matrix[i][last];

                // top-->right
                matrix[i][last] = top; // right<-- saved top.


            }
        }
        // print rotated matrix
        System.out.println("Rotated matrix: ");
        printMatrix(matrix);
        
        return true;
    }


    public static void main(String[] args) {
        int[][] m = {{1, 2, 1, 1}, {2, 1, 2, 3}, {1, 3, 2, 1}, {2, 2, 3, 1}};

        cci1_7 obj = new cci1_7();

        System.out.println(obj.rotate(m));

        
    }

    
}
