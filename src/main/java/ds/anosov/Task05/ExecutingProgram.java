package ds.anosov.Task05;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ExecutingProgram {
    public static void main(String[] args) throws IOException {


        String fileName = "src\\main\\resources\\files\\Text";
        String maxKey;

        List<String> listWithWords = new ArrayList<>();
        listWithWords = Reader.addSplitWords(fileName);
        WordSorting.toSort(listWithWords);

        System.out.println("\n----Выводим статистику и сортировку по словам на консоль----------------\n");
        Map<String, Integer> map1 = Statistics.statCompareWords(listWithWords);
        for (Map.Entry<String, Integer> entry : map1.entrySet()) {
            System.out.println("Слово '" + entry.getKey() + "' встречается '" + entry.getValue() + "' раз(а)");
        }
        System.out.println("\n---Находим слово с максимальным количеством повторений и выводим на консоль-----\n");
        maxKey = MaximumAmountOfRepetitions.maxCountKey(map1);
        System.out.println("Слово с максимальным количеством повторение - это '" + maxKey + "'. Встречается в файле '"
                + map1.get(maxKey) + "' раз(а)");

    }
}
