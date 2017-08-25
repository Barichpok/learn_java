package file_io;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        ConvertFromFastaToCsv convertFromFastaToCsv = new ConvertFromFastaToCsv();
        convertFromFastaToCsv.ConvertFile();
        System.out.println("Файл сконвертирован из fasta в csv");

        FindCountOfWord findCountOfWord = new FindCountOfWord();
        System.out.format("AGAAGGGA встречается %s раз\n", findCountOfWord.getCount());

        DeleteFile deleteFile = new DeleteFile();
        deleteFile.DeleteOutputFile();
    }
}
