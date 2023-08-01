package DZ_Seminar2_31_07_2023;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
    Напишите программу, которая запрашивает у пользователя число и проверяет, является ли оно положительным.
    Если число отрицательное или равно нулю, программа должна выбрасывать исключение InvalidNumberException
    с сообщением "Некорректное число".
    В противном случае, программа должна выводить сообщение "Число корректно".
*/
public class Task1 {
    public static void main(String[] args) {
        try {
            if (askNumber() <= 0) throw new InvalidNumberException("Некорректное число");
            System.out.println("Число корректно");
        } catch (InvalidNumberException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Введённые символы не являются числом");
        }
    }

    private static int askNumber() {
        System.out.print("Введите число: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.close();
        return num;
    }
}

class InvalidNumberException extends RuntimeException {
    public InvalidNumberException(String message) {
        super(message);
    }
}
