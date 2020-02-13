package CarlosDegollado;

public class NumberNode implements INumberNode {
    // Info and Link variables
    protected double m_info;
    protected NumberNode m_link;

    // Constructor
    public NumberNode(double newInfo) {
        m_info = newInfo;
        m_link = null;
    }

    // Sets reference
    public void setLink(NumberNode newLink) {
        m_link = newLink;
    }

    // Gets reference
    public NumberNode getLink() {
        return m_link;
    }

    // Gets node value
    public double getInfo() {
        return m_info;
    }
}
