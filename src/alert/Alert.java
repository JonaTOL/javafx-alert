package alert;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * @author Jonathan van der Meulen
 * @version 0.0.1
 * @since June 2018
 *
 * copyright MIT license
 * 2018 Jonathan van der meulen
 */
public class Alert {

    public void display(String title){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("alertgui.fxml"));
            Stage main = new Stage();
            main.setScene(new Scene(root));
            main.initModality(Modality.APPLICATION_MODAL);;
            main.setTitle(title);
            main.showAndWait();
        } catch (Exception e) {
            System.out.println(e);
        }


    }

}
