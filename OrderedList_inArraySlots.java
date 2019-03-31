/*********************************
OrderedList which has-A list but IS NOT a list
The user may add Numbers onto the list. 
 ********************************/

public class OrderedList_inArraySlots {
	//fields
	List_inArraySlots masterArray;
	
	 /**
      Construct an empty list with a small initial capacity.
     */
    public OrderedList_inArraySlots() {
		masterArray = new List_inArraySlots();
    }
	
    /**
      @return the number of elements in this list
     */
	public int size(){
		return masterArray.size();
	}
	
     /**
       @return a string representation of this list,
       in [a,b,c,] format
      */
	public String toString() {
		return masterArray.toString();
	}
	
	 /**
      accessor
      @return element @index from this list
     */
	public int get(int index){
		return masterArray.get(index);	
	}

    /**
      Set value at @index to @newValue and re-order
      @return old value at @index
      @precondition: @index is within the bounds of this list.
     */
	public int set(int value, int index){
		int oldValue = get(index);
		remove(index);
		add(value);
		return oldValue;
		
	}
	
    /**
      Appends @value to the appropriate spot. 
      @return true, in keeping with conventions yet to be discussed
     */
	public boolean add(int value){
        for( int elemIndex = 0; elemIndex < masterArray.size(); elemIndex++){
			if (value <= masterArray.get(elemIndex)){
				masterArray.add(value,elemIndex);
				return true;
			}
		}
		return masterArray.add(value);
	}
	
    /**
      Remove the element at position @index in this list.
      Shift any subsequent elements to the left (that is,
      decrease the index associated with each).
      @return the value that was removed from the list
     */
	public int remove(int index){
		return masterArray.remove(index);
	}


    
}