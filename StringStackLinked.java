package CarlosDegollado;

public class StringStackLinked implements IStringStackLinked {
    // Top variable
    protected StringNode m_top;

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
    public String top() {
        if (isEmpty()) {
            throw new RuntimeException(".top() attempted on an empty stack");
        } else {
            return m_top.getInfo();
        }
    }

    // Removes top node and returns its value
    public String pop() {
        String value;

        if (isEmpty()) {
            throw new RuntimeException(".pop() attempted on an empty stack");
        } else {
            value = m_top.getInfo();
            m_top = m_top.getLink();
        }

        return value;
    }

    // Creates new node with value newString and inserts it onto top of stack
    public void push(String newString) {
        StringNode newNode = new StringNode(newString);
        newNode.setLink(m_top);
        m_top = newNode;
    }

    // Returns the number of nodes in the stack
    public int size() {
        int size = 0;

        if (m_top == null) {
            size = 0;
        } else {
            StringNode tTop = m_top;
            do {
                size++;
                tTop = tTop.getLink();
            } while (tTop != null);
        }

        return size;
    }

    // Overrides toString method in Object class and returns the node values in the stack
    @Override
    public String toString() {
        String stackContent = "";
        StringNode current = m_top;
        do {
            stackContent += current.getInfo() + " ";
        } while (current != null);

        return stackContent;
    }
}
