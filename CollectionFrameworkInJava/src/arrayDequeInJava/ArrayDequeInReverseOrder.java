package arrayDequeInJava;

import java.util.ArrayDeque;
import java.util.Iterator;

class ReverseOrderInArrayDeque
{
	public void reverseOrderInArrayDeque()
	{
		ArrayDeque<Character> ad=new ArrayDeque<Character>();
		ad.add('a');
		ad.add('b');
		ad.add('c');
		ad.add('d');
		ad.add('e');
		
		Iterator<Character> itrOrignal=ad.iterator();
		
		while(itrOrignal.hasNext())
		{
			char ch=(char)itrOrignal.next();
			System.out.println(ch);
		}
		
		Iterator<Character> itrOrignal1= ad.descendingIterator();
		
		System.out.println("The reverse order of array deque is as follows:");
		while(itrOrignal1.hasNext())
		{
			char ch1=(char)itrOrignal1.next();
			System.out.println(ch1);
		}
		
		
		
	}
}

public class ArrayDequeInReverseOrder 
{

	public static void main(String[] args) 
	{
		ReverseOrderInArrayDeque road= new ReverseOrderInArrayDeque();
		road.reverseOrderInArrayDeque();
		
	}

}
