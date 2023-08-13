package collections;

import java.util.*;
import typeinfo.pets.*;

public class MapOfList {
    public static final Map<Person,List<? extends Pet>>
    petPeople=new HashMap<>();
    static{
        petPeople.put(new Person("Dawn"),Arrays.asList(new Cymric("Molly"),new Mutt("Spot")));
        petPeople.put(new Person("Kate"),Arrays.asList(new Cat("elsie may"),new Cat("shackleton"),new Dog("margrett")));
        petPeople.put(new Person("marilin"),Arrays.asList(new Pug("louie aka Louis Snorkelstein Dupree"),new Cat("Stanford"),new Cat("Pinkola")));
        petPeople.put(new Person("Luke"),Arrays.asList(new Rat("Fuzzy"),new Rat("Fizzy")));
        petPeople.put(new Person("Isaac"),Arrays.asList(new Rat("Freckly")));
    }
    public static void main(String[] args) {
        System.out.println("People: "+petPeople.keySet());
        System.out.println("Pets: "+petPeople.values());
        for(Person person:petPeople.keySet()){
        System.out.println(person+" has:");
        for(Pet pet:petPeople.get(person))
        System.out.println("  "+pet);
    }
}
}