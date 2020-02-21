import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

class Employee{
	String name;
	boolean isGood;
	String company;
	boolean issalGood;
	boolean ishikGood;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isGood() {
		return isGood;
	}
	public void setGood(boolean isGood) {
		this.isGood = isGood;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public Employee(String name, boolean isGood, String company) {
		super();
		this.name = name;
		this.isGood = isGood;
		this.company = company;
	}
}


public class Streams1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee("sai", false, "cts");
		Employee e2=new Employee("sai", false, "pureSoft");
		Employee e3=new Employee("sai", false, "Oracle");
		Employee e4=new Employee("sai", true, "c1");
		Employee e5=new Employee("sai", true, "c2");
		Employee e6=new Employee("sai", true, "c3");
		Employee e7=new Employee("sai", true, "c4");
		
		
		List<Employee> emplist=new ArrayList<Employee>();
		
		emplist.add(e1);
		emplist.add(e2);
		emplist.add(e3);
		emplist.add(e4);
		emplist.add(e5);
		emplist.add(e6);
		emplist.add(e7);		
		
		String newOrg=IntStream.
				range(0,emplist.size()-1).
				filter(i -> (emplist.get(i).isGood()!=emplist.get(i+1).isGood())).
				mapToObj(i -> {
					String result=emplist.get(i+1).getCompany();
					return result;
				}).findFirst().orElse(emplist.get(0).getCompany());
		
		System.out.println(newOrg);
		
		////////////////////
		String output=getlastupdatedcompany(emplist,"name");	
		
		String name;
			
			

	}

	private static String getlastupdatedcompany(List<Employee> emplist, String field_name) {

		/*
		 * String newOrg=IntStream. range(0,emplist.size()-1). filter(i ->
		 * ((emplist.get(i).isGood()!=emplist.get(i+1).isGood()))). mapToObj(i -> {
		 * String result=emplist.get(i+1).getCompany(); return result;
		 * }).findFirst().orElse(emplist.get(0).getCompany());
		 * if(field_name.equals("a")) System.out.println("hello"); else
		 * if(field_name.equals("b"))
		 * (emplist.get(i).isGood()!=emplist.get(i+1).isGood(); else
		 * System.out.println("bye");
		 * 
		 * return newOrg;
		 */
		return "hello";
	}

}

