package Week2.Day4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sorting {

	public static void main(String[] args) {
	String[] arr = {"HCL", "Wipro", "Aspire Systems", "CTS"};
	List<String> list = Arrays.asList(arr);
	Collections.sort(list);
	System.out.println(list);
	for(String nn:list)
		System.out.println(nn);
	

	}

}
