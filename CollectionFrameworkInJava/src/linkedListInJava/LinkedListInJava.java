package linkedListInJava;

import java.util.LinkedList;

class LinkedListCode
{
	public void linkedListCode()
	{
		LinkedList li=new LinkedList();
		li.add("Yogesh");
		li.add("Singh");
		li.add(26);
		li.add("Bengaluru");
		li.add("Yogesh");
		
		System.out.println(li);
		System.out.println(li.getFirst());
		System.out.println(li);
		System.out.println(li.getLast());
		System.out.println(li.indexOf(26));
		System.out.println(li.listIterator());
		System.out.println(li.listIterator(2));
		System.out.println(li.peekFirst());
		
		System.out.println(li);
		
		
		
	}
}

public class LinkedListInJava 
{

	public static void main(String[] args) 
	{
		LinkedListCode lc=new LinkedListCode();
		lc.linkedListCode();

	}

}
