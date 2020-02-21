import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> l=new ArrayList<Integer>();
		l.add(100);
		l.add(200);
		l.add(300);
		l.add(400);
		l.add(400);
		l.add(500);
		//Arrays.asList("100","200","300","400","500")
//ArrayList<Element> arrayList = new ArrayList<Element>(Arrays.asList(array));
		//List<Integer> l2=l.stream().filter(i->i>200).collect(Collectors.toList());
		//l.stream().filter(i->i>200).forEach(i ->{ System.out.println("Hellow "+i);});
		//System.out.println(l2);
		//List<Integer> l2=l.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		//System.out.println(l2);
		
	//maps
		//l=(ArrayList<Integer>) l.stream().filter(i->i>200).map(i->i+1).collect(Collectors.toList());
		//System.out.println(l);
		//array
		//Integer[] ar=l.stream().toArray(Integer[]::new);
		Integer[] ar=(Integer[]) l.stream().toArray(Integer[]::new);
		//System.out.println( l.stream().toArray());
		//Stream.of(ar).forEach(i-> {System.out.println(i);});
		List<Integer> l2=Stream.of(ar).collect(Collectors.toList());
		System.out.println(l2);
	}

}
