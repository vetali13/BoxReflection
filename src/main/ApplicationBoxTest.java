package main;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import domain.BigBox;
import domain.Box;
import domain.SmallBox;

public class ApplicationBoxTest {

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		SmallBox smallBox = new SmallBox();
		BigBox bigBox = new BigBox();
		System.out.println(testBox(smallBox));
		System.out.println(testBox(bigBox));

	}
	
	public static Boolean testBox(Box box) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		List<Boolean> testArray = new ArrayList<>();
		for(Field f : box.getClass().getDeclaredFields()) {
			String setF = "set" + f.getName();
			String getF = "get" + f.getName();
			Integer value = new Random().nextInt();
			
			for(Method m : box.getClass().getDeclaredMethods()) {
				if(m.getName().compareToIgnoreCase(setF)==0) {
					m.invoke(box, value);
				}
			}
			
			for(Method m : box.getClass().getDeclaredMethods()) {
				if(m.getName().compareToIgnoreCase(getF)==0) {
					testArray.add(m.invoke(box, null).equals(value));
				}
			}
	    }
		
		System.out.println(testArray);
		
		for(Boolean b : testArray) {
			if(b==false) {return false;}
			else {return true;}
		}
		return null;
	}



}
