package CodeJavaVolume.FirstVolume.Part8.pare1;

public class Pair<T> {
    private T first;
    private T second;

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public Pair() {
        first = null;
        second = null;
    }


    public T getFirst() {
        return first;
    }

    public void setFirst(T newValue) {
      first = newValue;
    }

    public T getSecond() {
        return second;
    }

    public void setSecond(T newValue) {
        second = newValue;
    }
}
