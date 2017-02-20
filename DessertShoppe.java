package assignment5;

public class DessertShoppe {
	public final static float taxRate=0.06536f;
	public final static String storeName="M & M Dessert Shoppe";
	public final static int maxSizeOfItemName=22;
	public static int width=30;
	public final static String cents2dollarsAndCents(int cost){
		String dollarAndCentsCost;
		if(cost%100<10){
			dollarAndCentsCost=(int)(cost/100)+".0"+cost%100;
		}
		else{
			dollarAndCentsCost=(int)(cost/100)+"."+cost%100;
		}
		return dollarAndCentsCost;
	}
}
