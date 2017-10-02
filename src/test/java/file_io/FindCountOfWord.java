package file_io;

import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.String.format;

public class FindCountOfWord {

    private static Main main = new Main();
    private int count = 0;

    public Integer getCount() throws IOException {

        List<String> words = readFromFile(main.FILE_NAME);

        for (String item : words) {
            count += getCountInString(item, main.regex);
        }
        return count;
    }

    private static List<String> readFromFile(String fileName) throws IOException {
        List<String> linkedList = new LinkedList<>();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(main.FILE_NAME)))) {
            String line;
            while ((line = br.readLine()) != null) {
                linkedList.add(line);
            }
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException(format("file [%s] not found", fileName));
        }
        return linkedList;
    }

    private static int getCountInString(String string, String patternValue) {
        int counter = 0;
        Pattern pattern = Pattern.compile(patternValue, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(string);
        while (matcher.find()) {
            counter++;
        }
        return counter;
    }
}
