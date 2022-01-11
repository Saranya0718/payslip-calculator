/**
 * Created by Ramkumar Kirubanandam on 07/01/2022.
 */
public class TaxItem {
	private int maxLimit;
	private int minLimit;
	private double taxRate;
	
	
	public TaxItem(){
		this(0,0,0);
	}
	public TaxItem(int minLimit, int maxLimit, double taxRate){
		this.maxLimit = maxLimit;
		this.minLimit = minLimit;
		this.taxRate = taxRate;
	}

	
	public double getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(double taxRate) {
		this.taxRate = taxRate;
	}

	public int getMaxLimit() {
		return maxLimit;
	}

	public void setMaxLimit(int maxLimit) {
		this.maxLimit = maxLimit;
	}

	public int getMinLimit() {
		return minLimit;
	}

	public void setMinLimit(int minLimit) {
		this.minLimit = minLimit;
	}
}
