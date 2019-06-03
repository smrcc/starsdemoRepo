package comparable;

public class Emp implements Comparable
{
	int id;
	String name;
	
	public Emp(String name,int id)
	{
		this.id=id;
		this.name=name;
	}

	public int compareTo(Object o) 
	{
		Emp e=(Emp)o;
		if(id==e.id)
			return 0;
		
		else if(id>e.id)
			return 1;
		
		return -1;
	}

	

}
