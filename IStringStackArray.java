package CarlosDegollado;

public interface IStringStackArray {
    // Top variable
//    protected String[] m_array;
//    protected int m_index;

    // Constructors
//    public StringStackArray(int cap) {
//        m_array = new String[cap];
//        m_index = -1;
//    }

    // Checks if stack is full
    boolean isFull();

    // Checks if stack is empty
    boolean isEmpty();

    // Returns top value
    String top();

    // Removes one node and returns its value
    String pop();

    // Create new node with v value and insert it
    void push(String newString);

    // Returns number of nodes in list
    int size();

    // Overrides toString method in Object class to print values of stack
    @Override
    String toString();
}
