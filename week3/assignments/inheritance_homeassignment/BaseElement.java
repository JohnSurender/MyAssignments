package week3.assignments.inheritance_homeassignment;

public class BaseElement {

    public void click(){
        System.out.println("Click action is performed");
    }

    public void setText(String Text){
        System.out.println(Text);

    }

    public static void main(String[] args) {
        BaseElement baseElement = new BaseElement();
        baseElement.click();
        baseElement.setText("");
    }
}
