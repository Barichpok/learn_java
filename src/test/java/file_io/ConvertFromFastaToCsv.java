package file_io;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConvertFromFastaToCsv {
    public void convertFile() throws IOException {

        Main main = new Main();

        try (
                final Stream<String> lines = Files.lines(main.fa);
                final PrintWriter pw = new PrintWriter(Files.newBufferedWriter(main.csv, StandardOpenOption.CREATE_NEW))) {
            lines.map((line) -> line.split("\\|"))
                    .map((line) -> Stream.of(line)
                            .collect(Collectors.joining(",")))
                    .forEach(pw::println);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
