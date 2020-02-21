import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Test2 {
	static int i;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List<String> ls=new ArrayList<String>();
		System.out.println(i); 
		List<String> ls=new CopyOnWriteArrayList<String>();//ArrayList<String>();
		ls.add("Hey");
		ls.add("Hello");
		ls.add("Dis");
		ls.add("is");		
		ls.add("Nikhil");
		
		Iterator<String> it=ls.iterator();
		while(it.hasNext()) {
			if(it.next().equals("Dis"))
				ls.add("new Dis");
				
				//if(it.next().equals("new Dis"))
					//ls.add("horrific new Dis");
			//System.out.println(it.next());
				//it.remove();
		}
		System.out.println("&&&&"+ls);
		
	}

}
