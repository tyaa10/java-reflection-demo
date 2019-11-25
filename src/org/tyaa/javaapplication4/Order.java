/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.javaapplication4;

/**
 *
 * @author student
 */
public class Order {
    
    private static Integer lastId = 0;
    private Integer secretCode = 0;
    public Integer id;
    public String name;
    public Double amount;

    public Order() {
        this.id = ++lastId;
        this.secretCode = (this.id * 12) + 5;
    }

    public Order(String name, Double amount) {
        this();
        this.name = name;
        this.amount = amount;
    }
}
