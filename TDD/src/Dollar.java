import org.junit.Assert;
import org.junit.Test;

class Dollar {
	int amount = 10;
	Dollar(int amount){}
	void times(int multiplier) {}

	@Test
	public void testMultiplication(){
		Dollar five = new Dollar(5);
		five.times(2);
		Assert.assertEquals(10, five.amount);

	}

	public static void main(final String[] args){
		
	
	}
}
