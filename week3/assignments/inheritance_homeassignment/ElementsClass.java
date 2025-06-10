package week3.assignments.inheritance_homeassignment;

public class ElementsClass extends Button{
    public void selectClass(){
        System.out.println("All classes are selected");
    }

    public static void main(String[] args) {
        ElementsClass elementsClass = new ElementsClass();
        elementsClass.selectClass();
        elementsClass.click();
        elementsClass.submit();
        elementsClass.setText("");

    }
}
