package ru.progwards.java1.lessons.basics;

public class AccuracyDoubleFloat {
    public static double volumeBallDouble(double radius) {
        double V1;
        V1 = ((double) 4) / 3 * 3.14 * radius * radius * radius;
        return V1;
    }
    public static float volumeBallFloat(float radius) {
        float V2;
        V2 = ((float) 4) / 3 * ((float) 3.14) * radius * radius * radius;
        return V2;
    }
    public static double calculateAccuracy(double radius) {
        return volumeBallDouble(radius) - volumeBallFloat((float) radius);
    }

    public static void main(String[] args) {
        System.out.println(volumeBallDouble(6371.2));
        System.out.println(volumeBallFloat(6371.2F));
        System.out.println(calculateAccuracy(1));
    }
}
