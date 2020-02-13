package CarlosDegollado;

public interface IStringNode {
    // Info and Link variables
//    protected String m_info;
//    protected NodeString m_link;

    // Constructor
//    public NodeString(String newInfo) {
//        m_info = newInfo;
//        m_link = null;
//    }

    // Sets reference
    void setLink(StringNode newLink);

    // Gets reference to last node, null if head
    StringNode getLink();

    // Gets node value
    String getInfo();
}
