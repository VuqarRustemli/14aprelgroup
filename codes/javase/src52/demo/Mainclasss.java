package demo;

public class Mainclasss {

    public static void main(String[] args) {

        try {
            int result = Example.divide(10, 0);
            System.out.println("Nəticə: " + result);
        } catch (CustomException e) {
            System.out.println("Xəta baş verdi: " + e.getMessage());
        }

    }
}