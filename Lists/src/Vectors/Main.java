package Vectors;

import java.util.List;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {


        //Vectors are synchronized. Any method that touches the Vector's contents is thread safe.
        //ArrayList , on the other hand, is unsynchronized.

        List<Employee> employeeList = new Vector<>();
        employeeList.add(new Employee("Adam", "X", 1));
        employeeList.add(new Employee("Kuba", "Y", 2));
        employeeList.add(new Employee("Anna", "Z", 3));
        employeeList.add(new Employee("Maja", "O", 4));

        //employeeList.forEach(employee -> System.out.println(employee));
        //System.out.println(employeeList.get(1));
        //System.out.println(employeeList.isEmpty());

        employeeList.set(1, new Employee("Wera", "K", 5));
        //employeeList.forEach(employee -> System.out.println(employee));

        System.out.println(employeeList.size());

        employeeList.add(3, new Employee("Gaja", "M", 6));
        //employeeList.forEach(employee -> System.out.println(employee));

        Employee[] employeeArray = employeeList.toArray(new Employee[0]);
        for (Employee employee : employeeArray) {
            System.out.println(employee);
        }

        System.out.println("-----");

        System.out.println(employeeList.contains(new Employee("Anna", "Z", 3)));
        System.out.println(employeeList.indexOf(new Employee("Maja", "O", 4)));

        employeeList.remove(2);
        employeeList.forEach(System.out::println);

    }
}
