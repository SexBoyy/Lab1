package by.epamtc.util.tool;
import java.awt.*;
import java.util.Scanner;

public class DataScanner  {
    public static int enterIntFromConsole(){
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()){
            scanner.next();
        }
        int number = scanner.nextInt();
        //scanner.close();
        return number;
    }
    public static double enterDoubleFromConsole(){
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextDouble()){
            scanner.next();
        }
        double number = scanner.nextDouble();
        return number;
    }
    public static Point enterPointFromConsole() {
        int x = enterIntFromConsole();
        int y = enterIntFromConsole();
        return new Point(x, y);
    }
}
