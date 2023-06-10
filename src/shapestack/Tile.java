/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapestack;

import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Shape;

/**
 *
 * @author acer
 */
public class Tile {
    Shape forma;
    Label valore = new Label();
    
    Tile(Shape forma, Integer valore) {
	this.forma = forma;
	this.setBackground();
	this.valore.setText(valore.toString());
    }
    
    private void setBackground() {
	this.forma.setFill(Color.rgb((int) Math.round(Math.random()*255), (int) Math.round(Math.random()*255), (int) Math.round(Math.random()*255)));
    }
}
