package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class mulTest {

	@Test
	public void test() {
		Calculator test=new Calculator();
		int output=test.mul(2,3);
		assertEquals(6,output);
	}

}
