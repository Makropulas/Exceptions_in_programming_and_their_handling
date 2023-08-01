package DZ_Seminar2_31_07_2023;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Напишите программу, которая запрашивает у пользователя два числа и выполняет их деление.
Если второе число равно нулю, программа должна выбрасывать исключение DivisionByZeroException
с сообщением "Деление на ноль недопустимо".
В противном случае, программа должна выводить результат деления.
 */
public class Task2 {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            System.out.println("Выполним деление");
            int result = divide(askNumber(), askNumber());
            System.out.println("Ответ: " + result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Введённые символы не являются числом");
        }
        scan.close();
    }

    private static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль недопустимо!");
        }
        return a / b;
    }

    private static int askNumber() {
        System.out.print("Введите число: ");
        return scan.nextInt();
    }
}
