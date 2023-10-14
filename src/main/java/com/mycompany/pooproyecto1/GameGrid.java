/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pooproyecto1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author Esteban
 */
public class GameGrid extends JPanel {
    /*
    Attributes
    */
    private int numRows;
    private int numCols;
    private Color[][] cellColors;
    
    /*
    Constructor
    */
    public GameGrid (int numRows, int numCols) {
        this.numRows = numRows;
        this.numCols = numCols;
        cellColors = new Color[numRows][numCols];
        
        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numCols; col++) {
                cellColors[row][col] = Color.WHITE;
            }
        }
        
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int cellWidth = getWidth() / numCols;
                int cellHeight = getHeight() / numRows;
                int col = e.getX() / cellWidth;
                int row = e.getY() / cellHeight;

                // Toggle the cell color between two predefined colors (e.g., RED and WHITE)
                if (cellColors[row][col] == Color.WHITE) {
                    cellColors[row][col] = Color.RED;
                } else {
                    cellColors[row][col] = Color.WHITE;
                }

                repaint(); // Redraw the panel to reflect the color changes
            }
        });
    }
    
    /*
    Methods
    */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int cellWidth = getWidth() / numCols;
        int cellHeight = getHeight() / numRows;

        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numCols; col++) {
                g.setColor(cellColors[row][col]);
                int x = col * cellWidth;
                int y = row * cellHeight;
                g.fillRect(x, y, cellWidth, cellHeight);
                g.setColor(Color.BLACK);
                g.drawRect(x, y, cellWidth, cellHeight);
            } 
        }
        
    }
}
