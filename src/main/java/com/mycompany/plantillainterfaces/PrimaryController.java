package com.mycompany.plantillainterfaces;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;

public class PrimaryController implements Initializable {

    @FXML
    private Button btnCalcular;
    @FXML
    private TextField txtCliente;
    @FXML
    private TextField txtPeso;
    @FXML
    private TextField txtEstatura;
    @FXML
    private ChoiceBox<String> choiceboxPeso;
    @FXML
    private ChoiceBox<String> choiceboxEstatura;
    @FXML
    private TextField txtEdad;
    @FXML
    private RadioButton btnHombre;
    @FXML
    private RadioButton btnMujer;
    @FXML
    private Label txtInfo;
    @FXML
    private ChoiceBox<String> choiceboxActividad;
    @FXML
    private Button txtAlmacenar;

    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }


    @FXML
    private void Calcular(ActionEvent event) {
        
        
  
       if(btnHombre.isSelected()  && choiceboxActividad.getSelectionModel().getSelectedItem().equals("Muy Ligera") ){     
        double a = Double.parseDouble(txtPeso.getText());
        double b = Double.parseDouble(txtEstatura.getText());
        double c = Double.parseDouble(txtEdad.getText());
        double f = 66.473 + 13.751 * a + 5.0033 * b - 6.755 * c;
        double gastoEnergetico = (66.473 + 13.751 * a + 5.0033 * b - 6.755 * c) * 1.3;
        txtInfo.setText("Su Metabolismo basal es de: " + f + " Y su GE relacionado es de : " + gastoEnergetico);
        txtInfo.setStyle("-fx-background-color:green");
        
   
        }else if(btnHombre.isSelected() && choiceboxActividad.getSelectionModel().getSelectedItem().equals("Ligera")  ){
        double a = Double.parseDouble(txtPeso.getText());
        double b = Double.parseDouble(txtEstatura.getText());
        double c = Double.parseDouble(txtEdad.getText());
        double f = 66.473 + 13.751 * a + 5.0033 * b - 6.755 * c;
        double gastoEnergetico = (66.473 + 13.751 * a + 5.0033 * b - 6.755 * c) * 1.6;
        txtInfo.setText("Su Metabolismo basal es de: " + f + " Y su GE relacionado es de : " + gastoEnergetico);
        txtInfo.setStyle("-fx-background-color:green");

        }else if(btnHombre.isSelected() && choiceboxActividad.getSelectionModel().getSelectedItem().equals("Moderada")  ){
        double a = Double.parseDouble(txtPeso.getText());
        double b = Double.parseDouble(txtEstatura.getText());
        double c = Double.parseDouble(txtEdad.getText());
        double f = 66.473 + 13.751 * a + 5.0033 * b - 6.755 * c;
        double gastoEnergetico = (66.473 + 13.751 * a + 5.0033 * b - 6.755 * c) * 1.7;
        txtInfo.setText("Su Metabolismo basal es de: " + f + " Y su GE relacionado es de : " + gastoEnergetico);
        txtInfo.setStyle("-fx-background-color:green");
        
        }else if(btnHombre.isSelected() && choiceboxActividad.getSelectionModel().getSelectedItem().equals("Intensa")  ){
        double a = Double.parseDouble(txtPeso.getText());
        double b = Double.parseDouble(txtEstatura.getText());
        double c = Double.parseDouble(txtEdad.getText());
        double f = 66.473 + 13.751 * a + 5.0033 * b - 6.755 * c;
        double gastoEnergetico = (66.473 + 13.751 * a + 5.0033 * b - 6.755 * c) * 2.1; 
        txtInfo.setText("Su Metabolismo basal es de: " + f + " Y su GE relacionado es de : " + gastoEnergetico);
        txtInfo.setStyle("-fx-background-color:green");

        } else if(btnMujer.isSelected() && choiceboxActividad.getSelectionModel().getSelectedItem().equals("Muy Ligera") ){
        
        double a = Double.parseDouble(txtPeso.getText());
        double b = Double.parseDouble(txtEstatura.getText());
        double c = Double.parseDouble(txtEdad.getText());      
        double f = 655.0955 + 9.463 * a + 1.8496 * b - 4.6756 * c; 
        double gastoEnergetico = (66.473 + 13.751 * a + 5.0033 * b - 6.755 * c) * 1.3;
        txtInfo.setText("Su Metabolismo basal es de: " + f + " Y su GE es de : " + gastoEnergetico );
        txtInfo.setStyle("-fx-background-color:green");
  
        }else if(btnMujer.isSelected() && choiceboxActividad.getSelectionModel().getSelectedItem().equals("Ligera") ){
                      
        double a = Double.parseDouble(txtPeso.getText());
        double b = Double.parseDouble(txtEstatura.getText());
        double c = Double.parseDouble(txtEdad.getText());
        double f = 655.0955 + 9.463 * a + 1.8496 * b - 4.6756 * c;
        double gastoEnergetico = (66.473 + 13.751 * a + 5.0033 * b - 6.755 * c) * 1.6;
        txtInfo.setText("Su Metabolismo basal es de: " + f + " Y su GE es de : " + gastoEnergetico );
        txtInfo.setStyle("-fx-background-color:green");

        } else if(btnMujer.isSelected() && choiceboxActividad.getSelectionModel().getSelectedItem().equals("Moderada") ){
          double a = Double.parseDouble(txtPeso.getText());
          double b = Double.parseDouble(txtEstatura.getText());
          double c = Double.parseDouble(txtEdad.getText());
          double f = 655.0955 + 9.463 * a + 1.8496 * b - 4.6756 * c;
          double gastoEnergetico = (66.473 + 13.751 * a + 5.0033 * b - 6.755 * c) * 1.7;
        
        txtInfo.setText("Su Metabolismo basal es de: " + f + " Y su GE es de : " + gastoEnergetico );
        txtInfo.setStyle("-fx-background-color:green");

        } else if(btnMujer.isSelected() && choiceboxActividad.getSelectionModel().getSelectedItem().equals("Intensa") ){
        
          double a = Double.parseDouble(txtPeso.getText());
          double b = Double.parseDouble(txtEstatura.getText());
          double c = Double.parseDouble(txtEdad.getText());
          double f = 655.0955 + 9.463 * a + 1.8496 * b - 4.6756 * c;
          double gastoEnergetico = (66.473 + 13.751 * a + 5.0033 * b - 6.755 * c) * 2.1;
        
        
        txtInfo.setText("Su Metabolismo basal es de: " + f + " Y su GE es de : " + gastoEnergetico );
        txtInfo.setStyle("-fx-background-color:green");

        }else if(txtCliente.getText().length()==0){
        
        Alert a = new Alert(Alert.AlertType.ERROR);
        a.setHeaderText(null);
        a.setTitle("Error");
        a.setContentText("Introduzca su nombre de cliente");
        a.showAndWait();
   
        }else if(txtPeso.getText().length()==0){
        
        Alert a = new Alert(Alert.AlertType.ERROR);
        a.setHeaderText(null);
        a.setTitle("Error");
        a.setContentText("Introduzca su peso");
        a.showAndWait();
   
        }else if(txtEstatura.getText().length()==0){
        
        Alert a = new Alert(Alert.AlertType.ERROR);
        a.setHeaderText(null);
        a.setTitle("Error");
        a.setContentText("Introduzca su estatura");
        a.showAndWait();
   
        } else if(txtEdad.getText().length()==0){
        
        Alert a = new Alert(Alert.AlertType.ERROR);
        a.setHeaderText(null);
        a.setTitle("Error");
        a.setContentText("Introduzca su edad");
        a.showAndWait();
   
        }else{
        
       txtInfo.setText("Introduzca los datos de manera correcta");
       txtInfo.setStyle("-fx-background-color:red");
        
       }}
        
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
         choiceboxPeso.getItems().add("Kilogramos");
         choiceboxPeso.getItems().add("Libras");
         choiceboxPeso.getItems().add("Kilo/Libras");
         choiceboxPeso.setValue("Kilogramos");
         
         choiceboxEstatura.getItems().add("Cm");
         choiceboxEstatura.getItems().add("Pies");
         choiceboxEstatura.getItems().add("Pulgadas");
         choiceboxEstatura.setValue("Cm");
         
    
         choiceboxActividad.getItems().add("Muy Ligera");
         choiceboxActividad.getItems().add("Ligera");
         choiceboxActividad.getItems().add("Moderada");
         choiceboxActividad.getItems().add("Intensa");
         choiceboxActividad.setValue("Muy Ligera"); 
         
    btnCalcular.setStyle("-fx-background-color:Green");
    txtAlmacenar.setStyle("-fx-background-color:Green");
    
    }
    @FXML
    private void Almacenar(ActionEvent event) {
        
        double a = Double.parseDouble(txtPeso.getText());
        double b = Double.parseDouble(txtEstatura.getText());
        double c = Double.parseDouble(txtEdad.getText());
        double f = 66.473 + 13.751 * a + 5.0033 * b - 6.755 * c;
        double gastoEnergetico = 66.473 + 13.751 * a + 5.0033 * b - 6.755 * c * 1.3;
        
       Alert z = new Alert(Alert.AlertType.INFORMATION);
        z.setHeaderText(null);
        z.setTitle("GER y GET");
        z.setContentText("El cliente " + txtCliente.getText() + " tiene un GER de: " + f + " y un GET de: " + gastoEnergetico);       
        z.showAndWait();  
        
 }}
