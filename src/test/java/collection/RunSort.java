package collection;

import collection.conditions.CountRepetitionEachWord;
import collection.conditions.SortByAlphabeticalOrder;
import collection.conditions.WordWithMaxCount;

import java.io.FileNotFoundException;

public class RunSort {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("1) Прочитать слова из файла:");
        ReadFromFile read_1 = new ReadFromFile();
        System.out.println(read_1.getWords());

        System.out.println("2) Отсортировать в алфавитном порядке:");
        SortByAlphabeticalOrder read_2 = new SortByAlphabeticalOrder();
        System.out.println(read_2.getSortWords());

        System.out.println("3) Посчитать, сколько раз каждое слово встречается в файле:");
        CountRepetitionEachWord read_3 = new CountRepetitionEachWord();
        System.out.println(read_3.getRepeatEachWord());

        System.out.println("4) Найти слово с максимальным количеством повторений:");
        WordWithMaxCount read_4 = new WordWithMaxCount();
        System.out.println(read_4.getWordWithMaxCount());
    }
}
