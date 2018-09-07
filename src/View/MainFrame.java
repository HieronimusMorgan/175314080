/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author asus
 */
public class MainFrame extends JFrame {

    private JMenuBar MenuBar;
    private JMenu fileMenu;
    private JMenuItem exitMenuItem;

    public MainFrame() {
        init();
    }

    public void init() {

        MenuBar = new JMenuBar();
        fileMenu = new JMenu("File");

        MenuBar.add(fileMenu);
        this.setJMenuBar(MenuBar);

        exitMenuItem = new JMenuItem("Exit");
        fileMenu.add(exitMenuItem);
        MenuBar.add(fileMenu);
    }

}
