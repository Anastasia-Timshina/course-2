package by.itland.itjava.Artyr000.lesson02;
import java.util.Scanner;

public class DistanceBetweenTwoPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        double result = Math.sqrt(Math.pow(y2-y1, 2)+ Math.pow(x2-x1, 2) );
        System.out.printf("Расстояние между тачками A(%d, %d) и B(%d, %d): %.3f", x1,y1,x2,y2,result);
    }
}