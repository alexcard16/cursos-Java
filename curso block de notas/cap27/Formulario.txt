import javax.swing.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener{
  JButton boton1;
  private JLabel label1;
  private JLabel label2;
  public Formulario(){
   setLayout(null);
   boton1 = new JButton("cerrar");
   boton1.setBounds(300,250,100,30);
   add(boton1);
   boton1.addActionListener(this);
   label1 = new JLabel("interface grafic");
   label1.setBounds(10,20,300,30);
   add(label1);
   label2= new JLabel("press the button cerrar");
   label2.setBounds(10,40,400,60); 
   add(label2);
 }

  public void actionPerformed(ActionEvent e){
   if(e.getSource() == boton1){
    System.exit(0);
  }
 }

  public static void main(String args[]){
   Formulario formulario1 = new Formulario();
   formulario1.setBounds(0,0,450,350);
   formulario1.setResizable(false);
   formulario1.setVisible(true);
   formulario1.setLocationRelativeTo(null);
 }
}