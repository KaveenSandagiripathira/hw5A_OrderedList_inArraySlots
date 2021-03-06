/**
  Implement a list of integer elements, including
  both data and operations.
 */

public class List_inArraySlots {

    private int[] elements;     // container for the elements of the list
    private int filledElements; // the number of elements in this list

    private static final int INITIAL_CAPACITY = 10;

    /**
      Construct an empty list with a small initial capacity.
     */
    public List_inArraySlots() {
        elements = new int[ INITIAL_CAPACITY];
        // filledElements has been initialized to the desired value, 0
    }


    /**
      @return the number of elements in this list
     */
    public int size() {
        return filledElements;
    }


     /**
       @return a string representation of this list,
       in [a,b,c,] format
      */
    public String toString() {
        String result = "[";
        for( int elemIndex = 0; elemIndex < filledElements; elemIndex++)
            result += elements[ elemIndex] + ",";
        return result + "]";
    }
	
	     /**
      accessor
      @return element @index from this list
      precondition: @index is within the bounds of the array.
          (Having warned the user about this precondition,
           you should NOT complicate your code to check
           whether user violated the condition.)
     */
    public int get( int index ) {
		return elements[index];
    }

    /**
      Set value at @index to @newValue
      @return old value at @index
      @precondition: @index is within the bounds of this list.
     */
    public int set( int newValue, int index ) {
		int oldValue = elements[index];
		elements[index] = newValue;
		return oldValue;
    }

    /**
      Appends @value to the end of this list.
      @return true, in keeping with conventions yet to be discussed
     */
     public boolean add( int value) {
         // expand if necessary
         if( filledElements == elements.length) expand();

         elements[ filledElements] = value;
         filledElements++;
         // idiomatic version: elements[ filledElements++] = value;
        return true;
	 }
	 
	 	/**
      Insert @value at position @index in this list.
      Shift the element currently at that position (if any)
      and any subsequent elements to the right
      (that is, increase the index associated with each).
     */
     public boolean add( int value, int index) {
		// expand if necessary
        if( filledElements == elements.length) expand();
		 
		for( int elemIndex = filledElements - 1; elemIndex >= index; elemIndex--)
			elements[ elemIndex + 1] = elements[ elemIndex];
		
		elements[index] = value;
		filledElements++;
		return true;
     }
	 
    /**
      Remove the element at position @index in this list.
      Shift any subsequent elements to the left (that is,
      decrease the index associated with each).
      @return the value that was removed from the list
     */
     public int remove( int index) {
		 // holds value for old value of removed index
		int oldValue = elements[index];
		for( int elemIndex = index; elemIndex < filledElements - 1; elemIndex++)
			elements[ elemIndex] = elements[ elemIndex + 1];
		
		elements[ filledElements - 1] = 0;
		filledElements--;
		return oldValue;
     }

    /**
      Double the capacity of the List_inArraySlots,
      preserving existing data.
     */
     private void expand() {
        System.out.println( "expand... (for debugging)");
           /* S.O.P. rules for debugging:
              Working methods should be silent. But during
              development, the programmer must verify that
              this method is called when that is appropriate.
              So test using the println(), then comment it out.
              */
        int[] bigger = new int[ elements.length * 2];
        for( int elemIndex = 0; elemIndex < filledElements; elemIndex++)
            bigger[ elemIndex] = elements[ elemIndex];
        elements = bigger;
     }
}