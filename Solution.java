package SpiralMatrix;


import java.util.ArrayList;
public class Solution {
	public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> result = new ArrayList<Integer>();
      int rowStart = 0;
      int rowEnd = matrix.length -1;
      int row = rowEnd;
      int colStart = 0;
      int colEnd = matrix[0].length - 1;
      int col=colEnd;

      while((col*row%2 > 0) ? (rowStart<rowEnd&&colStart<=colEnd) || (rowStart<=rowEnd&&colStart<colEnd) : rowStart<=rowEnd&&colStart<=colEnd){
          for(int i = colStart; i <= colEnd; i++) {
              result.add(matrix[rowStart][i]);
          }
          for(int j = rowStart + 1; j < rowEnd; j++) {
             result.add(matrix[j][colEnd]);
          }
  
          for(int m = colEnd; m >= colStart && rowEnd-rowStart > 0; m--) {
              result.add(matrix[rowEnd][m]);
          }

          for(int n = rowEnd-1; n > rowStart && colEnd-colStart > 0; n--) {
              result.add(matrix[n][colStart]);
          }
          rowStart++;
          rowEnd--;
          colStart++;
          colEnd--;
        }
        return result;
     }
}
