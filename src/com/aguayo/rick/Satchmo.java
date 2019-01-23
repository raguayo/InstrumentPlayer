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
    private Instrument instrument;
    
    public Satchmo(Instrument instrument) {
        this.instrument = instrument;
        System.out.println("Constructor dependency injection complete.");
    }

    public void playing() {
        this.instrument.play();
    }    
}
