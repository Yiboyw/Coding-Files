import java.util.HashMap;

/**
 * Created by yibowang on 1/16/18.
 */
public class HashMaps {

    //Purpose of this code is to practice HashMaps
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>(); //initialize a new HashHap called map

        map.put(25, "Weather for January 17, 2018"); //put a Integer key and String value into the HashMap

        map.put(38, "Weather for January 18, 2018");

        map.put(15, "Weather for January 13, 2018");

        map.size(); //finds the size of the map

        System.out.println("Size of Map: " + map.size()); //prints out the size of the map

        Integer key = 25;

        Integer key2 = 38;

        String value2 = map.get(key2); //gets the value of the map that relates to the key2 value

        System.out.println("value2: " + value2); //prints out the value

        String value = map.get(key);

        System.out.println("value: " + value);

        System.out.println("Does HashMap contains 21 as key: " + map.containsKey(21)); //Does HashMap contains 21 as key: false

        System.out.println("Does HashMap contains 25 as key: " + map.containsKey(25)); // Does HashMap contains 25 as key: true
    }
}
