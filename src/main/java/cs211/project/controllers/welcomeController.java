package cs211.project.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import cs211.project.services.FXRouter;
import java.io.IOException;

public class welcomeController {
    @FXML
    Label signupLabel;

    @FXML
    Label passwordLabel;

    @FXML
    Label userLabel;

    @FXML
    public void creator(){
        try {
            FXRouter.goTo("credit");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
