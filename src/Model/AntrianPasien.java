/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Morgan
 */
public class AntrianPasien {

    private int tanggalAntrian;
    private int bulanAntrian;
    private int tahunAntrian;
    private Klinik klinik;
    private static ArrayList<Pasien> daftarPasienAntri = new ArrayList<>();
    public static ArrayList<AntrianPasien> daftarAntrian = new ArrayList<AntrianPasien>();

    /**
     * Membuat Constructor kosong
     */
    public AntrianPasien() {

    }

    /**
     * Membuat Constructor dengan parameter
     *
     * @param tanggalAntrian int
     * @param bulanAntrian int
     */
    public AntrianPasien(int tanggalAntrian, int bulanAntrian) {
        this.tanggalAntrian = tanggalAntrian;
        this.bulanAntrian = bulanAntrian;
    }

    /**
     * Membuat method public dengan variable int dan diberi nama
     * getTanggalAntrian()
     *
     * @return tanggalAntrian
     */
    public int getTanggalAntrian() {
        //Pengembalian tanggalAntrian kepada method pemanggil getTanggalAntrian()
        return tanggalAntrian;
    }

    /**
     * Membuat method public dengan variable void dan diberi nama
     * setTanggalAntrian dengan parameter int tanggalAntrian
     *
     * @param tanggalAntrian int
     */
    public void setTanggalAntrian(int tanggalAntrian) {
        //tanggalAntrian dari variabel global sama dengan tanggalAntrian dari variabel lokal
        this.tanggalAntrian = tanggalAntrian;
    }

    /**
     * Membuat method public dengan variable int dan diberi nama
     * getBulanAntrian()
     *
     * @return bulanAntrian
     */
    public int getBulanAntrian() {
        //Pengembalian bulanAntrian kepada method pemanggil getBulanAntrian()
        return bulanAntrian;
    }

    /**
     * Membuat method public dengan variable void dan diberi nama bulanAntrian
     * dengan parameter int bulanAntrian
     *
     * @param bulanAntrian int
     */
    public void setBulanAntrian(int bulanAntrian) {
        //bulanAntrian dari variabel global sama dengan bulanAntrian dari variabel lokal
        this.bulanAntrian = bulanAntrian;
    }

    /**
     * Membuat method public dengan variable int dan diberi nama
     * getTahunAntrian()
     *
     * @return tahunAntrian
     */
    public int getTahunAntrian() {
        //Pengembalian tahunAntrian kepada method pemanggil getTahunAntrian()
        return tahunAntrian;
    }

    /**
     * Membuat method public dengan variable void dan diberi nama tahunAntrian
     * dengan parameter int tahunAntrian
     *
     * @param tahunAntrian int
     */
    public void setTahunAntrian(int tahunAntrian) {
        //tahunAntrian dari variabel global sama dengan tahunAntrian dari variabel lokal
        this.tahunAntrian = tahunAntrian;
    }

    /**
     * Membuat method public dengan variable int dan diberi nama getKlinik()
     *
     * @return klinik
     */
    public Klinik getKlinik() {
        //Pengembalian klinik kepada method pemanggil getKlinik()
        return klinik;
    }

    /**
     * Membuat method public dengan variable void dan diberi nama setKlinik
     * dengan parameter Klinik klinik
     *
     * @param klinik Klinik
     */
    public void setKlinik(Klinik klinik) {
        //klinik dari variabel global sama dengan klinik dari variabel lokal
        this.klinik = klinik;
    }

    /**
     * Membuat method public dengan variable ArrayList dan diberi nama
     * getDaftarPasien()
     *
     * @return daftarPasienAntri
     */
    public ArrayList<Pasien> getDaftarPasienAntri() {
        //Pengembalian daftarPasienAntri kepada method pemanggil getDaftarPasien()
        return daftarPasienAntri;
    }

    /**
     * Mendaftar berfungsi untuk memasukkan data kepada array daftarPasienAntri
     * dimana data array tersebut bersifat dinamis
     *
     * @param pasien Pasien
     */
    public void Mendaftar(Pasien pasien) {
        //daftarPasien memasukkan data array dengan add pasien
        daftarPasienAntri.add(pasien);
    }

    /**
     * PanggilPasien berfungsi memanggi pasien dimana Pasien dipanggil satu
     * persatu melalui nomorPanggil
     *
     * @param nomorPanggil int
     * @return daftarPasienAntri.get(nomorPanggil)
     */
    public Pasien PanggilPasein(int nomorPanggil) {
        //Pengembalian daftarPasienAntri yang memanggi data ke nomorPanggil
        return daftarPasienAntri.get(nomorPanggil);
    }

    /**
     *
     * @param tanggal int
     * @param bulan int
     * @param tahun int
     * @param klinik Klinik
     * @return i
     */
    public static int cariPasien(int tanggal, int bulan, int tahun, Klinik klinik) {
        // Pasien cari = new Pasien();
        for (int i = 0; i < daftarPasienAntri.size(); i++) {
            if (tanggal == daftarPasienAntri.get(i).getTanggalLahir()
                    && bulan == daftarPasienAntri.get(i).getBulanLahir() 
                    && tahun == daftarPasienAntri.get(i).getTahunLahir()
                    && daftarAntrian.get(i).getKlinik().getIdKlinik().equalsIgnoreCase(klinik.getIdKlinik())
                    && daftarAntrian.get(i).getKlinik().getNama().equalsIgnoreCase(klinik.getNama())) {
                return i;
            }
        }
        return -1;
    }

    /**
     *
     * @param tanggal int
     * @param bulan int
     * @param tahun int
     * @param klinik Klinik
     */
    public void buatAntrian(int tanggal, int bulan, int tahun, Klinik klinik) {
        AntrianPasien antrian = new AntrianPasien();
        antrian.setTanggalAntrian(tanggal);
        antrian.setBulanAntrian(bulan);
        antrian.setTahunAntrian(tahun);
        antrian.setKlinik(klinik);
        if (cariPasien(tanggal, bulan, tahun, klinik) >= 0) {
            daftarAntrian.add(antrian);
        } else {
            JOptionPane.showMessageDialog(null, "Antrian Sudah Ada !");
        }

    }
}
