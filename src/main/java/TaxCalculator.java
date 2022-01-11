import java.util.ArrayList;

/**
 * Created by Ramkumar Kirubanandam on 07/01/2022.
 */
public class TaxCalculator {

	private static ArrayList<TaxItem> initializeTaxItems() {
		ArrayList<TaxItem> taxItems = new ArrayList<>();

		TaxItem itemOne = new TaxItem(20001, 40000, 0.10);
		TaxItem itemTwo = new TaxItem(40001, 80000, 0.20);
		TaxItem itemThree = new TaxItem(80001, 180000, 0.30);
		TaxItem itemFour = new TaxItem(180000, Integer.MAX_VALUE, 0.40);

		taxItems = new ArrayList<>();

		taxItems.add(itemOne);
		taxItems.add(itemTwo);
		taxItems.add(itemThree);
		taxItems.add(itemFour);

		return taxItems;
	}

	public static long calculate(long annualSalary)
	throws PaySlipCalculatorException {
		if (annualSalary < 0) {
			throw new PaySlipCalculatorException("Annual Salary must be greater than zero");
		}
		for (TaxItem item : initializeTaxItems()) {
			if (annualSalary > item.getMinLimit() && annualSalary <= item.getMaxLimit()) {
				return Math.round(((annualSalary - item.getMinLimit()) * item.getTaxRate()) / 12);
			}
		}
		return annualSalary;
	}
}
