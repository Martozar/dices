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
public class Side {
    
    private final int hearts;
    private final int flashes;
    private final int dist;
    
    public Side(int hearts, int flashes, int dist){
        this.hearts = hearts;
        this.flashes = flashes;
        this.dist = dist;
    }
    
    public int getHearts(){
        return hearts;
    }
    
    public int getFlashes(){
        return flashes;
    }
    
    public int getDist(){
        return dist;
    }
}
