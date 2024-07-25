import java.util.ArrayList;
import java.util.List;

public class ParsingArguments {
    private static String path;
    private static String prefixName;
    private static List<String> fileName = new ArrayList<>();
    private static boolean addToExistingFiles = false;
    private static boolean showShortStatistic = false;
    private static boolean showFullStatistic = false;
    private static boolean showHelpInfo = false;

    public static List<String> getFileName() {
        return fileName;
    }

    public static String getPrefixName() {
        return prefixName;
    }

    public static String getPath() {
        return path;
    }

    public static boolean isAddToExistingFiles() {
        return addToExistingFiles;
    }

    public static boolean isShowShortStatistic() {
        return showShortStatistic;
    }

    public static boolean isShowFullStatistic() {
        return showFullStatistic;
    }

    public static boolean isShowHelpInfo() {
        return showHelpInfo;
    }

    public static void argWork(String[] args) {
        for (int i = 0; i < args.length; i++) {
            if (args[i].equals(OptionList.ARG_PATH.getName())) {
                if (i + 1 < args.length) {
                    if (!args[i + 1].matches("-\\w*")) {
                        path = args[i + 1];
                    }
                }
            }

            if (args[i].equals(OptionList.ARG_PREFIX.getName())) {
                if (i + 1 < args.length) {
                    if (!args[i + 1].matches("-\\w*") && !args[i+1].matches("(\\w+|[а-я]+)\\.txt")){
                        prefixName = args[i + 1];
                    }
                }
            }

            if (args[i].equals(OptionList.ARG_ADDING.getName())) {
                addToExistingFiles = true;
            }

            if (args[i].equals(OptionList.ARG_SHORT_STATISTIC.getName())) {
                showShortStatistic = true;
            }

            if (args[i].equals(OptionList.ARG_FULL_STATISTIC.getName())) {
                showFullStatistic = true;
            }

            if (args[i].equals(OptionList.ARG_INFO.getName())){
                showHelpInfo = true;
            }

            if (args[i].matches("(\\w+|[а-я]+)\\.txt")) {
                fileName.add(args[i]);
            }
        }
    }
}