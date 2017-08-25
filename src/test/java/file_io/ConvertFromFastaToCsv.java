package file_io;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConvertFromFastaToCsv {
    public void ConvertFile() throws IOException {

        final Path path = Paths.get("src", "test", "java", "file_io");
        final Path txt = path.resolve("chr1.subst.fa");
        final Path csv = path.resolve("outputFile.csv");
        try (
                final Stream<String> lines = Files.lines(txt);
                final PrintWriter pw = new PrintWriter(Files.newBufferedWriter(csv, StandardOpenOption.CREATE_NEW))) {
            lines.map((line) -> line.split("\\|")).
                    map((line) -> Stream.of(line).collect(Collectors.joining(","))).
                    forEach(pw::println);
        }
    }
}
