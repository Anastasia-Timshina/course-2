package by.itland.itjava.timshina.lesson16;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        List<Integer> collect = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            collect.add(i+1);
        }
        System.out.println(collect);
            int count = 0;
        while(collect.size() != 1){
        Iterator<Integer> iterator = collect.iterator();
            while(iterator.hasNext()){
                iterator.next();
                count++;
                if(count % 2==0){
                    iterator.remove();
                    System.out.println(collect);
                }
            }
        }
        System.out.println(collect);
        //сергей, с днём рождения
    }

}
