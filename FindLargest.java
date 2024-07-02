package Week2.Day4;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindLargest {

	public static void main(String[] args) {
		Integer arr3[] = {3, 2, 11, 4, 6, 7};
		Arrays.sort(arr3);
		List<Integer> list3 = Arrays.asList(arr3);
		Set<Integer> Larg = new TreeSet<Integer>(list3);
		System.out.println(Larg);
	int s =	Larg.size();
	System.out.println("Array size: "+ s);
for(Integer i = 0;i >s; i++);

	System.out.println(list3.get(s-2));



	
	}

}
