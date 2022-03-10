package by.itland.itjava.timshina.lesson16;

import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String value = scanner.next();
            if (value.equalsIgnoreCase("end")) {
                break;
            }
            value = value.replaceAll("[^A-Za-z']", "");

            if(map.containsKey(value)){
                map.put(value, map.get(value)+1);
            }
            else
                map.put(value, 1);

        }
        System.out.println(map);
    }
}
