package ru.training.intro.third;

import static java.lang.Math.PI;

/**
 * Created by Narek on 12.12.2016.
 */
class Main {
    public static void main(String[] args){
        Function function=new Function(-5, PI, 0.01);
        function.values();
    }
}
