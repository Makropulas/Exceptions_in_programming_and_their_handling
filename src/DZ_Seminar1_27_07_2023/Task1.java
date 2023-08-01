package DZ_Seminar1_27_07_2023;

/*
Реализуйте 3 метода, чтобы в каждом из них получить разные исключения.

Метод arrayOutOfBoundsException - Ошибка, связанная с выходом за пределы массива

Метод divisionByZero - Деление на 0

Метод numberFormatException - Ошибка преобразования строки в число
 */

public class Task1 {
    public static void main(String[] args) {
        Answer1 ans = new Answer1();
        try {
            ans.arrayOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }

        try {
            ans.divisionByZero();
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }

        try {
            ans.numberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования строки в число");
        }
    }
}

class Answer1 {
    public static void arrayOutOfBoundsException() {
        int[] num = new int[5];
        System.out.println(num[10]);
    }

    public static void divisionByZero() {
        System.out.println(5 / 0);
    }

    public static void numberFormatException() {
        String str = "five";
        int five = Integer.parseInt(str);
    }
}
