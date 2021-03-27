package by.epamtc.task.task10;


import javafx.util.Pair;
import by.epamtc.util.tool.DataScanner;



public class Runner {

    public static void printTable(Pair<Double,Double>[] table){
        for (Pair<Double, Double> doubleDoublePair : table) {
            System.out.println("x = " + doubleDoublePair.getKey() + " tg(x) = " + doubleDoublePair.getValue());
        }
    }

    public static void main(String[] args) {
        System.out.println("Введите левую границу промежутка");
        double a = DataScanner.enterDoubleFromConsole();
        System.out.println("Введите правую границу промежутка");
        double b = DataScanner.enterDoubleFromConsole();
        System.out.println("Введите итерационный шаг");
        double h = DataScanner.enterDoubleFromConsole();
        try {
            Pair<Double, Double>[] table = FunctionTable.tanTable(a, b, h);
            printTable(table);
        } catch (IllegalArgumentException illegalArgumentException) {
            System.out.println(illegalArgumentException.getMessage());
        }
    }
}
