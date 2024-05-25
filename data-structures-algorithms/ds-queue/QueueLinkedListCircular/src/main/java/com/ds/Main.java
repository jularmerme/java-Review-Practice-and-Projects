package com.ds;

public class Main {
    public static void main(String[] args) {

        ArrayQueue queue = new ArrayQueue(5);

        Employee employeeOne = new Employee("Jane", "Jones", 123);
        Employee employeeTwo = new Employee("Mark", "Smith", 412);
        Employee employeeThree = new Employee("Bill", "Notes", 369);
        Employee employeeFour = new Employee("Anna", "Wrap", 956);
        Employee employeeFive = new Employee("Charles", "Stuff", 122);

        queue.add(employeeFive);
        queue.add(employeeOne);
        queue.remove();
        queue.add(employeeTwo);
        queue.remove();
        queue.add(employeeThree);
        queue.remove();
        queue.add(employeeFour);
        queue.remove();
        queue.add(employeeFive);

        queue.printQueue();

    }
}