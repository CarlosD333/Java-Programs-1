// The linked list implementation for the NumberList ADT
// Carlos J Degollado

public class LinkedNumberList implements NumberList {
    //instance variables
    private LNode m_first;
    private LNode m_last;

    //constructor
    public LinkedNumberList() {
        m_first = m_last = null;
    }

    //insert a number into the list
    public void insertTail(int v) {
        LNode newNode = new LNode(v);

        /*
        newNode.setLink(m_first);
        m_first = newNode;
        */

        /* insertion at tail */
        if (m_first == null) {
            m_first = m_last = newNode;
        } else {
            m_last.setLink(newNode);
            m_last = newNode;
        }
    }

    //check if the list is full
    public boolean isFull() {
        return false;
    }

    //check if a given number exists in the list
    public boolean contains(int v) {
        LNode current = m_first;

        while(current != null) {
            if(current.getInfo() == v) {
                return true;
            } else {
                current = current.getLink();
            }
        }

        return false;
    }

    //returns a string representation of the list
    @Override
    public String toString() {
        String listContent = "The content of the list is ";
        LNode current = m_first;

        while(m_first != null) {
            listContent += m_first.getInfo() + " ";
            m_first = m_first.getLink();

        }

        return listContent;
    }
}
