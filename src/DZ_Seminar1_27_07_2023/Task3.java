package DZ_Seminar1_27_07_2023;

/*
Реализуйте метод divArrays, принимающий в качестве аргументов два целочисленных массива a и b,
и возвращающий новый массив с, каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке.

Если длины массивов не равны - верните нулевой массив длины 1.

Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.

Напишите свой код в методе divArrays класса Answer. Метод divArrays принимает на вход два параметра:

int[] a - первый массив
int[] b - второй массив
 */

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] a = {};
        int[] b = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = new int[]{12, 8, 16};
            b = new int[]{4, 2, 0};
        } else {
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
            b = Arrays.stream(args[1].split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        Answer3 ans = new Answer3();
        String itresume_res = Arrays.toString(ans.divArrays(a, b));
        System.out.println(itresume_res);
    }
}

class Answer3 {
    public int[] divArrays(int[] a, int[] b) {
        // Введите свое решение ниже
        if (a.length != b.length || (a.length == 0 && b.length == 0)) {
            return new int[1];
        }
        try {
            int[] c = new int[a.length];
            for (int i = 0; i < a.length; i++) {
                c[i] = a[i] / b[i];
            }
            return c;
        } catch (Exception e) {
            throw new RuntimeException("Деление на ноль запрещено");
        }
        // Эталонное решение
//        if (a.length != b.length || (a.length == 0 && b.length == 0)) {
//            return new int[1];
//        }
//        int[] c = new int[a.length];
//        for (int i = 0; i < a.length; i++) {
//            if (b[i] == 0) throw new RuntimeException("Деление на ноль запрещено");
//            else c[i] = a[i] / b[i];
//        }
//        return c;
    }
}
