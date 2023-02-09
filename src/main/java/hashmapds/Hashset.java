package hashmapds;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.logging.Logger;

public class Hashset {
	public static void main(String args[]) {
		Logger log=Logger.getLogger("hi");
		Scanner scan=new Scanner(System.in);
		HashSet<Integer> set=new HashSet();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(20);
		set.add(55);
		
		Iterator<Integer> it=set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		log.info("set cannot allowed dublicate element");
		log.info("Enter search Element");
		int search=scan.nextInt();
		if(set.contains(search)) {
			log.info("Element is found");
		}
		else
		{
			log.info("Element is not found");
		}
		}
		
}
