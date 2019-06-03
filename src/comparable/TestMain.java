package comparable;

import java.util.ArrayList;
import java.util.Collections;

public class TestMain {

	public static void main(String[] args) 
	{
		ArrayList<Emp> al=new ArrayList<Emp>();
		al.add(new Emp("mahesh", 222));
		al.add(new Emp("appala", 333));
		al.add(new Emp("mahesh babu", 113));
		
		Collections.sort(al);
		for(Emp o:al)
		{
			System.out.println(o.id+" "+o.name);
		}

	}

}
