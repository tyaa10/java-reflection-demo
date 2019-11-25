/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.javaapplication4;

import java.lang.reflect.Field;

/**
 *
 * @author student
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
        /*Class testedClass = Order.class;
        for (Field declaredField : testedClass.getDeclaredFields()) {
            System.out.println(declaredField.getName());
        }*/
        
        Order o1 = new Order("n1", 99.99);
        Class testedClass = o1.getClass();
        for (Field declaredField : testedClass.getDeclaredFields()) {
            declaredField.setAccessible(true);
            System.out.println(declaredField.getName() + " = " + declaredField.get(o1));
            if (declaredField.getName().equals("secretCode")) {
                declaredField.set(o1, 1000);
            }
        }
        System.out.println("*****");
        for (Field declaredField : testedClass.getDeclaredFields()) {
            declaredField.setAccessible(true);
            System.out.println(declaredField.getName() + " = " + declaredField.get(o1));
        }
    }
    
}
