package Work8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest {
	public static void main(String[] args) {
		CollectionTest a1 = new CollectionTest();
		
		Collection col1 = new ArrayList();
		Object Snoopy =new Object();
		col1.add(100);
		col1.add(3.14);
		col1.add(21L);
		col1.add((short) 100);
		col1.add((double)(5.1));
		col1.add("Kitty");
		col1.add(100);
		col1.add(Snoopy);
		col1.add(new BigInteger("1000"));
		
		a1.getElementFor(col1);
		a1.getElementForEach(col1);
		a1.getElementIterator(col1);
		a1.removeNonnumerElement(col1);
		
	}
	private void getElementFor(Collection col1) {	
		ArrayList temp=(ArrayList)col1;
		System.out.println("This is a for loop");
		for(int i = 0 ; i<temp.size();i++) {
			System.out.print(temp.get(i)+",");
		}	
		System.out.println("\n");
	}
	private void getElementForEach(Collection col1) {	
		ArrayList temp=(ArrayList)col1;
		System.out.println("This is a for each");
		for(Object xx : temp) {
			System.out.print(xx + ",");
		}	
		System.out.println("\n");
	}
	private void getElementIterator(Collection col1) {	
		System.out.println("This is a for each");
		Iterator it = col1.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+ ",");
		}
		System.out.println("\n");
	}
	private Collection removeNonnumerElement(Collection col1) {
		System.out.println("This is a remover");
		System.out.println("before");
		System.out.println(col1);
		Iterator it = col1.iterator();
		while (it.hasNext()) {
		    Object el = it.next();
		    if (!(el instanceof Number)) {
		        it.remove();
		    }
		}
		System.out.println("after");
		System.out.println(col1);
		System.out.println("\n");
		return col1;
	}
	
	
}


