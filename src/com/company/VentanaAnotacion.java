package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaAnotacion extends JFrame {
    private JLabel equipo1;
    private JLabel equipo2;
    private JTextField campo1;
    private JTextField campo2;
    private JTextField campo3;
    private JTextField campo4;
    private JButton boton;
    private Ventana ventana;


    public VentanaAnotacion() {

        super("Scoreboard");
        setSize(250, 300);

        equipo1 = new JLabel("Equipo 1");
        equipo2 = new JLabel("Equipo 2");
        campo1 = new JTextField(10);
        campo2 = new JTextField(2);
        campo3 = new JTextField(10);
        campo4 = new JTextField(2);
        boton = new JButton("Enter");


        setLayout(new FlowLayout());


        add(equipo1);
        add(campo1);
        add(campo2);
        add(equipo2);
        add(campo3);
        add(campo4);
        add(boton);

        ventana = new Ventana(this);
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                ventana.actualizarValores(campo1.getText(),campo2.getText(),campo3.getText(),campo4.getText());
                ventana.setVisible(true);
            }
        });

    }

    public JTextField getCampo1() {
        return campo1;
    }

    public void setCampo1(JTextField campo1) {
        this.campo1 = campo1;
    }

    public JTextField getCampo2() {
        return campo2;
    }

    public void setCampo2(JTextField campo2) {
        this.campo2 = campo2;
    }

    public JTextField getCampo3() {
        return campo3;
    }

    public void setCampo3(JTextField campo3) {
        this.campo3 = campo3;
    }

    public JTextField getCampo4() {
        return campo4;
    }

    public void setCampo4(JTextField campo4) {
        this.campo4 = campo4;
    }

}
