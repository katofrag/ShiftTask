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
