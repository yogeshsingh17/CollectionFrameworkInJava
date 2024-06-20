package treeSetInJava;

import java.util.*;

class ReverseOrderTreeSet
{
	public void reverseOrderTreeSet()
	{
		TreeSet<String> ts1=new TreeSet<String>();
		ts1.add("Red");
		ts1.add("Blue");
		ts1.add("Pink");
		ts1.add("Yellow");
		ts1.add("Green");
		
		System.out.println(ts1);
		
		System.out.println("Accessing colours in Treeset:");
		
		Iterator<String> p=ts1.iterator();
		while(p.hasNext())
		{
			String sp=(String)p.next();
			System.out.println(sp);
		}
		
		Iterator<String> p1=ts1.descendingIterator();
		System.out.println("The colours in reverse in treeset are asa follows:");
		while(p1.hasNext())
		{
			String sp1=(String)p1.next();
			System.out.println(sp1);
		}	
		
	}
}

public class TreeSetInReverseOrder 
{

	public static void main(String[] args) 
	{
		ReverseOrderTreeSet rots=new ReverseOrderTreeSet();
		rots.reverseOrderTreeSet();

	}

}
