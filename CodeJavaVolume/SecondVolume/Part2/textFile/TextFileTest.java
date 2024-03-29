package CodeJavaVolume.SecondVolume.Part2.textFile;


import CodeJavaVolume.FirstVolume.Part5.equals.Employee;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.util.Scanner;


public class TextFileTest {
    public static void main(String[] args) throws IOException {
        var staff = new Employee[4];

        staff[0] = new Employee("Carl Cracker", 75000, 1987, 12, 15);
        staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tony Tester", 40000, 1990, 3, 15);
        staff[3] = new Employee("Tony Tester", 40000, 1990, 3, 15);
        try (var out = new PrintWriter("employee.dat", StandardCharsets.UTF_8)) {
            writeData(staff, out);

        }
        try (var in = new Scanner(new FileInputStream("employee.dat"), StandardCharsets.UTF_8)) {
            Employee[] newstaff = readData(in);
            for (Employee e : newstaff)
                System.out.println(e);


        }


    }

    private static void writeData(Employee[] employees, PrintWriter out) throws IOException {
        out.println(employees.length);
        for (Employee e : employees) {
            writeEmployee(out, e);
        }
    }

    private static Employee[] readData(Scanner in) {
        int n = in.nextInt();
        in.nextLine();
        var employees = new Employee[n];
        for (int i = 0; i < n; i++) {
            employees[i] = readEmployee(in);

        }
        return employees;
    }

    private static void writeEmployee(PrintWriter out, Employee e) {
        out.println(e.getName() + "|" + e.getSalary() + "|" + e.getHireDay());
    }

    public static Employee readEmployee(Scanner in) {
        String line = in.nextLine();
        String[] tokens = line.split("\\|");
        String name = tokens[0];
        double salary = Double.parseDouble(tokens[1]);
        LocalDate hiredate = LocalDate.parse(tokens[2]);
        int year = hiredate.getYear();
        int month = hiredate.getMonthValue();
        int day = hiredate.getDayOfMonth();
        return new Employee(name, salary, year, month, day);

    }
}