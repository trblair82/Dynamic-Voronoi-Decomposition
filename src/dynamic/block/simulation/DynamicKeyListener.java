/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamic.block.simulation;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author trblair
 */
public class DynamicKeyListener implements KeyListener {

    @Override
    public void keyTyped(KeyEvent ke) {
        
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        int key = ke.getKeyCode();
         if(ke.getKeyCode() < 250){
            MyCanvas.keys[ke.getKeyCode()] = true;
         }       
        if(key == KeyEvent.VK_RIGHT){
            
        }
        if(key == KeyEvent.VK_LEFT){
            
        }
        if(key == KeyEvent.VK_SPACE){
            if(!MyCanvas.startPhysics){
                MyCanvas.startPhysics = true;
            }else MyCanvas.startPhysics = false;
            
        }
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        if (ke.getKeyCode() < 250){
            MyCanvas.keys[ke.getKeyCode()] = false;
        }
    }
    
}
