package lab9.task1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.HashMap;
import java.util.SortedSet;

public class WordCounterMap implements WordCounter {

    HashMap<String,Integer> map;

    public static void main(String[] args){
        WordCounterMap wordCounterMap = new WordCounterMap();
        String text = null;
        try {
            text = new String(Files.readAllBytes(Path.of("lorem.txt")));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        wordCounterMap.parse(text);
        wordCounterMap.printWordCounts();
    }

    public WordCounterMap() {
        map = new HashMap<>();
    }

    @Override
    public void parse(String text) {
        var tokens = text.split("[ .!?,\n]+");
        for (String token1 : tokens) {
            String token2 = token1.toLowerCase();
            if (!map.containsKey(token2)) {
                map.put(token2, 1);
            }
            else {
                map.put(token2, map.get(token2) + 1);
            }
        }
    }

    @Override
    public int getCount(String word) {
        return map.get(word);
    }

    @Override
    public SortedSet<String> getUniqueWords() {
        SortedListSet<String> sortedListSet = new SortedListSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return map.get(o1).compareTo(map.get(o2));
            }
        });
        sortedListSet.addAll(map.keySet());
        sortedListSet.sort(sortedListSet.comparator().reversed());
        return sortedListSet;
    }

    @Override
    public void printWordCounts() {
        for (String word : getUniqueWords()) {
            System.out.println(word + " " + map.get(word).toString());
        }
    }

    @Override
    public void reset() {
        map = new HashMap<>();
    }
}
