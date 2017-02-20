package assignment5;

public abstract class DessertItem {
	String name;
	public DessertItem(){
	}
	public DessertItem(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public int getCost(){
		int cost=0;
		return cost;     //cost in cents
	}
}
