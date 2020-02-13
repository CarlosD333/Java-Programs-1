package CarlosDegollado;

public interface IGenericStackLinked<T> {
    boolean isFull();
    boolean isEmpty();
    T top();
    T pop();
    void push(T newInfo);
    int size();
    @Override
    String toString();
}
