/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class RumahSakit implements Serializable {

    private ArrayList<Pasien> daftarPasien = new ArrayList<>();
    private ArrayList<AntrianKlinik> DaftarAntrianKlinik = new ArrayList<>();
    private ArrayList<Klinik> daftarKlinik = new ArrayList<>();
    private String nama;
    private String alamat;

    public RumahSakit() {

    }

    public RumahSakit(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    public void tambahPasien(Pasien pasien) {
        daftarPasien.add(pasien);
    }

    public Pasien cariPasien(String nama) {
        Pasien bantu = new Pasien();
        for (int i = 0; i < daftarPasien.size(); i++) {
            if (daftarPasien.get(i).getNama().equalsIgnoreCase(nama)) {
                bantu.setNama(daftarPasien.get(i).getNama());
            }
        }
        return bantu;
    }

    public void tambahPasienBaru(Pasien test) {
        daftarPasien.add(test);
    }

    public void simpanDaftarPasien(File file) {
        try {
            try (FileOutputStream fos = new FileOutputStream(file)) {
                for (int i = 0; i < daftarPasien.size(); i++) {
                    String data = daftarPasien.get(i).toString();
                    fos.write(data.getBytes());
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void bacaDaftarPasien(File file) {
        FileInputStream fis = null;
        try {

            String hasilBaca = "";
            fis = new FileInputStream(file);
            int dataInt;
            boolean noRM = false;
            boolean Nama = false;
            boolean Alamat = false;
            Pasien temp = new Pasien();
            RumahSakit tempo = new RumahSakit();
            while ((dataInt = fis.read()) != -1) {
                if ((char) dataInt != '\n') {
                    if ((char) dataInt != '\t' && noRM == false && Nama == false && Alamat == false) {
                        hasilBaca = hasilBaca + (char) dataInt;
                    } else if ((char) dataInt == '\t' && noRM == false && Nama == false && Alamat == false) {
                        noRM = true;
                        temp.setNik(hasilBaca);
                        hasilBaca = "";
                    } else if ((char) dataInt != '\t' && noRM == true && Nama == false && Alamat == false) {
                        hasilBaca = hasilBaca + (char) dataInt;
                    } else if ((char) dataInt == '\t' && noRM == true && Nama == false && Alamat == false) {
                        Nama = true;
                        temp.setNama(hasilBaca);
                        hasilBaca = "";
                    } else if ((char) dataInt != '\t' && noRM == true && Nama == true && Alamat == false) {
                        hasilBaca = hasilBaca + (char) dataInt;
                    } else if ((char) dataInt == '\t' && noRM == true && Nama == true && Alamat == false) {
                        Alamat = true;
                        temp.setAlamat(hasilBaca);
                        hasilBaca = "";
                    }
                } else {
                    Alamat = true;
                    tempo.setNama(hasilBaca);
                    temp.setAlamat(hasilBaca);
                    hasilBaca = "";
                    tambahPasienBaru(temp);
                    Nama = false;
                    noRM = false;
                    Alamat = false;
                    temp = new Pasien();
                }
            }
            fis.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void simpanObjekRumahSakit(File file) {
        try {
            FileOutputStream fos = new FileOutputStream(file);
            try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                oos.writeObject(this);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(RumahSakit.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(RumahSakit.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void bacaObjekRumahSakit(File file) {
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            RumahSakit a = (RumahSakit) ois.readObject();
            this.setDaftarPasien(a.getDaftarPasien());
            this.setDaftarAntrianKlinik(a.getDaftarAntrianKlinik());
            this.setDaftarKlinik(a.getDaftarKlinik());
            this.setNama(a.getNama());
            this.setAlamat(a.getAlamat());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(RumahSakit.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(RumahSakit.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Pasien> getDaftarPasien() {
        return daftarPasien;
    }

    public void setDaftarPasien(ArrayList<Pasien> daftarPasien) {
        this.daftarPasien = daftarPasien;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void tambahKlinik(Klinik klinik) {
        daftarKlinik.add(klinik);
    }

    public Klinik cariKlinik(String namaKlinik) {
        Klinik bantu = new Klinik();
        for (int i = 0; i < daftarKlinik.size(); i++) {
            if (daftarKlinik.get(i).getNama().equalsIgnoreCase(namaKlinik)) {
                bantu.setNama(daftarKlinik.get(i).getNama());
            }
        }
        return bantu;
    }

    public void buatAntrian(int tanggal, int bulan, int tahun, Klinik klinik) {
        AntrianKlinik antrian = new AntrianKlinik();
        antrian.setTanggalAntrian(tanggal);
        antrian.setBulanAntrian(bulan);
        antrian.setTahunAntrian(tahun);
        antrian.setKlinik(klinik);
        if (cariAntrian(tanggal, bulan, tahun, klinik) == -1) {
            this.DaftarAntrianKlinik.add(antrian);
        } else {
            JOptionPane.showMessageDialog(null, "Antrian Sudah Ada !");
        }
    }

    public int cariAntrian(int tanggal, int bulan, int tahun, Klinik klinik) {
        // Pasien cari = new Pasien();
        for (int i = 0; i < DaftarAntrianKlinik.size(); i++) {
            if (tanggal == DaftarAntrianKlinik.get(i).getTanggalAntrian()
                    && bulan == DaftarAntrianKlinik.get(i).getBulanAntrian()
                    && tahun == DaftarAntrianKlinik.get(i).getTahunAntrian()
                    && DaftarAntrianKlinik.get(i).getKlinik().getIdKlinik().equalsIgnoreCase(klinik.getIdKlinik())
                    && DaftarAntrianKlinik.get(i).getKlinik().getNama().equalsIgnoreCase(klinik.getNama())) {
                return i;
            }
        }
        return -1;
    }

    public void daftarPasien(Pasien pasien, int tanggal, int bulan, int tahun, Klinik klinik) {
        if (cariAntrian(tanggal, bulan, tahun, klinik) >= 0) {
            DaftarAntrianKlinik.get(cariAntrian(tanggal, bulan, tahun, klinik)).Mendaftar(pasien);
        } else {
            buatAntrian(tanggal, bulan, tahun, klinik);
            DaftarAntrianKlinik.get(cariAntrian(tanggal, bulan, tahun, klinik)).Mendaftar(pasien);
        }

    }

    public ArrayList<AntrianKlinik> getDaftarAntrianKlinik() {
        return DaftarAntrianKlinik;
    }

    public void setDaftarAntrianKlinik(ArrayList<AntrianKlinik> DaftarAntrianKlinik) {
        this.DaftarAntrianKlinik = DaftarAntrianKlinik;
    }

    public ArrayList<Klinik> getDaftarKlinik() {
        return daftarKlinik;
    }

    public void setDaftarKlinik(ArrayList<Klinik> daftarKlinik) {
        this.daftarKlinik = daftarKlinik;
    }

}
