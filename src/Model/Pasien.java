/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Morgan
 */
public class Pasien {

    private String noRekamMedis;
    private String nama;
    private String alamat;
    private String tempatLahir;
    private int tanggalLahir;
    private int bulanLahir;
    private int tahunLahir;
    public static ArrayList<Pasien> daftarPasien = new ArrayList<Pasien>();

    /**
     * Membuat Constructor kosong dengan nama Pasien
     */
    public Pasien() {

    }

    /**
     * Membuat Constructor dengan parameter
     *
     * @param nomorrekammedis
     * @param nama
     * @param alamat
     * @param tanggalLahir
     * @param bulanLahir
     * @param tahunLahir
     */
    public Pasien(String nomorrekammedis, String nama, String alamat,
            int tanggalLahir, int bulanLahir, int tahunLahir) {
        //variabel global sama dengan dari variabel lokal
        this.noRekamMedis = nomorrekammedis;
        this.nama = nama;
        this.alamat = alamat;
        this.tanggalLahir = tanggalLahir;
        this.bulanLahir = bulanLahir;
        this.tahunLahir = tahunLahir;
    }

    /**
     * Membuat method public dengan variable String dan diberi nama
     * getNoRekamMedis()
     *
     * @return noRekamMedis
     */
    public String getNoRekamMedis() {
        //Pengembalian nama kepada method getNama()
        return noRekamMedis;
    }

    /**
     * Membuat method public dengan variable void dan diberi nama
     * setNoRekamMedis dengan parameter String tahunlahir
     *
     * @param tahunlahir
     */
    public void setNoRekamMedis(String tahunlahir) {
        //noRekamMedis dari variabel global sama dengan noRekamMedis dari variabel lokal
        this.noRekamMedis = tahunlahir;
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
     * @param nama
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
     * @param alamat
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
     * @param tempatLahir
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
     * @param tanggalLahir
     *
     */
    public void setTanggalLahir(int tanggalLahir) {
        //Membandingkan jika tanggalLahir lebih dari 0 maka memasuki perbandingan
        //selanjutnya dengan membandingka jika tanggalLahir kurang dari sama dengan 31
        //maka tanggalLahir dari variabel global sama dengan tanggalLahir dari variabel lokal
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
     * dengan parameter int bulanLahir,
     *
     * @param bulanLahir
     *
     */
    public void setBulanLahir(int bulanLahir) {
        //bulanLahir dari variabel global sama dengan bulanLahir dari variabel lokal
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
     * dengan parameter int tahunLahir,
     *
     * @param tahunLahir
     *
     */
    public void setTahunLahir(int tahunLahir) {
        //tahunLahir dari variabel global sama dengan tahunLahir dari variabel lokal
        this.tahunLahir = tahunLahir;

    }

    /**
     * Membuat nomor rekam medis berdasarkan tanggal sekarang dengan mengimport
     * SimpleDateFormat dan Date dimana menginput tanggal dengan format yyyyMMdd
     * serta tambahan substring nama dengan 3 huruf depan
     *
     * @return nomorRekamMedis
     */
    public String BuatRekamMedis() {
        String nomorRekamMedis;
        Date date = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyyyMMdd");
        nomorRekamMedis = ft.format(date) + nama.substring(0, 3);
        return nomorRekamMedis;
    }

    /**
     * Digunakan untuk menampung seluruh Pasien yang baru mendaftar dengan
     * menambahnya di ArrayList daftarPasien yang berisi pasien
     *
     * @param pasien
     */
    public static void tambahPasienBaru(Pasien pasien) {
        daftarPasien.add(pasien);
    }

    /**
     * Digunakan untuk mencari daftar pasien melalui Nomor Rekam Medis, sehingga
     * saat dimasuukan statment tersebut maka secara otomatis akan mencari
     * daftarPasien yang memiliki NoRekamMedis yang sama lalu di return
     * daftarPasien.get(i)
     *
     * @param norekam
     * @return return daftarPasien.get(i)
     */
    public static Pasien cariPasien(String norekam) {
        for (int i = 0; i < daftarPasien.size(); i++) {
            // jika norekam = daftarPasien yang memanggil fetNoRekamMedis maka
            // daftarPasien.get(i) akan direturn ke method cariPasien
            if (norekam == null ? daftarPasien.get(i).getNoRekamMedis() == null
                    : norekam.equals(daftarPasien.get(i).getNoRekamMedis())) {
                return daftarPasien.get(i);
            }
        }
        //Jika data tidak ditemukan maka akan direturn null
        return null;
    }

}
