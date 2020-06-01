import java.io.File;
import java.io.FileWriter;
import java.util.Formatter;
import java.util.Scanner;

public class User1 {
    public static void main(String[] args) {


        File f = new File("C:\\Users\\Adrian\\Desktop\\plik.txt");
        if (!f.exists()) {
            try {
                f.createNewFile();
                System.out.println("Plik został utworzony.");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }


        while(true) {
            if (f.canWrite()) {
                try {

                    FileWriter fw = new FileWriter(f, true);
                    Formatter fm = new Formatter(fw);

                    Scanner sc = new Scanner(System.in);
                    System.out.println("Użytkownik 1: ");


                    String tekst ="Użytkownik 1: " + sc.nextLine();
                    fm.format("%s \r\n", tekst);
                    fm.close();
                    fw.close();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }

            try {
                Scanner sf = new Scanner(f);
                System.out.println("\nCZAT: ");
                while (sf.hasNextLine()) {
                    System.out.println(sf.nextLine());

                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}