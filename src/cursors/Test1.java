package cursors;

import java.util.ArrayList;
import java.util.Iterator;

public class Test1 {

	public static void main(String[] args) 
	{
		ArrayList<String> a=new ArrayList<String>();
		a.add("mahesh");
		a.add("mahesh babu");
		a.add("appala");
		a.add("mahesh babu appala");
		Iterator itr=a.iterator(); //normal 
		while(itr.hasNext())
		{
			String s=(String)itr.next();
			System.out.println(s);
		}
		Iterator<String> itr1=a.iterator();
		while(itr1.hasNext())
		{
			String s1=itr1.next();
			System.out.println(s1);

	}

}}
