/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.text.SimpleDateFormat;
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
    public Pasien(String nomorrekammedis, String nama, String alamat, int tanggalLahir, int bulanLahir, int tahunLahir) {
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
     * @return
     */
    public String getNoRekamMedis() {
        return noRekamMedis;
    }

    /**
     * Membuat method public dengan variable void dan diberi nama
     * setNoRekamMedis dengan parameter String tahunlahir dengan menggunakan
     * throws Exception
     *
     * @param tahunlahir
     * @throws Exception
     */
    public void setNoRekamMedis(String tahunlahir) throws Exception {
        //Membandingkan jika panjang String tahunlahir lebih dari sama dengan 6
        //maka maka tahunlahir dari variabel global sama dengan tahunlahir dari variabel lokal
        if (tahunlahir.length() >= 6) {
            this.noRekamMedis = tahunlahir;
        } else {
            //Jika tidak memenuhi kriteria tersebut maka akan mencetak "Nomor Rekam Medis Salah"
            throw new Exception("Nomor Rekam Medis Salah");
        }
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

    /**
     * Membuat method public dengan variable String dan diberi nama getAlamat()
     *
     * @return
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
     * @return
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
     * @return
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
     * @throws Exception
     */
    public void setTanggalLahir(int tanggalLahir) throws Exception {
        //Membandingkan jika tanggalLahir lebih dari 0 maka memasuki perbandingan
        //selanjutnya dengan membandingka jika tanggalLahir kurang dari sama dengan 31
        //maka tanggalLahir dari variabel global sama dengan tanggalLahir dari variabel lokal
        if (tanggalLahir > 0) {
            if (tanggalLahir <= 31) {
                this.tanggalLahir = tanggalLahir;
            } else {
                //Jika tidak memenuhi kriteria tersebut maka akan mencetak "Tanggal Lahir Salah"
                throw new Exception("Tanggal Lahir Salah");
            }
        } else {
            //Jika tidak memenuhi kriteria tersebut maka akan mencetak "Tanggal Lahir Salah"
            throw new Exception("Tanggal Lahir Salah");
        }

    }

    /**
     * Membuat method public dengan variable int dan diberi nama getBulanLahir()
     *
     * @return
     */
    public int getBulanLahir() {
        //Pengembalian alamat kepada method bulanLahir()
        return bulanLahir;
    }

    /**
     * Membuat method public dengan variable void dan diberi nama setBulanLahir
     * dengan parameter int bulanLahir, menggunakan throws Exception
     *
     * @param bulanLahir
     * @throws Exception
     */
    public void setBulanLahir(int bulanLahir) throws Exception {
        //Membandingkan jika bulanLahir lebih dari 0 maka memasuki perbandingan
        //selanjutnya dengan membandingka jika bulanLahir kurang dari sama dengan 12
        //maka bulanLahir dari variabel global sama dengan tanggalLahir dari variabel lokal
        if (bulanLahir > 0) {
            if (bulanLahir <= 12) {
                this.bulanLahir = bulanLahir;
            } else {
                //Jika tidak memenuhi kriteria tersebut maka akan mencetak "Bulan Lahir Salah"
                throw new Exception("Bulan Lahir Salah");
            }
        } else {
            //Jika tidak memenuhi kriteria tersebut maka akan mencetak "Bulan Lahir Salah"
            throw new Exception("Bulan Lahir Salah");
        }
    }

    /**
     * Membuat method public dengan variable int dan diberi nama getTahunLahir()
     *
     * @return
     */
    public int getTahunLahir() {
        //Pengembalian alamat kepada method getTahunLahir()
        return tahunLahir;
    }

    /**
     * Membuat method public dengan variable void dan diberi nama setTahunLahir
     * dengan parameter int tahunLahir, menggunakan throws Exception
     *
     * @param tahunLahir
     * @throws Exception
     */
    public void setTahunLahir(int tahunLahir) throws Exception {
        //Membandingkan jika bulanLahir lebih dari 0 maka
        //tahunLahir dari variabel global sama dengan tahunLahir dari variabel lokal
        if (tahunLahir > 0) {
            this.tahunLahir = tahunLahir;
        } else {
            //Jika tidak memenuhi kriteria tersebut maka akan mencetak "Tahun Lahir Salah"
            throw new Exception("Tahun Lahir Salah");
        }
    }

    /**
     * Membuat nomor rekam medis berdasarkan tanggal sekarang dengan mengimport
     * SimpleDateFormat dan Date dimana menginput tanggal dengan format yyyyMMdd
     * serta tambahan substring nama dengan 3 huruf depan
     *
     * @return
     */
    public String BuatRekamMedis() {
        String nomorRekamMedis;
        Date date = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyyyMMdd");
        nomorRekamMedis = ft.format(date) + nama.substring(0, 3);
        return nomorRekamMedis;
    }

}
