import org.junit.Assert;
import org.junit.Test;

abstract class Money {
	protected int amount;
	
	static Dollar dollar(int amount)  {
		return new Dollar(amount);
	}
	
	static Money franc(int amount) {
		return new Franc(amount);
	}
		
	abstract Money times(int multiplier); 
	   
	@Override
	public boolean equals(Object object) {
		Money money = (Money) object;
		return amount == money.amount && getClass().equals(money.getClass());
	}
	
	@Test
	public void testEquality() {
		Assert.assertTrue(Money.dollar(5).equals(Money.dollar(5)));
		Assert.assertFalse(Money.dollar(5).equals(Money.dollar(6)));
		Assert.assertTrue(Money.franc(5).equals(Money.franc(5)));
		Assert.assertFalse(Money.franc(5).equals(Money.franc(6)));
		Assert.assertFalse(Money.franc(5).equals(Money.dollar(5)));
	}
	
	@Test
	public void testMultiplication() {
		Money five = Money.dollar(5);
		Assert.assertEquals(Money.dollar(10), five.times(2));
		Assert.assertEquals(Money.dollar(15), five.times(3));
				
	}
	
	@Test
	public void testFrancMultiplication() {
		Money five = Money.franc(5);
		Assert.assertEquals(Money.franc(10), five.times(2));
		Assert.assertEquals(Money.franc(15), five.times(3));
	}
	
	
	
	
	
}
