package comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Testmain1 {

	
	public static void main(String[] args)
	{
		ArrayList<Emp> al=new ArrayList<Emp>();
		Emp e1=new Emp(2, "mahesh");
		Emp e2=new Emp(3, "babu");
		Emp e3=new Emp(1, "appala");
		al.add(e1);
		al.add(e2);
		al.add(e3);
		//Collections.sort(al, new Ename());
		Collections.sort(al, new EidComp());
		for(Emp e:al)
		{
			System.out.println(e.id+" "+ e.name);
		}
		

	}

}
