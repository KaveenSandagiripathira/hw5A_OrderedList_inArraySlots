/*********************************
 * comments
 ********************************/

public class UserOfOrderedList {
	public static void main(String[] commandLine) {
		OrderedList_inArraySlots myArray = new OrderedList_inArraySlots();
		System.out.println("Empty Ordered List: " + myArray);
		myArray.add(5);
		System.out.println("Add 5 [5]: " + myArray);
		myArray.add(6);
		System.out.println("Add 6 [5,6,]: " +myArray);
		myArray.add(3);
		System.out.println("Add 3 [3,5,6,]: " +myArray);
		myArray.add(2000);
		myArray.add(-1);
		myArray.add(313);
		System.out.println("Add 2000,-1,313 [-1,3,5,6,313,2000,]: " + myArray);
		myArray.remove(0);
		System.out.println("Remove -1 [3,5,6,313,2000,]: " +myArray);
		myArray.set(4,0); 
		System.out.println("Set 3 to 4 [4,5,6,313,2000,]: " + myArray);
		myArray.set(-1,5);
		System.out.println("Set 2000 to -1 [-1,4,5,6,313]: " + myArray);
	}
}