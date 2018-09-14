/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

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
        MenuBar = new JMenuBar();
        fileMenu = new JMenu("Pasien");

        MenuBar.add(fileMenu);
        this.setJMenuBar(MenuBar);

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
        if (e.getSource() == exitMenuItem) {
            System.exit(0);
        }
        if (e.getSource() == TambahPasien) {
            TambahPasienDialog tampil = new TambahPasienDialog();
            tampil.setSize(300, 400);
            tampil.setVisible(true);
        }
        if (e.getSource() == TambahAntrian) {
            TambahAntrianDialog tampil = new TambahAntrianDialog();
            tampil.setSize(300, 400);
            tampil.setVisible(true);
        }
    }

}
