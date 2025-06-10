package week3.assignments.overridding;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
    public void launch(){
        ChromeDriver driverChrome = new ChromeDriver();
        System.out.println("Chrome Launched");
    }

    public static void main(String[] args) {
        LaunchChrome chromeLaunch = new LaunchChrome();
        chromeLaunch.launch();
    }
}
