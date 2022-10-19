package entities;

public class Bill {
	 public static double COUVERT = 4.00;	
	 public char gender;
	 public int beer;
	 public int barbecue; 
	 public int softDrink;
	 
	 public double cover() {
		 return COUVERT;
	 }
	 public double feeding() {
		 return this.beer * 5.00  + this.softDrink * 3.00  + this.barbecue * 7.00;
	 }
	 public double ticket() {
		 if(gender == 'M') {
			 return 10.00;
		 }else {
			 return 8.00;
		 } 
	 }
	 public double total() {
		 if(feeding() > 30.00) {
			 return feeding()+ ticket();
		 }else {
			 return feeding()+cover()+ticket();
		 }
	 }
}