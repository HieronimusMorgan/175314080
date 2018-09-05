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
public class TestPasien {

    public static void main(String[] args) {
        try {
            Pasien Morgan = new Pasien();
            Morgan.setAlamat("Perumahan Kalibagor Indah F.78");
            Morgan.setTempatLahir("Banyumas");
            Morgan.setTanggalLahir(9);
            Morgan.setBulanLahir(2);
            Morgan.setNama("Morgan");
            Morgan.setTahunLahir(1999);
            Morgan.setNoRekamMedis(Morgan.BuatRekamMedis());
            System.out.println("Pasien");
            System.out.printf("%-15s\n", "Nomor Rekam Medis\t: " + Morgan.getNoRekamMedis());
            System.out.println("Nama\t\t\t: " + Morgan.getNama());
            System.out.println("Alamat\t\t\t: " + Morgan.getAlamat());
            System.out.println("Tempat, Tanggal Lahir\t: "
                    + Morgan.getTempatLahir() + ", "
                    + Morgan.getTanggalLahir() + "-" + Morgan.getBulanLahir() + "-" + Morgan.getTahunLahir()
            );

            Dokter Fredy = new Dokter();
            Fredy.setNomorPegawai("12343");
            Fredy.setNama("Fredy");
            Fredy.setAlamat("Jl. Kepuhsari No.44");
            Fredy.setTempatLahir("Purwokerto");
            Fredy.setTanggalLahir(2);
            Fredy.setBulanLahir(5);
            Fredy.setTahunLahir(1999);
            System.out.println("\n");
            System.out.println("Dokter");
            System.out.printf("%-15s\n", "Nomor Pegawai\t\t: " + Fredy.getNomorPegawai());
            System.out.println("Nama\t\t\t: " + Fredy.getNama());
            System.out.println("Alamat\t\t\t: " + Fredy.getAlamat());
            System.out.println("Tempat, Tanggal Lahir\t: "
                    + Fredy.getTempatLahir() + ", "
                    + Fredy.getTanggalLahir() + "-" + Fredy.getBulanLahir() + "-" + Fredy.getTahunLahir());

            System.out.println("");
            AntrianPasien antrian = new AntrianPasien();
            antrian.Mendaftar(Morgan);
            System.out.println(antrian.PanggilPasein(0).getNama());
           
            
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
