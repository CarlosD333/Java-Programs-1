package CarlosDegollado;

public interface ICharStackArray {
    // Char[] and Index variables
//    protected char[] m_array;
//    protected int m_index;

    // Constructor
//    public CharStack(int cap) {
//        m_array = new char[cap];
//        m_index = -1;
//    }

    // Checks if the stack is full
    boolean isFull();

    // Checks if the stack is empty
    boolean isEmpty();

    // Returns last element in the stack
    char top();

    // Removes last element and returns its value
    char pop();

    // Inserts a new char onto top of stack
    void push(char newChar);

    // Returns the number of elements in stack
    int size();

    // Overrides toString method in Object class and returns string representation of stack
    @Override
    String toString();
}
