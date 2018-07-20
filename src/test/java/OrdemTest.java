

import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.junit.Assert;
import org.junit.FixMethodOrder;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class OrdemTest {
	
	public static int contador = 0;

	@Test
	public void t1_inicia() {
		contador = 1;
	}
	
	@Test
	public void t2_verifica() {
		Assert.assertEquals(1, contador);
	}
	
}
