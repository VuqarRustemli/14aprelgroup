package dmeo;

public class Bank {

    private double balans;

    public double getBalans() {
        return balans;
    }

    public void setBalans(double balans) {
        if (balans < 0) {
            this.balans = 0;
            System.out.println("Balans 0dan kicik ola bilmez!");
        } else {
            this.balans = balans;
        }
    }
}
