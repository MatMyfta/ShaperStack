/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapestack;

import javafx.scene.control.TextInputDialog;

/**
 *
 * @author acer
 */
public class InitialDialog extends TextInputDialog {
    Integer min, max;
    InitialDialog(Integer min, Integer max) {
	Integer n = 0;
	while (n < min || n > max) {
	    
	}
    }
}
