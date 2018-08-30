package org.vexelon.net.unit1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.vexelon.net.common.Person;

public class Unit1ExerciseSolutionJava8 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51),
				new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39)
				);
		
		System.out.println("Printing all persons");
		printConditionally(people, (Person p)->true);
		
		// Step 1: Sort list by last name
		Collections.sort(people, (p1, p2)->p1.getLastName().compareTo(p2.getLastName()));
		
		
		// Step 2: Create a method that prints all elements in the list
		System.out.println("\nPrinting all persons in sorted order by last name");
		printConditionally(people, (Person p)->true);

		// Step 3: Create a method that prints all people that have last name beginning with C
		System.out.println("\nPrinting all persons with first name beginning with C");
		printConditionally(people, (Person p)->p.getLastName().startsWith("C"));

	}
	
	private static void printConditionally(List<Person> people, Condition condition) {
		for (Person person : people) {
			if (condition.test(person)) {
				System.out.println(person);
			}
		}
	}

	interface Condition {
		boolean test(Person p);
	}
}
