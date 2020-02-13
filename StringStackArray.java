package CarlosDegollado;

public class StringStackArray implements IStringStackArray {
    // Top variable
    protected String[] m_array;
    protected int m_index;

    // Constructors
    public StringStackArray(int cap) {
        m_array = new String[cap];
        m_index = -1;
    }

    // Checks if stack is full
    public boolean isFull() {
        if (m_index == m_array.length-1) {
            return true;
        } else {
            return false;
        }
    }

    // Checks if stack is empty
    public boolean isEmpty() {
        if (m_index == -1) {
            return true;
        } else {
            return false;
        }
    }

    // Returns top value
    public String top() {
        if (isEmpty()) {
            throw new RuntimeException(".top() attempted on an empty stack");
        } else {
            return m_array[m_index];
        }
    }

    // Removes one node and returns its value
    public String pop() {
        if (isEmpty()) {
            throw new RuntimeException(".pop() attempted on an empty stack");
        } else {
            String value = m_array[m_index];
            m_index--;
            return value;
        }
    }

    // Create new node with v value and insert it
    public void push(String newString) {
        if (isFull()) {
            throw new RuntimeException(".push(" + newString + ") attempted on an empty stack");
        } else {
            m_index++;
            m_array[m_index] = newString;
        }
    }

    // Returns number of nodes in list
    public int size() {
        return m_index+1;
    }

    // Overrides toString method in Object class to print values of stack
    @Override
    public String toString() {
        String stackContent = "";

        do {
            stackContent += m_array[m_index] + " ";
        } while (m_index != -1);

        return stackContent;
    }
}
