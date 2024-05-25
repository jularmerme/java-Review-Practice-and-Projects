package com.ds;

public class Main {
    public static void main(String[] args) {

        ArrayQueue queue = new ArrayQueue(10);

        Employee employeeOne = new Employee("Jane", "Jones", 123);
        Employee employeeTwo = new Employee("Mark", "Smith", 412);
        Employee employeeThree = new Employee("Bill", "Notes", 369);
        Employee employeeFour = new Employee("Anna", "Wrap", 956);
        Employee employeeFive = new Employee("Charles", "Stuff", 122);

        queue.add(employeeOne);
        queue.add(employeeTwo);
        queue.add(employeeThree);
        queue.add(employeeFour);
        queue.add(employeeFive);

        queue.printQueue();

        System.out.println("\nStack Peek => " + queue.peek());

        System.out.println("\nStack Popped: " + queue.remove());

        queue.printQueue();

    }
}