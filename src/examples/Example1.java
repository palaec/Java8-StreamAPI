package examples;

import java.util.List;
import java.util.stream.Collectors;

public class Example1 {

	public static void main(String[] args) {
	//Get all names in Upper case who's age is greater than 18 years
				
		List<String> names = SampleData.getPersonData().stream()
     						   .filter(p->p.getAge()>18)
     						   .map(p->p.getName().toUpperCase())
     						   .collect(Collectors.toList());
		
		System.out.println(names);

	}

}
