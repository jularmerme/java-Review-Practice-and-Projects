import org.home.learning.Employee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee("Jane", "Jones", 123));
        employeeList.add(new Employee("Jhonny", "Smith", 423));
        employeeList.add(new Employee("Homer", "Simpson", 908));
        employeeList.add(new Employee("Marge", "McCarty", 447));

        // employeeList.forEach( e -> System.out.println(e) );

        System.out.println(employeeList.get(1));

        Iterator itr = employeeList.iterator();

        while(itr.hasNext()) {
           //  System.out.println(itr.next());
        }




    }
}