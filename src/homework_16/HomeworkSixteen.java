package homework_16;

import java.util.HashMap;

public class HomeworkSixteen {
    public static void main(String[] args) {

        //    На вход поступает массив строк, верните Map<String, Boolean>, где каждая отдельная
        //    строка является ключом, и ее значение равно true, если эта строка встречается в массиве
        //    2 или более раз. Пример:
        //    wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}
        //    wordMultiple(["c", "b", "a"]) → {"a": false, "b": false, "c": false}
        //    wordMultiple(["c", "c", "c", "c"]) → {"c": true}
        System.out.println(wordMultiple(new String[]{"Dasha", "TS", "TS", "Egor", "JAVA", "Egor"}));
    }

    public static HashMap<String, Boolean> wordMultiple(String[] args) {
        HashMap<String, Boolean> map = new HashMap<>();

        for (String arg: args) {
            map.put(arg, map.containsKey(arg));
        }

        return map;
    }
}
