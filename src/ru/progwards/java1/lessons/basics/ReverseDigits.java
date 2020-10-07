package ru.progwards.java1.lessons.basics;

public class ReverseDigits {
    public static int reverseDigits(int number) {
        String str1 = Integer.toString(number);
        String revers = new StringBuffer(str1).reverse().toString();
        return Integer.parseInt(revers);
    }

    public static void main(String[] args){
        System.out.println(reverseDigits(123));
    }
}
