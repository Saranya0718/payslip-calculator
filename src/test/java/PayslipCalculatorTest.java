import junit.framework.TestCase;
import org.junit.Before;

/**
 * Created by Ramkumar Kirubanandam on 07/01/2022.
 */
public class PayslipCalculatorTest extends TestCase{
	private PaySlipCalculator paySlipCalculator;
	
	@Before
	public void setUp(){
		paySlipCalculator = new PaySlipCalculator();
	}
	
	public void testExecute(){
		paySlipCalculator.execute("input.txt","boo.txt");
	}
	
}
