package assign7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MagicSquares {

    public static void main(String[] args) throws IOException {

        FileReader fileReader = new FileReader("./Assign/assign7/TextFiles/Mercury.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        //初始化
        String line = null;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
        bufferedReader.close();
    }
}
