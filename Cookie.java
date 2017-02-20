package assignment5;

public class Cookie extends DessertItem{
	public double number;
	public double pricePerDozen;
	private int cost;

	public int getCost() {
		cost = (int) (number * pricePerDozen / 12 );
		return cost;
	}
	public Cookie(String name, double number, int pricePerDozen){
		this.name=name;
		this.number=number;
		this.pricePerDozen=pricePerDozen;
	}
	public String toString() {
		int lengthOfSpace=DessertShoppe.width-name.length()-4;
		String sspace="";
		for(int i=0;i<lengthOfSpace;i++){
			sspace+=" ";
		}
		String s1=number+" "+" @"+pricePerDozen/100+"/dz.\n";
		String s2=name+sspace+ DessertShoppe.cents2dollarsAndCents(getCost())+"\n";
		return s1+s2;
	}
}
