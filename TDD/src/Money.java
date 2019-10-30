import org.junit.Assert;
import org.junit.Test;

class Money {
	protected int amount;
	protected String currency;
	
	String currency() {
		return currency;
	}
	
	static Money dollar(int amount)  {
		return new Money(amount, "USD");
	}
	
	static Money franc(int amount) {
		return new Money(amount,"CHF");
	}
	
	Money(int amount,String currency){
		this.amount = amount;
		this.currency = currency;
	}
		
	Money times(int multiplier) {
		return new Money(amount * multiplier, currency);
	}
	   
	@Override
	public boolean equals(Object object) {
		Money money = (Money) object;
		return amount == money.amount && currency().equals(money.currency());
	}
	
	@Test
	public void testEquality() {
		Assert.assertTrue(Money.dollar(5).equals(Money.dollar(5))); 
		Assert.assertFalse(Money.dollar(5).equals(Money.dollar(6)));
		Assert.assertFalse(Money.franc(5).equals(Money.dollar(5)));
	}
	
	@Test
	public void testMultiplication() {
		Money five = Money.dollar(5);
		Assert.assertEquals(Money.dollar(10), five.times(2));
		Assert.assertEquals(Money.dollar(15), five.times(3));
				
	}
			
	@Test
	public void testCurrency() {
		Assert.assertEquals("USD", Money.dollar(1).currency());
		Assert.assertEquals("CHF", Money.franc(1).currency());
	}
	
}
