package demo;

public class MMain {
    public static void main(String[] args) {
        Player p1 = new Player("Vuqar", 100);

        Player p2 = p1.clone();

        System.out.println("Original hashCode: " + p1.hashCode());
        System.out.println("Clone hashCode   : " + p2.hashCode());

        System.out.println("== ilə müqayisə: " + (p1 == p2));
        System.out.println("equals ilə müqayisə: " + p1.equals(p2));
    }
}