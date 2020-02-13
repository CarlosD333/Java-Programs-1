package CarlosDegollado;

public class CharStackArray implements ICharStackArray {
    // Char[] and Index variables
    protected char[] m_array;
    protected int m_index;

    // Constructor
    public CharStackArray(int cap) {
        m_array = new char[cap];
        m_index = -1;
    }

    // Checks if the stack is full
    public boolean isFull() {
        if (m_array.length-1 == m_index) {
            return true;
        } else {
            return false;
        }
    }

    // Checks if the stack is empty
    public boolean isEmpty() {
        return (m_index == -1);
    }

    // Returns last element in the stack
    public char top() {
        if (isEmpty()) {
            throw new RuntimeException(".top() attempted on an empty stack");
        } else {
            return m_array[m_index];
        }
    }

    // Removes last element and returns its value
    public char pop() {
        if (isEmpty()) {
            throw new RuntimeException(".pop() attempted on an empty stack");
        } else {
            char value = m_array[m_index];
            m_index--;
            return value;
        }
    }

    // Inserts a new char onto top of stack
    public void push(char newChar) {
        if (isFull()) {
            throw new RuntimeException(".push(" + newChar + ") attempted on a full stack");
        } else {
            m_index++;
            m_array[m_index] = newChar;
        }
    }

    // Returns the number of elements in stack
    public int size() {
        return m_index+1;
    }

    // Overrides toString method in Object class and returns string representation of stack
    @Override
    public String toString() {
        String stackContent = "";

        for (int i = m_index; i >= 0; i--) {
            stackContent += m_array[i];
        }

        return stackContent;
    }
}
