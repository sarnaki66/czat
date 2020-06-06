import java.io.*;
import java.util.Formatter;
import java.util.Scanner;

public class User2 {
    public static void main(String[] args) throws InterruptedException {


        File f = new File("C:\\Users\\Adrian\\Desktop\\plik.txt");
        if (!f.exists()) {
            try {
                f.createNewFile();
                System.out.println("Plik został utworzony.");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }


        Odczyt odczyt = new Odczyt();
        Thread ob1 = new Thread(new Odczyt());
        ob1.start();
        odczyt.zatrzymaj = true;



        while(true) {
            if (f.canWrite()) {
                try {

                    FileWriter fw = new FileWriter(f, true);
                    Formatter fm = new Formatter(fw);

                    Scanner sc = new Scanner(System.in);
                    System.out.println("Użytkownik 2: ");


                    String tekst ="Użytkownik 2: " + sc.nextLine();
                    fm.format("%s \r\n", tekst);
                    fm.close();
                    fw.close();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }

    }
}

