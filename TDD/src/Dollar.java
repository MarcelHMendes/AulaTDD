import org.junit.Assert;
import org.junit.Test;

class Dollar extends Money{
	int amount = 10;
	Dollar(int amount){
		this.amount = amount;		
	}
	int times(int multiplier) {
		amount = amount * multiplier;
		return amount;
	}

	@Test
	public static void testMultiplication(){
		Dollar five = new Dollar(5);
		Assert.assertEquals(10, five.times(2));
		Assert.assertEquals(new Dollar(15), five.times(3));
	}
	
		
	@Override
	public boolean equals(Object object) {
		Dollar dollar = (Dollar) object;
		return amount == dollar.amount;
	}
	
	
	
}
