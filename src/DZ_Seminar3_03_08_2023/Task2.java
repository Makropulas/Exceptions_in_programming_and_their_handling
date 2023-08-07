package DZ_Seminar3_03_08_2023;

/*
Файловый менеджер (ООП, исключения)

Создайте класс FileManager. Этот класс должен иметь методы для выполнения основных операций с файлами:
чтение, запись и копирование. Каждый из этих методов должен выбрасывать соответствующее исключение,
если в процессе выполнения операции произошла ошибка (например, FileNotFoundException, если файл не найден)
*/

import java.io.*;
import java.nio.file.Files;

public class Task2 {
    public static void main(String[] args) {
        try {
            File file = new File("file.txt");
            File newFile = new File("newFile.txt");
            FileManager.readFile(file);
            for (int i = 0; i < 5; i++) {
                FileManager.writeFile(file, "Какой-то новый текст");
            }
            FileManager.copyFile(file, newFile);
        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}

class FileManager {
    static void readFile(File file) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }

    static void writeFile(File file, String str) throws IOException {
        FileWriter fw = new FileWriter(file, true);
        fw.write(str + "\n");
        fw.close();
    }

    static void copyFile(File file, File newFile) throws IOException {
        if (newFile.exists()) {
            throw new IOException("Не удаётся скопировать данные в новый файл, т.к. файл с таким именем уже существует");
        }
        if (!file.exists()) {
            throw new IOException("Невозможно скопировать. Копируемый файл не существует");
        }
        Files.copy(file.toPath(), newFile.toPath());
    }
}