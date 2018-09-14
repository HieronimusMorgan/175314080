/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.AntrianPasien;
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
public class TambahPasienDialog extends JDialog implements ActionListener {

    private JLabel judulLabel;
    private JLabel namaLabel;
    private JTextField namaText;
    private JButton saveButton;
    private JLabel noRekam;
    private JLabel alamat;
    private JTextField noRekamText;
    private JTextField alamatText;

    public TambahPasienDialog() {
        init();
    }

    public void init() {

        this.setLayout(null);
        judulLabel = new JLabel("Form Tambah Pasien");
        judulLabel.setBounds(70, 20, 300, 50);
        this.add(judulLabel);

        noRekam = new JLabel("NIK");
        noRekam.setBounds(20, 60, 100, 50);
        this.add(noRekam);

        noRekamText = new JTextField();
        noRekamText.setBounds(70, 75, 200, 20);
        this.add(noRekamText);

        namaLabel = new JLabel("Nama ");
        namaLabel.setBounds(20, 100, 100, 50);
        this.add(namaLabel);

        namaText = new JTextField(" ");
        namaText.setBounds(70, 115, 200, 20);
        this.add(namaText);
        namaText.addActionListener(this);

        alamat = new JLabel("Alamat ");
        alamat.setBounds(20, 140, 100, 50);
        this.add(alamat);

        alamatText = new JTextField(" ");
        alamatText.setBounds(70, 155, 200, 20);
        this.add(alamatText);
        alamatText.addActionListener(this);

        saveButton = new JButton("SIMPAN");
        saveButton.setBounds(100, 200, 100, 30);
        this.add(saveButton);
        saveButton.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == saveButton) {
            Pasien daftar = new Pasien();
            daftar.setNama(namaText.getText());
            daftar.setAlamat(alamat.getText());
            daftar.setNoRekamMedis(noRekamText.getText());
            Pasien.daftarPasien.add(daftar);      
        }
    }

}
