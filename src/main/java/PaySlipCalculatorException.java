/**
 * Created by Ramkumar Kirubanandam on 07/01/2022.
 */
public class PaySlipCalculatorException extends RuntimeException{
	private String message;
	
	public PaySlipCalculatorException(String message){
		super(message);
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
}
