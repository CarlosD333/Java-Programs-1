package CarlosDegollado;

// The linked list based implementation for the NumberStack ADT
// Carlos J Degollado

public class LinkedNumberStack implements NumberStack
{
    // instance variable
    private LNode m_top;

    // check whether the stack is empty
    public boolean isEmpty()
    {
        if (m_top == null)
            return true;
        else
            return false;
    }

    // check whether the stack is full
    public boolean isFull()
    {
        return false;
    }

    // return the element at the top of the stack
    public int top()
    {
        if (isEmpty())
            throw new RuntimeException("top attempted on an empty stack");
        else
            return m_top.getInfo();
    }

    // push a value onto the stack
    public void push(int v)
    {
        if (isFull()) {
            throw new RuntimeException("Push attempted on a full stack");
        } else {
            LNode newNode = new LNode(v);
            newNode.setLink(m_top);
            m_top = newNode;
        }
    }

    // remove and return the value at the top of the stack
    public int pop()
    {
        int val;

        if(isEmpty()) {
            throw new RuntimeException("Pop attempted on an empty stack");
        } else {
            val = m_top.getInfo();
            m_top = m_top.getLink();
        }

        return val;
    }

    // return the number of elements on the stack
    public int size()
    {
        int size = 0;

        if(m_top == null) {
            size = 0;
        } else {
            LNode tTop = m_top;

            do {
                size++;
                tTop = tTop.getLink();
            } while (tTop != null);
        }

        return size;
    }

    // return a string representation of the stack
    @Override
    public String toString()
    {
        String stackContent = "";
        LNode current = m_top;

        while (current != null)
        {
            stackContent += current.getInfo() + " ";
            current = current.getLink();
        }

        return stackContent;
    }
}