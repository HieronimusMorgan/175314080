/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Morgan
 */
public class AntrianPasien {

    private int tanggalAntrian;
    private int bulanAntrian;
    private static ArrayList<Pasien> daftarPasien = new ArrayList<>();
    private int AntrianPasien = daftarPasien.size();

    /**
     * Membuat Constructor kosong
     */
    public AntrianPasien() {
    }

    /**
     * Membuat Constructor dengan parameter
     *
     * @param tanggalAntrian
     * @param bulanAntrian
     */
    public AntrianPasien(int tanggalAntrian, int bulanAntrian) {
        this.tanggalAntrian = tanggalAntrian;
        this.bulanAntrian = bulanAntrian;
    }

    /**
     * Membuat method public dengan variable int dan diberi nama
     * getTanggalAntrian()
     *
     * @return
     */
    public int getTanggalAntrian() {
        //Pengembalian tanggalAntrian kepada method pemanggil getTanggalAntrian()
        return tanggalAntrian;
    }

    /**
     * Membuat method public dengan variable void dan diberi nama
     * setTanggalAntrian dengan parameter int tanggalAntrian
     *
     * @param tanggalAntrian
     */
    public void setTanggalAntrian(int tanggalAntrian) {
        //tanggalAntrian dari variabel global sama dengan tanggalAntrian dari variabel lokal
        this.tanggalAntrian = tanggalAntrian;
    }

    /**
     * Membuat method public dengan variable int dan diberi nama
     * getBulanAntrian()
     *
     * @return
     */
    public int getBulanAntrian() {
        //Pengembalian bulanAntrian kepada method pemanggil getBulanAntrian()
        return bulanAntrian;
    }

    /**
     * Membuat method public dengan variable void dan diberi nama bulanAntrian
     * dengan parameter int bulanAntrian
     *
     * @param bulanAntrian
     */
    public void setBulanAntrian(int bulanAntrian) {
        //bulanAntrian dari variabel global sama dengan bulanAntrian dari variabel lokal
        this.bulanAntrian = bulanAntrian;
    }

    /**
     * Membuat method public dengan variable ArrayList dan diberi nama
     * getDaftarPasien()
     *
     * @return
     */
    public ArrayList<Pasien> getDaftarPasien() {
        //Pengembalian daftarPasien kepada method pemanggil getDaftarPasien()
        return daftarPasien;
    }

  
    /**
     * Mendaftar berfungsi untuk memasukkan data kepada array daftarPasien
     * dimana data array tersebut bersifat dinamis
     *
     * @param pasien
     */
    public void Mendaftar(Pasien pasien) {
        //daftarPasien memasukkan data array dengan add pasien
        daftarPasien.add(pasien);
    }

    /**
     * PanggilPasien berfungsi memanggi pasien dimana Pasien dipanggil satu
     * persatu melalui nomorPanggil
     *
     * @param nomorPanggil
     * @return
     */
    public Pasien PanggilPasein(int nomorPanggil) {
        //Pengembalian daftarPasien yang memanggi data ke nomorPanggil
        return daftarPasien.get(nomorPanggil);
    }

    
    

}
