import java.util.*;

public class LooseTyping<E> {
	/** demonstrates generics in java
	**/
	public static void main(String[] args){
		LooseTyping looseTyping = new LooseTyping();
		ArrayList mylist = new ArrayList();//use raw typing
		//create different typed objects
		String stringObj = new String("string object");
		Integer integerObj = 6;
		Character[] charArrayObj = {'a','b','c'};
		
		//insert objects into a list
		looseTyping.addElementToList(mylist, stringObj);
		looseTyping.addElementToList(mylist, integerObj);
		looseTyping.addElementToList(mylist, charArrayObj);
		System.out.println(mylist);
	}

	private void addElementToList(ArrayList<E> genericList, E element){
		genericList.add(element);
	}
}
