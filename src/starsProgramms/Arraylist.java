package starsProgramms;

import java.util.ArrayList;
import java.util.Arrays;

public class Arraylist {

	public static void main(String[] args) {
	//conversion of collection to arrays
		
		ArrayList<String> a=new ArrayList<String>();
		a.add("mahi");
		a.add("appala");
		
		
		String [] s=new String[a.size()];
	    a.toArray(s);
	//System.out.println(s);not getting proper output
	    
	    for(String ss:s)
	    {
	    	System.out.println(ss);
	    }
	//conversion of arrays to collection
	    
	    String c[]= {"aaa","bbb","ccc"};
	    
	    ArrayList<String> aa=new ArrayList<String>(Arrays.asList(c));
	    aa.add("mahesh");
	    aa.add("babu");
	    aa.add("appala");
	    System.out.println(aa);
	  //conversion of normal collection to arrays
	    
	    ArrayList a1=new ArrayList();
		a1.add(10);
		a1.add("mahesh");
		Object [] oo=a1.toArray();
		for(Object o:a1)
		{
			System.out.println(o);
		}

	}
	
	
	

}
