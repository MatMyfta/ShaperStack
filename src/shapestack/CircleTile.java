/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapestack;

import javafx.scene.shape.Circle;

/**
 *
 * @author acer
 */
public class CircleTile extends Tile{
    Integer n;
    
    CircleTile(Integer n) {
	super(new Circle(10), n);
	this.n = n;
    }
}
