package net.home.example;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        Employee employeeOne = new Employee("One", "Employee", 001);
        Employee employeeTwo = new Employee("Two", "Employee", 002);
        Employee employeeThree = new Employee("Three", "Employee", 003);
        Employee employeeFour = new Employee("Four", "Employee", 004);
        Employee employeeFive = new Employee("Five", "Employee", 005);

        LinkedList<Employee> list = new LinkedList<>();

        list.addFirst(employeeThree);
        list.addFirst(employeeTwo);
        list.addFirst(employeeOne);

        printList(list);

        list.add(employeeFour);

        printList(list);

        list.addLast(employeeFive);

        printList(list);

        list.removeFirst();

        printList(list);

        list.removeLast();

        printList(list);

    }

    public static void printList(LinkedList theList) {
        Iterator itr = theList.iterator();
        System.out.print("HEAD -> ");
        while(itr.hasNext()) {
            System.out.print(itr.next());
            System.out.print(" <=> ");
        }
        System.out.print(" null\n");
    }
}