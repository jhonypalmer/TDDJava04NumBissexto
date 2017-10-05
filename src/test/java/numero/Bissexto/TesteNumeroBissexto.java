package numero.Bissexto;

import org.junit.Assert;
import org.junit.Test;

public class TesteNumeroBissexto{
	@Test
	public void testeNumeroBissexto() {
	
		Bissexto numero = new Bissexto();
		
		Assert.assertTrue(numero.bissexto(4));
		Assert.assertFalse(numero.bissexto(0));
		Assert.assertTrue(numero.bissexto(400));
		Assert.assertFalse(numero.bissexto(100));
		Assert.assertTrue(numero.bissexto(404));
		Assert.assertTrue(numero.bissexto(800));
		Assert.assertTrue(numero.bissexto(2016));
		Assert.assertFalse(numero.bissexto(2018));
		
	}
}
