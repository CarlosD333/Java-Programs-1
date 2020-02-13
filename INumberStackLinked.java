package CarlosDegollado;

public interface INumberStackLinked {
    // Top variable
//    protected LNode m_top;

    // Checks if stack is full
    boolean isFull();

    // Checks if stack is empty
    boolean isEmpty();

    // Returns top value of stack
    double top();

    // Removes one node from stack and returns its value
    double pop();

    // Create new node with v value and insert it onto top of stack
    void push(double newNum);

    // Returns number of nodes in stack
    int size();

    // Overrides toString method in Object class to print values of stack
    @Override
    String toString();
}