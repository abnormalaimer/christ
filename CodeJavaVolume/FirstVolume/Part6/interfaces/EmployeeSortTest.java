package CodeJavaVolume.FirstVolume.Part6.interfaces;

import java.util.*;

public class EmployeeSortTest {
    public static void main(String[] args) {
        Employee[] staff=new Employee[3];

        staff[0]=new Employee("harry hacker", 35000);
        staff[1]=new Employee("Carl Cracker", 75000);
        staff[2]=new Employee("Tony tester", 38000);

        Arrays.sort(staff);

        for(Employee e:staff)
            System.out.println("name="+e.getName()+",salary="+e.getSalary());

    }
    
}
