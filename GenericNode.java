package CarlosDegollado;

public class GenericNode<T> implements IGenericNode<T> {
    protected GenericNode m_link;
    protected T m_info;

    public GenericNode(T newInfo) {
        m_info = newInfo;
        m_link = null;
    }

    public void setLink(GenericNode newLink) {
        m_link = newLink;
    }

    public GenericNode getLink() {
        return m_link;
    }

    public T getInfo() {
        return m_info;
    }
}
