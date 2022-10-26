package fr.diginamic.enumerations;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestSaison {

	@Test
	public void testValueofLibelle(){
		
		String resultat = Saison.valueOfLibelle("Automne");
		
		assertEquals("Automne", resultat);
				
		
	}
	

}
