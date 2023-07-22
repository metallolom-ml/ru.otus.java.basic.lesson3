package ru.otus.java.basic.lesson3;

import javax.print.attribute.standard.PresentationDirection;
import java.sql.SQLOutput;

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


    /*public static void main(String[] args) {
        System.out.println("A\nB"); // \n - перенести вторую букву на следующую строку
        // println (распечатать строку) - команда распечатать что в скобках будет и спуститься на следующую строку

        System.out.println("A"); // простой вариант с двумя выводами строк
        System.out.println("B");

        // print (распечатать значение в скобках и не перепрыгивать на строку ниже)
        System.out.print("ABC");
        System.out.print("ABC");
    }*/

    // 10 > 5 = true (истина)
    // 5 > 10 = false (ложь)
    // 2 > 1 && 3 > 0 = true (&& - (амперсант) "И")
    // 1 > 0 || 0 > 1 = true ( || - "ИЛИ")
    // !(10 > 0) = false  ( ! - "НЕ")
    // boolean isCold = temperature < -20;
    // if (temperature > 25) { // жарко  (if - если)
    // int x = 5;
    // !(x != 10) && x > 0 = false; (х не равен 10 - да, но перед скобками !(не) - значит переворачивается значение с "да" на "нет")
    // int a = 1; int b = 2;
    // a + b > 0 = true (1+2=3; 3>0 - да)


    /*public static void main(String[] args) {
        int val = 10; (val - value - объявление целочисленной переменной число)
        val++;  //увеличить значение val на 1
        val--;  //уменьшить значение val на 1
        val += 10;  //прибавить к val 10
        val += 1;  //так тоже мжно уеличить значение val на 1, по лучше истользовать ++
        val -= 10;  //вычесть из val 10
        val *= 10;  // умножить val на 10
        val /= 10;  //поделить val на 10
        val = 10;  //присвоить val значение 10
        int val12 = 20 % 7;  //деление по модулю (остаток от деления)*/


    /*public static void main(String[] args) {
        System.out.println("-----");
        System.out.println("|   |");
        System.out.println("|   |");
        System.out.println("|   |");
        System.out.println("-----");
    }*/

    // drawManyRectangles - имена методов, также как и имена переменных пишутся в camelCase (верблюжий стиль) без пробелов, точек и подверкиваний
    // Методы могут находиться ТОЛЬКО внутри тела класса
    // Метод нельзя объявить внутри другого метода!!!!!
    // drawRectangle() - вызов метода происходит с помощью скобок после названия метода
    // () - список аргументов находится в скобках

    /*public static void main(String[] args) {  // один метод вызывает второй метод, который вызывает третий метод, в котором уже выполнен чертеж коробки.
        drawManyRectangles();                 //два раза вызывается метод который печатает три раза коробку из третьего метода, где коробка собрана
        drawManyRectangles();
    }

    public static void drawManyRectangles() {  // один метод вызывает второй метод, в котором уже выполнен чертеж коробки.
        drawRectangle();
        drawRectangle();
        drawRectangle();
    }
    public static void drawRectangle() {
        System.out.println("-----");
        System.out.println("|   |");
        System.out.println("|   |");
        System.out.println("|   |");
        System.out.println("-----");
    }*/


    /*  public static void main(String[] args) {  // метод sumAndPrint с заданными данными
          sumAndPrint();
      }

      public static void sumAndPrint() {
          int a = 1;
          int b = 2;
          int res = a + b;
          System.out.println("res: " + res);
      }*/

    // sumAndPrint(1, 1, 3); - нельзя вызвать метод не указав все его аргументы!!

    /*  public static void main(String[] args) {  // более удачный метод sumAndPrint
          sumAndPrint(1, 1, 3);
          sumAndPrint(3, 5, 2);
          sumAndPrint(31, 33, 12);
      }

      public static void sumAndPrint(int a, int b, int c) {
          int res = a + b + c;
          System.out.println("res: " + res);
      }*/

    // Возможные проверки
    // < - меньше
    // <= - меньше или равно
    // > - больше
    // >= - больше или равно
    // == - равно
    //!= - не равно

    // Возможное использование логических операторов && (И), || (ИЛИ), ! (НЕ)
    // int a = 10;
    // int b = 20;
    //boolean bV = true;
    // if (a > 10 && a < 20) - если значение переменной а одновременно (И) больше 10 и меньше 20
    // if (a == 0 || a > 100) - если значение переменной равно 0 ИЛИ больше 100
    // if (a == 0 || b == 0) - если значение переменной а или b равно 0
    // if (bV) - если значение переменной bV равно true (b - boolean)
    // if (!bV) - если значение переменной bV равно false (b - boolean)

    //boolean b = false;
    // if (b == false) { смысл этой строки и строки ниже одинаков (if (!b))
    // if (!b) {


    /*public static void main(String[] args) {
        int temperature = 10;       // final temperature - константа температуры.
        if (temperature >= 0) {     // if - если
            System.out.println("Тепло");
        } else {                            // else - еще; необязательный блок, нужно смотреть условия метода
            System.out.println("Холодно");
        }
    }*/

  /*  public static void main(String[] args) {  // плохой вариант кода с циклами
        int a = 10;
        System.out.println(a);
        a++;
        System.out.println(a);
        a++;
        System.out.println(a);
        a++;
        System.out.println(a);
    }*/

    /*public static void main(String[] args) {  // более удачный код с циклами
        int a = 10;
        while (a < 50) {  // while - до тех пор, пока
            System.out.println(a);
            a++;
        }
        System.out.println("END");
    }*/

   /* public static void main(String[] args) {  // более удачный код с циклами с большими цифрами
        int a = 10;
        System.out.println(a);
        while (a < 500000) {  // while - до тех пор, пока
            a = (a * 2 + 15) * 3 / 2 + 10;
            System.out.println(a);
        }
        System.out.println("END");
    }*/

    /*public static void main(String[] args) {
        int a = 10;
        System.out.println(a);
        while (true){
            a++;
            if (a > 100) {
                System.out.println(a);
                break;
            }
        }
    }*/

 /*   public static void main(String[] args) {
        int a = 10;
        System.out.println(a);
        while (a < 500000) {        // в этом примере неважен верхний порог, break останавливает работу цикла
            a = (a * 2 + 15) * 3 / 2 + 10;
            System.out.println(a);
            if (a == 56846) {
                break;    // break - прервать/остановить работу цикла при заданных условиях перед ним
            }
        }
        System.out.println("END");
    }*/

    // ввод данных
    //import java.util.Scanner;

    //public class ConsoleApplication {
    //  public class void main(String[] args) {
    //  Scanner scanner = new Scanner(System.in);
    //  System.out.println("Введите целое число");
    //  int result = scanner.nextInt();
    //  System.out.println(result);
    }
}