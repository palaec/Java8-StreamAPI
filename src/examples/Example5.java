package examples;

import java.util.Map;
import java.util.stream.Collectors;

public class Example5 {

	public static void main(String[] args) {
		// Groupby : Get sum of all ages based on Gender
		
			Map<Object, Integer> map = SampleData.getPersonData().stream()
				.collect(Collectors
						.groupingBy(p -> p.getGender(), Collectors.summingInt(p -> p.getAge())));
			System.out.println(map);
	}

}
