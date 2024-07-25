import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadFile {
    private static List<String> allText = new ArrayList<>();
    private static List<String> intNumber = new ArrayList<>();
    private static List<String> doubleNumber = new ArrayList<>();
    private static List<String> stringsText = new ArrayList<>();

    public List<String> getIntNumber() {
        return intNumber;
    }

    public List<String> getDoubleNumber() {
        return doubleNumber;
    }

    public List<String> getStringsText() {
        return stringsText;
    }

    public void readFile() throws IOException {

        for (int i = 0; i < ParsingArguments.getFileName().size(); i++) {
            String fileNameOfArgument = ParsingArguments.getFileName().get(i);


            File file = new File(fileNameOfArgument);

            try (Scanner scanner = new Scanner(file)) {
                while (scanner.hasNextLine()) {
                    allText.add(scanner.nextLine());
                }
            } catch (FileNotFoundException e) {
                System.out.println("Файл c именем " + fileNameOfArgument + " не найден");
            }
        }

        for (String element : allText) {
            if (element.matches("-?\\d+"))
                intNumber.add(element);

        }

        for (String element : allText) {
            if (element.matches("\\D+")) {
                stringsText.add(element);
            }
        }

        for (String element : allText) {
            if (element.matches("(-?\\d+[.,]\\d+|-?\\d+[.,]\\d+[eE][-+]?\\d+)")) {
                doubleNumber.add(element);
            }
        }
    }

}
