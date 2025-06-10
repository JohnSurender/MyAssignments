package week3.assignments.inheritance_homeassignment;

public class RadioButton extends Button{
    public void selectRadioButton(){
        System.out.println("Radio button is clicked");
    }

    public static void main(String[] args) {
        RadioButton radioButton = new RadioButton();
        radioButton.selectRadioButton();
    }
}
