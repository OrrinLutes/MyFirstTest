
/**
 * Write a description of class Pair here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pair
{
    private int row;
    private int col;
    private int value;
    public Pair(int row, int col, int value)
    {
        this.row = row;
        this.col = col;
        this.value = value;
    }
    public int getRow()
    {
        return row;
    }
    public int getCol()
    {
        return col;
    }
    public void setValue(int value)
    {
        this.value= value;
    }
}
