package assignment5;

import java.util.*;

public class Checkout {
	ArrayList<DessertItem> itemList = new ArrayList<DessertItem>();

	public Checkout() {

	}

	public int numberOfItems() {
		return itemList.size();
	}

	public void enterItem(DessertItem item) {
		itemList.add(item);
	}

	public void clear() {
		itemList = new ArrayList<DessertItem>();
		System.out.println("Your screen is cleared.\n\n");
	}

	public int totalCost() {
		int ttCost = 0;
		for (int i = 0; i < itemList.size(); i++) {
			ttCost += itemList.get(i).getCost();
		}
		return ttCost;
	}

	public int totalTax() {
		return (int)(totalCost() * DessertShoppe.taxRate);
	}

	public String toString() {
		String s1 = DessertShoppe.storeName + "\n";
		String s2 = "-------------------------------\n\n";
		String s3 = "";
		for (int i = 0; i < itemList.size(); i++) {
			s3 += itemList.get(i).toString();
		}
		String s4 = "\nTax                       " + DessertShoppe.cents2dollarsAndCents(totalTax()) + "\n";  //23 spaces
		String s5 = "Total Cost               " + DessertShoppe.cents2dollarsAndCents(totalTax() + totalCost())+ "\n"; //15 spaces
		return s1 + s2 + s3 + s4 + s5;
	}

}
