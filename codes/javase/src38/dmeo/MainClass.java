package dmeo;

public class MainClass {

	public static void main(String[] args) {

        Bank bank = new Bank();

        bank.setBalans(1000);

        System.out.println("Indiki balans: " + bank.getBalans());
    }

}
