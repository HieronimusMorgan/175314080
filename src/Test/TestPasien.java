/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import Model.AntrianPasien;
import Model.Klinik;
import Model.Pasien;

/**
 *
 * @author Morgan
 */
public class TestPasien {

    public static void main(String[] args) {
        AntrianPasien antrian = new AntrianPasien();
        try {
            Pasien  test = new Pasien(                    
                    "20180912", //Nomor Rekam Medis
                    "Morgan", // Nama Pasien
                    "Perumahan Kalibagor Indah", // Alamat Pasien
                    12,  // Tanggal 
                    9, // Bulan
                    2018// Tahun            
            );
            
            Pasien  test1 = new Pasien(                    
                    "20180825", //Nomor Rekam Medis
                    "Fredy", // Nama Pasien
                    "Jln. Kepuh sari no.44", // Alamat Pasien
                    12,  // Tanggal 
                    9, // Bulan
                    2018// Tahun            
            );
            Klinik klinik = new Klinik();
            klinik.setNama("Mata");
            Pasien.tambahPasienBaru(test1);
            Pasien.tambahPasienBaru(test);
            for (int i = 0; i < Pasien.daftarPasienKlinik.size(); i++) {
                System.out.println(Pasien.daftarPasienKlinik.get(i).getNama());
            }            
            System.out.println(test.cariPasien("20180825").getNama());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
