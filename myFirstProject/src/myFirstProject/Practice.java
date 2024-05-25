package myFirstProject;
import java.util.*;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog myDog = new Dog("something", 2, "white");
		System.out.println(myDog.breed);
		System.out.println(myDog.age);
		System.out.println(myDog.color);
		myDog.barking();
		
		// Array
		int array[] = new int[5];
		for(int x = 0; x < array.length; x++) {
			array[x] = (x * 10) / 2;
		}
		
		for(int x = 0; x < array.length; x++) {
			System.out.println(array[x]);
		}
		
		// ArrayList
		List a1 = new ArrayList();
		a1.add("Zara");
		a1.add("Mahnaz");
		a1.add("Ayan");
		System.out.println(" ArrayList Elements");
		System.out.println("\t" + a1);
		
		// LinkedList
		List l1 = new LinkedList();
		l1.add("Zara");
		l1.add("Mahnaz");
		l1.add("Ayan");
		System.out.println(" LinkedList Elements");
		System.out.println("\t" + l1);
		
		// HashSet
		Set s1 = new HashSet();
		s1.add("Zara");
		s1.add("Mahnaz");
		s1.add("Avan");
		System.out.println(" Set Elements");
		System.out.println("\t" + s1);
		
		// HashMap
		Map m1 = new HashMap();
		m1.put("Zara", "8");
		m1.put("Mahnaz", "31");
		m1.put("Ayan", "12");
		m1.put("Daisy", "14");
		System.out.println(" Map Elements");
		System.out.println("\t" + m1);
		
		System.out.println(Adder.add(11,11));
		System.out.println(Adder.add(12.3, 12.6));
		System.out.println(Adder.add(11,11,11));
		
	}

}
