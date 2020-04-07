/**
 * 
 */
package examples;

import java.util.List;
import java.util.stream.Collectors;

import model.Person;

public class Example2 {

	public static void main(String[] args) {
		//Get all the names with name Uppercase

		List<Person> personList = SampleData.getPersonData().stream()
		.filter(p->p.getGender().equals("Male"))
		.map(p->new Person(p.getName().toUpperCase(),p.getGender(),p.getAge()))
		.collect(Collectors.toList());
		
		System.out.println(personList);
	}

}
