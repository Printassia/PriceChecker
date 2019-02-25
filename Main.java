package KemTech;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.image.*;
import java.io.FileInputStream;
import javafx.stage.Stage;

public class Main extends Application {

    //Launch Application
    public static void main(String[] args) {
        launch(args);
    }

    //Start Application Code
    //First Scene Labels
    Label header;
    Button welcomeButton;
    Scene scene1;

    //Second Scene Labels
    Label label1;
    TextField label1TextField;
    Label label2;
    Button searchButton;
    Scene scene2;

    //Stage field
    Stage stage;

    @Override
    public void start(Stage stage) {
        this.stage = stage;
        //First Scene
        header = new Label("WELCOME TO SUPER VALUE GROCERY STORE");
//        header.setAlignment(Pos.BOTTOM_RIGHT); **Insets
        welcomeButton = new Button();
//        welcomeButton.setAlignment(Pos.BOTTOM_RIGHT); **Insets
        welcomeButton.setText("CLICK FOR ITEM PRICE");
        welcomeButton.setOnAction(
                e -> btnSwitchToScene2_Click()
        );
        //Set Layout
        VBox vbox1 = new VBox(10, header, welcomeButton);
        scene1 = new Scene(vbox1, 350,200);

        //Second Scene
        label1 = new Label("Enter Barcode Manually");
        label1TextField = new TextField();
        searchButton = new Button("Search Item");
        label2 = new Label("Scan Barcode Below");

        //Arrow image
        Image img = new Image("file:/Users/iyah/NetBeansProjects/PriceChecker/src/KemTech/iu.png"); //iyah/NetBeansProjects/PriceChecker/src/KemTech/
        ImageView iview = new ImageView(img);
        iview.setFitWidth(100);
        iview.setFitHeight(50);

        VBox vbox2 = new VBox(label1, label1TextField, searchButton, label2, iview);
        scene2 = new Scene(vbox2, 350, 200);
        stage.setTitle("Price Check");
        stage.setScene(scene1);
        stage.show();
    }

    public void btnSwitchToScene2_Click() {
        stage.setScene(scene2);
    }

}
