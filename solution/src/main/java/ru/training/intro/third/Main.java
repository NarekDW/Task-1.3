package ru.training.intro.third;

import java.util.Scanner;

/**
 * Created by Narek on 12.12.2016.
 */
class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args){
        double[] range = getRange();
        Function function=new Function(range[0], range[1], range[2]);
        function.values();
    }

    private static double[] getRange(){
        double[] r = new double[3];
        System.out.println("Задайте начало отрезка:");
        r[0] = scan.nextDouble();
        System.out.println("Задайте конец отрезка:");
        r[1] = scan.nextDouble();
        System.out.println("Задайте шаг:");
        r[2] = scan.nextDouble();
        return r;
    }
}
