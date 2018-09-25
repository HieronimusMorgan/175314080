/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Pasien;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author asus
 */
public class TambahPasienBaruDialog extends JDialog implements ActionListener {

    private JLabel judulLabel;
    private JLabel namaLabel;
    private JTextField namaText;
    private JButton saveButton;
    private JLabel noRekam;
    private JLabel alamat;
    private JTextField noRekamText;
    private JTextField alamatText;
    private JLabel jenisKelaminLabel;
    private JRadioButton priaRadioButton;
    private JRadioButton perempuanRadioButton;
    private ButtonGroup groupButtonGroup;
    private JLabel tanggalLahirLabel;
    private JLabel bulanLahirLabel;
    private JLabel tahunLahirLabel;
    private JComboBox tanggalComboBox;
    private JComboBox bulanComboBox;
    private JComboBox tahunComboBox;
    private String tanggalArray[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9",
        "10", "11", "12", "13", "14", "15", "16", "17", "18",
        "19", "20", "21", "22", "23", "24", "25", "26", "27",
        "28", "29", "30", "31"};
    private String bulanArray[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9",
        "10", "11", "12"};
    private String tahunArray[] = {"1970", "1971", "1972", "1973", "1974", "1975",
        "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985",
        "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994",
        "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002"};

    public TambahPasienBaruDialog() {
        init();
    }

    public void init() {

        this.setLayout(null);
        //Membuat label dengan nama "Form Tambah Pasien"
        judulLabel = new JLabel("Form Tambah Pasien");
        // Ukuran x = 140, y = 10 dan panjang = 200 tinggi 20
        judulLabel.setBounds(140, 10, 200, 20);
        this.add(judulLabel);

        // Membuat label dengan nama "NIK"
        noRekam = new JLabel("NIK");
        // Ukuran x = 20, y = 50 dan panjang = 100 tinggi 50
        noRekam.setBounds(20, 50, 100, 50);
        this.add(noRekam);

        // Membuat TextField untuk input melalui keyboard
        noRekamText = new JTextField();
        // Ukuran x = 120, y = 65 dan panjang = 200 tinggi 20
        noRekamText.setBounds(120, 65, 200, 20);
        this.add(noRekamText);

        // Membuat label dengan nama "Nama"
        namaLabel = new JLabel("Nama ");
        // Ukuran x = 20, y = 90 dan panjang = 100 tinggi 50
        namaLabel.setBounds(20, 90, 100, 50);
        this.add(namaLabel);

        // Membuat TextField untuk input melalui keyboard
        namaText = new JTextField(" ");
        // Ukuran x = 120, y = 105 dan panjang = 200 tinggi 20
        namaText.setBounds(120, 105, 200, 20);
        this.add(namaText);

        // Membuat label dengan nama "Alamat"
        alamat = new JLabel("Alamat ");
        // Ukuran x = 20, y = 130 dan panjang = 100 tinggi 50
        alamat.setBounds(20, 130, 100, 50);
        this.add(alamat);

        // Membuat TextField untuk input melalui keyboard
        alamatText = new JTextField(" ");
        // Ukuran x = 120, y = 145 dan panjang = 200 tinggi 20
        alamatText.setBounds(120, 145, 200, 20);
        this.add(alamatText);

        // Membuat label dengan nama "Kenis Kelamin"
        jenisKelaminLabel = new JLabel("Jenis Kelamin ");
        // Ukuran x = 20, y = 165 dan panjang = 100 tinggi 50
        jenisKelaminLabel.setBounds(20, 165, 100, 50);
        this.add(jenisKelaminLabel);

        // Membuat RadioButton dengan nama "Pria" 
        priaRadioButton = new JRadioButton("Pria", true);
        // Ukuran x = 120, y = 180 dan panjang = 50 tinggi 20
        priaRadioButton.setBounds(120, 180, 50, 20);
        this.add(priaRadioButton);

        // Membuat RadioButton dengan nama "Perempuan"
        perempuanRadioButton = new JRadioButton("Perempuan", false);
        // Ukuran x = 120, y = 200 dan panjang = 120 tinggi 20
        perempuanRadioButton.setBounds(120, 200, 120, 20);
        this.add(perempuanRadioButton);

        // Membuat ButtonGroup untuk pengelompokan RadioButton
        groupButtonGroup = new ButtonGroup();
        groupButtonGroup.add(priaRadioButton);
        groupButtonGroup.add(perempuanRadioButton);

        // Membuat label dengan nama "Tanggal"
        tanggalLahirLabel = new JLabel("Tanggal");
        // Ukuran x = 20, y = 230 dan panjang = 80 tinggi 20
        tanggalLahirLabel.setBounds(20, 230, 80, 20);
        this.add(tanggalLahirLabel);

        //Membuat ComboBox untuk memilih urutan tanggal
        tanggalComboBox = new JComboBox(tanggalArray);
        // Ukuran x = 75, y = 230 dan panjang = 40 tinggi 20
        tanggalComboBox.setBounds(75, 230, 40, 20);
        this.add(tanggalComboBox);

        // Membuat label dengan nama "Bulan"
        bulanLahirLabel = new JLabel("Bulan");
        // Ukuran x = 120, y = 230 dan panjang = 80 tinggi 20
        bulanLahirLabel.setBounds(120, 230, 80, 20);
        this.add(bulanLahirLabel);

        //Membuat ComboBox untuk memilih urutan bulan
        bulanComboBox = new JComboBox(bulanArray);
        // Ukuran x = 160, y = 230 dan panjang = 40 tinggi 20
        bulanComboBox.setBounds(160, 230, 40, 20);
        this.add(bulanComboBox);

        // Membuat label dengan nama "Tahun"
        tahunLahirLabel = new JLabel("Tahun");
        // Ukuran x = 210, y = 230 dan panjang = 80 tinggi 20
        tahunLahirLabel.setBounds(210, 230, 80, 20);
        this.add(tahunLahirLabel);

        //Membuat ComboBox untuk memilih urutan tahun
        tahunComboBox = new JComboBox(tahunArray);
        // Ukuran x = 250, y = 230 dan panjang = 90 tinggi 20
        tahunComboBox.setBounds(250, 230, 90, 20);
        this.add(tahunComboBox);

        // Membuat Button dengan naa "SIMPAN"
        saveButton = new JButton("SIMPAN");
        // Ukuran x = 140, y = 300 dan panjang = 100 tinggi 30
        saveButton.setBounds(140, 300, 100, 30);
        this.add(saveButton);
        //menambahkan ActionListener untuk melakukan tindakan jika di klik 
        //maka akan masuk ke method actionPerformed
        saveButton.addActionListener(this);

    }

    /**
     * digunakan untuk melakukan tindakan dimana menggunakan implements dari
     * kelas ActionListener dengan membuat method actionPerformed dengan
     * parameter e bertipe data ActionEvent
     *
     * @param e ActionEvent
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == saveButton) {
            Pasien daftar = new Pasien();
            daftar.setNama(namaText.getText());
            daftar.setAlamat(alamatText.getText());
            daftar.setNoRekamMedis(noRekamText.getText());
//            String tanggalan = tanggalComboBox.getSelectedItem().toString();
            daftar.setTanggalLahir(Integer.valueOf(tanggalComboBox.getSelectedItem().toString()));
            daftar.setBulanLahir(Integer.valueOf(bulanComboBox.getSelectedItem().toString()));
            daftar.setTahunLahir(Integer.valueOf(tahunComboBox.getSelectedItem().toString()));
            Pasien.tambahPasienBaru(daftar);
            JOptionPane.showMessageDialog(null, namaText.getText() + "\nAnda Terdaftar");
            this.dispose();
        }
    }

}
