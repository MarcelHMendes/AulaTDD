

class Franc extends Money {
	
	
	
	Franc(int amount, String currency) {      
		super(amount, currency);
	}					
	Money times(int multiplier)  {      
		return Money.franc(amount * multiplier);				
	}   
	public boolean equals(Object object) {					
		Franc franc = (Franc) object;      
		return amount == franc.amount;					
	}	
	
}
