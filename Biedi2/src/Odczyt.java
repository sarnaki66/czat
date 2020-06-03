import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Odczyt implements Runnable {

    @Override
    public void run() {
        File file = new File("C:\\Users\\Adrian\\Desktop\\plik.txt");

        BufferedReader br = null;

    try {
        FileReader fr = new FileReader(file);
        br = new BufferedReader(fr);

        String line;

        while ((line = br.readLine()) != null && !line.equals("exit")) {
            System.out.println(line);
        }

    } catch (FileNotFoundException e) {
        System.out.println("File not found: " + file.toString());
    } catch (IOException e) {
        System.out.println("Unable to read file: " + file.toString());
    } finally {
        try {
            br.close();
        } catch (IOException e) {
            System.out.println("Unable to close file: " + file.toString());
        } catch (NullPointerException ex) {
        }

    }

    }

}