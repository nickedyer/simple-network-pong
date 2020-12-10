package com.nickedyer.snpclient;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Client to Simple Network Pong, a game designed to play pong with your friends.
 *
 * @author Nicholas Dyer
 */
public class Main extends Application {

    //Static variables for the running stage and scene
    private static Stage runningStage;
    private static Scene runningScene;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage mainStage) {
        runningStage = mainStage;

        //Set window title
        runningStage.setTitle("Simple Network Pong");

        //Create new main menu pane and display it
        RunningPanes.addPane("mainMenu", new MainMenu());
        runningScene = RunningPanes.getPane("mainMenu").getScene();
        runningStage.setScene(runningScene);
        runningStage.show();
    }

    /**
     * Sets the current running scene of the program and displays it.
     *
     * @param scene The scene to be displayed
     */
    public static void setScene(Scene scene) {
        runningScene = scene;
        runningStage.setScene(scene);
    }
}
