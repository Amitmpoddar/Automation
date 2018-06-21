package qspiders;




import org.openqa.selenium.firefox.FirefoxDriver;




public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.firefox.driver","./software/gekodriver.exe");
        FirefoxDriver f= new FirefoxDriver();
		f.close();
		
	}

}
