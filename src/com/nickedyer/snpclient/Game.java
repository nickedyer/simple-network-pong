package com.nickedyer.snpclient;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class Game extends Pane {
    private static final int MAIN_MENU_WIDTH = 800;
    private static final int MAIN_MENU_HEIGHT = 600;

    public Game() {
        Scene mainScene = new Scene(this, MAIN_MENU_WIDTH, MAIN_MENU_HEIGHT);
        mainScene.setFill(Color.WHITE);

    }
}

