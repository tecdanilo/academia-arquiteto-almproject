package arquiteto.data;


import static org.junit.Assert.*;

import org.junit.Test;


public class TesteData {

	@Test
	public void test() {
		Data data = new Data(1,10,2000);
		assertTrue("bissexto errado!",data.anoBissexto());
	}
}
