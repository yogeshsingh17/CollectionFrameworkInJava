package arrayDequeInJava;

import java.util.ArrayDeque;

class DequeArray
{
	public void dequeArray()
	{
		ArrayDeque ad=new ArrayDeque();
		ad.add("Ankit");
		ad.add("Mahima");
		ad.add(26);
		ad.add(27);
		
		System.out.println(ad);
		
		ad.addFirst("Hi");
		System.out.println(ad);
		System.out.println(ad);
	}
}

public class ArrayDequeInJava 
{

	public static void main(String[] args) 
	{
		DequeArray da=new DequeArray();
		da.dequeArray();

	}

}
