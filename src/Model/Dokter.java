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
     * @param nomorPegawai
     * @param nama
     * @param alamat
     * @param tempatLahir
     * @param tanggalLahir
     * @param bulanLahir
     * @param tahunLahir
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
     * @return
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
     * @param nomorPegawai
     * @throws Exception
     */
    public void setNomorPegawai(String nomorPegawai) throws Exception {
        //Membandingkan panjang String nomorPegawai sama dengan 5 
        //maka nomorPegawai dari variabel global sama dengan nomorPegawai dari variabel lokal
        if (nomorPegawai.length() == 5) {
            this.nomorPegawai = nomorPegawai;
        } else {
            //Jika tidak memenuhi kriteria tersebut maka akan mencetak "Nomor Pegawai Salah"
            throw new Exception("Nomor Pegawai Salah");
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
        //selanjutnya dengan membandingkan jika bulanLahir kurang dari sama dengan 12

        if (bulanLahir > 0) {
            if (bulanLahir <= 12) {
                //bulanLahir dari variabel global sama dengan tanggalLahir dari variabel lokal
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
        if (tahunLahir > 0) {
            //tahunLahir dari variabel global sama dengan tahunLahir dari variabel lokal
            this.tahunLahir = tahunLahir;
        } else {
            //Jika tidak memenuhi kriteria tersebut maka akan mencetak "Tahun Lahir Salah"
            throw new Exception("Tahun Lahir Salah");
        }
    }

}
