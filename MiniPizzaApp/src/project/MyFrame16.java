package project;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame16 extends JFrame implements ActionListener {
private JLabel l0 = new JLabel("Your order has been approved and the delivery is on the way :) ");
private JButton b1=new JButton("Exit");
private JButton b2=new JButton("Return");
private JPanel p1=new JPanel();
private JPanel p2=new JPanel();

public MyFrame16(String s){
	super(s);
	Container content=getContentPane();
	content.setLayout(new BorderLayout());
	content.setBackground(Color.PINK);
	p1.setBackground(Color.PINK);
	p2.setBackground(Color.PINK);
	Font f=new Font("TimesRoman", Font.BOLD,15);
	p1.setLayout(new GridLayout(2,1));
	l0.setFont(f); 
	p1.add(l0);
	p2.add(b2); 
	p2.add(b1); 
	
	content.add(p1, BorderLayout.CENTER);
	content.add(p2, BorderLayout.SOUTH);
	b2.addActionListener(this);
	b1.addActionListener(this);  

	setSize(470,200);    setVisible(true);}
	
public void actionPerformed(ActionEvent e){
    
  	Object target=e.getSource();
 	if (target==b1){
          		System.exit(0);
             }
 	if (target==b2){
 		MyFrame15 mf15=new MyFrame15("Return"); 
     }
}
}