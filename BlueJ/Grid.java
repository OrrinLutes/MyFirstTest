import java.util.Stack;
public class Grid
{
   private static final int SIZE = 10;
   int[][] pixels = new int[SIZE][SIZE];
   

   /*
      Flood fill, starting with the given row and column.
   
   public void floodfill(int row, int column)
   {  
       this.row = row;
       this.col = column;
       
   }
   */
   public void floodfill(int row, int col)
   {
       Stack<Pair> flood = new Stack<>();
       Pair pik = new Pair( row, col,1);
       
       flood.push(pik);
       pik.setValue(1);
       pixels[pik.getRow()][pik.getCol()]=1;
       
    }
    
   @Override
   public String toString()
   {
      String r = "";
      for (int i = 0; i < SIZE; i++)
      {
         for (int j = 0; j < SIZE; j++)
            r = r + String.format("%4d", pixels[i][j]);
         r = r + "\n";
      }
      return r;
   }
   
   
}
