import java.util.*;

public class Mapping {
    public static void main(String[] args) {
        //duplicate values are allowed, but dupplicates keys are not allowed
        //it follows the hashing technique
        //mapping -> Key-value pair
        //HashMap -> it is non-synchronized and it is not thread-safe
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Naresh");
        map.put(2, "Kumar");
        map.put(3, "Reddy");
        map.put(4, "Naresh"); // duplicate value
        map.put(1, "Naresh"); // duplicate key
        map.put(null, null); // null key and null value
        map.put(null, "Naresh"); // null key and non-null value
        System.out.println(map);
        System.out.println(map.get(3));
        map.putIfAbsent(11,"hello");
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());
        for (Map.Entry<Integer, String> e : map.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
        /* 
         * mapping methods:
         * .put(key, value) -> to insert key-value pair
         * .get(key) -> to get the value based on the key
         * .keySet() -> to get all the keys
         * .values() -> to get all the values
         * .entrySet() -> to get all the key-value pairs
         * .remove(key) -> to remove the key-value pair based on the key
         * .clear() -> to remove all the key-value pairs
         * .size() -> to get the size of the map
         * .containsKey(key) -> to check if the key is present or not
         * .containsValue(value) -> to check if the value is present or not
         * .isEmpty() -> to check if the map is empty or not
         * .clone() -> to clone the map
         * .equals() -> to compare two maps
         * .forEach() -> to iterate the map
         * .merge() -> to merge two maps
         * .compute() -> to compute the value based on the key
         * .replace() -> to replace the value based on the key
         * .putIfAbsent() -> to insert the key-value pair if the key is not present
         * .putAll() -> to insert all the key-value pairs from another map
         * .getOrDefault() -> to get the value based on the key, if the key is not present, return the default value
         * 
        */
        

    }
}
