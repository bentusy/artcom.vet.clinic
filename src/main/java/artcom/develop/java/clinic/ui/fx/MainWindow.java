package ui.fx;/**
 * Created by Artem on 1988,20,10.

 */


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ButtonBuilder;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Tooltip;
import javafx.scene.effect.BlendMode;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.net.URL;

public class MainWindow extends Application {

    public static void main(String[] args) {
        System.out.println("try");
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Тестирование GUI-компонентов");
        Group root = new Group();
        Scene scene = new Scene(root, 300, 300, Color.LIGHTGREEN);
        final Button btn;
        btn = new Button();
        btn.setLayoutX(20);
        btn.setLayoutY(20);
        btn.setText("Тестировать свойства");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent eveActionEventnt) {
                System.out.println("Свойства, унаследованные от класса Node:"+"\n"+
                        "Свойство blendMode: "+btn.blendModeProperty().getValue()+"\n"+
                        "Свойство boundsInLocal: "+btn.boundsInLocalProperty().getValue()+"\n");

            } });

        Button btnON;
        btnON= ButtonBuilder.create().build();
        btnON.setLayoutX(20);
        btnON.setLayoutY(150);
        btnON.setText("Установить свойства");
        btnON.setStyle("-fx-font: bold italic 12pt Arial;" +
                " -fx-text-fill: #660000;" +
                " -fx-background-color: #ff99ff;" +
                " -fx-border-width: 3px;" +
                " -fx-border-radius: 30;" +
                " -fx-background-radius: 30;" +
                " -fx-border-color: #660066;" );
        btnON.setPrefSize(200,30);
        btnON.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {

                btn.setBlendMode(BlendMode.DARKEN);
                //javafx.scene.shape.Circle clip=new javafx.scene.shape.Circle(75,53,80);
// btn.setClip(clip);
                btn.setCursor(Cursor.CLOSED_HAND);
                DropShadow effect=new DropShadow();
                effect.setOffsetX(10);
                effect.setOffsetY(10);
                btn.setEffect(effect);
//btn.setManaged(false);
//btn.setMouseTransparent(true);
                btn.setOpacity(0.5);
                btn.setRotate(10);
                btn.setLayoutX(80);
                btn.setScaleX(1.8);
                btn.setLayoutY(170);
                btn.setTranslateZ(-50);
                btn.setPrefSize(150, 100);
                btn.setTooltip(new Tooltip
                        ("Это кнопка тестирования свойств класса Button"));
                Class aClass = this.getClass();
                URL resource = aClass.getResource("/images/image.jpg");
                String pass = resource.toString();
                Image im=new Image(pass);
                ImageView imv=new ImageView(im);
                imv.setFitHeight(50);
                imv.setFitWidth(50);
                btn.setGraphic(imv);
                btn.setStyle("-fx-font: bold italic 10pt Helvetica;");
//btn.setFont(Font.font("Helvetica", FontWeight.BOLD,
// FontPosture.ITALIC, 10));
                btn.setAlignment(Pos.CENTER);
                btn.setContentDisplay(ContentDisplay.RIGHT);
                btn.setUnderline(true);
                btn.setWrapText(true);
//btn.setCancelButton(true);
//btn.toBack();
            }});
        root.getChildren().add(btn);
        root.getChildren().add(btnON);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


}
