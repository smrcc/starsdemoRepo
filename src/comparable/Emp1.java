package comparable;

public class Emp1 implements Comparable<Emp1>
{
	String name;
	int id;
	public Emp1(String name, int id) {
		this.name = name;
		this.id = id;
	}
	@Override
	public int compareTo(Emp1 e) 
	{
		
		
		return name.compareTo(e.name);
	}
	

}
