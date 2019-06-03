package cursors;

import java.util.Enumeration;
import java.util.Vector;

public class Test {

	public static void main(String[] args)
	{
		Vector<String> v=new Vector<String>();
		v.add("appala");
		v.add("mahesh");
		v.add("babu");
		v.add("appala mahesh babu");
		//read the data by using enumeration by normal
		Enumeration e=v.elements();
		while(e.hasMoreElements())
		{
			String s=(String)e.nextElement();
			System.out.println(s);
		}
		Enumeration<String> e1=v.elements();
		while(e1.hasMoreElements())
		{
			String s=e1.nextElement();
			System.out.println(s);
		}

	}

}
