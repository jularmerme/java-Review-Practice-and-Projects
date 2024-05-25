package com.ds;


import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedStack {

    private LinkedList<Employee> stack;

    public LinkedStack() {
        stack = new LinkedList<Employee>();
    }

    public void push(Employee employee) {
        stack.push(employee);
    }

    public Employee pop() {
        return stack.pop();
    }

    public Employee peek()
    {
        return stack.peek();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void printStack() {
        int counter = 0;
        ListIterator<Employee> iterator = stack.listIterator();
        while(iterator.hasNext()) {
            if(counter == 0)
                System.out.print("\nStack Top => ");
            else
                System.out.print("\t\t\t ");
            System.out.println(iterator.next());
            counter++;
        }
    }
}
