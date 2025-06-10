package week3.assignments.inheritance_homeassignment;

public class TextField extends BaseElement{

    public void getText(){
        System.out.println("Text is entered");
    }

    public static void main(String[] args) {
        TextField textField = new TextField();
        textField.getText();
    }
}
