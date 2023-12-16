package practice_project_6;



import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {

    public static void main(String[] args) {
        // HashMap example
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);
        System.out.println("HashMap: " + hashMap);

        // Accessing elements in HashMap
        System.out.println("Value for key 'Two': " + hashMap.get("Two"));

        // Checking if a key exists in HashMap
        String keyToCheck = "Four";
        System.out.println("Does HashMap contain key '" + keyToCheck + "': " + hashMap.containsKey(keyToCheck));

        // Iterating over HashMap using entrySet
        System.out.println("Iterating over HashMap:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // TreeMap example (sorted map)
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Banana", 10);
        treeMap.put("Apple", 5);
        treeMap.put("Orange", 8);
        System.out.println("TreeMap: " + treeMap);

        // Accessing elements in TreeMap
        System.out.println("Value for key 'Apple': " + treeMap.get("Apple"));

        // Checking if a key exists in TreeMap
        keyToCheck = "Grapes";
        System.out.println("Does TreeMap contain key '" + keyToCheck + "': " + treeMap.containsKey(keyToCheck));

        // Iterating over TreeMap using entrySet
        System.out.println("Iterating over TreeMap:");
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

