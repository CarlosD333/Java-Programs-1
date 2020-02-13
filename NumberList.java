//The NumberList interface
//Carlos J Degollado

public interface NumberList {
    void insertTail(int v);     //insert a number into the list
    boolean isFull();       //check if the list is full
    boolean contains(int v);        //check if a given number exists in the list
    @Override
    String toString();      //returns a string representation of the list
}
