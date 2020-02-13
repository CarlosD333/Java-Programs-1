package CarlosDegollado;

public interface IGenericStackArray<T> {
    boolean isFull();
    boolean isEmpty();
    T top();
    T pop();
    void push(T info);
    int size();
    @Override
    String toString();
}
