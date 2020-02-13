package CarlosDegollado;

public class CharNode implements ICharNode {
    // Info and link variables
    protected char m_info;
    protected CharNode m_link;

    // Constructor
    public CharNode(char newInfo) {
        m_info = newInfo;
        m_link = null;
    }

    // Sets node link
    public void setLink(CharNode newLink) {
        m_link = newLink;
    }

    // Returns link for node
    public CharNode getLink() {
        return m_link;
    }

    // Returns value of node
    public char getInfo() {
        return m_info;
    }
}
