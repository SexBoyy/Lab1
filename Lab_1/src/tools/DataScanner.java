package tools;
import java.awt.*;
import java.util.Scanner;

public class DataScanner  {
    public DataScanner(){
        scanner = new Scanner(System.in);
    }
    public /*static*/ int enterIntFromConsole(){
        //Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()){
            scanner.next();
        }
        int number = scanner.nextInt();
        //scanner.close();
        return number;
    }
    public double enterDoubleFromConsole(){
        while (!scanner.hasNextDouble()){
            scanner.next();
        }
        double number = scanner.nextDouble();
        return number;
    }
    public Point enterPointFromConsole(){
        int x = enterIntFromConsole();
        int y =enterIntFromConsole();
        return new Point(x,y);
    }
    public void close(){
        scanner.close();
    }
    private Scanner scanner;
}
