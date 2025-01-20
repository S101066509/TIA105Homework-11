package Work8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TrainTest {
	public static void main(String[] args) {
		TrainTest a1 = new TrainTest();
		Train t0 = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
		Train t1 = new Train(1254, "區間", "屏東", "基隆", 700);
		Train t2 = new Train(118, "自強", "高雄", "台北", 500);
		Train t3 = new Train(1288, "區間", "新竹", "基隆", 400);
		Train t4 = new Train(122, "自強", "台中", "花蓮", 600);
		Train t5 = new Train(1222, "區間", "樹林", "七堵", 300);
		Train t6 = new Train(1254, "區間", "屏東", "基隆", 700);
		Train[] trlist = { t0, t1, t2, t3, t4, t5, t6 };

		System.out.println("HashSet_元素不重複但無序\n");
		Set<Train> s1 = new HashSet<Train>();
		a1.addElement(trlist, s1);
		a1.showMsg(s1);

		System.out.println("ArrayList_元素可重複但有序\n");
		List<Train> l1 = new ArrayList<Train>();
		a1.addElement(trlist, l1);
		Collections.sort(l1);
		a1.showMsg(l1);

		System.out.println("TreeSet_元素不重複且有序\n");
		Set<Train> s2 = new TreeSet<Train>();
		a1.addElement(trlist, s2);
		a1.showMsg(s2);

	}

	private void getElementByIterator(Collection<Train> tratable) {
		Iterator<Train> it = tratable.iterator();
		while (it.hasNext()) {
			Train temp = (Train) it.next();
			System.out.print(temp.getNumber() + " ");
		}
		System.out.println("");
	}

	private void getElementByForeach(Collection<Train> tratable) {
		for (Train it : tratable) {
			System.out.print(it.getNumber() + " ");
		}

		System.out.println("");
	}

	private void getElementByFor(Collection<Train> tratable) {
		Object[] arr = tratable.toArray();
		for (int i = 0; i < tratable.size(); i++) {
			System.out.print(((Train) arr[i]).getNumber() + " ");
		}
		System.out.println();
	}

	private void addElement(Train[] trlist, Collection<Train> tratable) {
		for (int i = 0; i < trlist.length; i++) {
			tratable.add(trlist[i]);
		}
	}

	private void showMsg(Collection<Train> tra) {
		System.out.println("使用Iterator:");
		this.getElementByIterator(tra);
		System.out.println("使用for loop:");
		this.getElementByFor(tra);
		System.out.println("使用for each:");
		this.getElementByForeach(tra);
		System.out.println("=====================");

	}

}
