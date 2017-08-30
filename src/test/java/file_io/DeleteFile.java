package file_io;

import java.io.File;

public class DeleteFile {

    private static final String FILE_PATH = "src\\test\\java\\file_io\\outputFile.csv"; //вынеси путь к файлу в main

    public void DeleteOutputFile(){

        if( DeleteFile.deleteFile(FILE_PATH) ){ // добавть throw new IllegalStateException 
            System.out.println("Файл удален");
        } else {
            System.err.println("Не получилось удалить файл");
        }
    }

    public static boolean deleteFile(String filePath){
        File file = new File(FILE_PATH);
        return file.delete();
    }
}
