package mpp.TreeMap;

import java.util.HashMap;
import java.util.TreeMap;

public class MyTreeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating an empty TreeMap
        TreeMap<Integer, String> tree_map
            = new TreeMap<Integer, String>();
 
        // Mapping string values to int keys
        // using put() method
        tree_map.put(10, "Geeks");
        tree_map.put(15, "4");
        tree_map.put(20, "Geeks");
        tree_map.put(25, "Welcomes");
        tree_map.put(30, "You");        
 
        // Printing the elements of TreeMap
        System.out.println("TreeMap: " + tree_map);
        
        HashMap<String, Integer> map = new HashMap<>();
        
        // Adding elements to the Map
        // using standard add() method
        map.put("vishal", 10);
        map.put("sachin", 30);
        map.put("vaibhav", 20);
 
        // Print size and content of the Map
        System.out.println("Size of map is: "
                           + map.size());
 
        // Printing elements in object of Map
        System.out.println(map);
	}

}
