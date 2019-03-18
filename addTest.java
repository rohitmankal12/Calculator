package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class addTest {

	@Test
	public void test() {
		Calculator test=new Calculator();
		int output=test.add(2,3);
		assertEquals(5,output);
	}

}
