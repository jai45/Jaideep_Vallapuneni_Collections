import static org.junit.Assert.*;

import org.junit.Test;

public class testCase {

	@Test
	public void test() {
		CustomArrayList<Integer> list = new CustomArrayList<Integer>();
		list.add(12);
		list.add(65);
		list.add(78);
		list.add(32);
		list.add(92);
		list.add(42);
		list.add(11);
		list.add(37);
		list.add(79);
		list.add(10);
		list.add(1);
		list.add(6);
		list.add(39);
		list.add(0);
		int y=list.remove(5);
		assertEquals(42,y);
		int x=list.get(0);
		assertEquals(12,x);
		
	}

}
