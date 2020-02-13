package CarlosDegollado;

import java.util.Objects;

public class GenericStackArray<T> implements IGenericStackArray<T> {

    protected T[] m_array;
    protected int m_index;

    public GenericStackArray(int cap) {
        m_array = (T[]) new Object[cap];
        m_index = -1;
    }

    public boolean isFull() {
        if (m_index == m_array.length-1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (m_index == -1) {
            return false;
        } else {
            return true;
        }
    }

    public T top() {
        return m_array[m_index];
    }

    public T pop() {
        T value;

        if (isEmpty()) {
            throw new RuntimeException(".pop() attempted on an empty stack");
        } else {
            value = m_array[m_index];
            m_array[m_index] = null;
            m_index--;
        }

        return value;
    }

    public void push(T info) {
        if (isFull()) {
            throw new RuntimeException(".push() attempted on a full stack");
        } else {
            m_index++;
            m_array[m_index] = info;
        }
    }

    public int size() {
        return m_array.length;
    }

    @Override
    public String toString() {
        String stackContent = "";

        for (int i = m_array.length-1; i >= 0; i--) {
            if (m_array[i] != null) {
                stackContent += m_array[i];
            }
        }

        return stackContent;
    }
}
