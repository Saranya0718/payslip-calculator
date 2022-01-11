import junit.framework.TestCase;
import org.junit.Before;

import java.util.ArrayList;

/**
 * Created by Ramkumar Kirubanandam on 07/01/2022.
 */
public class CSVFileReaderTest extends TestCase {
	CSVFileReader reader;
	
	@Before
	public void setUp(){
		reader = new CSVFileReader();
	}
	
	public void testReadInvalidFile(){
		try{
			reader.readFrom("blar.txt");
		}catch(PaySlipCalculatorException ex){
			assertEquals("File 'blar.txt' not found",ex.getMessage());
		}
	}

	public void testFromPercentageToDoubleWithInvalidValue(){
		try {
			double result = reader.fromPercentageStringToDouble("1");
		}catch(PaySlipCalculatorException ex){
			assertEquals("value must ends with %",ex.getMessage());
		}
	}
	
	public void testFromPercentageToDoubleWithValidValue(){
		try {
			double result = reader.fromPercentageStringToDouble("1%");
			assertEquals(0.01, result);
		}catch(PaySlipCalculatorException ex){
			//do nothing
		}
	}
	
	public void testReadFromValidFile(){
		try{
			ArrayList<Employee> employees = reader.readFrom("input.txt");
			assertEquals(2, employees.size());
			
			Employee employeeOne = employees.get(0);
			assertEquals("Kevin",employeeOne.getFirstName());
			assertEquals("Spacey",employeeOne.getLastName());
			assertEquals("01 March – 31 March",employeeOne.getPaymentStartDate());
			assertEquals(60050,employeeOne.getAnnualSalary());
			assertEquals(0.1,employeeOne.getSuperRate());

			Employee employeeTwo = employees.get(1);
			assertEquals("Johnny",employeeTwo.getFirstName());
			assertEquals("Depp",employeeTwo.getLastName());
			assertEquals("01 March – 31 March",employeeTwo.getPaymentStartDate());
			assertEquals(120000,employeeTwo.getAnnualSalary());
			assertEquals(0.1,employeeTwo.getSuperRate());

		}catch(Exception ex){
			//do nothing
		}
	}
}
