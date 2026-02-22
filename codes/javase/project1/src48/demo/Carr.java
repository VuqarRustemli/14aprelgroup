package demo;

class Carr implements Cloneable {

    String model;
    String brand;

    public Carr(String model, String brand) {
        this.model = model;
        this.brand = brand;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}