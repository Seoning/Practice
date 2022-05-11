
public class AccountingAPP {

	public static void main(String[] args) {
		
		double ValueOfSupply = Double.parseDouble(args[0]);
		double vatRate = 0.1;
		double vat = ValueOfSupply * vatRate;
		double total = vat + ValueOfSupply;
		double expenseRate = 0.3;
		double espense = ValueOfSupply * expenseRate;
		double income = ValueOfSupply - espense;
		double dividend1 = income * 0.5;
		double dividend2 = income * 0.3;
		double dividend3 = income * 0.2;
		
		
		System.out.println("Value of supply :" + ValueOfSupply);
		System.out.println("VAT :"+vat );
		System.out.println("Total :"+total );
		System.out.println("Expense :" +espense);
		System.out.println("Income :" +income);
		System.out.println("Dividend1 :" +dividend1);
		System.out.println("Dividend2 :" +dividend2);
		System.out.println("Dividend3 :" +dividend3);
		
		
		

	}

}
