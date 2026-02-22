package demo;

class Player implements Cloneable {
    String name;
    int score;

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}