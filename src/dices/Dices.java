/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dices;

/**
 *
 * @author michail
 */
public class Dices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dice bd = new Dice(new Side[] {new Side(1,1,1),new Side(2,2,3)}, true);
        System.out.println(bd.getSides()[1].getDist());
        System.out.println("");
    }
    
}
