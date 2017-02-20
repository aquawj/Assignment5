package assignment5;

public class IceCream extends DessertItem {
	protected int cost;
	public int getCost() {
		return cost;
	}
	public IceCream(String name,int cost){
		this.name=name;
		this.cost=cost;
	}
	public IceCream(){}
	public String toString() {
		int lengthOfSpace=DessertShoppe.width-name.length()-4;
		String sspace="";
		for(int i=0;i<lengthOfSpace;i++){
			sspace+=" ";
		}
		String s=name+sspace+ DessertShoppe.cents2dollarsAndCents(getCost())+"\n";
		return s;
	}
}
