import java.io.* ;

class TwoDPractice
{
   
    /**
     * return the sum of all elements in the given row
     */
    public  int rowSum (int[][] data, int row) 
    {
      int sum = 0;
      for (int i = 0; i < data[row].length; i++) {
        sum += data[row][i];
      }
        return sum;
    }

    /**
     * return the sum of all elements in the given column
     */
    public int columnSum(int[][] data, int col)
    {
      int sum = 0;
      for (int i = 0; i < data.length; i++) {
        if (data[i].length > col)
          sum += data[i][col];
      }
        return sum;
    }
}      
