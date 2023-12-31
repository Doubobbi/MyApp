class Accounting{
	public static double valueofSupply;
	public static double vatRate;
	public static double expenseRate;
	static void print() {
		System.out.println("Value of supply : "+ valueofSupply);
		System.out.println("VAT :"+ getVAT());
		System.out.println("Total "+ getTotal() );
		System.out.println("Expense : "+ getExpense() );
		System.out.println("Income : "+ getIncome() );
		System.out.println("Dividend 1 : "+ getDividend1() );
		System.out.println("Dividend 2 : "+ getDividend2() );
		System.out.println("Dividend 3 : "+ getDividend3() );
	}

	private static double getDividend1() {
		return getIncome()*0.5;
	}
	private static double getDividend2() {
		return getIncome()*0.3;
	}
	private static double getDividend3() {
		return getIncome()*0.2;
	}

	private static double getIncome() {
		return valueofSupply - getExpense();
	}

	private static double getExpense() {
		return valueofSupply * expenseRate;
	}

	private static double getTotal() {
		return valueofSupply + getVAT();
	}

	private static double getVAT() {
		return valueofSupply*vatRate;
	}
}

public class AccountingClassApp {
	
	public static void main(String[] args) {
		
		Accounting.valueofSupply = 10000.0;
		Accounting.vatRate = 0.1;
		Accounting.expenseRate = 0.3;
		Accounting.print();
		// anotherVarieble = ...;
		// anotherMethod = ...;
	
	}

}
	