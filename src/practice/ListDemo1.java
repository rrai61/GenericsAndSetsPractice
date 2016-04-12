/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 *
 * @author ritu
 */
public class ListDemo1 {
    public static void main(String[]args){
        //List shoppingList = new ArrayList(); // only stores objects
        //List<String> shoppingList = new ArrayList<>(); // using generics limited to 1 datatype
        Set<String> shoppingList = new HashSet<>();
                 
        // <String> is a generic identifier
        // shoppingList.add(5); // autoboxing since JDK 5
        // shoppingList.add(new Integer(5)); --> boxing primitives
        
        shoppingList.add("Beer");
        shoppingList.add("Chips");
        shoppingList.add("Beer"); // duplicate items allowed in a list (but not in a set)
        shoppingList.add("Nuts");
        
        int size = shoppingList.size();
        
        // String item = (String)shoppingList.get(1); --> if not using generics
        //shoppingList.set(1, "Steak"); // replace Chips with Steak
        //shoppingList.remove(1);
        //shoppingList.remove("Chips");
        
        // ***LOOPS*** 
//        
//        Iterator<String> j = shoppingList.iterator();
//        while(j.hasNext()){
//            String item = j.next(); // needs generics
//            System.out.println(item);
//        }
//        
//        for(int i=0; i<size; i++){
//            String item = shoppingList.get(i);
//            System.out.println(item);
//        }
//        
        // foreach loop as of JDK 5 and using generics
        for(String s: shoppingList){
            System.out.println(s);
        }
//        
    }
}
