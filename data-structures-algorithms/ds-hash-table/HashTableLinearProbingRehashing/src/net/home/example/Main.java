package net.home.example;

public class Main {
    public static void main(String[] args) {

        Employee employeeOne = new Employee("One", "Employee", 001);
        Employee employeeTwo = new Employee("Two", "Employee", 002);
        Employee employeeThree = new Employee("Three", "Employee", 003);
        Employee employeeFour = new Employee("Four", "Employee", 004);
        Employee employeeFive = new Employee("Five", "Employee", 005);

        SimpleHashTable ht = new SimpleHashTable();

        ht.put("Jones", employeeOne);
        ht.put("Doe", employeeTwo);
        ht.put("Wilson", employeeThree);

        ht.printHashtable();

        System.out.println("Retrieve key Wilson" + ht.get("Wilson"));

    }
}