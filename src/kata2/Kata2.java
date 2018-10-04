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
        // TODO code application logic here
        int[] data = {4,2,5,1,6,7,4,2,5,7,5,3,5,9,8};
        Map<Integer, Integer> histogram = new HashMap<Integer, Integer>();
        
        for (int key : data) {
            histogram.put(key,histogram.containsKey(key)? histogram.get(key)+1:1);
        }
        for (int key : data) {
            System.out.println(data[key] + "==>" + histogram.get(data[key]));
        }
    }
}
