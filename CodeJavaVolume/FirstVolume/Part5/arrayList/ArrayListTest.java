package CodeJavaVolume.FirstVolume.Part5.arrayList;

import java.util.*;

import CodeJavaVolume.FirstVolume.Part5.equals.Employee;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Employee> staff=new ArrayList<>();
        staff.add(new Employee("Carl Cracker", 75000, 1987, 12, 15));
        staff.add(new Employee("Harry Hacker", 50000, 1989, 10, 1));
        staff.add(new Employee("Tony Tester", 40000, 1990, 3, 15));
        for(Employee e:staff)
        e.raiseSalary(100);
        int n=staff.size()/2;
        staff.add(n,new Employee("Bob Baxter", 50000, 1989, 3, 15));
        for(Employee e:staff)
        System.out.println("name="+e.getName()+",salary="+e.getSalary()+",hireday="+e.getHireDay());
    }
    
}