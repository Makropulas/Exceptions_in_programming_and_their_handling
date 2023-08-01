package DZ_Seminar2_31_07_2023;

/*
Напишите программу, которая запрашивает у пользователя три числа и выполняет следующие проверки:

- Если первое число больше 100, выбросить исключение NumberOutOfRangeException с сообщением "Первое число вне допустимого диапазона".
- Если второе число меньше 0, выбросить исключение NumberOutOfRangeException с сообщением "Второе число вне допустимого диапазона".
- Если сумма первого и второго чисел меньше 10, выбросить исключение NumberSumException с сообщением
  "Сумма первого и второго чисел слишком мала".
- Если третье число равно 0, выбросить исключение DivisionByZeroException с сообщением "Деление на ноль недопустимо".
- В противном случае, программа должна выводить сообщение "Проверка пройдена успешно".
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task3 {
    private static Scanner scan = new Scanner(System.in);
    private static int count = 1;

    public static void main(String[] args) {
        try {
            int num1 = askNumber();
            int num2 = askNumber();
            int num3 = askNumber();
            System.out.println();
            if (num1 > 100)
                throw new NumberOutOfRangeException("Первое число вне допустимого диапазона");
            if (num2 < 0)
                throw new NumberOutOfRangeException("Второе число вне допустимого диапазона");
            if (num1 + num2 < 10)
                throw new NumberSumException("Сумма первого и второго чисел слишком мала");
            if (num3 == 0) throw new DivisionByZeroException("Деление на ноль недопустимо");
            System.out.println("Проверка пройдена успешно");
        } catch (NumberOutOfRangeException | NumberSumException | DivisionByZeroException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Введённые символы не являются числом");
        }
        scan.close();
    }

    private static int askNumber() {
        System.out.printf("Введите число %d: ", count);
        count++;
        return scan.nextInt();
    }
}

class NumberOutOfRangeException extends RuntimeException {
    public NumberOutOfRangeException(String message) {
        super(message);
    }
}

class NumberSumException extends RuntimeException {
    public NumberSumException(String message) {
        super(message);
    }
}

class DivisionByZeroException extends RuntimeException {
    public DivisionByZeroException(String message) {
        super(message);
    }
}
