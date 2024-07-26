# Утилита фильтрации содержимого файлов
## Особенности реализации
Для сборки программы использовать maven. Запускать через командрую строку. Утилита принимат на вход в качестве
аргументов опции и текстовые файлы. Подаваемые текстовые файлы должны распологаться в одной директории вместе с
программой. Исходящие файлы имеют дефолтные названия strings.txt, integers.txt, floats.txt.
## Особенности реализации, не уточненные в задании
1. Утилита выводит информции об успехе работы. Если фильтрация не произошла, об этом сообщается в консоль.
2. Входящие файлы, подаваемые на фильтрацию, должны находится в одной директории с утилитой.
3. Добавлена опция "-i", выводящая информацию об утилите и ee доступных опциях.
4. Опция "-о", позволяющая указывать путь для исходящих файлов, может указывать путь только в существующую директорию.
## Используемые инструменты
1. Версия Java: openjdk 21.0.2
2. Версия Maven: Apache Maven 3.9.5 
