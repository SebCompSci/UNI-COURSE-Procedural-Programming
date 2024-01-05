public class MatrixMult {
    
    public static void main(String[] args) {
        double[][] matrix1 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};
        double[][] matrix2 = {{1}, {2}, {3}, {4}, {5}};
        String x = multiplyMatrices(matrix1, matrix2).toString();
        System.out.println(x);
        
    }


    public static double[][] multiplyMatrices(double[][] firstMatrix, double[][] secondMatrix) {

        boolean isLegal = false;
        if(firstMatrix[0].length == secondMatrix.length) { //Assumes that matrices are rectangle shaped.
            isLegal = true;
        }

        double[][] newMatrix = new double[firstMatrix.length][secondMatrix[0].length];
        if(isLegal){
            for(int i = 0; i < newMatrix[0].length; i++) { //Iterates over the rows of 'newMatrix'.
                for(int j = 0; j < newMatrix.length; j++) { //Iterates over the colums of the rows of 'newMatrix'.
                    for(int k = 0; k < firstMatrix[0].length; k++) {
                        newMatrix[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                    }
                }
            }
            return newMatrix;
        }
        else {
            System.out.println("Incompatible matrices.");
            return null;
        }
    }

}
