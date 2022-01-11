import junit.framework.TestCase;
import org.junit.Before;

/**
 * Created by Ramkumar Kirubanandam on 07/01/2022.
 */
public class EmployeeTest extends TestCase {
	private Employee employee;

	@Before
	public void setUp() {
		employee = new Employee("Ram", "Kumar", 165000, 0.10, "01 March - 31 March");
	}

	public void testIfEmployeeInstanceIsCreated() {
		assertNotNull(employee);
	}

	public void testIfAnnualSalaryIsInvalid() {
		try {
			employee.setAnnualSalary(-100000);
		} catch (PaySlipCalculatorException ex) {
			assertEquals("Invalid salary range. Salary value must be a positive integer", ex.getMessage());
		}
	}

	public void testSuperRateIsInvalid() {
		try {
			employee.setSuperRate(100.0);
		} catch (PaySlipCalculatorException ex) {
			assertEquals("Super rate must be between 0% - 50% inclusive", ex.getMessage());
		}
		try {
			employee.setAnnualSalary(-10000);
			employee.setSuperRate(43.0);
		} catch (PaySlipCalculatorException ex) {
			assertEquals("Invalid salary range. Salary value must be a positive integer", ex.getMessage());
		}
	}
}
