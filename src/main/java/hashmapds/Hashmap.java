package hashmapds;

import java.util.HashMap;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Hashmap
{
    public static void main( String[] args )
    {
    	HashMap<String, String> map = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        Logger l=Logger.getLogger("hi");
        map.put("one", "Hardikpandiya");
        map.put("two", "Dhoni");
        map.put("three", "kholi");

        l.info("MAP:");
		l.log(Level.INFO,()->" "+(map));

        System.out.println("Print the keys:");
        for (String i : map.keySet()) {
            l.info(i);
        }

        System.out.println("Print the Values:");
        for (String i : map.values()) {
            l.info(i);
        }
        System.out.println("Enter Search Value");
        String search = scan.nextLine();

        if (map.containsValue(search)) {
            l.info("true");
        } else {
            l.info("False");
        }
        
        l.log(Level.INFO,()->" "+(map.size()));
     }
    }
