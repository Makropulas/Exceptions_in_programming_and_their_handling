package DZ_Seminar3_03_08_2023;


import java.util.Scanner;

/*
Проверка пароля (Основы языка Java, операторы, ветвления)

Создайте класс PasswordVerifier. Этот класс должен содержать метод, который принимает строку пароля и проверяет его
на соответствие следующим правилам:

Пароль должен быть не менее 8 символов.
Пароль должен содержать хотя бы одну цифру.
Пароль должен содержать хотя бы одну заглавную букву.
Метод должен выбрасывать исключение, если пароль не соответствует какому-либо из этих правил.
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password;
        while (true) {
            System.out.println("Пароль должен быть длиной не менее 8 символов и может содержать только латинские буквы и цифры");
            System.out.print("Введите пароль: ");
            password = scanner.nextLine();
            try {
                if (PasswordVerifier.passwordCheck(password)) {
                    System.out.println("\nОтлично! Такой пароль можно использовать");
                    scanner.close();
                    break;
                }
            } catch (PasswordNotMatching e) {
                System.out.println(e.getMessage() + " Введите пароль ещё раз");
            }
        }
    }
}

class PasswordVerifier {
    /**
     * Метод, проверки пароля на соответствие условиям.
     *
     * @param password Проверяемый пароль.
     * @return Подтверждение валидности пароля.
     * @throws PasswordNotMatching Если пароль не соответствует условиям.
     */
    static boolean passwordCheck(String password) throws PasswordNotMatching {
        String patternLatinAndNumbers = "[a-zA-Z0-9]+";
        String patternAll = "(?=.*[A-Z])(?=.*[0-9]).{8,}";
        String patternUppercase = "(?=.*[A-Z]).{8,}";
        String patternNumber = "(?=.*[0-9]).{8,}";
        if (!password.matches(patternLatinAndNumbers)) {
            throw new PasswordNotMatching("Пароль должен содержать только латинские буквы и цифры.");
        }
        if (password.length() < 8) {
            throw new PasswordNotMatching("Пароль должен быть не менее восьми символов.");
        }
        if (!password.matches(patternAll)) {
            if (!password.matches(patternUppercase) && !password.matches(patternNumber)) {
                throw new PasswordNotMatching("Пароль должен содержать хотя бы одну цифру и заглавную букву.");
            }
            if (!password.matches(patternUppercase)) {
                throw new PasswordNotMatching("Пароль должен содержать хотя бы одну заглавную букву.");
            }
            if (!password.matches(patternNumber)) {
                throw new PasswordNotMatching("Пароль должен содержать хотя бы одну цифру.");
            }
        }
        return true;
    }
}

class PasswordNotMatching extends Exception {
    public PasswordNotMatching(String message) {
        super(message);
    }
}
