/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestStream;

import Model.Pasien;
import java.io.File;
/**
 *
 * @author admin
 */
public class TestStream {
    public static void main(String[] args) {
        Pasien test = new Pasien();
        test.setNoRekamMedis("001");
        test.setNama("puspa");
        test.setAlamat("klaten");
        
        Pasien test1 = new Pasien();
        test1.setNoRekamMedis("002");
        test1.setNama("adi");
        test1.setAlamat("klaten");
        
        Pasien test2 = new Pasien();
        test2.setNoRekamMedis("003");
        test2.setNama("morgan");
        test2.setAlamat("purwokerto"); 
       
        Pasien.tambahPasienBaru(test);
        Pasien.tambahPasienBaru(test1);
        Pasien.tambahPasienBaru(test2);
        
        Pasien.simpanDaftarPasien(new File("daftar.txt"));
    }
}
