package file_io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class FindCountOfWord {

    private static final String FILE_NAME = "src\\test\\java\\file_io\\chr1.subst.fa"; //вынеси в main

    public Integer getCount() throws IOException { //ты тут еще раз читаешь из файла данные. они ведь уже прочитаны
        //этот метод должен принимать список строк, в строчках находить подстроку и возвращать сумму этих вхождений

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
            if (findWord.getKey().matches("AGAAGGGA\\w+")) { //искомую подстроку тоже в main вынеси,опять жесткая привязка к ноккретному значению
                count++;
            }
        }
        return count;
    }
}
