package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

import logic.Person;

public class Main extends JFrame{
    private JTextField txtNachname;
    private JTextField txtEmail;
    private JTextField txtVorname;
    private JTextField txtTelefon;
    private ArrayList<Person> pListe = null;

    public Main() {
        getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 17));
        setMinimumSize(new Dimension(300, 400));
        getContentPane().setLayout(new BorderLayout(0, 0));
        
        JPanel panel = new JPanel();
        getContentPane().add(panel, BorderLayout.WEST);
        
        JLabel lblVorname = new JLabel("Vorname:");
        
        JLabel lblNachname = new JLabel("Nachname:");
        
        JLabel lblEmail = new JLabel("E-Mail:");
        
        JLabel lblTelefon = new JLabel("Telefon:");
        GroupLayout gl_panel = new GroupLayout(panel);
        gl_panel.setHorizontalGroup(
            gl_panel.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_panel.createSequentialGroup()
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblVorname)
                    .addGap(20))
                .addGroup(gl_panel.createSequentialGroup()
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNachname)
                    .addContainerGap())
                .addGroup(gl_panel.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblEmail)
                    .addContainerGap(37, Short.MAX_VALUE))
                .addGroup(gl_panel.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblTelefon)
                    .addContainerGap(29, Short.MAX_VALUE))
        );
        gl_panel.setVerticalGroup(
            gl_panel.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_panel.createSequentialGroup()
                    .addGap(51)
                    .addComponent(lblVorname)
                    .addGap(32)
                    .addComponent(lblNachname)
                    .addGap(27)
                    .addComponent(lblEmail)
                    .addGap(28)
                    .addComponent(lblTelefon)
                    .addContainerGap(79, Short.MAX_VALUE))
        );
        panel.setLayout(gl_panel);
        
        JPanel panel_1 = new JPanel();
        getContentPane().add(panel_1, BorderLayout.EAST);
        
        txtVorname = new JTextField();
        txtVorname.setColumns(10);
        
        txtNachname = new JTextField();
        txtNachname.setColumns(10);
        
        txtEmail = new JTextField();
        txtEmail.setColumns(10);
        
        txtTelefon = new JTextField();
        txtTelefon.setColumns(10);
        GroupLayout gl_panel_1 = new GroupLayout(panel_1);
        gl_panel_1.setHorizontalGroup(
            gl_panel_1.createParallelGroup(Alignment.TRAILING)
                .addGroup(gl_panel_1.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
                        .addComponent(txtTelefon, GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                        .addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
                            .addComponent(txtVorname, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNachname, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap())
        );
        gl_panel_1.setVerticalGroup(
            gl_panel_1.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_panel_1.createSequentialGroup()
                    .addGap(51)
                    .addComponent(txtVorname, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(27)
                    .addComponent(txtNachname, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(18)
                    .addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(18)
                    .addComponent(txtTelefon, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(79, Short.MAX_VALUE))
        );
        panel_1.setLayout(gl_panel_1);
        
        JPanel panel_2 = new JPanel();
        getContentPane().add(panel_2, BorderLayout.SOUTH);
        
        JButton btnAnzeigen = new JButton("Anzeigen");
        btnAnzeigen.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                schowPersons(pListe);
            }
        });
        
        JButton btnAdd = new JButton("Anlegen");
        btnAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                // TODO: add Pattern!
                String vorname = txtVorname.getText().trim();
                String nachname = txtNachname.getText().trim();
                String email = txtEmail.getText().trim();
                String telefon = txtTelefon.getText().trim();
                
                Person p = addPerson(vorname, nachname, email, telefon);
                
                System.out.println(p);
                
            }
        });
        GroupLayout gl_panel_2 = new GroupLayout(panel_2);
        gl_panel_2.setHorizontalGroup(
            gl_panel_2.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_panel_2.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(btnAdd)
                    .addPreferredGap(ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                    .addComponent(btnAnzeigen)
                    .addGap(31))
        );
        gl_panel_2.setVerticalGroup(
            gl_panel_2.createParallelGroup(Alignment.LEADING)
                .addGroup(Alignment.TRAILING, gl_panel_2.createSequentialGroup()
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
                        .addComponent(btnAdd)
                        .addComponent(btnAnzeigen))
                    .addContainerGap())
        );
        panel_2.setLayout(gl_panel_2);
        
        JPanel panel_3 = new JPanel();
        getContentPane().add(panel_3, BorderLayout.NORTH);
        
        JLabel lblNeuenKontaktAnlegen = new JLabel("Neuen Kontakt anlegen:");
        lblNeuenKontaktAnlegen.setFont(new Font("Tahoma", Font.PLAIN, 20));
        panel_3.add(lblNeuenKontaktAnlegen);
        
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }
    
    protected void schowPersons(ArrayList<Person> pListe) {
       // if (pListe != null) {
          PersonenListe pL =  new PersonenListe();       
        //}
        
    }

    private Person addPerson(String vorname, String nachname, String email, String telefon) {
        Person p = new Person(vorname, nachname, email, telefon);
        
        return p;
    }
    
    

    public static void main(String[] args) {
        new Main().setVisible(true);

    }
}
