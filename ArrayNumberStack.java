public class ArrayNumberStack implements NumberStack {
    //variables
    protected int[] m_array;
    protected int m_index;

    //constructor
    public ArrayNumberStack(int cap) {
        m_array = new int[cap];
        m_index = 0;
    }

    public boolean isEmpty()  // checks if stack is empty
    {
        return (m_index == 0);
    }

    public boolean isFull()   // checks if stack is full
    {
        return (m_index == m_array.length);
    }

    public void push(int v)    // push a value onto the stack
    {
        if (isFull()) {
            throw new RuntimeException("push attempted on a full stack");
        } else {
            m_array [m_index] = v;
            m_index++;
        }
    }

    public int pop()  // removes and returns the element at top of stack
    {
        if (isEmpty()) {
            throw new RuntimeException("pop attempted on a empty stack");
        } else {
            int v = m_array[m_index-1]; //int v = --m_index;    maybe
            m_index--;

            return v;
        }
    }

    public int top()     // returns element at top of stack
    {
        if (isEmpty()) {
            throw new RuntimeException("top attempted on a empty stack");
        } else {
            return m_array[m_index-1];
        }
    }

    public int size()     // returns number of elements on stack
    {
        return m_index;
    }

    @Override
    public String toString()      // returns a string representation of the stack
    {
        String stackContent = "The content of the stack from top to bottom is \n";

        for (int i = m_index-1; i >= 0; i--) {
            stackContent += m_array[i] + "\n";
        }

        return stackContent;
    }
}
