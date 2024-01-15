import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Cripto {
    public static void process(FileInputStream file1, FileOutputStream file2) throws IOException {
        try{
            boolean eof = false;
            int count = 0;
            ArrayList<Integer> vetor = new ArrayList<>();
            while (!eof) {
                int input = file1.read();
                if (input != -1) {
                    vetor.add(input);
                    count++;
                } else eof = true;
            }
            System.out.println("Bytes lidos: " + count);
            for (int i = 0; i < vetor.size(); i++) {
                file2.write(vetor.get(i));
            }
        }finally {
            if (file1 != null) {
                file1.close();
            }
            if (file2 != null) {
                file2.close();
            }
        }


    }
    public static void main(String[] args) {
        String arquivo1 = args[0];
        String arquivo2 = args[1];
        try {
            FileInputStream file1 = new FileInputStream(arquivo1);
            FileOutputStream file2 = new FileOutputStream(arquivo2);
            Cripto.process(file1, file2);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {

        }

    }
}
