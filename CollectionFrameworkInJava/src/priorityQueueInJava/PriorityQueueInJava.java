package priorityQueueInJava;


/*
 * How to access data of collection
 * 
 *  There are 3 ways in which we can access the data of the collection.
 *  1.Normal loop
 *  2.For each loop
 *  3.Iterator
 *  
 *  
 */



import java.util.*;

class PriorityQueueJava
{
	public void priorityQueue()
	{
//		PriorityQueue<String> pq=new PriorityQueue<String>();
		PriorityQueue pq=new PriorityQueue();
		pq.add("Pune");
		pq.add("Bengaluru");
		pq.add("Chennai");
		
		System.out.println(pq);
		
		PriorityQueue<Integer> pq1=new PriorityQueue<Integer>();
		pq1.add(100);
		pq1.add(50);
		pq1.add(25);
		pq1.add(150);
		pq1.add(75);
		
		System.out.println(pq1);
		
		System.out.println("This is iterator method");
		
		Iterator itr=pq1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("Accessing the data using normal for loop");
		
		
		
		
	}
}

public class PriorityQueueInJava 
{

	public static void main(String[] args) 
	{
		PriorityQueueJava pqj= new PriorityQueueJava();
		pqj.priorityQueue();

	}

}
