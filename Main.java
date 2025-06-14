/**
 * Main.java
 *
 * This file is the main java method that starts the program.
 *
 * @author Tyler N
 * @since 2025-06-15
 */

import javax.swing.JFrame; // a class in Java's Swing GUI toolkit that represents top-level window

public class Main
{
    public static void main(String[] args)
    {
        // 19 col, 21 row, 32px each box
        int rowCount = 21;
        int columnCount = 19;
        int tileSize = 32;
        int boardWidth = columnCount * tileSize;
        int boardHeight = rowCount * tileSize;

        JFrame frame = new JFrame("Pac Man"); // Creates the frame or window
        //frame.setVisible(true); // Makes the window visible
        frame.setSize(boardWidth, boardHeight); // sets the dimensions of window
        frame.setLocationRelativeTo(null); // spawn the window in the middle of screen
        frame.setResizable(false); // Don't let user resize window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // make window close on exit button

        PacMan pacmanGame = new PacMan(); // create the panel
        frame.add(pacmanGame); // Add the panel onto our window
        frame.pack(); // put the fill size of panel into our window
        pacmanGame.requestFocus(); // receive keyboard events
        frame.setVisible(true);
    }
}