package com.nickedyer.snpclient;

import javafx.scene.layout.Pane;

import java.util.HashMap;

/**
 * Class to manage multiple running panes. This class stores all of the panes in a HashMap, where the key is the name of the pane and the value is the pane itself.
 *
 * @author Nicholas Dyer
 */
public class RunningPanes {
    private static HashMap<String, Pane> panes = new HashMap<>();

    /**
     * Adds a pane to the HashMap to be managed.
     *
     * @param paneName The name of the pane to be added
     * @param pane     The pane object
     */
    public static void addPane(String paneName, Pane pane) {
        panes.put(paneName, pane);
    }

    /**
     * Get the pane object from its assigned name.
     *
     * @param paneName The name of the pane to get
     * @return The pane linked to the given name
     */
    public static Pane getPane(String paneName) {
        return panes.get(paneName);
    }

    /**
     * Removes a pane object from the HashMap.
     *
     * @param paneName The name of the pane to be removed
     */
    public static void removePane(String paneName) {
        panes.remove(paneName);
    }
}
