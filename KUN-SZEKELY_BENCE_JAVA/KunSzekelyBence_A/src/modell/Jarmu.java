/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modell;

import java.io.Serializable;

/**
 *
 * @author install
 */
public class Jarmu implements Serializable{
    private String rendszam;
    public enum minosites{KIVALO, ATLAGOS, MEGFELEELO};
    private minosites allapot;

    public Jarmu(String rendzsam, minosites min){
        setRendzsam(rendzsam);
        this.allapot = min;
    }
    
    public void setRendzsam(String rendzsam) {
        int i = 0;
        while (i < rendzsam.length() && rendzsam.charAt(i) != '-') {            
            i++;
        }
        if (i >= rendzsam.length()) {
            throw new RendszamException("nincs kötőjel");
        }
        if (rendzsam.charAt(0) == '-') {
            rendzsam = rendzsam.charAt(rendzsam.length()-1)+ rendzsam.substring(0, rendzsam.length()-2);
        }
        this.rendszam = rendzsam;
    }

    public String getRendszam() {
        return rendszam;
    }

    @Override
    public String toString() {
        return "Jarmu{" + "rendszam=" + rendszam + ", allapot=" + allapot + '}';
    }
    
    
    
}
