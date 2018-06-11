package mainStage;

import alert.Alert;

public class Controller {

    private Alert box = new Alert();

    public void button() {
        System.out.println("Pressed");
        box.display("Test");
    }

}
