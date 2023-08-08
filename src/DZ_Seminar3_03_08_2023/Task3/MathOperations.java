package DZ_Seminar3_03_08_2023.Task3;

/**
 * Класс содержит методы, выполняющие операции с числами:
 *
 * @see MathOperations#sum(int, int) Сложение
 * @see MathOperations#subtract(int, int) Вычитание
 * @see MathOperations#multiply(int, int) Умножение
 * @see MathOperations#divide(double, double) Деление
 * @see MathOperations#exponent(int, int) Возведение в степень
 */
public class MathOperations {

    /**
     * Метод выполняет сложение двух чисел
     *
     * @param a Первое число для сложения
     * @param b Второе число для сложения
     * @return Результат сложения a и b
     */
    public int sum(int a, int b) {
        return a + b;
    }

    /**
     * Метод выполняет вычитание двух чисел
     *
     * @param a Уменьшаемое число
     * @param b Вычитаемое число
     * @return Результат вычитания b из a
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Метод выполняет умножение двух чисел
     *
     * @param a Первый множитель
     * @param b Второй множитель
     * @return Результат умножения a на b
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Метод выполняет деление двух чисел
     *
     * @param a Делимое число
     * @param b Делитель
     * @return Результат деления a на b
     * @throws CalculatorException Если делитель b равен нулю
     */
    public double divide(double a, double b) throws CalculatorException {
        if (b == 0) {
            throw new DivisionByZeroException("Деление на ноль недопустимо.");
        }
        return a / b;
    }

    /**
     * Метод выполняет возведение в степень
     *
     * @param a Число, возводимое в степень
     * @param b Степень
     * @return Результат возведения числа a в степень b.
     * @throws CalculatorException Если число a равно нулю и степень b является отрицательной
     */
    public double exponent(int a, int b) throws CalculatorException {
        if (a == 0 && b < 0) {
            throw new InvalidInputException("Ноль не может быть возведен в отрицательную степень");
        }
        return Math.pow(a, b);
    }
}
