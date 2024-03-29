package CodeJavaVolume.FirstVolume.Part5.equals;

public class EqualText {
    public static void main(String[] args) {
        Employee alice1 = new Employee("Alice Adams", 75000, 1987, 12, 15);
        Employee alice2 = alice1;
        Employee alice3 = new Employee("Alice Adams", 75000, 1987, 12, 15);
        Employee bob = new Employee("Bob Brandson", 50000, 1989, 10, 1);

        System.out.println("alice1=alice2:" + (alice1 == alice2));
        System.out.println("alice1==alice3:" + (alice1 == alice3));
        System.out.println("alice1.CodeJavaVolume.FirstVolume.Part5.equals(alice3:)" + alice1.equals(alice3));
        System.out.println("alice1.CodeJavaVolume.FirstVolume.Part5.equals(bob):" + alice1.equals(bob));
        System.out.println("bob.toString():" + bob);

        Manager carl = new Manager("Carl Cracker", 80000, 1987, 12, 15);
        Manager boss = new Manager("Carl Cracker", 80000, 1987, 12, 15);
        boss.setBonus(5000);
        System.out.println("boss.toString():" + boss);
        System.out.println("carl.CodeJavaVolume.FirstVolume.Part5.equals(boss):" + carl.equals(boss));
        System.out.println("alice1.hashcode():" + alice1.hashCode());
        System.out.println("alice3.hashcode():" + alice3.hashCode());
        System.out.println("bob.hashcode():" + bob.hashCode());
        System.out.println("carl.hashcode():" + carl.hashCode());


    }

}
