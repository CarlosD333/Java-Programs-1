package CarlosDegollado;

public class CharStackLinked implements ICharStackLinked {
    // Top variable
    protected CharNode m_top;

    // Checks if stack is full
    public boolean isFull() {
        return false;
    }

    // Checks if stack is empty
    public boolean isEmpty() {
        if (m_top == null) {
            return true;
        } else {
            return false;
        }
    }

    // Returns value of top node
    public char top() {
        if (isEmpty()) {
            throw new RuntimeException(".top() attempted on an empty stack");
        }
        return m_top.getInfo();
    }

    // Removes top node and returns its value
    public char pop() {
        char value;
        if (isEmpty()) {
            throw new RuntimeException(".pop() attempted on an empty stack");
        } else {
            value = m_top.getInfo();
            m_top = m_top.getLink();
        }

        return value;
    }

    // Creates new node and inserts it onto top of stack
    public void push(char newChar) {
        CharNode newNode = new CharNode(newChar);
        newNode.setLink(m_top);
        m_top = newNode;
    }

    // Returns number of nodes in the stack
    public int size() {
        int size = 0;

        if (m_top == null) {
            size = 0;
        } else {
            CharNode tTop = m_top;
            do {
                size++;
            } while (tTop != null);
        }

        return size;
    }

    // Overrides toString method in Object class and returns string representation of the stack
    @Override
    public String toString() {
        String stackContent = "";
        CharNode current = m_top;

        do {
            stackContent += m_top.getInfo() + " ";
        } while (current != null);

        return stackContent;
    }
}
