package week3.day2;

public class CalculatorFunctionality {

    //add 2 numbers
    public void addNumbers(int a, int b){
        System.out.println(a + b);

    }
    //add three numbers
    public void addNumbers(int a, int b, int c){
        System.out.println(a + b + c);
    }
    // add 2 decimals
    public void addNumbers(float a, float b){
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        CalculatorFunctionality calci = new CalculatorFunctionality();
        calci.addNumbers(12,15);
        calci.addNumbers(15.5f,24.5f);
        calci.addNumbers(23,34,45);
    }
}

