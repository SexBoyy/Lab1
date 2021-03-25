package task1;
import tools.DataScanner;

public class Runner {
    public static void main(String[] args){
        System.out.println("Введите число");
        DataScanner dataScanner = new DataScanner();
        int number = dataScanner.enterIntFromConsole();
        System.out.println("Последняя цифра квадрата числа = " + Number.getLastSquareNumber(number));
        dataScanner.close();
    }
}
