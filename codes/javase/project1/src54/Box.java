public class Box<T> {

    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public <A> void printAny(A data) {
        System.out.println("Generic metoddan gelen deyer: " + data);
    }
}