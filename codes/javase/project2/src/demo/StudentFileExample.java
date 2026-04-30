package demo;

import java.io.*;
import java.util.Scanner;

public class StudentFileExample {

    public static void main(String[] args) {

        try {

            File folder = new File("student_data");

            if (!folder.exists()) {
                folder.mkdir();
                System.out.println("Folder yaradıldı.");
            } else {
                System.out.println("Folder artıq mövcuddur.");
            }

            File file = new File("student_data/info.txt");

            if (file.createNewFile()) {
                System.out.println("Fayl yaradıldı.");
            } else {
                System.out.println("Fayl artıq mövcuddur.");
            }

            Scanner sc = new Scanner(System.in);

            System.out.print("Ad daxil edin: ");
            String ad = sc.nextLine();

            System.out.print("Soyad daxil edin: ");
            String soyad = sc.nextLine();

            System.out.print("Yaş daxil edin: ");
            int yas = sc.nextInt();

            BufferedWriter writer = new BufferedWriter(new FileWriter(file));

            writer.write("Ad: " + ad);
            writer.newLine();
            writer.write("Soyad: " + soyad);
            writer.newLine();
            writer.write("Yaş: " + yas);

            writer.close();

            System.out.println("Məlumat fayla yazıldı.");

            BufferedReader reader = new BufferedReader(new FileReader(file));

            String line;

            System.out.println("\nFayldan oxunan məlumat:");

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();

            if (file.delete()) {
                System.out.println("\nFayl silindi.");
            } else {
                System.out.println("\nFayl silinmədi.");
            }

            if (folder.delete()) {
                System.out.println("Folder silindi.");
            } else {
                System.out.println("Folder silinmədi (boş olmaya bilər).");
            }

        } catch (IOException e) {
            System.out.println("Xəta baş verdi: " + e.getMessage());
        }

    }
}