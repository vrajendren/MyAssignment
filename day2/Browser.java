package week.day2;

public class Browser {
public void launchBrowser(String Browser)
{
	System.out.println(Browser);
}
public void loadurl() {
	System.out.println("Application url loaded successfully");
}
public static void main(String[] args) {
	Browser a = new Browser();
	a.launchBrowser("Browser launched successfully");
	a.loadurl();
}
}
