package java8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Example1_foreach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating and adding elements to list
		List<Integer> l=new ArrayList<Integer>();
		for(int i=0;i<10;i++) {
			l.add(i);
		}
		
		//iterating over a list with iterator
		Iterator<Integer> iterator=l.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			//l.add(22); uncomment this line for producing ConcurrentModificationException			
		}
		
		//iterating with inbuilt foreach() of Java8
		l.forEach(i -> {System.out.println(i);});
		
		/* l.forEach(i -> {l.add(22);}); */ //throws ConcurrentModificationException
		
		/*
		 * l.forEach(new Consumer<Integer >() { public void accept(Integer t) {
		 * l.add(22); } });
		 */ //throws ConcurrentModificationException
	}

}
