package examples;

import java.util.stream.Collectors;

public class Example4 {

	public static void main(String[] args) {
		// get persons and Sort based on names
				System.out.println(
						SampleData.getPersonData()
						.stream()
						.sorted((p3, p4) -> p3.getName().compareTo(p4.getName()))
						.collect(Collectors.toList()));

	}

}
