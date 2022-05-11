package ds.anosov.Task05;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Reader {

    public static List<String> addSplitWords(String fileName) throws IOException {


        List<String> list = new ArrayList<String>();
        String text = new String(Files.readAllBytes(Paths.get(fileName)), StandardCharsets.UTF_8);
        String[] words = text.split(" ");
        for (int i = 0; i < words.length; i++) {
            list.add(words[i].toUpperCase());
        }
        return list;
    }
}

