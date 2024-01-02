package Employeetest;

import java.time.LocalDate;

/**
 * @author christ
 * @version 2023-3-28
 */
public class EmployeeTest {
    public static void main(String[] args) {

        Employee herry = new Employee(3, "Tony Tester", 40000, 1990, 3, 15);
        Employee petter = new Employee(4, "petter Tester", 40000, 1990, 3, 15);
        herry.setId();
        petter.setId();
        System.out.println(herry.getName() + "'s id is " + herry.getId());
        System.out.println(petter.getName() + "'s id is " + petter.getId());


    }
}

class Employee {
    private static int nextId = 1;
    private int id;
    private final String name;
    private double salary;
    private final LocalDate hireDay;

    public Employee(int b, String n, double s, int year, int month, int day) {
        id = b;
        name = n;
        salary = s;
        hireDay = LocalDate.of(year, month, day);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }


    public int getId() {
        return id;
    }

    public void setId() {
        id = nextId;
        nextId++;
    }
}
  