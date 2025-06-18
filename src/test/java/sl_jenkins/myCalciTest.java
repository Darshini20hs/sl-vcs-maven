package sl_jenkins;
import mypkg.calci;
import static org.junit.Assert.*;

import org.junit.Test;

public class myCalciTest {

	@Test
	public void test() {
		
		calci calc = new calci();
		assertEquals(30,calc.add(10,20));
	}

}
