public enum OptionList {

    ARG_PATH("-o", "Использовать для указания пути исходящих файлов в существующую директорию"),
    ARG_PREFIX("-p", "Использовать для добавления префикса к названию исходящих файлов"),
    ARG_ADDING("-a", "Использовать для добавления данных в уже существующие исходящие файлы"),
    ARG_SHORT_STATISTIC("-s", "Использовать для выведения краткой статистики по отфильтрованным данным"),
    ARG_FULL_STATISTIC("-f", "Использовать для выведения полной статистики по отфильтрованным данным"),
    ARG_INFO("-i", "Использовать для вывода информации о доступных опциях программы");

    private String name;
    private String info;

    public String getName() {
        return name;
    }

    OptionList(String name, String info) {
        this.name = name;
        this.info = info;
    }

    public static void infoArgs() {
        if (ParsingArguments.isShowHelpInfo()) {
            System.out.println("Утилита фильтрации содержимого файлов.\nДоступные опции:\nПередача в качестве" +
                    " аргрумента текстовых файлов в формате \"файл.txt\"\n" + OptionList.ARG_PATH + "\n" +
                    OptionList.ARG_PREFIX + "\n" + OptionList.ARG_ADDING + "\n" + OptionList.ARG_SHORT_STATISTIC +
                    "\n" + OptionList.ARG_FULL_STATISTIC + "\n" + OptionList.ARG_INFO);
        }else {
            System.out.println("Используйте опцию \"-i\" для получения информации о доступных опциях программы.");
        }
    }

    @Override
    public String toString() {
        return "Опция \"" + name +
                "\", " + info + ".";
    }
}