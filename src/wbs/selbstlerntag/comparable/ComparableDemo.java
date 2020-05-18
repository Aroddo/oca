package wbs.selbstlerntag.comparable;
import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemo {

	public static void main(String[] args) {
		ArrayList<Person> personen = new ArrayList<Person>();
		personen.add(new Person("Jens", "Richter", 222));
		personen.add(new Person("Christoph", "Sloma", 111));
		personen.add(new Person("Armin", "Otto", 666));
		personen.add(new Person("Walter", "Hohm", 444));
		personen.add(new Person("Cristo", "von Wehren", 777));

		System.out.println(String.format("%25s %15s %10s", "Vorame", "Name", "Alter"));
		System.out.println("Unsortiert ");
		personen.forEach(System.out::println);	

		System.out.println("Vorname ");
		Person.setSortMode(0);	
		Collections.sort(personen);
		personen.forEach(System.out::println);

		System.out.println("Name ");
		Person.setSortMode(1);
		Collections.sort(personen);
		personen.forEach(System.out::println);

		System.out.println("Alter ");
		Person.setSortMode(2);
		Collections.sort(personen);
		personen.forEach(System.out::println);
		
		Person p = personen.get(0);
		System.out.println(personen.get(0).hashCode());
		personen.get(0).setName("ASDASD");
		System.out.println(personen.get(0).hashCode());
		
		
		System.out.println();
		System.out.println( (new Person("AA","BB",11)).getName()    );
		
	}
}