import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Ramkumar Kirubanandam on 07/01/2022.
 */
public class CSVFileWriter {
	
	public boolean writeToFile(String fileName, ArrayList<Employee> employees){
		try {
			FileWriter writer = new FileWriter(fileName);
			
			for (Employee employee : employees) {
				writer.append(employee.toString());
				writer.append("\n");
			}
			
			writer.flush();
			writer.close();
			
		}catch (IOException e) {
			throw new PaySlipCalculatorException("Unable to write to file");
		}
		return true;
	}
}
