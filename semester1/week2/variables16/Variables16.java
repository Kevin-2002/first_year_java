public class Variables16
{
	public static void main(String[] args)
	{
		//Declare variables
		int sharesBought = 2000;
		int sharesSold = 2000;
		double purchasePrice = 40.00;
		double salesPrice = 42.75;
		double commission = 0.03;
		double stockPurchase;
		double commonPurchase;
		double totalPurchases;
		double totalSales;
		double stockSale;
		double commonSale;
		double profitOrloss;

		//Calculations
		//Price of share
		stockPurchase = sharesBought * purchasePrice;
		//Brokers commission on purchases
		commonPurchase = stockPurchase * commission;
		//Total price paid for shares including commission
		totalPurchases = stockPurchase + commonPurchase;
		//Share sales amount
		stockSale = sharesSold * salesPrice;
		//Brokers commission on selling shares
		commonSale = stockSale * commission;
		//Sales on shares
		totalSales = stockSale - commonSale;
		//Profit or loss
		profitOrloss = totalSales - totalPurchases;
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		//Results
		System.out.println("Joe paid $" + stockPurchase + " for the stock.");
		System.out.println("Joe paid $" + commonPurchase + " Commission on Purchases.");
		System.out.println("Joe sold stock for $" + stockSale);
		System.out.println("Joe paid $" + commonSale + " commission on sales");
		System.out.println("Joe received a total of $" + totalSales);
		System.out.println("Joe's profit or loss : $" + profitOrloss);
	}
}