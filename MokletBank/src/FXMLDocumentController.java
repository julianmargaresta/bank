/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import org.controlsfx.control.textfield.CustomTextField;

/**
 * FXML Controller class
 *
 * @author M12RjUL14n
 */
public class FXMLDocumentController implements Initializable {

    int kesempatan = 3;
    
    @FXML
    private Label label;
    @FXML
    private JFXButton b1;
    @FXML
    private JFXButton b2;
    @FXML
    private JFXButton b3;
    @FXML
    private JFXButton b4;
    @FXML
    private JFXButton b5;
    @FXML
    private JFXButton b6;
    @FXML
    private JFXButton b7;
    @FXML
    private JFXButton b8;
    @FXML
    private JFXButton b9;
    @FXML
    private JFXButton bc;
    @FXML
    private JFXButton b0;
    @FXML
    private JFXButton boke;
    @FXML
    private CustomTextField editpin;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void tkn1(ActionEvent event) {
        String nomer = editpin.getText();
        editpin.setText(nomer+""+1);
    }

    @FXML
    private void tkn2(ActionEvent event) {
        String nomer = editpin.getText();
        editpin.setText(nomer+""+2);
    }

    @FXML
    private void tkn3(ActionEvent event) {
        String nomer = editpin.getText();
        editpin.setText(nomer+""+3);
    }

    @FXML
    private void tkn4(ActionEvent event) {
        String nomer = editpin.getText();
        editpin.setText(nomer+""+4);
    }

    @FXML
    private void tkn5(ActionEvent event) {
        String nomer = editpin.getText();
        editpin.setText(nomer+""+5);
    }

    @FXML
    private void tkn6(ActionEvent event) {
        String nomer = editpin.getText();
        editpin.setText(nomer+""+6);
    }

    @FXML
    private void tkn7(ActionEvent event) {
        String nomer = editpin.getText();
        editpin.setText(nomer+""+7);
    }

    @FXML
    private void tkn8(ActionEvent event) {
        String nomer = editpin.getText();
        editpin.setText(nomer+""+8);
    }

    @FXML
    private void tkn9(ActionEvent event) {
        String nomer = editpin.getText();
        editpin.setText(nomer+""+9);
    }

    @FXML
    private void tkndel(ActionEvent event) {
        editpin.setText("");
    }

    @FXML
    private void tkn0(ActionEvent event) {
    }

    @FXML
    private void tknoke(ActionEvent event) {
        if(boke.getText().equals("12345")){
            try{
                ((Node)(event.getSource())).getScene().getWindow().hide();
                
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("FXMLHome.fxml"));
                Scene scene = new Scene(fxmlLoader.load());
                
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.setTitle("perbankan telkom");
                stage.show();
            }catch (IOException e){
                System.out.println("Failed to create new windows" + e);
            }
        }else{
            kesempatan -= 1;
            
            if(kesempatan == 0){
                System.exit(0);
            }
        }
    }
    
}
