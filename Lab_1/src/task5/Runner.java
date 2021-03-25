package task5;

import tools.DataScanner;

public class Runner {
    public static void main(String[] args){
        DataScanner dataScanner = new DataScanner();
        System.out.println("Введите число");
        int number = dataScanner.enterIntFromConsole();
        try {
            if (PerfectNumber.isPerfectNumber(number)) System.out.println("true");
            else System.out.println("false");
        }catch (IllegalArgumentException illegalArgumentException){
            System.err.println(illegalArgumentException.getMessage());
        }
        dataScanner.close();
    }
}
