package homework_12;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeworkTwelve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку: ");
        String sentence = scanner.nextLine();

        String[] strArr = sentence.split(" ");

        for (String str: strArr) {
            if (str.length() >=2 && str.length() <= 6 && str.matches("[А-ЯA-Z]+")) {
                System.out.println("Слово состоит из прописных букв: " + str);
            }
        }

        String regexPhone = "\\+\\(\\d{2}\\)\\d{7}(?=\\s|$|[^\\d])";
        String docRegex = "\\b\\d{4}-\\d{4}-\\d{2}\\b";
        String emailRegex = "\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}\\b";

        String text = "Мои данные: документ 1234-5678-90, почта user@example.com. " +
                "Также есть doc-4444-3333-11 и test.email@domain.org";

        // Поиск номеров документов
        System.out.println("Номера документов:");
        Pattern docPattern = Pattern.compile(docRegex);
        Matcher docMatcher = docPattern.matcher(text);

        while (docMatcher.find()) {
            System.out.println("Найден документ: " + docMatcher.group());
        }

        // Поиск email адресов
        System.out.println("\nEmail адреса:");
        Pattern emailPattern = Pattern.compile(emailRegex);
        Matcher emailMatcher = emailPattern.matcher(text);

        while (emailMatcher.find()) {
            System.out.println("Найден email: " + emailMatcher.group());
        }
    }
}
