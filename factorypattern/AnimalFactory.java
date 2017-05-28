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
public class AnimalFactory {

    public static Animal getTiger() {
        return new Tiger();
    }

    public static Animal getLion() {
        return new Lion();
    }

    public static Animal getDog() {
        return new Dog();
    }
}
