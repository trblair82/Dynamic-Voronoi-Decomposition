package dynamic.block.simulation;


import CGAL.Kernel.Point_3;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author trblair
 */
public class DelaunayPoints implements Serializable{
    private ArrayList points;
    
    public DelaunayPoints(ArrayList input_points){
        points = input_points;
    }
    public void saveArray(ArrayList input_points, String filename){
        
        ArrayList list = input_points;
        try{
           FileOutputStream fos = new FileOutputStream(filename);
           ObjectOutputStream out = new ObjectOutputStream(fos);
           out.writeObject(list);
           out.close();
        }catch (IOException ex) {
			ex.printStackTrace();
        }
    }
    public ArrayList loadArray(String filename){
        ArrayList list = new ArrayList();
        try {
			FileInputStream fis = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(fis);
			list = (ArrayList) in.readObject();
			in.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}
        return list;
    }
    
    }
