package hashSetInJava;

import java.util.HashSet;

class HashSetInsideJava
{
	public void hashsetInsideJava()
	{
		HashSet hs=new HashSet();
		hs.add("India");
		hs.add("India");
		hs.add("Brazil");
		hs.add("Brazil");
		hs.add("Brazil");
		
		//Duplicates are not allowed inside Hash set
		
		System.out.println(hs);
	}
}

public class HashSetInJava 
{

	public static void main(String[] args) 
	{
		HashSetInsideJava hsij=new HashSetInsideJava();
		hsij.hashsetInsideJava();

	}

}
