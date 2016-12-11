package ru.training.intro.third;

import static java.lang.Math.tan;

/**
 * Created by Narek on 12.12.2016.
 */
class Function {

    private double a;   // a - начало отрезка на котором вычисляется функция
    private double b;   // b - конец отрезка на котором вычисляется функция
    private double h;   // h - шаг дискретизации

    protected Function(double a, double b, double h){
        this.a=a;
        this.b=b;
        this.h=h;
    }

    /*Метод вычисляет значение функции
    * на отрезке [a, b] с шагом h и выводит
    * результаты в таблицу*/

    protected strictfp void values(){
        /*Выделяем количество итераций,
        * берем всю длину отрезка и смотрим сколько
        * шагов целочисленно входит в данный отрезок.
        * (т.к. цикл for с типами double работает некорректно)
        * */
        int amount=(int)((b-a)/h);
        double f=0; // значение функции
        printHead(); // выводит заголовок таблицы x и f(x)
        for(int i=amount; i>=0; i--, a+=h){
            f=tan(2*a)-3;
            printValues(a,f); // вывод аргумента и значения функции в таблицу
        }
    }

    private static void printHead(){
        System.out.printf("%5s  %12s%n","x", "f(x)");
    }

    private static void printValues(double x, double f){
        System.out.printf("%6.2f %13.4f%n", x, f);
    }
}
