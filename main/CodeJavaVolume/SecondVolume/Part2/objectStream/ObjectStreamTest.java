package CodeJavaVolume.SecondVolume.Part2.objectStream;


import CodeJavaVolume.FirstVolume.Part5.equals.Employee;
import CodeJavaVolume.FirstVolume.Part5.equals.Manager;

import java.io.*;

public class ObjectStreamTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        var harry = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        var carl = new Manager("Harry Hacker", 50000, 1942, 3, 2);
        carl.setSecretary(harry);
        var tony = new Manager("TonyTester", 40000, 1990, 7, 2);
        tony.setSecretary(harry);

        var staff = new Employee[3];

        staff[0] = carl;
        staff[1] = harry;
        staff[2] = tony;

        try (var out = new ObjectOutputStream(new FileOutputStream("employee.dat"))) {
            out.writeObject(staff);

        }
        try (var in = new ObjectInputStream(new FileInputStream("employee.dat"))) {
            var newStaff = (Employee[]) in.readObject();
            newStaff[1].raiseSalary(10);
            for (Employee e : newStaff)
                System.out.println(e);


        }

    }
}

