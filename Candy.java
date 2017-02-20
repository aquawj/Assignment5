package assignment5;

public class Candy extends DessertItem {
	public double weight;
	public double pricePerPound;
	private int cost;
	public int getCost(){
		cost=(int)(weight*pricePerPound);
		return cost;
	}
	public Candy(String name, double weight, int pricePerPound){
		this.name=name;
		this.weight=weight;
		this.pricePerPound=pricePerPound;
	}
	public String toString() {
		String sspace="";
		int lengthOfSpace=DessertShoppe.width-name.length();
		for(int i=0;i<lengthOfSpace;i++){
			sspace+=" ";
		}
		String s1=weight+" "+"lbs. @"+pricePerPound/100+"/lb.\n";
		String s2=name+sspace+ DessertShoppe.cents2dollarsAndCents(getCost())+"\n";
		return s1+s2;
	}
}
