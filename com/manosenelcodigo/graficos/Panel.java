
package com.manosenelcodigo.graficos;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Panel extends JPanel implements ActionListener {
    
    private JButton boton1;
    private JLabel label;
    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
    }
    
    public void addBoton()
    {
        this.label=new JLabel();
        this.boton1=new JButton("Presionar");
        this.label.setBounds(50, 00, 100, 100);
        this.label.setText("Haz clic en el botón");
        add(this.label);
        add(this.boton1);
        this.boton1.setToolTipText("Un texto de tipo tooltips");
        this.boton1.addActionListener((ActionListener)this);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        Object botonPulsado=e.getSource();
        if(botonPulsado==this.boton1)
        {
            setBackground(Color.WHITE);
            this.label.setText("otro texto al label con ñandú");
            this.label.setBounds(100,300,200,200);
            Font mifuente=new Font("Arial",Font.BOLD,30);
            this.label.setFont(mifuente);
            this.label.setForeground(Color.red);
            this.boton1.setText("otro texto para el botón");
        }
    }
    
    
    
}
