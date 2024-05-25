package net.home.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        LinkedList<Employee> employees = new LinkedList<>();

        employees.add(new Employee("One", "Employee", 001));
        employees.add(new Employee("Two", "Employee", 002));
        employees.add(new Employee("Three", "Employee", 003));
        employees.add(new Employee("Four", "Employee", 001));
        employees.add(new Employee("Five", "Employee", 002));

        employees.forEach( e -> System.out.println(e));

        HashMap<Integer, Employee> employeetable = new HashMap<>();
        ListIterator<Employee> iterator = employees.listIterator();
        List<Employee> remove = new ArrayList<>();

        while(iterator.hasNext()) {
            Employee employee = iterator.next();
            if(employeetable.containsKey(employee.getId())) {
                remove.add(employee);
            } else {
                employeetable.put(employee.getId(), employee);
            }
        }

        for(Employee employee: remove) {
            employees.remove(employee);
        }

        System.out.println("---------------------------------------");
        employees.forEach( e -> System.out.println(e));
    }
}