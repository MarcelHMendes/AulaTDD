import org.junit.Assert;
import org.junit.Test;

class Money {
	protected int amount;
	
	@Override
	public boolean equals(Object object) {
		Money money = (Money) object;
		return amount == money.amount;
	}
	
	@Test
	public void testEquality() {
		Assert.assertTrue(new Dollar(5).equals(new Dollar(5)));
		Assert.assertFalse(new Dollar(5).equals(new Dollar(6)));
		Assert.assertTrue(new Franc(5).equals(new Franc(5)));
		Assert.assertFalse(new Franc(5).equals(new Franc(6)));
	}
	
	
	
	
}
