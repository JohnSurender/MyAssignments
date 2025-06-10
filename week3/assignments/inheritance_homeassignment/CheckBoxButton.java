package week3.assignments.inheritance_homeassignment;

public class CheckBoxButton extends Button{

    public void clickCheckBoxButton(){
        System.out.println("CheckBox button is clicked");
    }

    public static void main(String[] args) {
        CheckBoxButton checkBoxButton = new CheckBoxButton();
        checkBoxButton.clickCheckBoxButton();
    }
}
