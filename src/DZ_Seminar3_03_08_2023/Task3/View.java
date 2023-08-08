package DZ_Seminar3_03_08_2023.Task3;

import java.util.Scanner;

public class View {
    Scanner input = new Scanner(System.in);

    public int getNumber(String title) {
        System.out.printf("%s", title);
        int num;
        if(input.hasNextInt()){
            num = input.nextInt();
        } else {
            System.out.println("Нужно вводить число. Попробуйте еще раз");
            input.next();
            num = getNumber(title);
        }
        return num;
    }

    public char getOperator(String title) {
        System.out.printf("%s", title);
        char operator;
        if(input.hasNext()){
            operator = input.next().charAt(0);
            if (operator != '+' && operator != '-' && operator != '*' && operator != '/' && operator != '^') {
                System.out.println("Недопустимый оператор. Попробуйте еще раз");
                operator = getOperator(title);
            }
        } else {
            System.out.println("Ошибка при вводе оператора. Попробуйте еще раз");
            input.next();
            operator = getOperator(title);
        }
        return operator;
    }

    public void print(double a, char operator, double b, double result) {
        System.out.println("\n" + resultToString(a, operator, b, result) + "\n");
    }

    public String resultToString (double a, char operator, double b, double result) {
        return a + " " + operator + " " + b + " = " + result;
    }
}
