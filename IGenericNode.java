package CarlosDegollado;

public interface IGenericNode<T> {
    void setLink(GenericNode newLink);
    GenericNode getLink();
    T getInfo();
}
