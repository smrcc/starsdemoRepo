package comparable;

import java.util.ArrayList;
import java.util.Collections;

public class TestMain1 {

	public static void main(String[] args) 
	{
		Emp1 e1=new Emp1("mahesh", 1);
		Emp1 e2=new Emp1("appala", 3);
		Emp1 e3=new Emp1("babu", 5);
		ArrayList<Emp1> al=new ArrayList<Emp1>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		Collections.sort(al);
		for(Emp1 e:al)
		{
			System.out.println(e.id+" "+ e.name);
		}
	

	}

}
