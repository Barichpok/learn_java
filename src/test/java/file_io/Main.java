package file_io;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        //путь к файлу нужно в main передавать. иначе твоя программа заточена на один конкретный файл, находящийся в конкретном месте
        //это не универсально
        ConvertFromFastaToCsv convertFromFastaToCsv = new ConvertFromFastaToCsv();
        convertFromFastaToCsv.ConvertFile(); //метод с маленькой буквы
        System.out.println("Файл сконвертирован из fasta в csv");

        FindCountOfWord findCountOfWord = new FindCountOfWord();
        System.out.format("AGAAGGGA встречается %s раз\n", findCountOfWord.getCount());

        DeleteFile deleteFile = new DeleteFile(); //зачем целый класс для удаления файла. 
        deleteFile.DeleteOutputFile(); //метод с маленькой буквы
    }
}
