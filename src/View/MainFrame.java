/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


/**
 *
 * @author asus
 */
public class MainFrame extends JFrame implements ActionListener {

    private JMenuBar MenuBar;
    private JMenu fileMenu;
    private JMenuItem exitMenuItem;
    private JMenuItem TambahPasien;
    private JMenuItem TambahAntrian;

    public MainFrame() {
        init();
    }

    public void init() {
        //membuat menuBar dengan nama Pasien
        MenuBar = new JMenuBar();
        fileMenu = new JMenu("Pasien");

        MenuBar.add(fileMenu);
        this.setJMenuBar(MenuBar);
        //menambah MenuBar dengan ini TambahPasien, TambahAntrian, exitMenuItem
        exitMenuItem = new JMenuItem("Exit");
        TambahPasien = new JMenuItem("Tambah Pasien Baru");
        TambahAntrian = new JMenuItem("Tambah Antrian");
        
        
        fileMenu.add(TambahPasien);
        fileMenu.add(TambahAntrian);
        fileMenu.add(exitMenuItem);
        MenuBar.add(fileMenu);

        exitMenuItem.addActionListener(this);
        TambahPasien.addActionListener(this);
        TambahAntrian.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Jika klik exitMenuItem maka akan keluar
        if (e.getSource() == exitMenuItem) {
            System.exit(0);
        }
        // Jika klik TambahPasien maka akan menampilkan tampilan TambahPasienDialog
        if (e.getSource() == TambahPasien) {
            TambahPasienBaruDialog tampil = new TambahPasienBaruDialog();
            tampil.setSize(400, 500);
            tampil.setVisible(true);
        }
        // Jika klik TambahAntrian maka akan menampilkan tampilan TambahAntrianDialog
        if (e.getSource() == TambahAntrian) {
            TambahAntrianDialog tampil = new TambahAntrianDialog();
            tampil.setSize(400, 500);
            tampil.setVisible(true);
        }
    }

}
