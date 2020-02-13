package CarlosDegollado;

public class StringNode implements IStringNode {
    // Info and Link variables
    protected String m_info;
    protected StringNode m_link;

    // Constructor
    public StringNode(String newInfo) {
        m_info = newInfo;
        m_link = null;
    }

    // Sets reference
    public void setLink(StringNode newLink) {
        m_link = newLink;
    }

    // Gets reference to last node, null if head
    public StringNode getLink() {
        return m_link;
    }

    // Gets node value
    public String getInfo() {
        return m_info;
    }
}
