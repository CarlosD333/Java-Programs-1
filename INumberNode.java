package CarlosDegollado;

public interface INumberNode {
    // Info and Link variables
//    protected double m_info;
//    protected LNode m_link;

    // Constructor
//    public LNode(double newInfo) {
//        m_info = newInfo;
//        m_link = null;
//    }

    // Sets reference
    void setLink(NumberNode newLink);

    // Gets reference for last node, null if head
    NumberNode getLink();

    // Gets node value
    double getInfo();
}
