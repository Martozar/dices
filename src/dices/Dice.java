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
public class Dice {

    private final Side[] sides;
    private boolean isAttack;

    public Dice(Side[] sides, boolean isAttack) {
        this.sides = sides;
        this.isAttack = isAttack;
    }

    public Side[] getSides() {
        return sides;
    }

    public boolean getIsAttack() {
        return isAttack;
    }
}
