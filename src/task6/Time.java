package task6;

public class Time {
    public static int calcSeconds(int seconds) throws IllegalArgumentException{
        return (seconds - 3600*calcHours(seconds)-60*calcMinutes(seconds));
    }
    public static int calcMinutes(int seconds) throws IllegalArgumentException{
        return (seconds - 3600*calcHours(seconds))/60;
    }
    public static int calcHours(int seconds) throws IllegalArgumentException {
        if(seconds>=MAX_SECONDS) throw new IllegalArgumentException("Секунд больше чем сутках");
        if(seconds<0) throw new IllegalArgumentException("Отрицательное число секунд");
        return seconds / 3600;
    }
    public static int MAX_SECONDS = 24*3600;
}
