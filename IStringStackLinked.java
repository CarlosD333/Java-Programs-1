package CarlosDegollado;

public interface IStringStackLinked {
    // Top variable
//    protected NodeString m_top;

    // Checks if stack is full
    boolean isFull();

    // Checks if stack is empty
    boolean isEmpty();

    // Returns value of top node
    String top();

    // Removes top node and returns its value
    String pop();

    // Creates new node with value newString and inserts it onto top of stack
    void push(String newString);

    // Returns the number of nodes in the stack
    int size();

    // Overrides toString method in Object class and returns the node values in the stack
    @Override
    String toString();
}
