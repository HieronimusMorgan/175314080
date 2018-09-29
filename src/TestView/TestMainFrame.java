/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestView;

import View.MainFrame;
import javax.swing.JFrame;

/**
 *
 * @author asus
 */
public class TestMainFrame {

    public static void main(String[] args) {
        MainFrame tampil = new MainFrame();
        //Mengatur ukuran panel sebesar 400 dan 500
        tampil.setSize(400, 500);        
        tampil.setVisible(true);
        tampil.setResizable(false);
        //Jika mengeklik tanda silang maka secara otomatis program akan berhenti
        tampil.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
