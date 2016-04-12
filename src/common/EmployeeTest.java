/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author ritu
 */
public class EmployeeTest {
    public static void main(String[] args){
        
        // Create four employee objects
        Employee emp1 = new Employee(1, "Jones", "Sally", "111-111-1111");
        Employee emp2 = new Employee(2, "Smith", "Jo", "111-111-1111");
        Employee emp3 = new Employee(3, "River", "Dan", "333-333-3333");
        Employee emp4 = new Employee(4, "Bilbo", "Bill", "444-444-4444");
        
        // Put employees in Hash Map
        Map<String, Employee> empList = new HashMap<>();
        empList.put("3", emp3);
//        empList.put("2", emp2);
//        empList.put("4", emp4);
//        empList.put("1", emp1);

        // Create a collection to loop through Map values
        System.out.println("\nHash Map");
        Collection<Employee> values = empList.values();
        for(Employee e : values){
            System.out.println(e);
        }
        // Loop to get individual pieces of information from Employee object (ex. id, name, ssn)
        System.out.println("\nHash Map Employee Names");
        for(Employee e : values){
            System.out.println("Name: " + e.getFirstName() + " " + e.getLastName());        
        }
        
        // Put employees in Tree Map (order matters)
        Map<String, Employee> empList2 = new TreeMap<>();
        empList2.put("3", emp3);
        empList2.put("2", emp2);
        empList2.put("4", emp4);
        empList2.put("1", emp1);
        
        // Create a collection to loop through Map keys
        System.out.println("\nTree Map");
        Set<String> keys = empList2.keySet();
        for(String key: keys) {
            Employee e = empList2.get(key);
            System.out.println(e);
        }
        
        // Put employees in Tree Set (sorted and duplicates removed)
        Set<Employee> empList3 = new TreeSet<>();
        empList3.add(emp4);
        empList3.add(emp1);
        empList3.add(emp3);
        empList3.add(emp2);
        
        // Loop through tree set
        System.out.println("\nTree Set");
        for(Employee e : empList3) {
            System.out.println(e);
        }
    }
}
