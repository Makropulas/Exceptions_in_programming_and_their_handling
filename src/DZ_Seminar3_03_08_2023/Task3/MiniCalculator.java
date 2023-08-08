package DZ_Seminar3_03_08_2023.Task3;

import java.util.ArrayList;

/**
 * Класс наследуется от MathOperations:
 *
 * @see MathOperations
 */
public class MiniCalculator extends MathOperations {
    View view;
    ArrayList<String> memory = new ArrayList<>();

    public MiniCalculator(View view) {
        this.view = view;
    }

    public void calculate() throws CalculatorException {
        int a = view.getNumber("Введите первое число: ");
        char operator = view.getOperator("Введите оператор (+, -, *, /, ^): ");
        int b = view.getNumber("Введите второе число: ");
        double result = 0;
        switch (operator) {
            case '+' -> result = sum(a, b);
            case '-' -> result = subtract(a, b);
            case '*' -> result = multiply(a, b);
            case '/' -> result = divide(a, b);
            case '^' -> result = exponent(a, b);
        }
        view.print(a, operator, b, result);
        memory.add(view.resultToString(a, operator, b, result));
    }

    public void showMemory() {
        System.out.println("История операций");
        for (String operation : memory) {
            System.out.println(operation);
        }
    }
}
