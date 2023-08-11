package collections;
import typeinfo.pets.*;
import java.util.*;
public class CrossCrectionIteration2 {
    public static void display(Iterable<Pet> ip) {
      Iterator<Pet> it=ip.iterator();
      while(it.hasNext()){
        Pet p=it.next();
        System.out.print(p.id()+":"+p+" ");
      }
        
        System.out.println();
    }
    public static void main(String[] args) {
        List<Pet> pets=Pets.arrayList(8);
        LinkedList<Pet> petsLL=new LinkedList<>(pets);
        HashSet<Pet> petsHS=new HashSet<>(pets);
        TreeSet<Pet> petsTS=new TreeSet<>(pets);
        display(pets);
        display(petsLL);
        display(petsHS);
        display(petsTS);
    }
}
