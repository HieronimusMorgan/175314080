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
    private static ArrayList<Pasien> daftarPasienAntri = new ArrayList<>();

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

    public Pasien cariPasien(String noRM, int tanggalAntrian, int bulan, int tahun) {
        Pasien a = new Pasien();
        for (int i = 0; i < daftarPasienAntri.size(); i++) {
            if (noRM.equalsIgnoreCase(daftarPasienAntri.get(i).getNoRekamMedis()) || tanggalAntrian == daftarPasienAntri.get(i).getTanggalLahir()
                    || bulan == daftarPasienAntri.get(i).getBulanLahir() || tahun == daftarPasienAntri.get(i).getTahunLahir()) {
                return a;
            }
        }
        return null;

    }
}
