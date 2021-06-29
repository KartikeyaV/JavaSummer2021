/**
 * HW4_8
 * @author karti
 *
 */
public class HW4_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float CHEESE_PIZZA_COST = 10;
		float VEGGIE_PIZZA_COST = 15;
		float MEAT_LOVER_PIZZA_COST = 17;
		float STATE_TAX_PERCENTAGE = 6;
		System.out.println("CHEESE PIZZA: $10");
		System.out.println("VEGGIE PIZZA: $15");
		System.out.println("MEAT LOVER PIZZA: $17");
		System.out.println("---------------------");
		String userName = RUI.readUserStringInput("Customer's Name:");
		int numOfCheese = RUI.readUserIntInput("Number of Cheese Pizzas:");
		int numOfVeg = RUI.readUserIntInput("Number of Veggie Pizzas:");
		int numOfMeat = RUI.readUserIntInput("Number of Meat Pizzas:");
		float totalCostCheese = CHEESE_PIZZA_COST * numOfCheese;
		float totalCostVeg = VEGGIE_PIZZA_COST * numOfVeg;
		float totalCostMeat = MEAT_LOVER_PIZZA_COST * numOfMeat;
		float totalCost = totalCostCheese + totalCostVeg + totalCostMeat;
		float salesTax = totalCost * (STATE_TAX_PERCENTAGE/100);
		String formatTitle = String.format("%-13s | %-9s | %-15s | %-12s |", "Item", "Quantity", "Price Per Item", "Total");
		String formatCheese = String.format("%-13s | %-9s | %-15s | %-12s |", "Cheese Pizza", numOfCheese, "$" + CHEESE_PIZZA_COST, "$" + totalCostCheese);
		String formatVeg = String.format("%-13s | %-9s | %-15s | %-12s |", "Veggie Pizza", numOfVeg, "$" + VEGGIE_PIZZA_COST, "$" + totalCostVeg);
		String formatMeat = String.format("%-13s | %-9s | %-15s | %-12s |", "Meat Pizza", numOfMeat, "$" + MEAT_LOVER_PIZZA_COST, "$" + totalCostMeat);
		String formatSpace = String.format("%-13s | %-9s | %-15s | %-12s |", "", "", "","");
		String formatTax = String.format("%-13s | %-9s | %-15s | %-12s |", "Sales Tax", "", STATE_TAX_PERCENTAGE + "%", "$" + salesTax);
		String formatTotal = String.format("%-43s | %-12s |", "Total Due", "$" + (totalCost + salesTax));
		System.out.println("");
		System.out.println("Karthik's Pizza Store");
		System.out.println("---------------------");
		System.out.println("Customer Name: " + userName);
		System.out.println("------------------------------------------------------------");
		System.out.println(formatTitle);
		System.out.println("------------------------------------------------------------");
		if (numOfCheese > 0) {
		System.out.println(formatCheese);
		}
		if (numOfVeg > 0) {
		System.out.println(formatVeg);
		}
		if (numOfMeat > 0 ) {
		System.out.println(formatMeat);
		}
		System.out.println(formatSpace);
		System.out.println(formatSpace);
		System.out.println(formatTax);
		System.out.println(formatSpace);
		System.out.println("------------------------------------------------------------");
		System.out.println(formatTotal);
	}

}
