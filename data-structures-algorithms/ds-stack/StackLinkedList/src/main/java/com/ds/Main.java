package com.ds;

public class Main {
    public static void main(String[] args) {

        Employee employeeOne = new Employee("Jane", "Jones", 123);
        Employee employeeTwo = new Employee("Mark", "Smith", 412);
        Employee employeeThree = new Employee("Bill", "Notes", 369);
        Employee employeeFour = new Employee("Anna", "Wrap", 956);
        Employee employeeFive = new Employee("Charles", "Stuff", 122);

        LinkedStack stack = new LinkedStack();

        stack.push(employeeOne);
        stack.push(employeeTwo);
        stack.push(employeeThree);
        stack.push(employeeFour);
        stack.push(employeeFive);

        stack.printStack();

        System.out.println("\nStack Peek => " + stack.peek());

        System.out.println("\nStack Popped: " + stack.pop());

        stack.printStack();

    }
}