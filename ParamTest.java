 /**
 * This program demonstrates parameter passing in Java.
 * ©version 1.00 2000-01-27
 * author Cay Horstmann
 **/
 public class ParamTest{
public static void main(String[] args) {
  System.out.println("Testing tripleValue:");
  double percent=10;
  System.out.println("Before:percent"+percent);
  tripleValue(percent);
  System.out.println("After:percent"+percent);
  System.out.println("\nTesting tripleSalary");
  Employee harry=new Employee("Harry",5000);
  System.out.println("\nTesting swap:");
Employee a = new Employee("Alice", 70000);
Employee b = new Employee("Bob", 60000);
System.out.println("Before: a=" + a.getName());
System.out.println("Before: b=" + b. getName());
swap(a, b);
System.out.println("After: a=" + a.getName());
System.out.println("After: b=" + b.getName());}
public static void tripleValue(double x) // doesn't work
{
  x=3*x;
  System.out.println("End of method:salary="+x);
}
public static void tripleSalary(Employee x) {
  x.raiseSalary(200);
  System.out.println("End of method:salary"+x.getSalary());
  }
  public static void swap(Employee x , Employee y)
{
Employee temp = x;
x = y ;
y = temp;
System.out.println("End of method: x=" + x .getName());
System.out.println("End of method: y=" + y.getName());
}}
class Employee{
  private String name;
  private double salary;
  public Employee(String n,double s){
    name=n;
    salary=s;
  }
  public String getName(){
    return name;
  }
  public double getSalary(){
    return salary;
  }
  public void raiseSalary(double bypercent){
    double raise=salary*bypercent/100;

  }
}