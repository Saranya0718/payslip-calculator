import junit.framework.TestCase;
import org.junit.Before;

/**
 * Created by Ramkumar Kirubanandam on 07/01/2022.
 */
public class SuperCalculatorTest extends TestCase {
	
	public void testCalculateSuper(){
		int result = SuperCalculator.calculate(5004,0.09);
		assertEquals(450, result);
	}
}
