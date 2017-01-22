package com.example.shopping;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by Jesse on 22/01/2017.
 */
public class ShoppingGrid {
    public ShoppingGrid() {
        initTable();

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });


    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("ShoppingGrid");
        frame.setContentPane(new ShoppingGrid().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public void initTable() {
        String[] columnNames = {"First Name",
                "Last Name",
                "Sport",
                "# of Years",
                "Vegetarian"};

        Object[][] data = {
                {"Kathy", "Smith",
                        "Snowboarding", new Integer(5), new Boolean(false)},
                {"John", "Doe",
                        "Rowing", new Integer(3), new Boolean(true)},
                {"Sue", "Black",
                        "Knitting", new Integer(2), new Boolean(false)},
                {"Jane", "White",
                        "Speed reading", new Integer(20), new Boolean(true)},
                {"Joe", "Brown",
                        "Pool", new Integer(10), new Boolean(false)}
        };

        table1 = new JTable(data, columnNames);
    }



    private JTable table1;
    private JPanel panel1;
    private JButton addButton;
    private JButton editButton;
    private JComboBox comboBox1;


}
