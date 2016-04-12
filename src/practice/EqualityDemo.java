/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author ritu
 */
public class EqualityDemo {
        public static void main(String[]args){
            Person p1 = new Person("Sally", "Smith", "333-33-3333");
            Person p2 = new Person("Sally", "Smith", "333-33-3333");
            Person p3 = new Person("John", "Doe", "444-44-4444");
            if(p1.equals(p2)){
                System.out.println("Persons ARE equal");
            }
            else{
                System.out.println("Persons NOT equal");
            }
            
            // Set<Person> persons = new HashSet<>(); // never use sets for storage, use for transformation
            List<Person> persons = new ArrayList<>(); // lists do not remove duplicates
            persons.add(p1);
            persons.add(p2);
            persons.add(p3);
            
            Set<Person> peopleSet = new HashSet<>(persons); // persons is polymorphic b/c a list is a set
            // duplicates automatically removed if using set and using overriden equals/hash code methods
            
            for(Person p : persons){ 
                System.out.println(p);
            }
            
            persons = new ArrayList<>(peopleSet); // now list no longer has duplicates
        }
    
}
