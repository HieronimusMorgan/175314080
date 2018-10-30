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
public class AntrianKlinik {

    private int tanggalAntrian;
    private int bulanAntrian;
    private int tahunAntrian;
    private Klinik klinik;
    private static ArrayList<Pasien> daftarPasienAntri = new ArrayList<>();
    public static ArrayList<AntrianKlinik> daftarAntrian = new ArrayList<AntrianKlinik>();

    /**
     * Membuat Constructor kosong
     */
    public AntrianKlinik() {

    }

    /**
     * Membuat Constructor dengan parameter
     *
     * @param tanggalAntrian int
     * @param bulanAntrian int
     */
    public AntrianKlinik(int tanggalAntrian, int bulanAntrian) {
        this.tanggalAntrian = tanggalAntrian;
        this.bulanAntrian = bulanAntrian;
    }

    public void Mendaftar(Pasien pasien) {
        //daftarPasien memasukkan data array dengan add pasien
        daftarPasienAntri.add(pasien);
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

    public Klinik getKlinik() {
        //Pengembalian klinik kepada method pemanggil getKlinik()
        return klinik;
    }

    public void setKlinik(Klinik klinik) {
        //klinik dari variabel global sama dengan klinik dari variabel lokal
        this.klinik = klinik;
    }

    public ArrayList<Pasien> getDaftarPasienAntri() {
        //Pengembalian daftarPasienAntri kepada method pemanggil getDaftarPasien()
        return daftarPasienAntri;
    }


    public static Pasien CariPasien(int nomorPanggil) {
        //Pengembalian daftarPasienAntri yang memanggi data ke nomorPanggil
        return daftarPasienAntri.get(nomorPanggil);
    }

    @Override
    public String toString() {
        return String.valueOf(tahunAntrian)
                + String.valueOf(bulanAntrian)
                + String.valueOf(tanggalAntrian)
                + klinik.getIdKlinik() + klinik.getNama();
    }
}
