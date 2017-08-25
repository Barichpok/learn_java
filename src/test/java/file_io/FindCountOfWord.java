package file_io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class FindCountOfWord {

    private static final String FILE_NAME = "src\\test\\java\\file_io\\chr1.subst.fa";

    public Integer getCount() throws IOException {

        Map<String, Integer> words = new HashMap<>();
        String line;

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(FILE_NAME)));

            while ((line = br.readLine()) != null) {
                String allWords = line.toUpperCase();
                Integer count = words.get(allWords);
                if (count == null) {
                    count = 0;
                }
                words.put(allWords, ++count);
            }

            br.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        int count = 0;
        for (Map.Entry<String, Integer> findWord : words.entrySet()) {
            if (findWord.getKey().matches("AGAAGGGA\\w+")) {
                count++;
            }
        }
        return count;
    }
}
