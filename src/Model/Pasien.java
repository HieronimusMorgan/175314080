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
    private String nik;
    private int tanggalLahir;
    private int bulanLahir;
    private int tahunLahir;
    public static ArrayList<Pasien> daftarPasienKlinik = new ArrayList<Pasien>();

    /**
     * Membuat Constructor kosong dengan nama Pasien
     */
    public Pasien() {

    }

    /**
     * Membuat Constructor dengan parameter
     *
     * @param nomorrekammedis String
     * @param nama String
     * @param alamat String
     * @param tanggalLahir int
     * @param bulanLahir int
     * @param tahunLahir int
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
     * @param noRekamMedis String
     */
    public void setNoRekamMedis(String noRekamMedis) {
        //noRekamMedis dari variabel global sama dengan noRekamMedis dari variabel lokal
        this.noRekamMedis = noRekamMedis;
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
     * Membuat method public dengan variable String dan diberi nama getNik()
     *
     * @return nik
     */
    public String getNik() {
        //Pengembalian nik kepada method getNik()
        return nik;
    }

    /**
     * Membuat method public dengan variable void dan diberi nama setNik dengan
     * parameter String nik
     *
     * @param nik String
     */
    public void setNik(String nik) {
        //nik dari variabel global sama dengan nik dari variabel lokal
        this.nik = nik;
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
     * @param bulanLahir int
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
     * @param tahunLahir int
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
     * menambahnya di ArrayList daftarPasienKlinik yang berisi pasien
     *
     * @param pasien Pasien
     */
    public static void tambahPasienBaru(Pasien pasien) {
        daftarPasienKlinik.add(pasien);
    }

    /**
     * Digunakan untuk mencari daftar pasien melalui Nomor Rekam Medis, sehingga
     * saat dimasuukan statment tersebut maka secara otomatis akan mencari
     * daftarPasienKlinik yang memiliki NoRekamMedis yang sama lalu di return
     * daftarPasienKlinik.get(i)
     *
     * @param norekam String
     * @return daftarPasienKlinik.get(i)
     */
    public static Pasien cariPasien(String norekam) {
        for (int i = 0; i < daftarPasienKlinik.size(); i++) {
            // jika norekam = daftarPasienKlinik yang memanggil fetNoRekamMedis maka
            // daftarPasienKlinik.get(i) akan direturn ke method cariPasien
            if (norekam == null ? daftarPasienKlinik.get(i).getNoRekamMedis() == null
                    : norekam.equals(daftarPasienKlinik.get(i).getNoRekamMedis())) {
                return daftarPasienKlinik.get(i);
            }
        }
        //Jika data tidak ditemukan maka akan direturn null
        return null;
    }

}
