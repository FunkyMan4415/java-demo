package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JList;

public class PersonenListe extends JFrame{

    public PersonenListe() {
        setMinimumSize(new Dimension(300, 200));
        
        JList list = new JList();
        getContentPane().add(list, BorderLayout.CENTER);
        
        this.setVisible(true);
    }

}
