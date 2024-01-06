/*
 * Assignment 4: Multiplication of arrays.
 * Goal: Learning and using arrays.
 * Implement a method that performs matrix multiplication and returns the product of the two matrices as a result.
 * Make the method check whether the multiplication is legal, and warn the user if it is not.
 */

public class MatrixMult {


    public static double[][] multiplyMatrices(double[][] firstMatrix, double[][] secondMatrix) {
        //Takes two two-dimensional double arrays that will be multiplied togehther.
        //If the multiplication is legal, the method will return a two-dimensional double array containing the result.

        //Checks if multiplication is legal (Amount of columns of 'firstMatrix' must be equal to amount of rows of 'secondMatrix').
        boolean isLegal = false;
        if(firstMatrix[0].length == secondMatrix.length) {
            isLegal = true;
        }

        double[][] newMatrix = new double[firstMatrix.length][secondMatrix[0].length];
        if(isLegal){
            for(int i = 0; i < newMatrix.length; i++) { //Iterates over the rows of 'newMatrix'.
                for(int j = 0; j < newMatrix[0].length; j++) { //Iterates over the colums of the rows of 'newMatrix'.
                    for(int k = 0; k < firstMatrix[0].length; k++) { //Iterates k times, where k is the amount of columns of 'firstMatrix'.
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
