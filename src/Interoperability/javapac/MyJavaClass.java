package Interoperability.javapac;

import Interoperability.ktpack.MyCustomKotlinName;
import Interoperability.ktpack.MyKTfileKt;

public class MyJavaClass {

    public static void main(String[] args) {

        int sum = MyKTfileKt.add(5, 5);

        System.out.println("printing from java class .... summation = " + sum);

        int sum2 = MyCustomKotlinName.add2(5, 6);
        System.out.println("printing from java class and using custom class name .... summation = " + sum2);


    }

    public static int ractangle(int a, int b) {

        return a * b;
    }

}

