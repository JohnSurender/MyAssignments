package week3.assignments.singleInheritance;

public class TestData{
    public void enterCredentials(){
        System.out.println("Credentials are entered");
    }

    public void navigateToHomePage(){
        System.out.println("Navigates back to home page");
    }

    public static void main(String[] args) {
        TestData tData = new TestData();
        tData.enterCredentials();
        tData.navigateToHomePage();
    }
}
