package testcases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.BeforeSuite;

public class BaseTest {

	public FileInputStream fis = null;

	@BeforeSuite
	public void initialize() throws IOException {
		Properties testCaseData = new Properties();
		try {
			fis = new FileInputStream(
					"C:\\Users\\hp\\eclipse-workspace\\PageObjectFactory\\src\\test\\resources\\config\\TestCaseData.properties");
			testCaseData.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
