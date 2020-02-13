// The LNode class that represents a node in linked list
// Carlos J Degollado

public class LNode {

    //instance variables
    protected int m_info;
    protected LNode m_link;

    //constructor
    public LNode(int info) {
        m_info = info;
        m_link = null;
    }

    //getters and setters
    public void setLink(LNode link) {
        m_link = link;
    }

    public int getInfo() {
        return m_info;
    }

    public LNode getLink() {
        return m_link;
    }
}
