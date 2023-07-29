package cs211.project.controllers;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import cs211.project.services.FXRouter;
import javafx.scene.image.ImageView;

import java.io.IOException;
public class creditController {
    @FXML
    Label nonLabel;


    @FXML
    public void backy(){
        try {
            FXRouter.goTo("welcome");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
