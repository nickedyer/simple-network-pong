package com.nickedyer.snpclient;

import javafx.application.Application;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String args[]) {
        launch(args);
    }

    @Override
    public void start(Stage mainStage) throws Exception {
        Pane mainMenu = new MainMenu();
        mainStage.setTitle("Simple Network Pong");

        mainStage.setScene(mainMenu.getScene());
        mainStage.show();
    }
}
