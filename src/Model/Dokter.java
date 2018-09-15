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
public class Dokter {

    private String nomorPegawai;
    private String nama;
    private String alamat;
    private String tempatLahir;
    private int tanggalLahir;
    private int bulanLahir;
    private int tahunLahir;

    /**
     * Membuat Constructor kosong dengan nama Dokter
     */
    public Dokter() {

    }

    /**
     * Membuat Constructor dengan parameter
     *
     * @param nomorPegawai String
     * @param nama String
     * @param alamat String
     * @param tempatLahir String
     * @param tanggalLahir int
     * @param bulanLahir int
     * @param tahunLahir int
     */
    public Dokter(String nomorPegawai, String nama, String alamat, String tempatLahir, int tanggalLahir, int bulanLahir, int tahunLahir) {
        this.nomorPegawai = nomorPegawai;
        this.nama = nama;
        this.alamat = alamat;
        this.tempatLahir = tempatLahir;
        this.tanggalLahir = tanggalLahir;
        this.bulanLahir = bulanLahir;
        this.tahunLahir = tahunLahir;
    }

    /**
     * Membuat method public dengan variable String dan diberi nama
     * getNomorPegawai()
     *
     * @return nomorPegawai + nama.substring(0, 3)
     */
    public String getNomorPegawai() {
        //Pengembalian nomorPegawai kepada method pemanggil getNomorPegawai() 
        //dengan menambah substring dari nama sejumlah 3 huruf depan
        return nomorPegawai + nama.substring(0, 3);
    }

    /**
     * Membuat method public dengan variable void dan diberi nama
     * setNomorPegawai dengan parameter String nomorPegawai dengan menggunakan
     * throws Exception
     *
     * @param nomorPegawai String
     */
    public void setNomorPegawai(String nomorPegawai) {
        //nomorPegawai dari variabel global sama dengan nomorPegawai dari variabel lokal
        this.nomorPegawai = nomorPegawai;
    }

    /**
     * Membuat method public dengan variable String dan diberi nama getNama()
     *
     * @return nama
     */
    public String getNama() {
        //Pengembalian nama kepada method getNama()
        return nama;
    }

    /**
     * Membuat method public dengan variable void dan diberi nama setNama dengan
     * parameter String nama
     *
     * @param nama String
     */
    public void setNama(String nama) {
        //nama dari variabel global sama dengan nama dari variabel lokal
        this.nama = nama;
    }

    /**
     * Membuat method public dengan variable String dan diberi nama getAlamat()
     *
     * @return alamat
     */
    public String getAlamat() {
        //Pengembalian alamat kepada method getAlamat()
        return alamat;
    }

    /**
     * Membuat method public dengan variable void dan diberi nama setAlamat
     * dengan parameter String alamat
     *
     * @param alamat String
     */
    public void setAlamat(String alamat) {
        //alamat dari variabel global sama dengan alamat dari variabel lokal
        this.alamat = alamat;
    }

    /**
     * Membuat method public dengan variable String dan diberi nama
     * getTempatLahir()
     *
     * @return tempatLahir
     */
    public String getTempatLahir() {
        //Pengembalian tempatLahir kepada method getTempatLahir()
        return tempatLahir;
    }

    /**
     * Membuat method public dengan variable void dan diberi nama setTempatLahir
     * dengan parameter String tempatLahir
     *
     * @param tempatLahir String
     */
    public void setTempatLahir(String tempatLahir) {
        //tempatLahir dari variabel global sama dengan tempatLahir dari variabel lokal
        this.tempatLahir = tempatLahir;
    }

    /**
     * Membuat method public dengan variable int dan diberi nama
     * getTanggalLahir()
     *
     * @return tanggalLahir
     */
    public int getTanggalLahir() {
        //Pengembalian tanggalLahir kepada method getTanggalLahir()
        return tanggalLahir;
    }

    /**
     * Membuat method public dengan variable void dan diberi nama
     * setTanggalLahir dengan parameter int tanggalLahir menggunakan throws
     * Exception
     *
     * @param tanggalLahir int
     */
    public void setTanggalLahir(int tanggalLahir) {
        // tanggalLahir dari variabel global sama dengan tanggalLahir dari variabel lokal
        this.tanggalLahir = tanggalLahir;

    }

    /**
     * Membuat method public dengan variable int dan diberi nama getBulanLahir()
     *
     * @return bulanLahir
     */
    public int getBulanLahir() {
        //Pengembalian alamat kepada method bulanLahir()
        return bulanLahir;
    }

    /**
     * Membuat method public dengan variable void dan diberi nama setBulanLahir
     * dengan parameter int bulanLahir, menggunakan throws Exception
     *
     * @param bulanLahir int
     */
    public void setBulanLahir(int bulanLahir) {
        //bulanLahir dari variabel global sama dengan tanggalLahir dari variabel lokal
        this.bulanLahir = bulanLahir;

    }

    /**
     * Membuat method public dengan variable int dan diberi nama getTahunLahir()
     *
     * @return tahunLahir
     */
    public int getTahunLahir() {
        //Pengembalian alamat kepada method getTahunLahir()
        return tahunLahir;
    }

    /**
     * Membuat method public dengan variable void dan diberi nama setTahunLahir
     * dengan parameter int tahunLahir, menggunakan throws Exception
     *
     * @param tahunLahir int
     */
    public void setTahunLahir(int tahunLahir) {
        //tahunLahir dari variabel global sama dengan tahunLahir dari variabel lokal
        this.tahunLahir = tahunLahir;
    }
}
