package homework_16;

import java.util.HashMap;
import java.util.Stack;

public class HomeworkSixteen {
    public static void main(String[] args) {

        //    На вход поступает массив строк, верните Map<String, Boolean>, где каждая отдельная
        //    строка является ключом, и ее значение равно true, если эта строка встречается в массиве
        //    2 или более раз. Пример:
        //    wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}
        //    wordMultiple(["c", "b", "a"]) → {"a": false, "b": false, "c": false}
        //    wordMultiple(["c", "c", "c", "c"]) → {"c": true}
        System.out.println(wordMultiple(new String[]{"Dasha", "TS", "TS", "Egor", "JAVA", "Egor"}));

        //    На вход поступает массив непустых строк, создайте и верните Map<String,
        //            String> следующим образом: для каждой строки добавьте ее первый символ в
        //    качестве ключа с последним символом в качестве значения. Пример:
        //    pairs(["code", "bug"]) → {"b": "g", "c": "e"}
        //    pairs(["man", "moon", "main"]) → {"m": "n"}
        //    pairs(["man", "moon", "good", "night"]) → {"g": "d", "m": "n", "n": "t"}
        System.out.println(pairs(new String[]{"code", "bug"}));
        System.out.println(pairs(new String[]{"man", "moon", "main"}));
        System.out.println(pairs(new String[]{"man", "moon", "good", "night"}));



        //    Задана строка, которая может иметь внутри себя скобки. Скобкой считается
        //    любой из следующих символов — «(«, «)», «[«, «]», «{«, «}». Проверить
        //    сбалансированность расстановки скобок в этой строке. Набор скобок считается
        //    сбалансированной парой, если открывающая скобка "(", "[" и "{" стоит слева от
        //    соответствующей закрывающей скобки ")", "]" и "} ", соответственно. Строка,
        //            содержащая пары скобок, не сбалансирована, если набор заключенных в нее
        //    скобок не совпадает .
        //            Например, если ввод «{[(])}», пара квадратных скобок «[]» заключает в себя
        //    одну несбалансированную открывающую круглую скобку «(». Аналогично, пара
        //    круглых скобок «() ", заключает в себя одну несбалансированную
        //    закрывающую квадратную скобку "]". Таким образом, входная строка "{[(])}"
        //    несбалансированная.
        //            Пример
        //                    () - сбалансирована
        //            [()] - сбалансирована
        //    {[()]} - сбалансирована
        //            ([{{[(())]}}]) - сбалансирована
        //    {{[]()}}}} - не сбалансирована
        //{[(])} - не сбалансирована

        String[] tests = {
                "()",
                "[()]",
                "{[()]}",
                "([{{[(())]}}])",
                "{{[]()}}}}",
                "{[(])}"
        };

        for (String t : tests) {
            System.out.println(t + " -> " +
                    (isBalanced(t) ? "сбалансирована" : "НЕ сбалансирована"));
        }
    }

    public static HashMap<String, Boolean> wordMultiple(String[] args) {
        HashMap<String, Boolean> map = new HashMap<>();

        for (String arg: args) {
            map.put(arg, map.containsKey(arg));
        }

        return map;
    }

    public static HashMap<String, String> pairs(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        for (String arg: args) {
            char[] chars = arg.toCharArray();
            map.put(String.valueOf(chars[0]), String.valueOf(chars[arg.length() - 1]));
        }

        return map;
    }

    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        final HashMap<Character, Character> pairs = new HashMap<>() {{
            put(')', '(');
            put(']', '[');
            put('}', '{');
        }};

        for (char ch : s.toCharArray()) {
            if (!pairs.containsKey(ch)) {
                stack.push(ch);
            }

            else {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if (top != pairs.get(ch)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
