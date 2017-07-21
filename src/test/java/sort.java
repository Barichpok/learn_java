/**
 * Created by Владислав on 22.07.2017.
 */

import java.io.*;
        import java.util.*;

public class sort {
    public static void main(String[] args) throws IOException {
        String line;
        FileInputStream file = new FileInputStream("numbers.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(file));

        List<Integer> list = new ArrayList<>();

        while ((line = br.readLine()) != null)   {
            String[] Array = line.split(",");
            for (String s: Array) {
                list.add(Integer.parseInt(s.trim()));
            }
        }
        br.close();

        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);
    }
}
