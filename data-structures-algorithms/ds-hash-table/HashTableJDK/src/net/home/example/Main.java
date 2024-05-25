package net.home.example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Employee employeeOne = new Employee("One", "Employee", 001);
        Employee employeeTwo = new Employee("Two", "Employee", 002);
        Employee employeeThree = new Employee("Three", "Employee", 003);
        Employee employeeFour = new Employee("Four", "Employee", 004);
        Employee employeeFive = new Employee("Five", "Employee", 005);

        Map<String, Employee> hashMap = new HashMap<String, Employee>();

        hashMap.put("Jones", employeeOne);
        hashMap.put("Doe", employeeTwo);
        hashMap.put("Smith", employeeThree);

        Iterator<Employee> iterator = hashMap.values().iterator();

        hashMap.putIfAbsent("Doe", employeeFive);

        /*while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }*/

        hashMap.put("Four", employeeFour);

        System.out.println(hashMap.containsKey("Doe"));

        hashMap.forEach((k,v) -> System.out.println("Key = " + k + ", Employee = " + v));

    }
}