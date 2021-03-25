package task6;

import tools.DataScanner;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Введите число секунд");
        DataScanner dataScanner = new DataScanner();
        int allSeconds = dataScanner.enterIntFromConsole();
        try {
            int seconds = Time.calcSeconds(allSeconds);
            int minutes = Time.calcMinutes(allSeconds);
            int hours = Time.calcHours(allSeconds);
            System.out.println("Время - " + hours + ":" + minutes + ":" + seconds);
        }catch (IllegalArgumentException illegalArgumentException){
            System.err.println(illegalArgumentException.getMessage());
        }
        dataScanner.close();
    }
}
