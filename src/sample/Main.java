package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage Stage) throws Exception{
        StackPane box = new StackPane();
        box.setStyle("-fx-background-color: #ADD8E6 ");
        Stage.setTitle("Ventana Principal");

        //************Objetos de cada clase***************************
        DBManager accesoBD = new DBManager();
        //OperacionesClientes opCliente = new OperacionesClientes(accesoBD.getConnection());
        // Cliente regCliente = opCliente.getCliente(14);

        TextFieldsclass tablas = new TextFieldsclass();
        box.getChildren().add(tablas);


        //System.out.println("Nuevo cliente: " + regCliente);
        Stage.setScene(new Scene(box, 1000, 500));
        Stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
