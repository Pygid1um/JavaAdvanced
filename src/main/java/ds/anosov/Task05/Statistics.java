package ds.anosov.Task05;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Statistics {
    public static Map<String, Integer> statCompareWords (List<String> words){
        Map<String, Integer> mapStat = new TreeMap<String, Integer>();
        for (String word : words) {
            if (!mapStat.containsKey(word)) {
                mapStat.put(word, 1);
            }
            else {
                mapStat.put(word, mapStat.get(word) + 1);
            }
        }
        return mapStat;
    }


}
