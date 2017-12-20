package org.polytechtours.javaperformance.tp.paintingants;

/*
 *
 */
//import java.util.ArrayList;
import java.util.HashMap;
import java.awt.Color;
import java.lang.StringBuilder;

public class ColorSingleton {

	/*private static volatile ColorSingleton instance;
	private static Object mutex = new Object();
        public ArrayList<Color> colorExist;

	private ColorSingleton() {
		colorExist = new ArrayList<Color>();
	}

	public static ColorSingleton getInstance() {
		ColorSingleton result = instance;
		if (result == null) {
			synchronized (mutex) {
				result = instance;
				if (result == null)
					instance = result = new ColorSingleton();
			}
		}
		return result;
	}*/

	/*public static ColorSingleton instance = null;
	public ArrayList<Color> colorExist;

        private ColorSingleton() {
		colorExist = new ArrayList<Color>();
	}

        public static ColorSingleton getInstance() {
		if(instance == null)
			return new ColorSingleton();
                else
			return instance;	
	}*/
	
	/*public static ColorSingleton instance = null;
	public HashMap<Integer, Color> colorExist;
	
	public ColorSingleton(){
		colorExist = new HashMap<Integer, Color>();
		for(int i=0; i<=255; i++){
			for(int j=0; j<=255; j++){
				for(int k=0; k<=255; k++){
					Color color = new Color(i,j,k);
					colorExist.put(i*256*256+j*256+k, color);
				}			
			}		
		}
	}

	public static ColorSingleton getInstance(){
		if(instance == null)
			return new ColorSingleton();
		else
			return instance;	
	}*/

	public static HashMap<Integer, Color> colorExist;
	public static void initial(){
		colorExist = new HashMap<Integer, Color>();
		for(int i=0; i<=255; i++){
			for(int j=0; j<=255; j++){
				for(int k=0; k<=255; k++){
					Color color = new Color(i,j,k);
					colorExist.put(i*256*256+j*256+k, color);
				}			
			}		
		}
	}

}
