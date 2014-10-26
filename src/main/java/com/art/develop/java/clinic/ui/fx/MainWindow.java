package com.art.develop.java.clinic.ui.fx;/**
 * Created by Artem on 1988,20,10.

 */


import javafx.application.Application;
import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.effect.BlendMode;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.net.URL;
import java.util.ArrayList;

public class MainWindow extends Application {

    public static void main(String[] args) {
        System.out.println("try");
        launch(args);
    }

    @Override
    public void start(final Stage primaryStage) {
        primaryStage.setTitle("Тестирование GUI-компонентов");
        Group root = new Group();
        Group root2 = new Group();
        final Scene scene2 = new Scene(root2, 300, 300, Color.LIGHTGREEN);

        Scene scene = new Scene(root, 300, 300, Color.LIGHTGREEN);
        final Button btn;
        btn = new Button();
        btn.setLayoutX(20);
        btn.setLayoutY(20);
        btn.setText("Тестировать свойства");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent eveActionEventnt) {
                primaryStage.setScene(scene2);

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
                javafx.scene.shape.Circle clip=new javafx.scene.shape.Circle(75,53,80);
// btn.setClip(clip);
                btn.setCursor(Cursor.CLOSED_HAND);
                DropShadow effect=new DropShadow();
                effect.setOffsetX(10);
                effect.setOffsetY(10);
                btn.setEffect(effect);
//btn.setManaged(false);
//btn.setMouseTransparent(true);
                btn.setCursor(Cursor.OPEN_HAND);
                btn.setOpacity(0.5);
                btn.setRotate(10);
                btn.setLayoutX(80);
                btn.setScaleX(1.8);
                btn.setLayoutY(170);
                btn.setPrefSize(150,100);
                btn.setTooltip(new Tooltip
                        ("Это кнопка тестирования свойств класса Button"));
               Image im=new Image(this.getClass().getResource("/images/image.jpg").toString());
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


        final CheckBox ckb = new CheckBox("Тестировать свойства");
        ckb.setLayoutX(20);
        ckb.setLayoutY(20);
        ckb.setOnMousePressed(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {System.out.println("Свойства, унасл");}});


        Button b1 = new Button();
        b1.setLayoutX(20);
        b1.setLayoutY(100);
        b1.setText("Установить свойства");
        b1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {


                if (ckb.selectedProperty().getValue() == true) {
                    ckb.setBlendMode(BlendMode.HARD_LIGHT);
                    Rectangle clip = new Rectangle(0, 15, 15, 20);
//ckb.setClip(clip);
                    ckb.setCursor(Cursor.CROSSHAIR);
                    DropShadow effect = new DropShadow();
                    effect.setOffsetX(5);
                    effect.setOffsetY(10);
                    ckb.setEffect(effect);
//ckb.setManaged(false);
//ckb.setMouseTransparent(true);
//ckb.setOpacity(0.5);
                    ckb.setLayoutX(50);
                    ckb.setTranslateZ(-50);
                    ckb.setScaleX(1.8);
                    ckb.setPrefSize(150, 50);
                    ckb.setTooltip(new Tooltip
                            ("Это переключатель тестирования свойств класса CheckBox"));

                    Image im2 = new Image(this.getClass().getResource("/images/image.jpg").toString());
                    ImageView imv = new ImageView(im2);
                    imv.setFitHeight(50);
                    imv.setFitWidth(50);
                    ckb.setGraphic(imv);
                    ckb.setStyle("-fx-font: bold italic 10pt Helvetica;");
                    ckb.setAlignment(Pos.CENTER);
                    ckb.setContentDisplay(ContentDisplay.RIGHT);
                    ckb.setUnderline(true);
                    ckb.setWrapText(true);
                    ckb.setAllowIndeterminate(true);
//ckb.toBack();
//ckb.setTranslateY(50);
//ckb.setRotate(30);
                }
            }
        });

        String a = new String();
        root2.getChildren().add(ckb);
        root2.getChildren().add(b1);

        root.getChildren().add(btn);
        root.getChildren().add(btnON);

        primaryStage.setScene(scene);
        primaryStage.show();
    }


}
