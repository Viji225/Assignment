package Week2.Day4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MissingNumber {

	public static void main(String[] args) {
		Integer[] array = {1, 2, 3, 4, 10, 6, 8};
		Set<Integer> numset = new HashSet<Integer>();
		for(Integer num:array)
			numset.add(num);
		int minNum =1,maxNum =10;
		List<Integer> miss = new ArrayList<Integer>();
		for (int i = minNum; i <=maxNum; i++) {
			if(!numset.contains(i))
				miss.add(i);
		}
			for(Integer num:miss)
			System.out.println(num);
		}
	
		

	}


