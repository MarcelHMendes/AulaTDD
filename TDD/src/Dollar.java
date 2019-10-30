//import org.junit.Assert;
//import org.junit.Test;

class Dollar extends Money{
		
	Dollar(int amount,String currency){
		super(amount,currency);
	}
	Money times(int multiplier) {
		amount = amount * multiplier;
		return Money.dollar(amount * multiplier);
	}

	@Override
	public boolean equals(Object object) {
		Dollar dollar = (Dollar) object;
		return amount == dollar.amount;
	}
	
}
