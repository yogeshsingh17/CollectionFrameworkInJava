package linkedListInJava;

import java.util.*;

class ReverseOrder
{
	public void reverseOrder()
	{
		LinkedList<Integer> ll=new LinkedList<Integer>();
		ll.add(100);
		ll.add(200);
		ll.add(300);
		ll.add(400);
		ll.add(500);
		
		Iterator<Integer> itr=ll.iterator();
		
		while(itr.hasNext())
		{
			Integer i=(Integer)itr.next();
			System.out.println(i);
		}
		
		Iterator<Integer> itr1= ll.descendingIterator();
		
		System.out.println("Accessing the data in the reverse order");
		while(itr1.hasNext())
		{
			Integer in= (Integer)itr1.next();
			System.out.println(in);
		}
		
	}
}

public class LinkedListInReverseOrder 
{

	public static void main(String[] args) 
	{
		ReverseOrder ro=new ReverseOrder();
		ro.reverseOrder();

	}

}
