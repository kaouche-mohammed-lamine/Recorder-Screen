/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.casting;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lamine-pacificatory
 */
public class clock extends Thread {
    int sc=0,min=0,he=0;

    
AppCasting a ;
public clock(AppCasting a){
    this.a =  a;
}
    public void run(){
        try {
                    while(true){
                for(he = 0  ; he <24;he++){
                for(min = 0  ; min <60;min++){
                   
                    for(sc = 0  ; sc <60;sc++){
                        
                            
                            TimeUnit.SECONDS.sleep(1);
                            
                            a.jLabel4.setText(he + ":"+min +":"+sc );
                            
                           
                       
                    }
                     if (sc == 59) { 
                                sc = 0;
                            }
                    
                }
                if (min == 59) {
                           min = 0; 
                        }
                
            }
                if (he == 59) {
                           he = 0; 
                        }
                } } catch (InterruptedException ex) {
                            Logger.getLogger(AppCasting.class.getName()).log(Level.SEVERE, null, ex);
                        }}
}
