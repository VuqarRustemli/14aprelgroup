package demo;

import java.io.*;

public class Newtask {
    public static void main(String[] args) {

        try {
            File folder = new File("Myfolder");
            if (!folder.exists()) {
                folder.mkdir();
            }

            File file = new File(folder, "tap.txt");

            if (file.exists()) {
                System.out.println("Fayl artiq var");
            } else {
                file.createNewFile();

                FileWriter fw = new FileWriter(file);
                BufferedWriter bw = new BufferedWriter(fw);

                bw.write("Java-da fayllarla islemek maraqlidir!");

                bw.close();
                fw.close();

                System.out.println("Fayl yaradildi ve metn yazildi");
            }

        } catch (IOException e) {
            System.out.println("Xeta bas verdi: " + e.getMessage());
        }
    }
}