/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestStream;

import Model.Pasien;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author admin
 */
public class TestStream2 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Pasien.bacaDaftarPasien(new File("daftar.txt"));
        for (int i = 0; i < Pasien.getDaftarPasien().size(); i++) {
            System.out.println(Pasien.getDaftarPasien().get(i).getNama());
        }
        
        FileOutputStream fos = new FileOutputStream(new File("daftar.txt"));
        fos.close();
    }
}
