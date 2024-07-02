package Week2.Day4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindIntersection {
public static void main(String[] args) {
	Integer arr1[] ={3, 2, 11, 4, 6, 7};
	Integer arr2[]={1, 2, 8, 4, 9, 7};
	List<Integer> list1 = Arrays.asList(arr1);
	List<Integer> list2 = Arrays.asList(arr2);
	Set<Integer> intersection = new HashSet<Integer>(list1);
	intersection.retainAll(list2);
	for(Integer num :intersection) 
	System.out.println(num);

	
	
}
}
