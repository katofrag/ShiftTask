public enum OptionList {

    ARG_PATH("-o", "использовать для указания пути исходящих файлов в существующую директорию"),
    ARG_PREFIX("-p", "использовать для добавления префикса к названию исходящих файлов"),
    ARG_ADDING("-a", "использовать для добавления данных в уже существующие исходящие файлы"),
    ARG_SHORT_STATISTIC("-s", "использовать для выведения краткой статистики по отфильтрованным данным"),
    ARG_FULL_STATISTIC("-f", "использовать для выведения полной статистики по отфильтрованным данным"),
    ARG_INFO("-i", "использовать для вывода информации о доступных опциях программы");

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
                    " аргрумента текстовых файлов в формате \"файл.txt\".\n" + OptionList.ARG_PATH + "\n" +
                    OptionList.ARG_PREFIX + "\n" + OptionList.ARG_ADDING + "\n" + OptionList.ARG_SHORT_STATISTIC +
                    "\n" + OptionList.ARG_FULL_STATISTIC + "\n" + OptionList.ARG_INFO);
        }
    }

    @Override
    public String toString() {
        return "Опция \"" + name +
                "\": " + info + ".";
    }
}