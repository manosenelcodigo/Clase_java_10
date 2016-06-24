
package com.manosenelcodigo.graficos;

import javax.swing.JFrame;

public class Marco extends JFrame {
    
    public void getVentana()
    {
        setBounds(200,50,1024,768);
        setVisible(true);
        setTitle("#manosenelcódigo");
        setResizable(true);
        
        Panel panel=new Panel();
        add(panel);
        panel.addBoton();
        
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
