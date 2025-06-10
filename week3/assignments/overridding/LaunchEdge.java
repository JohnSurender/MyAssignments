package week3.assignments.overridding;

import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdge extends LaunchChrome {

    public void launch(){
        super.launch();
        EdgeDriver driverEdge = new EdgeDriver();
        System.out.println("Edge is launched");

    }

    public static void main(String[] args) {
        LaunchEdge edgeLaunch = new LaunchEdge();
        edgeLaunch.launch();

    }
}
