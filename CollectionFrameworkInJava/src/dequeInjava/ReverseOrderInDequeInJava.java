package dequeInjava;

import java.util.*;


class ReverseOrderInDeque
{
	public void reverseOrderInDeque()
	{
		Deque<String> dd=new ArrayDeque<String>();
		dd.add("apple");
		dd.add("Orange");
		dd.add("Banana");
		dd.add("Mango");
		dd.add("Kiwi");
		
		System.out.println(dd);
		System.out.println(dd.peekFirst());
		
		System.out.println("The original list of fruits are as follows:");
		
		Iterator<String> it=dd.iterator();
		
		while(it.hasNext())
		{
			String str=(String)it.next();
			System.out.println(str);
		}
		
		Iterator<String> it1= dd.descendingIterator();
		System.out.println("The reverse order of deque is as follows:");
		
		while(it1.hasNext())
		{
			String str1=(String)it1.next();
			System.out.println(str1);
		}
		
	}
}

public class ReverseOrderInDequeInJava 
{

	public static void main(String[] args) 
	{
		ReverseOrderInDeque rod=new ReverseOrderInDeque();
		rod.reverseOrderInDeque();

	}

}
