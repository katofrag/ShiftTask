import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class WriteFile {
    public static void writeFile(ReadFile readFile) throws IOException {
        if (ParsingArguments.getPath() != null) {

            if (Files.isDirectory(Paths.get(ParsingArguments.getPath()))) {
                Path userSpecifiedPath = Path.of(ParsingArguments.getPath());

                if (ParsingArguments.getPrefixName() != null) {
                    crateFile(readFile, ParsingArguments.getPrefixName(), userSpecifiedPath);

                } else {
                    crateFile(readFile, userSpecifiedPath);
                }
            } else {
                System.out.println("Введите существующий путь расположения файла после аргумента \"-o\" в формате " +
                        "путь/путь.");
            }
        } else {
            if (ParsingArguments.getPrefixName() != null) {
                crateFile(readFile, ParsingArguments.getPrefixName());

            } else {
                crateFile(readFile);
            }
        }
    }

    public static void crateFile(ReadFile readFile, String prefixName) throws IOException {
        Path pathStings = Path.of(prefixName + "strings.txt");
        Path pathIntegers = Path.of(prefixName + "integers.txt");
        Path pathFloats = Path.of(prefixName + "floats.txt");

        if (ParsingArguments.isAddToExistingFiles() && Files.exists(pathStings) && Files.exists(pathIntegers)
                && Files.exists(pathFloats)) {

            if (!readFile.getStringsText().isEmpty()) {
                Files.write(pathStings, readFile.getStringsText(), StandardOpenOption.APPEND);
            }
            if (!readFile.getIntNumber().isEmpty()) {
                Files.write(pathIntegers, readFile.getIntNumber(), StandardOpenOption.APPEND);
            }
            if (!readFile.getDoubleNumber().isEmpty()) {
                Files.write(pathFloats, readFile.getDoubleNumber(), StandardOpenOption.APPEND);
            }

        } else {
            if (!readFile.getStringsText().isEmpty()) {
                Files.write(pathStings, readFile.getStringsText());
            }
            if (!readFile.getIntNumber().isEmpty()) {
                Files.write(pathIntegers, readFile.getIntNumber());
            }
            if (!readFile.getDoubleNumber().isEmpty()) {
                Files.write(pathFloats, readFile.getDoubleNumber());
            }
        }
    }
    public static void crateFile(ReadFile readFile) throws IOException {
        Path pathStings = Path.of("strings.txt");
        Path pathIntegers = Path.of("integers.txt");
        Path pathFloats = Path.of("floats.txt");

        if (ParsingArguments.isAddToExistingFiles() && Files.exists(pathStings) && Files.exists(pathIntegers)
                && Files.exists(pathFloats)) {
            if (!readFile.getStringsText().isEmpty()) {
                Files.write(pathStings, readFile.getStringsText(), StandardOpenOption.APPEND, StandardOpenOption.SYNC);
            }
            if (!readFile.getIntNumber().isEmpty()) {
                Files.write(pathIntegers, readFile.getIntNumber(), StandardOpenOption.APPEND, StandardOpenOption.SYNC);
            }
            if (!readFile.getDoubleNumber().isEmpty()) {
                Files.write(pathFloats, readFile.getDoubleNumber(), StandardOpenOption.APPEND, StandardOpenOption.SYNC);
            }
        } else {
            if (!readFile.getStringsText().isEmpty()) {
                Files.write(pathStings, readFile.getStringsText());
            }
            if (!readFile.getIntNumber().isEmpty()) {
                Files.write(pathIntegers, readFile.getIntNumber());
            }
            if (!readFile.getDoubleNumber().isEmpty()) {
                Files.write(pathFloats, readFile.getDoubleNumber());
            }
        }

    }

    public static void crateFile(ReadFile readFile, String prefixName, Path path) throws IOException {
        Path pathStings = Path.of(String.valueOf(path), prefixName + "strings.txt");
        Path pathIntegers = Path.of(String.valueOf(path), prefixName + "integers.txt");
        Path pathFloats = Path.of(String.valueOf(path), prefixName + "floats.txt");

        if (ParsingArguments.isAddToExistingFiles() && Files.exists(pathStings) && Files.exists(pathIntegers)
                && Files.exists(pathFloats)) {
            if (!readFile.getStringsText().isEmpty()) {
                Files.write(pathStings, readFile.getStringsText(), StandardOpenOption.APPEND);
            }
            if (!readFile.getIntNumber().isEmpty()) {
                Files.write(pathIntegers, readFile.getIntNumber(), StandardOpenOption.APPEND);
            }
            if (!readFile.getDoubleNumber().isEmpty()) {
                Files.write(pathFloats, readFile.getDoubleNumber(), StandardOpenOption.APPEND);
            }
        } else {
            if (!readFile.getStringsText().isEmpty()) {
                Files.write(pathStings, readFile.getStringsText());
            }
            if (!readFile.getIntNumber().isEmpty()) {
                Files.write(pathIntegers, readFile.getIntNumber());
            }
            if (!readFile.getDoubleNumber().isEmpty()) {
                Files.write(pathFloats, readFile.getDoubleNumber());
            }
        }
    }

    public static void crateFile(ReadFile readFile, Path path) throws IOException {
        Path pathStings = Path.of(String.valueOf(path), "strings.txt");
        Path pathIntegers = Path.of(String.valueOf(path), "integers.txt");
        Path pathFloats = Path.of(String.valueOf(path), "floats.txt");

        if (ParsingArguments.isAddToExistingFiles() && Files.exists(pathStings) && Files.exists(pathIntegers)
                && Files.exists(pathFloats)) {
            if (!readFile.getStringsText().isEmpty()) {
                Files.write(pathStings, readFile.getStringsText(), StandardOpenOption.APPEND);
            }
            if (!readFile.getIntNumber().isEmpty()) {
                Files.write(pathIntegers, readFile.getIntNumber(), StandardOpenOption.APPEND);
            }
            if (!readFile.getDoubleNumber().isEmpty()) {
                Files.write(pathFloats, readFile.getDoubleNumber(), StandardOpenOption.APPEND);
            }
        } else {
            if (!readFile.getStringsText().isEmpty()) {
                Files.write(pathStings, readFile.getStringsText());
            }
            if (!readFile.getIntNumber().isEmpty()) {
                Files.write(pathIntegers, readFile.getIntNumber());
            }
            if (!readFile.getDoubleNumber().isEmpty()) {
                Files.write(pathFloats, readFile.getDoubleNumber());
            }
        }
    }
}