package project;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame15 extends JFrame implements ActionListener{
	private JPanel p1=new JPanel();
	private JLabel l0 = new JLabel(" Pizza World ");
	private JLabel l1 = new JLabel("Name-Surname ");
	private JTextField t1=new JTextField(" ",25);
	private JLabel l2 = new JLabel("Address ");
	private JTextField t2=new JTextField(" ",25);
	private JLabel l3 = new JLabel("E-mail ");
	private JTextField t3=new JTextField(" ",25);
	private JLabel l4 = new JLabel("Phone ");
	private JTextField t4=new JTextField(" ",25);
	private JButton b1=new JButton("Select your pizza");
	String [] list1={"Neapolitan","Chicken","Vegeterian","Texas BBQ","Cheese&Tomato"};
	private JComboBox c1=new JComboBox(list1);
	
	private JLabel l5 = new JLabel("On the side of...");
	
	private JCheckBox cb1=new JCheckBox("garlic bread",false);
	private JCheckBox cb2=new JCheckBox("potato",false);
	private JCheckBox cb3=new JCheckBox("chicken wings",false);
	private JCheckBox cb4=new JCheckBox("meatballs",false);

	private JLabel l6 = new JLabel("Size");

	private JCheckBox cb5=new JCheckBox("small",false);
	private JCheckBox cb6=new JCheckBox("medium",false);
	private JCheckBox cb7=new JCheckBox("large",false);
	
	
	private JLabel l7 = new JLabel("Drinks");
	
	
	private JCheckBox cb8=new JCheckBox("Coca-Cola",false);
	private JCheckBox cb9=new JCheckBox("Diet Coke",false);
	private JCheckBox cb10=new JCheckBox("Sprite",false);
	private JCheckBox cb11=new JCheckBox("Fanta",false);
	
	private JButton b2=new JButton("Get Quote");
	private JTextField t5=new JTextField(" ",8);
	private JButton b3=new JButton("Confirm");
	private JButton b4=new JButton("Cancel");
	private JButton b5=new JButton("Print");
	
	int numb = 2;
	private Pizzaworld b =new Pizzaworld(numb);
	
	public MyFrame15(String s){
		super(s);
		Container content=getContentPane();
		content.setLayout(new FlowLayout());
		Font f=new Font("TimesRoman", Font.BOLD+Font.ITALIC,25);
		p1.setFont(f);
	
		
		
		content.setBackground(Color.PINK);
		p1.setBackground(Color.PINK);
		cb1.setBackground(Color.PINK);
		cb2.setBackground(Color.PINK);
		cb3.setBackground(Color.PINK);
		cb4.setBackground(Color.PINK);
		cb5.setBackground(Color.PINK);
		cb6.setBackground(Color.PINK);
		cb7.setBackground(Color.PINK);
		cb8.setBackground(Color.PINK);
		cb9.setBackground(Color.PINK);
		cb10.setBackground(Color.PINK);
		cb11.setBackground(Color.PINK);
		p1.setLayout(new GridLayout(31,1));
		
		l0.setFont(f); 
		p1.add(l0);
		p1.add(l1); p1.add(t1);
		p1.add(l2); p1.add(t2);
		p1.add(l3); p1.add(t3);
		p1.add(l4); p1.add(t4);
		p1.add(b1); p1.add(c1);
		p1.add(l5);
		p1.add(cb1);
		p1.add(cb2);
		p1.add(cb3);
		p1.add(cb4);
		p1.add(l6);
		p1.add(cb5);
		p1.add(cb6);
		p1.add(cb7);
		p1.add(l7);
		p1.add(cb8);
		p1.add(cb9);
		p1.add(cb10);
		p1.add(cb11);
		p1.add(b2); p1.add(t5);
		p1.add(b3);	p1.add(b4);	
		p1.add(b5);	
		
		content.add(p1);
		
		b1.addActionListener(this);   
		b2.addActionListener(this);   
		b3.addActionListener(this);   
		b4.addActionListener(this);   
		b5.addActionListener(this);   
		refresh();
		setSize(400,1050);
		setVisible(true);}
	
	public  void  refresh(){
		t5.setText("Delivery Charge €"+ b.readTotal());
	
	}



	public void actionPerformed(ActionEvent e){
        
	  	Object target=e.getSource();
	  	
	 	if (target==b2){
	 		b.newtotal(2);
	 		t5.setText("Delivery Charge €"+ b.readTotal());
	 		String pizza = "";
			String size = "";
			String extra = "";
			String drink = "";
	 		
	 		int type=c1.getSelectedIndex();
	 		int res=0;
	 		if(type==0){
	 			res=(int) 10.00; pizza = "Neapolitan";
	 			}
	 		if(type==1){
	 			res=(int) 12.00; pizza = "Chicken";
	 		}
	 		if(type==2){
	 			res=(int) 10.00; pizza = "Vegetarian";
	 		}
	 		if(type==3){
	 			res=(int) 13.00; pizza = "Texas BBQ";
	 		}
	 		if(type==4){
	 			res=(int) 11.00; pizza = "Cheese and Tomato";
	 		}
	 	
	 		boolean gb=cb1.isSelected();
	 		boolean pt=cb2.isSelected();
	 		boolean cw=cb3.isSelected();
	 		boolean mb=cb4.isSelected();
	 		boolean small=cb5.isSelected();
	 		boolean medium=cb6.isSelected();
	 		boolean large=cb7.isSelected();
	 		boolean cola=cb8.isSelected();
	 		boolean diet=cb9.isSelected();
	 		boolean sprite=cb10.isSelected();
	 		boolean fanta=cb11.isSelected();

	 		

	 		if(gb==true){res=(int) (res+6.00); extra = "Garlic Bread";}
	 		if(pt==true){res=(int) (res+4.00); extra = "Potato";}
	 		if(cw==true){res=(int) (res+6.00); extra = "Chicken Wings";}
	 		if(mb==true){res=(int) (res+5.00); extra = "Meatballs";}
	 		
	 		if(small==true){res=(int) (res+0.00); size = "Small";}
	 		if(medium==true){res=(int) (res+2.00); size = "Medium";}
	 		if(large==true){res=(int) (res+4.00); size = "Large";}
	 		
	 		if(cola==true){res=(int) (res+1.00); drink = "Coca-Cola";}
	 		if(diet==true){res=(int) (res+1.00); drink = "Diet Coke";}
	 		if(sprite==true){res=(int) (res+1.00); drink = "Sprite";}
	 		if(fanta==true){res=(int) (res+1.00); drink = "Fanta";}
	 		
	 		res = b.returnres() + res;
	 		t5.setText(" €" +res);
	 		b.newtotal(res);
	 		b.details(pizza, size, extra, drink);
	 	
	   
	 }
	 	if (target==b3){
      		MyFrame16 mf16=new MyFrame16("Confirm"); 
	 	}
		if (target==b4){
      		System.exit(0); }
		
		if (target==b5)
		{
		      b.printDetails();
		}
	}
}
	