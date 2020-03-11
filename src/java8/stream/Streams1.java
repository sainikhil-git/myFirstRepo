package java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Streams1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l1=new ArrayList<String>();
		l1.add("one");
		l1.add("two");
		l1.add("three");
		l1.add("four");
		l1.add("five");
		
		//example to see how skip() works
		//l1.stream().skip(2).forEach(i -> System.out.println(i));
		
		//example1 to create custom defined Predicate
		Predicate<Integer> p1 = (i -> {
			if (i > 5)
				return true;
			else
				return false;
		});		
		//System.out.println(p1.test(6));
		
		//example2 to create custom defined Predicate
		Predicate<Integer> p2= i -> (i>5);
		//System.out.println(p2.test(6));
		
		

	}

}
