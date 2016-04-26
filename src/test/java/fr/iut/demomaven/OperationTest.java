package fr.iut.demomaven;

import junit.framework.TestCase;

public class OperationTest extends TestCase
{
	
	public void testAdditionner()
	{
		Operation o = new Operation();
		
		assertEquals(
			o.additionner(12, 13), 
			25
		);
		
		assertEquals(
			o.additionner(-12, 13), 
			1
		);
		
		assertEquals(
			o.additionner(0, 0), 
			0
		);
		
	}

}
