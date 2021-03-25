package task4;

public class EvenNumbers {
    public static boolean isTwoNumbersEven(int numberA, int numberB, int numberC, int numberD){
        int amountEvenNumbers = 0;
        if (isEvenNumber(numberA)) ++amountEvenNumbers;
        if (isEvenNumber(numberB)) ++amountEvenNumbers;
        if (isEvenNumber(numberC)) ++amountEvenNumbers;
        if (isEvenNumber(numberD)) ++amountEvenNumbers;
        return amountEvenNumbers>=2;
    }
    private static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}
