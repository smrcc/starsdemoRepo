package comparator;

import java.util.Comparator;

public class Ename implements Comparator<Emp>
{

	@Override
	public int compare(Emp e1, Emp e2) {
		
		return e1.name.compareTo(e2.name);
	}
	

}
