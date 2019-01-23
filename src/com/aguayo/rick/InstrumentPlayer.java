package com.aguayo.rick;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author rickaguayo
 */
public class InstrumentPlayer {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/aguayo/rick/beans.xml");
        System.out.println("beans.xml loaded");
        Musician musician = context.getBean("musician", Musician.class);
        musician.playing();
        Satchmo satchmo = context.getBean("satchmo", Satchmo.class);
        System.out.println("Satchmo's full name: " + satchmo.getFirstName() + 
                " " + satchmo.getLastName());
        satchmo.playing();
    }
    
}
