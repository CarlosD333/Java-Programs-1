package CarlosDegollado;

public interface ICharNode {
    // Info and link variables
//    protected char m_info;
//    protected CharNode m_link;

    // Constructor
//    public CharNode(char newInfo) {
//        m_info = newInfo;
//        m_link = null;
//    }

    // Sets node link
    void setLink(CharNode newLink);

    // Returns link for node
    CharNode getLink();

    // Returns value of node
    char getInfo();
}
