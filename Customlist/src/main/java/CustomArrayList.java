import java.util.AbstractList;
import java.util.Arrays;
public class CustomArrayList<E> extends AbstractList<E>{
	public final int InitialCapacity=10;
	public int size=0;
	Object[] array= {};
	CustomArrayList()
	{
		array = new Object[InitialCapacity];
	}
	@Override
	public boolean add(E e)
	{
		if(size==array.length)
		{
			increaseCapacity();
		}
		
		array[size++]=e;
		return true;
	}
	private void increaseCapacity() {
		int newIncreasedCapacity = array.length * 2;
        array = Arrays.copyOf(array, newIncreasedCapacity);
		
	}
	@SuppressWarnings("unchecked")
	@Override
	public E get(int index) {
		if(index<0 ||index >=size)
		{
			throw new IndexOutOfBoundsException();
		}
		return (E) array[index];
	}
	@SuppressWarnings("unchecked")
	@Override
	public E remove(int index)
	{
		if(index<0 || index>=size)
		{
			throw new IndexOutOfBoundsException();
		}
		E elementRemoved=(E) array[index];
		for(int i=index;i<size-1;i++)
			array[i]=array[i+1];
		size--;
		return elementRemoved;
	}
	
	public void display()
	{
		System.out.print('[');
		String s="";
		for(int i=0;i<size;i++)
			s+=array[i]+",";
		s=s.substring(0, s.length()-1);
		System.out.print(s+"]\n");
	}
	
	@Override
	public int size() {		
		return size;
	}

}
