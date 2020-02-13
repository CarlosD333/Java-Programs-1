package CarlosDegollado;

public class GenericStackLinked<T> implements IGenericStackLinked<T> {
    protected GenericNode m_top;

    public boolean isFull() {
        return false;
    }

    public boolean isEmpty() {
        if (m_top == null) {
            return true;
        } else {
            return false;
        }
    }

    public T top() {
        if (isEmpty()) {
            throw new RuntimeException(".top() attempted on an empty stack");
        } else {
            return (T) m_top.getInfo();
        }
    }

    public T pop() {
        T value;

        if (isEmpty()) {
            throw new RuntimeException(".pop() attempted on an empty stack");
        } else {
            value = (T) m_top.getInfo();
            m_top = m_top.getLink();
            return value;
        }
    }

    public void push(T newInfo) {
        GenericNode newNode = new GenericNode(newInfo);
        newNode.setLink(m_top);
        m_top = newNode;
    }

    public int size() {
        int size = 0;

        if (isEmpty()) {
            size = 0;
        } else {
            GenericNode tTop = m_top;
            do {
                size++;
                tTop = tTop.getLink();

            } while (tTop != null);
        }

        return size;
    }

    @Override
    public String toString() {
        String stackContent = "";
        GenericNode current = m_top;

        do {
            stackContent += current.getInfo() + " ";
            current = current.getLink();
        } while (current != null);

        return stackContent;
    }
}
