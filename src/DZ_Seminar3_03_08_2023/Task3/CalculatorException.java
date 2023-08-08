package DZ_Seminar3_03_08_2023.Task3;

public class CalculatorException extends Exception {
    public CalculatorException(String message) {
        super(message);
    }
}

class DivisionByZeroException extends CalculatorException {
    public DivisionByZeroException(String message) {
        super(message);
    }
}

class InvalidInputException extends CalculatorException {
    public InvalidInputException(String message) {
        super(message);
    }
}
