
/**
 * Counts the occurences of each word in a file.
 *
 * @author Terence Wu
 * @version 9/26/2024
 */

import java.util.HashMap;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException; 

public class ctrlF
{
    public HashMap<String, Integer> countWords(String fileName)
    {
        Scanner fileIn = null; 
        try
        {
            fileIn = new Scanner(new FileInputStream(fileName));
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File Not Found.");
            System.exit(0);
        }
        
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        while (fileIn.hasNextLine()) 
        {
            Scanner s = new Scanner(fileIn.nextLine());
            while(s.hasNext()) 
            {
                String str = s.next();
                if(map.containsKey(str))
                    map.put(str, map.get(str)+1);
                else
                    map.put(str,1);
                
            }
        }  
        
        return map;
    }
    
    public void printCountedWords(String fileName)
    {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map = countWords(fileName);
        for(String key : map.keySet())
            System.out.println(key+": " + map.get(key));
    }
    
}
