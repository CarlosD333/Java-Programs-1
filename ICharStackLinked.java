package CarlosDegollado;

public interface ICharStackLinked {
    // Top variable
//    protected CharNode m_top;

    // Checks if stack is full
    boolean isFull();

    // Checks if stack is empty
    boolean isEmpty();

    // Returns value of top node
    char top();

    // Removes top node and returns its value
    char pop();

    // Creates new node and inserts it onto top of stack
    void push(char newChar);

    // Returns number of nodes in the stack
    int size();

    // Overrides toString method in Object class and returns string representation of the stack
    @Override
    String toString();
}
