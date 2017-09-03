package file_io;

import java.io.File;

public class DeleteFile {

    private static Main main = new Main();

    public void deleteOutputFile() {

        if (DeleteFile.deleteFile(main.FILE_PATH)) {
            System.out.println("Файл удален");
        } else {
            throw new IllegalStateException("Не получилось удалить файл");
        }
    }

    public static boolean deleteFile(String filePath) {
        File file = new File(filePath);
        return file.delete();
    }
}
