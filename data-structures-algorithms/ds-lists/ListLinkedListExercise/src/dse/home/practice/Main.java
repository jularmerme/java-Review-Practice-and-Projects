package dse.home.practice;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        LinkedList<Student> studentLinkedList = new LinkedList<>();
        ArrayList<Student> studentArrayList = new ArrayList<>();

        ArrayList<String> fruits = new ArrayList<>();

        String str = "race car";

        fruits.add("Mango");
        fruits.add("Papaya");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Grapes");


        Object studentCopy;

        //System.out.println("Array is Empty => " + shoppingList.isEmpty());

        Student jhsm = new Student(1, "Jhon", "Smith");
        Student ruca = new Student(2, "Ruby", "Capes");
        Student duca = new Student(3, "Dulci", "Larose");
        Student brch = new Student(4, "Brander", "Chaucer");
        Student kiqu = new Student(5, "Kip", "Quayle");
        Student josa = new Student(6, "Joby", "Sanday");
        Student shwo = new Student(7, "Sheree", "Wodgen");
        Student hoeg = new Student(8, "Honor", "Egell");
        Student muli = new Student(9, "Munmro", "Limpertz");
        Student thke = new Student(10, "Thomas", "Keme");

        studentLinkedList.add(jhsm);
        studentLinkedList.add(ruca);
        studentLinkedList.add(duca);
        studentLinkedList.add(brch);
        studentLinkedList.add(kiqu);

        studentArrayList.add(josa);
        studentArrayList.add(shwo);
        studentArrayList.add(hoeg);
        studentArrayList.add(muli);
        studentArrayList.add(thke);

//        printList(studentLinkedList);
//        printlist(studentArrayList);
//
//        studentLinkedList.addAll(studentArrayList);
//
//        printList(studentLinkedList);
//
//        printList(fruits);
//
//        Collections.sort(fruits);
//
//        printList(fruits);
//
//        Collections.sort(fruits, Collections.reverseOrder());
//
//        printList(fruits);

            char[] charArray = str.toCharArray();


            ArrayList<Character> charArrayList = new ArrayList<>();

            charArrayList = Arrays.asList(charArray);




    }

    private static void printlist(ArrayList<Student> studentArrayList) {
        System.out.println("Student List using ArrayList: ");
        Iterator itr = studentArrayList.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    private static void printList(LinkedList<Student> studentLinkedList) {
        System.out.println("Student List using LinkedList: ");
        Iterator itr = studentLinkedList.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    private static void printList(ArrayList<String> arrayList) {
        System.out.println("Student List using LinkedList: ");
        Iterator itr = arrayList.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}