/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modell;

import java.util.UUID;

/**
 *
 * @author install
 */
public class Auto extends Jarmu implements Comparable<Jarmu>{
    private UUID id;
    private String kiberelve;

    public Auto(String rendzsam, minosites min) {
        this(rendzsam, min, "hétfő");
    }
    
    
    
    public Auto(String rendzsam,minosites min, String kiberelve) {
        super(rendzsam, min);
        this.id = UUID.randomUUID();
        this.kiberelve = kiberelve;
    }

    @Override
    public int compareTo(Jarmu masikjarmu) {
        String rendszam = super.getRendszam();
        return rendszam.compareTo(masikjarmu.getRendszam());
    }
    
    
}
