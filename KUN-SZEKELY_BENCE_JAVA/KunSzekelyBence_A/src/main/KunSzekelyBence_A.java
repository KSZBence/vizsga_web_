/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import java.io.IOException;
import nezet.GuiForm;

/**
 *
 * @author install
 */
public class KunSzekelyBence_A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        new KunSzekelyBence_A().program();
    }
    private void program() throws IOException{
        new nezet.Konzol();
        new GuiForm().setVisible(true);
    }
}
