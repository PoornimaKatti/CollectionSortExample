import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Employee implements Comparable<Employee> {
    private String ID;
    private String name;
    private String gender;

    public Employee(String ID, String name, String gender) {
        this.ID = ID;
        this.name = name;
        this.gender = gender;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    // Implement Comparable interface to allow sorting based on Name
    @Override
    public int compareTo(Employee otherEmployee) {
        return this.getName().compareTo(otherEmployee.getName());
    }

    // Implementation to sort a collection of employees based on Name
    public static List<Employee> sortEmployeesByName(List<Employee> employees) {
        Collections.sort(employees);
        return employees;
    }

    // Unit test for sorting employees by Name
    public static void main(String[] args) {
        // Creating a list of employees
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("1", "John ", "Male"));
        employees.add(new Employee("2", "Pinky", "Female"));
        employees.add(new Employee("3", "Rinky", "Female"));

        // Sorting the list of employees by Name
        List<Employee> sortedEmployees = sortEmployeesByName(employees);

        // Displaying the sorted list
        for (Employee employee : sortedEmployees) {
            System.out.println(employee.getName());
        }
    }
}
