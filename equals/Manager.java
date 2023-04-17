package equals;

public class Manager extends Employee {
    private double bonus;

public Manager(String name,double salary,int year,int month,int day){
    super(name, salary, year, month, day);
    bonus=0;
}    
public double getSalary()
{
double baseSalary = super.getSalary() ;
return baseSalary + bonus;}
public void setBonus(double bonus){
    this.bonus=bonus;
}
public boolean equals(Object othrObject){
    if(!super.equals(othrObject)) return false;
    Manager other=(Manager)othrObject;
    return bonus==other.bonus;
}
public int hashCode(){
    return super.hashCode()+17* Double.valueOf(bonus).hashCode();
}
public String tostring(){
    return super.toString()+"[bonus="+bonus+"]";
}
}
