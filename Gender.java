/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application.models;



/**
 *
 * @author CWL
 * @version 1.0
 * @since 03.09.2016
 */

public enum Gender {
    FEMALE("F","Female"),MALE("M","Male");
    
    String symbol;
    String description;
    
    Gender(String sym,String desc){
        this.symbol=sym;
        this.description=desc;
    }
    
    @Override
    public String toString(){
        return symbol;
    }
}
