package com.ds;

public class Main {
    public static void main(String[] args) {

        ArrayStack stack = new ArrayStack(10);

        stack.push(new Employee("Jane", "Jones", 123));
        stack.push(new Employee("Mark", "Smith", 412));
        stack.push(new Employee("Bill", "Notes", 369));
        stack.push(new Employee("Anna", "Wrap", 956));
        stack.push(new Employee("Charles", "Stuff", 122));

        stack.printStack();

        System.out.println(stack.peek());

        System.out.println("Popped: " + stack.pop());

        stack.printStack();

    }
}