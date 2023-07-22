package ru.otus.java.basic.lesson3;

public class MainApp {
   /* public static void main(String[] args) {
        int a = 200;
        int b = 110;
        int sum = a + b;
        // 2 + 1 = 3
        System.out.println(a + " + " + b + " = " + sum);

        System.out.println("a" + 1 + 1); // a11 (после конкатенации (скобками) джава приравнивает все к строкам)
        System.out.println("a" + (1 + 1)); // a2 по матем закону приоритет скобок идет поэтому будет так
        System.out.println(1 + 1 + "a");  // 2a (до конкатенации (скобками) джава видит число и после добавляет текст)
        System.out.println(1 + 1 + "a" + 1 + 1);  //2a11
    }*/


    public static void main(String[] args) {
        System.out.println("A\nB"); // \n - перенести вторую букву на следующую строку
        // println (распечатать строку) - команда распечатать что в скобках будет и спуститься на следующую строку

        System.out.println("A"); // простой вариант с двумя выводами строк
        System.out.println("B");

        // print (распечатать значение в скобках и не перепрыгивать на строку ниже)
        System.out.print("ABC");
        System.out.print("ABC");
    }
}