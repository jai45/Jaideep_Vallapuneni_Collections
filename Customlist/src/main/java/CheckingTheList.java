import java.util.Iterator;

public class CheckingTheList {

	public static void main(String args[])
	{
		CustomArrayList<Integer> list1 = new CustomArrayList<Integer>();
		list1.add(12);
		list1.add(56);
		list1.add(89);
		list1.add(98);
		list1.add(45);
		System.out.println("Element removed at index 1 is: "+list1.remove(1));
		System.out.println("Element at index 3 is: "+list1.get(3));
		System.out.println("List elements are:");
		list1.display();
		CustomArrayList<String> list2 = new CustomArrayList<String>();
		list2.add("epam");
		list2.add("java");
		list2.add("Eclipse");
		list2.add("custom");
		list2.add("list");
		System.out.println("Element removed at index 2 is: "+list2.remove(2));
		System.out.println("Element at index 1 is: "+list2.get(1));
		System.out.println("Remaining elements in list are:");
		Iterator<String> iterator = list2.iterator();
        System.out.println("List elements are: "); 
        while (iterator.hasNext()) 
            System.out.print(iterator.next() + " "); 
	}
}
