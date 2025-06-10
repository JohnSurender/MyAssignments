package week3.assignments.inheritance_homeassignment;

public class Button extends BaseElement{

    public void submit(){
        System.out.println("Click on Submit Button");
    }

    public static void main(String[] args) {
        Button button = new Button();
        button.submit();

    }

}
