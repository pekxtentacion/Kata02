/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata2;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Usuario
 */
public class Kata2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        String[] data = {"Rosa", "Pepe", "María", "Pepe", "Pepe", "Rosa"};
        int[] data = {4,2,5,1,6,7,4,2,5,7,5,3,5,9,8};
        Histogram histo = new Histogram(data);
        Map <Integer,Integer> histogr = histo.getHistogram();
        
        for (Integer key : histogr.keySet()) {
            System.out.println(key + "==>" + histogr.get(key));
        }
    }
}
