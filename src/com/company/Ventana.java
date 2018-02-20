package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Ventana extends JFrame{

    private VentanaAnotacion ventanaAnotacion;
    private JLabel uno;
    private JLabel dos;
    private JLabel tres;
    private JLabel cuatro;
    private JLabel cinco;


    public Ventana(VentanaAnotacion ventanaAnotacion) {
        super("Resultados");
        setSize(200, 300);
        this.ventanaAnotacion = ventanaAnotacion;
        uno = new JLabel();
        dos = new JLabel();
        tres = new JLabel("Versus");
        cuatro = new JLabel();
        cinco = new JLabel();

        setLayout(new FlowLayout());
        add(uno);
        add(dos);
        add(tres);
        add(cuatro);
        add(cinco);
    }

    public void actualizarValores(String campo1, String campo2,String campo3, String campo4){

        uno.setText(campo1);
        dos.setText(campo2);
        cuatro.setText(campo3);
        cinco.setText(campo4);


    }

}
