import java.util.Arrays;

public class CollectionOfStatistics {
    public static void fullStatistic(ReadFile readFile) {
        if(ParsingArguments.isShowFullStatistic()) {
            stringStatistic(readFile);
            intStatistic(readFile);
            doubleStatistic(readFile);
        }
    }

    public static void stringStatistic(ReadFile readFile) {
        System.out.println("Подробная статистика по строкам;\n- Количество записанных строк = " +
                readFile.getStringsText().size() + ".");
        if (!readFile.getStringsText().isEmpty()) {
            int max = readFile.getStringsText().getFirst().length();

            for (String string : readFile.getStringsText())
                if (string.length() > max)
                    max = string.length();

            for (String string : readFile.getStringsText())
                if (string.length() == max) {
                    System.out.println("- Самая длинная строка - " + string + "." +
                            "\n- Количество символов в ней = " + max + ".");
                }

            int min = readFile.getStringsText().getFirst().length();

            for (String string : readFile.getStringsText()) {
                if (string.length() < min)
                    min = string.length();
            }

            for (String string : readFile.getStringsText())
                if (string.length() == min)
                    System.out.println("- Самая короткая строка - " + string + "." +
                            "\n- Количество символов в ней = " + min + ".");
        }
    }

    public static void intStatistic(ReadFile readFile) {
        System.out.println("Подробная статистика по целым числам;\n- Количество записанных целых чисел = " +
                readFile.getIntNumber().size() + ".");
        if (!readFile.getIntNumber().isEmpty()) {
            long[] numbers = new long[readFile.getIntNumber().size()];
            for (int i = 0; i < readFile.getIntNumber().size(); i++) {
                numbers[i] = Long.parseLong(readFile.getIntNumber().get(i));
            }
            System.out.println("- Минимальное значение = " + Arrays.stream(numbers).min().orElse(0) + "." +
                    "\n- Максимальное значение = " + Arrays.stream(numbers).max().orElse(0) + "." +
                    "\n- Сумма целых чисел = " + Arrays.stream(numbers).sum()+ "." +
                    "\n- Среднее арифметическое целых чисел = " + Arrays.stream(numbers).average().orElse(0) +
                    ".");
        }
    }

    public static void doubleStatistic(ReadFile readFile){
        System.out.println("Подробная статистика по вещественным числам;\n- Количество записанных вещественных чисел = "
                + readFile.getDoubleNumber().size() + ".");
        if (!readFile.getDoubleNumber().isEmpty()) {
            double[] numbers = new double[readFile.getDoubleNumber().size()];
            for (int i = 0; i < readFile.getDoubleNumber().size(); i++) {
                numbers[i] = Double.parseDouble(readFile.getDoubleNumber().get(i));
            }
            System.out.println("- Минимальное значение = " + Arrays.stream(numbers).min().orElse(0) + "." +
                    "\n- Максимальное значение = " + Arrays.stream(numbers).max().orElse(0) + "." +
                    "\n- Сумма вещественных чисел = " + Arrays.stream(numbers).sum()+ "." +
                    "\n- Среднее арифметическое вещественных чисел = " +
                    Arrays.stream(numbers).average().orElse(0) + ".");
        }
    }

    public static void shortStatistic(ReadFile readFile) {
        if (ParsingArguments.isShowShortStatistic()) {
            System.out.println("Краткая статистика - количество элементов, записанных в исходящие файлы; " +
                    "\n- Количесво строк: " + readFile.getStringsText().size() + "." +
                    "\n- Количество целых чисел: " + readFile.getIntNumber().size() + "." +
                    "\n- Количество вещественных чисел: " + readFile.getDoubleNumber().size() + ".");
        }
    }
}
