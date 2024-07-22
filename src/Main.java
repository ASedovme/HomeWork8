import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание 8");
//Задание 1
        System.out.println("Задание 1");
        //часть 1
        int[] number = new int[3];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;

        //часть 2
        double[] num = {1.57, 7.654, 9.986};

        //часть 3
        int[] mas = new int[4];
        int a = 17;
        int b = 22;
        int c = 33;
        int d = 4;
        mas[0] = a;
        mas[1] = b;
        mas[2] = c;
        mas[3] = d;


//Задание 2
        System.out.println("Задание 2");
        // System.out.println(number[0] + "," + number[1] + "," + number[2]);
        for (int i = 0; i <= 2; i++) {
            if (i < 2) {
                System.out.print(number[i] + ", ");
            } else {
                System.out.print(number[i]);
            }
        }
        System.out.println(" ");
        //System.out.println(num[0] + "," + num[1] + "," + num[2]);
        for (int i = 0; i <= 2; i++) {
            if (i < 2) {
                System.out.print(num[i] + ", ");
            } else {
                System.out.print(num[i]);
            }
        }
        System.out.println(" ");
        //System.out.println(mas[0] + "," + mas[1] + "," + mas[2] + "," + mas[3]);
        for (int i = 0; i <= 3; i++) {
            if (i < 3) {
                System.out.print(mas[i] + ", ");
            } else {
                System.out.print(mas[i]);
            }
        }
        System.out.println(" ");
//Задание 3
        System.out.println("Задание 3");
        for (int i = 2; i >= 0; i--) {
            if (i > 0) {
                System.out.print(number[i] + ", ");
            } else {
                System.out.print(number[i]);
            }
        }
        System.out.println(" ");
        for (int i = 2; i >= 0; i--) {
            if (i > 0) {
                System.out.print(num[i] + ", ");
            } else {
                System.out.print(num[i]);
            }
        }
        System.out.println(" ");
        for (int i = 3; i >= 0; i--) {
            if (i > 0) {
                System.out.print(mas[i] + ", ");
            } else {
                System.out.print(mas[i]);
            }
        }
        System.out.println(" ");
//Задание 4
        System.out.println("Задание 4");
        for (int i = 0; i <= 2; i++) {
            if (number[i] % 2 != 0) {
                number[i] = number[i] + 1;
            }
        }
        System.out.println(Arrays.toString(number));
    }
}