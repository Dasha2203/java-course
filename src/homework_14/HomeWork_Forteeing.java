package homework_14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class HomeWork_Forteeing {
    public static void main(String[] args) throws IOException {
        //        Задача 1:
        //        В задании приложен файл Ромео и Джульетта на английском, вычитать его в приложении.
        //                Проанализировать и записать в другой файл самое длинное слово
        File file = new File("src/homework_14","test.txt");

        if (!file.isFile()) {
            if (file.createNewFile()) {
                System.out.println("The file had been created");
            } else {
                System.out.println("The file hadn't been created");
            }
        }

        String text = "В Java поток (Thread) — это наименьшая единица выполнения внутри процесса.\n Представьте," +
                " что у вас есть кухня (это процесс), и на ней может работать один повар (это главный поток, или " +
                "main).\n Если задач много (варить суп, резать овощи, мыть посуду), один повар будет делать всё " +
                "по очереди, и это медленно.";

        writeToFile(file.getAbsolutePath(), text);

        StringBuilder data = readFromFile(file);

        String maxWord = findMaxLengthWord(data);

        System.out.println("Maximum length of word: " + maxWord);


        //        Допустим есть txt файл с номерами документов. Номером документа является строка,
        //        состоящая из букв и цифр(без служебных символов). Пусть этот файл содержит каждый
        //        номер документа с новой строки и в строке никакой другой информации, только номер
        //        документа. Валидный номер документа должен иметь длину 15 символов и начинаться с
        //        последовательности docnum(далее любая последовательность букв/цифр) или
        //        contract(далее любая последовательность букв/цифр). Написать программу для чтения
        //        информации из входного файла - путь к входному файлу должен задаваться через
        //        консоль. Программа должна проверять номера документов на валидность. Валидные
        //        номера документов следует записать в один файл-отчет. Невалидные номера документов
        //        следует записать в другой файл-отчет, но после номеров документов следует добавить
        //        информацию о том, почему этот документ не валиден.
        File docsFile = new File("src/homework_14","docs.txt");

        if (!docsFile.isFile()) {
            System.out.println("File not found");
            return;
        }

        StringBuilder docsText = readFromFile(docsFile);
        String[] docs = docsText.toString().split("\n");
        System.out.println("\nAll docs: \n");

        for (String doc: docs) {
            try {
                validateDoc(doc);
                File validDocs = new File("src/homework_14","valid.txt");
                writeToFile(validDocs.getAbsolutePath(), doc + "\n");

            } catch (WrongDocException e) {
                File inValidDocs = new File("src/homework_14","invalid.txt");
                writeToFile(inValidDocs.getAbsolutePath(), doc + " " + e.getMessage() + "\n");
            }

            System.out.println(doc);
        }


    }

    public static void writeToFile(String pathToFile, String text) {
        try {
            FileWriter myWriter = new FileWriter(pathToFile, true);
            myWriter.write(text);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("Writing to the file was failed");
        }
    }

    public static StringBuilder readFromFile(File file) throws FileNotFoundException {
        try(Scanner reader = new Scanner(file)) {
            StringBuilder data = new StringBuilder();
            while (reader.hasNextLine()) {
                data.append(reader.nextLine()).append("\n");
            }

            return data;
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        return null;
    }

    public static String findMaxLengthWord(StringBuilder text) {
        String[] words = text.toString().split("[\\s\\p{Punct}]+");
        String maxWord = words[0];

        for (String word: words) {
            if (word.length() > maxWord.length()) maxWord = word;
        }

        return maxWord;
    }

    public static void validateDoc(String doc) {
        if (doc.length() != 15) {
            throw new WrongDocException("The length must be 15 symbols");
        }

        if (!(doc.startsWith("docnum") || doc.startsWith("contract"))) {
            throw new WrongDocException("The doc must starts with docnum or contruct");
        }

        if (!doc.matches("[A-Za-z0-9]+")) {
            throw new WrongDocException("The doc must contains only numbers and letters");
        }
    }
}
