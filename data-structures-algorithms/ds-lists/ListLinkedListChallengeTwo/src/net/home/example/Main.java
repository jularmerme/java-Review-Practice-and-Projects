package net.home.example;

public class Main {
    public static void main(String[] args) {

        Employee employeeOne = new Employee("One", "Employee", 001);
        Employee employeeTwo = new Employee("Two", "Employee", 002);
        Employee employeeThree = new Employee("Three", "Employee", 003);
        Employee employeeFour = new Employee("Four", "Employee", 004);
        Employee employeeFive = new Employee("Five", "Employee", 005);

        EmployeeLinkedList list = new EmployeeLinkedList();

        list.addToFront(employeeOne);
        list.addToFront(employeeTwo);
        list.addToFront(employeeThree);
        list.addToFront(employeeFour);
        list.addToFront(employeeFive);

        System.out.println(list.isEmpty());

        System.out.println(list.getSize());

        list.printList();

        list.removeFromFront();

        System.out.println(list.getSize());

        list.printList();

    }
}