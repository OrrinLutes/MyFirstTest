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
       int count =1;
       Pair temp = new Pair(0,0,0);
       try{
       
       while (count != 100)
       {
           temp = flood.pop();
           if (pixels[temp.getRow()-1][temp.getCol()] == 0)
           {
               count++;
               flood.push(new Pair (temp.getRow()-1,temp.getCol(),count));
               pik.setValue(count);
               pixels[temp.getRow()-1][temp.getCol()]=count;
            }
            if (pixels[pik.getRow()][pik.getCol()+1]==0)
           {
               count++;
               flood.push(new Pair (temp.getRow()-1,temp.getCol(),count));
               pik.setValue(count);
               pixels[temp.getRow()][temp.getCol()+1]=count;
            }
            if (pixels[pik.getRow()+1][pik.getCol()]==0)
           {
               count++;
               flood.push(new Pair (temp.getRow()-1,temp.getCol(),count));
               pik.setValue(count);
               pixels[temp.getRow()+1][temp.getCol()]=count;
            }
            if (pixels[pik.getRow()][pik.getCol()-1]==0)
           {
               count++;
               flood.push(new Pair (temp.getRow()-1,temp.getCol(),count));
               pik.setValue(count);
               pixels[temp.getRow()][temp.getCol()-1]=count;
            }
        }
    }
    catch (ArrayIndexOutOfBoundsException)
    
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
