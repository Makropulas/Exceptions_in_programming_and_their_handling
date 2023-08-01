package DZ_Seminar1_27_07_2023;

/*
Реализуйте метод subArrays, принимающий в качестве аргументов два целочисленных массива a и b,
и возвращающий новый массив c, каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.

Если длины массивов не равны - верните нулевой массив длины 1.

Напишите свой код в методе subArrays класса Answer. Метод subArrays принимает на вход два параметра:

int[] a - первый массив
int[] b - второй массив
 */

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] a = {};
        int[] b = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = new int[]{4, 5, 6};
            b = new int[]{1, 2, 3};
        } else {
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
            b = Arrays.stream(args[1].split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        Answer2 ans = new Answer2();
        String itresume_res = Arrays.toString(ans.subArrays(a, b));
        System.out.println(itresume_res);
    }
}

class Answer2 {
    public int[] subArrays(int[] a, int[] b) {
        // Введите свое решение ниже
        if (a.length != b.length || (a.length == 0 && b.length == 0)) {
            return new int[1];
        }
        int[] c = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i] - b[i];
        }
        return c;
    }
}
