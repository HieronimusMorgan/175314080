/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Morgan
 */
public class Klinik {

    private String idKlinik;
    private String nama;

    /**
     * Membuat Constructor kosong pada kelas AntrianPasien
     */
    public Klinik() {
    }

    /**
     * Membuat Constructor dengan parameter
     *
     * @param idKlinik
     * @param nama
     */
    public Klinik(String idKlinik, String nama) {
        this.idKlinik = idKlinik;
        this.nama = nama;
    }

    /**
     * Membuat method public dengan variable String dan diberi nama
     * getIdKlinik()
     *
     * @return
     */
    public String getIdKlinik() {
        //Pengembalian idKlinik kepada method pemanggil getIdKlinik()
        return idKlinik;
    }

    /**
     * Membuat method public dengan variable void dan diberi nama setIdKlinik
     * dengan parameter String idKlinik
     *
     * @param idKlinik
     */
    public void setIdKlinik(String idKlinik) {
        //idKlinik dari variabel global sama dengan idKlinik dari variabel lokal
        this.idKlinik = idKlinik;
    }

    /**
     * Membuat method public dengan variable String dan diberi nama getNama()
     *
     * @return
     */
    public String getNama() {
        //Pengembalian nama kepada method getNama()
        return nama;
    }

    /**
     * Membuat method public dengan variable void dan diberi nama setNama dengan
     * parameter String nama
     *
     * @param nama
     */
    public void setNama(String nama) {
        //nama dari variabel global sama dengan nama dari variabel lokal
        this.nama = nama;
    }

}
