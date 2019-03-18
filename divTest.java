package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class divTest {

	@Test
	public void test() {
		Calculator test=new Calculator();
		int output=test.div(10,2);
		assertEquals(5,output);
	}

}
