package examples;

import java.util.List;
import java.util.stream.Collectors;

import model.Person;

public class Example3 {

	public static void main(String[] args) {
		//Get all the Males with name Uppercase (Do not modify the original List)

		List<Person> personList = SampleData.getPersonData().stream()
		.filter(p->p.getGender().equals("Male"))
		.map(p->new Person(p.getName().toUpperCase(),p.getGender(),p.getAge()))
		.collect(Collectors.toList());
		
		System.out.println(personList);
	}
	
}
