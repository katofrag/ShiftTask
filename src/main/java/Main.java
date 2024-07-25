import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ParsingArguments.argWork(args);
        ReadFile readFile = new ReadFile();
        readFile.readFile();
        WriteFile.writeFile(readFile);
        CollectionOfStatistics.fullStatistic(readFile);
        CollectionOfStatistics.shortStatistic(readFile);
        OptionList.infoArgs();
    }
}





































/*
public class Lesson15 {
    public static void main(String[] args) {
        /*
            \\d - одна цифра
            \\w - одна английская буква
            \\w == [a-zA-Z]

            + - 1 или более
            * - 0 или более
            ? - 0 или 1 символов до

            (x|y|2) - одна строка из множества строк
            [abc] == (a|b|c)

            [a-zA-Z] - все английскте буквы
            [0-9] == \\d
            [^abc] - симовл отрицания, все кроме [abc]

            . - любой симол

            {2} - 2 символа до (\\d{2})
            {2, } - 2 или более символов (\\d{2,})
            {2, 4} - от 2 до 4 символов (\\d{2,4})


String a = "-123123";
String b = "112313";
String c = "+312313";

        System.out.println(a.matches("(-|\\+)?\\d*"));
        System.out.println(b.matches("(-|\\+)?\\d*"));
        System.out.println(c.matches("(-|\\+)?\\d*"));

String d = "a1a3sdd1231245";
        System.out.println(d.matches("[a-zA-Z31]+\\d+"));

String e = "asdf";
        System.out.println(e.matches("[^abc]*"));

String url = "http://www.google.com";
String url2 = "http://www.yandex.ru";
        System.out.println(url.matches("http://www\\..+\\.(com|ru)"));
        System.out.println(url2.matches("http://www\\..+\\.(com|ru)"));

String f = "12";
        System.out.println(f.matches("\\d{2,}"));
        }
        }
package javaRegexp;

import java.util.Arrays;

public class Lesson16 {
    public static void main(String[] args) {
        String a = "Hello123123124t2412he12412e123123h4141ey";
        String[] words = a.split("\\d+");
        System.out.println(Arrays.toString(words));

        String b = "Hello there hey";
        String modifiedString =  b.replace(" ", ".");
        System.out.println(modifiedString);

        String e = "Holla312312311amigos1424124qu";
        String modifiedString2 = e.replaceAll("\\d+", "-");
        System.out.println(modifiedString2);

        String modifiedString3 = e.replaceFirst("\\d+", "_");
        System.out.println(modifiedString3);
    }
}

 */
