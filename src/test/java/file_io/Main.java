package file_io;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    private final Path path = Paths.get("src", "test", "java", "file_io");
    final Path fa = path.resolve("chr1.subst.fa");
    final Path csv = path.resolve("outputFile.csv");
    final String FILE_PATH = "src\\test\\java\\file_io\\outputFile.csv";
    final String FILE_NAME = "src\\test\\java\\file_io\\chr1.subst.fa";
    final String regex = "AGAAGGGA";

    public static void main(String[] args) throws IOException {

        ConvertFromFastaToCsv convertFromFastaToCsv = new ConvertFromFastaToCsv();
        convertFromFastaToCsv.convertFile();
        System.out.println("Файл сконвертирован из fasta в csv");

        FindCountOfWord findCountOfWord = new FindCountOfWord();
        System.out.format("AGAAGGGA встречается %s раз(а)\n", findCountOfWord.getCount());

        DeleteFile deleteFile = new DeleteFile();
        deleteFile.deleteOutputFile();
    }
}
