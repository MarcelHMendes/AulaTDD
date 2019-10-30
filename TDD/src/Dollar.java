//import org.junit.Assert;
//import org.junit.Test;

class Dollar extends Money{
	int amount = 10;
	Dollar(int amount){
		this.amount = amount;		
	}
	Money times(int multiplier) {
		amount = amount * multiplier;
		return new Dollar(amount * multiplier);
	}

	@Override
	public boolean equals(Object object) {
		Dollar dollar = (Dollar) object;
		return amount == dollar.amount;
	}
	
	
	
}
