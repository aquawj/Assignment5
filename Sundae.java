package assignment5;

public class Sundae extends IceCream {
	public String topName;
	private int topCost;

	public Sundae(String name, int cost, String topName, int topCost) {
		super.name = name;
		super.cost = cost;
		this.topName = topName;
		this.topCost = topCost;
	}

	public int getCost() {
		return (cost + topCost);
	}
	public String toString() {
		int lengthOfSpace=DessertShoppe.width-name.length();
		String sspace="";
		for(int i=0;i<lengthOfSpace;i++){
			sspace+=" ";
		}
		String sn=topName+" Sundae with "+name;
		String s="";
		int max=DessertShoppe.maxSizeOfItemName;
		if(sn.length()<=max){
			s=sn+sspace+ DessertShoppe.cents2dollarsAndCents(getCost())+"\n";
		}
		else{
			s=sn.substring(0,max)+"        "+ DessertShoppe.cents2dollarsAndCents(getCost())+"\n"+sn.substring(max+1)+"\n";// 4 spaces
		}
		return s;
	}
}
