package week3.assignments.singleInheritance;

public class LoginTestData extends TestData {
    public void enterUsername(){
        System.out.println("Username is entered");
    }
    public void enterPassword(){
        System.out.println("Password is entered");
    }

    public static void main(String[] args) {
        LoginTestData lTData = new LoginTestData();

        lTData.enterUsername();
        lTData.enterPassword();
        lTData.enterCredentials();
        lTData.navigateToHomePage();
    }
}
