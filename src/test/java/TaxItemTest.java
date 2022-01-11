import junit.framework.TestCase;
import org.junit.Before;

/**
 * Created by Ramkumar Kirubanandam on 07/01/2022.
 */
public class TaxItemTest extends TestCase {
	private TaxItem item;
	
	@Before
	public void setUp(){
		item = new TaxItem();
	}
	
	public void testDerivedTaxItem(){
		
		item.setTaxRate(0.10);
		item.setMinLimit(20001);
		item.setMaxLimit(40000);
		
		assertEquals(item.getTaxRate(),0.10);
		assertEquals(item.getMinLimit(),20001);
		assertEquals(item.getMaxLimit(),40000);
	}
}
