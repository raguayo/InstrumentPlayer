package com.aguayo.rick;

/**
 *
 * @author rickaguayo
 */
public class Musician {
    private Instrument instrument;
   
    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
        System.out.println("Setter dependency injection complete.");
    }
    
    public void playing() {
        this.instrument.play();
    } 
}
