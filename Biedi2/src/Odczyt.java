import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Odczyt implements Runnable {


    public boolean zatrzymaj = false;
    String line;

    @Override
    public void run() {
        File file = new File("C:\\Users\\Adrian\\Desktop\\plik.txt");

        BufferedReader br = null;

    try {

        FileReader fr = new FileReader(file);
        br = new BufferedReader(fr);

        while (!zatrzymaj) {

                line = br.readLine();
                if (line != null) {
                    System.out.println(line);
                }
                Thread.sleep(100);

        }


    } catch (FileNotFoundException e) {
        System.out.println("File not found: " + file.toString());
    } catch (IOException e) {
        System.out.println("Unable to read file: " + file.toString());
    } catch (InterruptedException e) {
        e.printStackTrace();
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