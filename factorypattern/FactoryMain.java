/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorypattern;

/**
 *
 * @author subarat talukder
 */
public class FactoryMain {

    public static void main(String[] args) {

        Animal tiger = AnimalFactory.getTiger();
        tiger.getName();
        
        Animal dog = AnimalFactory.getDog();
        dog.getName();
    }
}
