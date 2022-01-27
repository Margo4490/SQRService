package ru.netology.sqr;

public class SQRService {
    public int sqrRange(int lowerLimit, int upperLimit) {
        int count = 0;
        int i;
        for (i = 10; i <= 99; i++) {
            if (i * i >= lowerLimit && i * i <= upperLimit) {
                System.out.println("Число подходит по нижней границе" + "Число подходит по верхней границе");
                count = count + 1;
            }
        }
        return count;
    }

}
