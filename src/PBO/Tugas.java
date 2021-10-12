/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
/**
 *
 * @author Ronyzs
 */
public class Tugas {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        GridBagLayout layout = new GridBagLayout();
        panel.setLayout(layout);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 10, 5, 10);

        JLabel lbl = new JLabel("Masukan kata : ");
        JTextField tf = new JTextField();
        tf.setColumns(10);
        JButton btn1 = new JButton("Tampilkan");
        JButton btn2 = new JButton("Reset");

        frame.setSize(300, 300);
        frame.setTitle("Tampilkan Pesan");

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(btn1, gbc);
        btn1.addActionListener((e) -> {
            JOptionPane.showMessageDialog(null, tf.getText());
        });

        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(btn2, gbc);
        btn2.addActionListener((e) -> {
            tf.setText("");
        });
        
        gbc.gridx=0;
        gbc.gridy=1;
        panel.add(lbl, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(tf, gbc);

        frame.add(panel);
        frame.show();
    }
}
