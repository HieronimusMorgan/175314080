/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Pasien;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author asus
 */
public class TambahAntrianDialog extends JDialog implements ActionListener {

    private JLabel judulLabel;
    private JLabel namaLabel;
    private JTextField namaText;
    private JLabel noRekamLabel;
    private JLabel alamatLabel;
    private JTextField noRekamText;
    private JTextField alamatText;

    public TambahAntrianDialog() {
        init();
    }

    public void init() {

        this.setLayout(null);
        //Membuat label dengan nama "Form Tambah Pasien"
        judulLabel = new JLabel("Form Tambah Antrian");
        // Ukuran x = 140, y = 10 dan panjang = 200 tinggi 20
        judulLabel.setBounds(140, 10, 200, 20);
        this.add(judulLabel);

        //Membuat label dengan nama "No. RM"
        noRekamLabel = new JLabel("No. RM");
        // Ukuran x = 20, y = 60 dan panjang = 100 tinggi 50
        noRekamLabel.setBounds(20, 60, 100, 50);
        this.add(noRekamLabel);

        // Membuat TextField untuk input melalui keyboard
        noRekamText = new JTextField();
        // Ukuran x = 70, y = 75 dan panjang = 200 tinggi 20
        noRekamText.setBounds(70, 75, 200, 20);
        this.add(noRekamText);
        noRekamText.addActionListener(this);

        //Membuat label dengan nama "Nama "
        namaLabel = new JLabel("Nama ");
        // Ukuran x = 20, y = 100 dan panjang = 100 tinggi 50
        namaLabel.setBounds(20, 100, 100, 50);
        this.add(namaLabel);

        // Membuat TextField untuk input melalui keyboard
        namaText = new JTextField(" ");
        // Ukuran x = 70, y = 115 dan panjang = 200 tinggi 20
        namaText.setBounds(70, 115, 200, 20);
        this.add(namaText);
        //menambahkan ActionListener untuk melakukan tindakan jika di Enter
        //maka akan masuk ke method actionPerformed
        namaText.addActionListener(this);

        //Membuat label dengan nama "Alamat"
        alamatLabel = new JLabel("Alamat ");
        // Ukuran x = 20, y = 140 dan panjang = 100 tinggi 50
        alamatLabel.setBounds(20, 140, 100, 50);
        this.add(alamatLabel);

        // Membuat TextField untuk input melalui keyboard
        alamatText = new JTextField(" ");
        // Ukuran x = 70, y = 115 dan panjang = 200 tinggi 20
        alamatText.setBounds(70, 155, 200, 20);
        this.add(alamatText);

    }

    /**
     * digunakan untuk melakukan tindakan dimana menggunakan implements dari
     * kelas ActionListener dengan membuat method actionPerformed dengan
     * parameter e bertipe data ActionEvent
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == noRekamText) {
            //Jika cariPasien tidak null Pointer maka akan masuk ke fungsi if 
            //jika tidak maka akan menampilkan Message Dialog 
            //"Data Tidak Tersedia"
            if (Pasien.cariPasien(noRekamText.getText()) != null) {
                String nama = Pasien.cariPasien(noRekamText.getText()).getNama();
                String alamata = Pasien.cariPasien(noRekamText.getText()).getAlamat();
                namaText.setText(nama);
                alamatText.setText(alamata);
            } else {
                JOptionPane.showMessageDialog(null, "Data Tidak Tersedia");
            }
        }
    }

}
