package by.itland.itjava.timshina.lesson17;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            System.out.println(x/y);
        }
        catch (Exception e){
            System.out.println("что-то");
        }finally {

            System.out.println("сработал finally4");
        }


    }
}
