package CarlosDegollado;

public class NumberStackLinked implements INumberStackLinked {
    // Top variable
    protected NumberNode m_top;

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

    // Returns top value
    public double top() {
        if (m_top == null) {
            throw new RuntimeException(".top() attempted on an empty stack");
        } else {
            return m_top.getInfo();
        }
    }

    // Removes one node and returns its value
    public double pop() {
        double value;

        if (isEmpty()) {
            throw new RuntimeException(".pop() attempted on an empty stack");
        } else {
            value = m_top.getInfo();
            m_top = m_top.getLink();
        }

        return value;
    }

    // Create new node with v value and insert it
    public void push(double newNum) {
        NumberNode newNode = new NumberNode(newNum);
        newNode.setLink(m_top);
        m_top = newNode;
    }

    // Returns number of nodes in list
    public int size() {
        int size = 0;
        if (isEmpty()) {
            size = 0;
        } else {
            NumberNode tTop = m_top;
            do {
                size++;
                tTop = tTop.getLink();
            } while (tTop != null);
        }

        return size;
    }

    // Overrides toString method in Object class to print values of stack
    @Override
    public String toString() {
        String stackContent = "";
        NumberNode current = m_top;

        while (current != null) {
            stackContent += current.getInfo() + " ";
            current = current.getLink();
        }

        return stackContent;
    }
}
