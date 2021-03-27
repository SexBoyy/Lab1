package by.epamtc.task.task1;

public class Number {
    public static int calcLastSquareNumber(int number) {
        int lastNumber = number % 10;
        return (lastNumber * lastNumber) % 10;
    }
}
