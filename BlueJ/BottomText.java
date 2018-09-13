import java.util.*;
import java.io.*;
/**
 * Write a description of class BottomText here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BottomText
{
    public static void main(String args[])
    {
        String fileName = "/home/pi/BlueJ/Trump.txt";
        Set<String> speech = new TreeSet<>();
        

        try (Scanner scan = new Scanner(new File(fileName)))
        {
            while(scan.hasNext())
            {
                String word = scan.next();
                speech.add(word);
            }
            int counter = 0;
            for (String words : speech)
            {
                System.out.println(words);
                counter++;
            }
            System.out.println("There were " + counter + " diffrent words in that speech.");
            
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Could not find file");
        }
    }
}
