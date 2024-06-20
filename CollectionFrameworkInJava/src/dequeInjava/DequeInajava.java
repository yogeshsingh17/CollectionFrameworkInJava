package dequeInjava;

import java.util.ArrayDeque;
import java.util.Deque;

class JavaDeque
{
	public void javaDeque()
	{
		Deque<String> d=new ArrayDeque<String>();
		d.add("Ankit");
		d.add("Mahima");
		d.add("Yogesh");
		d.add("Sonal");
		d.addFirst("Apoorva");
		
		System.out.println(d);
		
		System.out.println(d.contains("Yogesh"));
		
		System.out.println(d.getFirst());
		
		System.out.println(d.isEmpty());
		
		System.out.println(d.offerFirst("Sonal"));  //Will add the element at the starting of the array.
		
		System.out.println(d);
		
		System.out.println(d.peekFirst());
		System.out.println(d);
		
		System.out.println(d.pollFirst());
		System.out.println(d);
		
		System.out.println(d.remove("Ankit"));
		System.out.println(d);
		
		System.out.println(d.pop());
		System.out.println(d);
		
		System.out.println(d.iterator());
		
		
		
	}
	
}

public class DequeInajava 
{

	public static void main(String[] args) 
	{
		JavaDeque jd=new JavaDeque();
		jd.javaDeque();

	}

}
