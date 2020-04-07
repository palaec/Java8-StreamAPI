package examples;

import java.util.stream.Collectors;

public class Example4 {

	public static void main(String[] args) {
		// Get persons and sort based on names
				System.out.println(
						SampleData.getPersonData()
						.stream()
						.sorted((p3, p4) -> p3.getName().compareTo(p4.getName()))
						.collect(Collectors.toList()));

	}

}
