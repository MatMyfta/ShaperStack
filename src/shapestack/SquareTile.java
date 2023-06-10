/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapestack;

import javafx.scene.shape.Rectangle;

/**
 *
 * @author acer
 */
public class SquareTile extends Tile {
    Integer n;
    
    SquareTile(Integer n) {
	super(new Rectangle(20,20), n);
	this.n = n;
    }
}
