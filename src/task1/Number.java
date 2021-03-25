package task1;

public class Number {
    public static int getLastSquareNumber(int number){
        int lastNumber = number%10;
        return (lastNumber*lastNumber)%10;
    }
}
