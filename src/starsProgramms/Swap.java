package starsProgramms;

import java.util.ArrayList;
import java.util.Collections;

public class Swap {

	public static void main(String[] args) 
	{
		ArrayList <String> a=new ArrayList<String>();
		a.add("mahesh");
		a.add("mahesh babu");
		a.add("appala");
		a.add("prakasam");
		a.add("ongole");
		
		System.out.println("before swapping: " + a);
		
		Collections.swap(a, 2, 0);
		
		System.out.println("after swapping: "+ a);
		
		ArrayList<String> a1=new ArrayList<String>(a.subList(0, 3));
		System.out.println(a1);
		
		

	}

}
