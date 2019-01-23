/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aguayo.rick;

/**
 *
 * @author rickaguayo
 */
public class Satchmo {
    private String firstName;
    private String lastName;
    private Instrument instrument;
  
       
    public Satchmo(Instrument instrument) {
        this.instrument = instrument;
        System.out.println("Satchmo constructor dependency injection complete.");
    }
    
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        System.out.println("Satchmo firstName setter dependency injection complete.");
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        System.out.println("Satchmo lastName setter dependency injection complete.");
    }

    public void playing() {
        this.instrument.play();
    }    
}
