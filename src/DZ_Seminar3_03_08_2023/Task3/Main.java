package DZ_Seminar3_03_08_2023.Task3;

/*
Мини-калькулятор (ООП, исключения, коллекции) - по желанию

Создайте класс MiniCalculator, который поддерживает следующие операции:

Сложение
Вычитание
Умножение
Деление
Возведение в степень

Операции должны выполняться с использованием ООП принципов (например, каждая операция может быть отдельным классом).
Класс должен поддерживать историю операций, которая хранится в коллекции. Класс также должен выбрасывать исключения
при недопустимых операциях (например, деление на ноль).
*/

public class Main {
    public static void main(String[] args) {
        try {
            MiniCalculator mc = new MiniCalculator(new View());
            mc.calculate();
            mc.calculate();
            mc.calculate();
            mc.calculate();
            mc.calculate();
            mc.showMemory();
        } catch (CalculatorException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
