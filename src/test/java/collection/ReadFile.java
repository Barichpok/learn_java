package collection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public Scanner readFile() throws FileNotFoundException {
        return new Scanner(new File("src\\test\\java\\collection\\words.txt"));
    }
}
