package practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\eclipse-workspace\\PageObjectFactory\\src\\test\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://cnn.com");

		Set<Cookie> cookies = driver.manage().getCookies();

		Iterator<Cookie> it = cookies.iterator();

		while (it.hasNext()) {
			Cookie c = it.next();
			System.out.println(c.getName() + "  =  " + c.getValue());

			// to delete a cookie

			if (c.getName().equalsIgnoreCase("tryThing00")) {
				driver.manage().deleteCookie(c);
			}
			
			Cookie myCookie = new Cookie("tryThing00", "UK");
			driver.manage().addCookie(myCookie);
		}

			System.out.println("================================");
			
		cookies = driver.manage().getCookies();

		 it = cookies.iterator();

		while (it.hasNext()) {
			Cookie c = it.next();
			System.out.println(c.getName() + "  =  " + c.getValue());

			// to delete a cookie

		}
		driver.quit();

	}

}
