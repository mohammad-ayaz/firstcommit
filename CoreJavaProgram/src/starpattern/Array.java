package starpattern;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Array {

	final int i =10;
	
	public void one() { 
		String []x = {"a","B","c"};
		
	List<String> l = Arrays.asList(x);
		System.out.println(l);
		System.out.println("Hello" + i);
		
		/*For Primitives*/
		
		int []y = {1,2,3,4};
		List<Integer> l1 = Arrays.stream(y).boxed().collect(Collectors.toList());
		System.out.println(l1);
	}

}
