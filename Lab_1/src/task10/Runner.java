package task10;

import javafx.util.Pair;
import tools.DataScanner;

public class Runner {
    public static void main(String[] args){
        System.out.println("Введите левую границу промежутка");
        DataScanner dataScanner = new DataScanner();
        double a = dataScanner.enterDoubleFromConsole();
        System.out.println("Введите правую границу промежутка");
        double b = dataScanner.enterDoubleFromConsole();
        System.out.println("Введите итерационный шаг");
        double h = dataScanner.enterDoubleFromConsole();
        try {
            Pair<Double, Double>[] table = FunctionTable.tanTable(a, b, h);
            for (int i = 0; i < table.length; i++) {
                System.out.println("x = " + table[i].getKey() + " tg(x) = " + table[i].getValue());
            }
        }catch (IllegalArgumentException illegalArgumentException){
            System.out.println(illegalArgumentException.getMessage());
        }
    }
}
