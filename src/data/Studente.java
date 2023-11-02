/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author efimi
 */
public class Studente extends Persona {
    
    Persona persona;

    public Studente(Persona persona, String nome, int eta) {
        super(nome, eta);
        this.persona = persona;
    }
    
    
}
