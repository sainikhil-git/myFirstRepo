package hashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
public class Test1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Employee, String> hm = new HashMap<Employee, String>();
		Employee e1=new Employee(123, "temp1");
		Employee e2=new Employee(124, "temp2");
		
		hm.put(e1,"sai");
		hm.put(e2,"nikhil");
		
		e1.setName("snik");
		
		//System.out.println(hm.get(e1));
		//ArrayList<Number> k =new CopyOnWriteArrayList<Number>(); //ArrayList<Integer>();
		/*
		 * Object[] in= {new Integer(12),new String("foo"),new Boolean(true)};
		 * Arrays.sort(in); for(int i=0;i<in.length;i++) {
		 * System.out.println(in[i].toString()); } System.out.println();
		 */
		
		//List
		ArrayList<String> k =new ArrayList<String>();
		k.add("hji");
		k.add("hello");
		k.add(1, "sai");
		String s="hello";
		s.toUpperCase();
		//System.out.println(s);
		Boolean b=true?null:false;
		System.out.println(b);
		
		//ArrayList<Long> kll =new ArrayList<Integer>();
	}

}
