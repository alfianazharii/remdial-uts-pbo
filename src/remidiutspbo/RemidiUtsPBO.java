/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remidiutspbo;

/**
 *
 * @author lenovo
 */
public class RemidiUtsPBO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        INTEL intel1 = new INTEL(2);
        AMD amd1 = new AMD (3);
        Komputer kmp = new Komputer(intel1);
        
        
            kmp.cetakInfo();
            kmp.memasang(intel1);
            kmp.mencabut(amd1);
            kmp.cetakInfo();
    }
    
}
