public interface NumberStack {
    boolean isEmpty();  // checks if stack is empty
    boolean isFull();   // checks if stack is full
    void push(int v);    // push a value onto the stack
    int pop();  // removes and returns the element at top of stack
    int top();     // returns element at top of stack
    int size();     // returns number of elements on stack
    @Override
    String toString();      // returns a string representation of the stack
}
