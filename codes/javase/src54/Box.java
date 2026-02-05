public class Box<T> {

    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public <E> void printAny(E data) {
        System.out.println("Generic metoddan gelen deyer: " + data);
    }
}