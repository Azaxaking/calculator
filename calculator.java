package calculator;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.html.*;

import java.awt.Window.Type;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButtonMenuItem;
import java.awt.Label;
import java.awt.Color;
import java.awt.Point;
import java.awt.Rectangle;

public class calculator extends JFrame {

	private ButtonGroup bg = new ButtonGroup();
	
	private JPanel contentPane;
	private JTextField txtHeyy;	
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnNewRadioButton_1;
	private JButton btnNewButton;
	private JButton button;
	private JButton button_1;
	private JButton button_2;
	private JButton button_3;
	private JButton button_4;
	private JButton button_5;
	private JButton button_6;
	private JButton button_7;
	private JButton button_8;
	private JButton button_9;
	private JButton button_10;
	private JButton button_11;
	private JButton button_12;
	private JButton button_13;
	private JButton button_14;
	private JButton button_15;
	private JButton button_16;
	private JButton btnX_1;
	private JButton btnX;
	private JButton btnCe;
	private Label label;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator frame = new calculator();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	double ans,num;
	int calculation;
	
	public void aritmetic_operation() {
		switch(calculation){
		case 1: //Addition
			//convert String into Double
			ans = num + Double.parseDouble(txtHeyy.getText());
			//convert Double into String
			txtHeyy.setText(Double.toString(ans));
			break;
			
		case 2: // Subtraction
			ans = num - Double.parseDouble(txtHeyy.getText());
			txtHeyy.setText(Double.toString(ans));
			break;
			
		case 3: // Multipication 
			ans = num * Double.parseDouble(txtHeyy.getText());
			txtHeyy.setText(Double.toString(ans));
			break;
			
		case 4: // Division
			ans = num / Double.parseDouble(txtHeyy.getText());
			txtHeyy.setText(Double.toString(ans));
			break;
		case 5: // Square root
			ans = Math.sqrt(num);
			txtHeyy.setText(Double.toString(ans));
			break;
		case 6: // Percent
			ans = (num * Double.parseDouble(txtHeyy.getText()))/100;
			txtHeyy.setText(Double.toString(ans));
			break;
		case 7: //
			ans = Math.pow(num, Double.parseDouble(txtHeyy.getText()));
			txtHeyy.setText(Double.toString(ans));
			break;
			}
	}
	
public void enable() {       
	rdbtnNewRadioButton_1.setEnabled(true);   // OFF button enabled
	rdbtnNewRadioButton.setEnabled(false);    // ON button disabled
	btnNewButton.setEnabled(true);		
	button_10.setEnabled(true);
	button_11.setEnabled(true);
	button_12.setEnabled(true);
	button_13.setEnabled(true);
	button_14.setEnabled(true);
	button_15.setEnabled(true);
	button_16.setEnabled(true);
	btnX_1.setEnabled(true);	
	button_1.setEnabled(true);
	button_2.setEnabled(true);
	button_3.setEnabled(true);
	button_4.setEnabled(true);
	button_5.setEnabled(true);
	button_6.setEnabled(true);
	button_7.setEnabled(true);
	button_8.setEnabled(true);
	button_9.setEnabled(true);				
	txtHeyy.setEnabled(true);	
	button.setEnabled(true);
	btnCe.setEnabled(true);
	btnX.setEnabled(true);	
}
public void disable() {	
	    rdbtnNewRadioButton.setEnabled(true);	// ON button enabled
	    rdbtnNewRadioButton_1.setEnabled(false); // OFF button disbled
		btnNewButton.setEnabled(false);		
		button_10.setEnabled(false);
		button_11.setEnabled(false);
		button_12.setEnabled(false);
		button_13.setEnabled(false);
		button_14.setEnabled(false);
		button_15.setEnabled(false);
		button_16.setEnabled(false);
		btnX_1.setEnabled(false);	
		button_1.setEnabled(false);
		button_2.setEnabled(false);
		button_3.setEnabled(false);
		button_4.setEnabled(false);
		button_5.setEnabled(false);
		button_6.setEnabled(false);
		button_7.setEnabled(false);
		button_8.setEnabled(false);
		button_9.setEnabled(false);				
		txtHeyy.setEnabled(false);	
		button.setEnabled(false);
		btnCe.setEnabled(false);
		btnX.setEnabled(false);	
	}
	
	public calculator() {
		setLocation(550,300);
		setMaximizedBounds(new Rectangle(0, 0, 0, 0));
		
		
		  
		setResizable(false);
		setTitle("Kalkulyator");
		setFont(new Font("Tahoma", Font.BOLD, 15));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(550, 250, 207, 395);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		txtHeyy = new JTextField();
		txtHeyy.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtHeyy.setHorizontalAlignment(SwingConstants.RIGHT);
		txtHeyy.setBounds(10, 25, 185, 54);		
		txtHeyy.setColumns(10);
		contentPane.add(txtHeyy);
		
		
	    rdbtnNewRadioButton = new JRadioButton("ON");
	    rdbtnNewRadioButton.setEnabled(false);
	    rdbtnNewRadioButton.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		enable();   //call enable method here
	    	}
	    });
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnNewRadioButton.setBounds(4, 99, 43, 15);
		contentPane.add(rdbtnNewRadioButton);
		
		rdbtnNewRadioButton_1 = new JRadioButton("OFF");
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				disable(); // call disable method here
			}
		});
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnNewRadioButton_1.setBounds(4, 117, 45, 15);
		contentPane.add(rdbtnNewRadioButton_1);
		
		bg.add(rdbtnNewRadioButton);
		bg.add(rdbtnNewRadioButton_1);
		
		btnNewButton = new JButton("3");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtHeyy.setText(txtHeyy.getText()+"3");
			}
		});
		btnNewButton.setBounds(105, 175, 43, 32);
		contentPane.add(btnNewButton);
		
	    button = new JButton("1");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				txtHeyy.setText(txtHeyy.getText()+"1");
				
			}
		});
		button.setBounds(6, 175, 43, 32);
		contentPane.add(button);
		
		 button_1 = new JButton("2");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtHeyy.setText(txtHeyy.getText()+"2");
			}
		});
		button_1.setBounds(57, 175, 43, 32);
		contentPane.add(button_1);
		
		 button_2 = new JButton("4");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				txtHeyy.setText(txtHeyy.getText()+"4");
			}
		});
		button_2.setBounds(6, 214, 43, 32);
		contentPane.add(button_2);
		
		 button_3 = new JButton("5");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtHeyy.setText(txtHeyy.getText()+"5");
			}
		});
		button_3.setBounds(57, 214, 43, 32);
		contentPane.add(button_3);
		
		 button_4 = new JButton("6");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtHeyy.setText(txtHeyy.getText()+"6");
			}
		});
		button_4.setBounds(105, 214, 43, 32);
		contentPane.add(button_4);
		
		 button_5 = new JButton("7");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtHeyy.setText(txtHeyy.getText()+"7");
			}
		});
		button_5.setBounds(6, 253, 43, 32);
		contentPane.add(button_5);
		
		 button_6 = new JButton("8");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtHeyy.setText(txtHeyy.getText()+"8");
			}
		});
		button_6.setBounds(57, 253, 43, 32);
		contentPane.add(button_6);
		
		 button_7 = new JButton(txtHeyy.getText()+"9");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtHeyy.setText(txtHeyy.getText()+"9");
			}
		});
		button_7.setBounds(105, 253, 43, 32);
		contentPane.add(button_7);
		
		 button_8 = new JButton("=");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				aritmetic_operation();
				label.setText("");
			}
		});
		button_8.setBounds(105, 291, 90, 32);
		contentPane.add(button_8);
		
		 button_9 = new JButton(txtHeyy.getText()+"0");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtHeyy.setText(txtHeyy.getText()+"0");
			}
		});
		button_9.setBounds(57, 291, 43, 32);
		contentPane.add(button_9);
		
		 button_10 = new JButton(".");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtHeyy.setText(txtHeyy.getText()+".");
			}
		});
		button_10.setBounds(6, 291, 43, 32);
		contentPane.add(button_10);
		
		 button_11 = new JButton("+");
		 button_11.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		num = Double.parseDouble(txtHeyy.getText());
		 		calculation = 1;
		 		txtHeyy.setText("");
		 		label.setText(num + "+");		 		
		 	}
		 });
		button_11.setBounds(152, 139, 43, 32);
		contentPane.add(button_11);
		
		 button_12 = new JButton(txtHeyy.getText()+"-");
		 button_12.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		num = Double.parseDouble(txtHeyy.getText());
		 		calculation = 2;
		 		txtHeyy.setText("");
		 		label.setText(num + "-");
		 	}
		 });
		button_12.setBounds(152, 175, 43, 32);
		contentPane.add(button_12);
		
		 btnX = new JButton(txtHeyy.getText()+"x");
		 btnX.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		num = Double.parseDouble(txtHeyy.getText());
		 		calculation = 3;
		 		txtHeyy.setText("");
		 		label.setText(num + "x");
		 		}
		 });
		btnX.setBounds(152, 214, 43, 32);
		contentPane.add(btnX);
		
		 button_14 = new JButton(txtHeyy.getText()+"/");
		 button_14.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		num = Double.parseDouble(txtHeyy.getText());
		 		calculation = 4;
		 		txtHeyy.setText("");
		 		label.setText(num + "/");
		 	}
		 });
		button_14.setBounds(152, 253, 43, 32);
		contentPane.add(button_14);
		
		 button_13 = new JButton(txtHeyy.getText()+"<--");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				int length = txtHeyy.getText().length();
				int num = txtHeyy.getText().length() - 1;
				
				if(length > 0) {
					//"txtHeyy" into to StringBuilder
					StringBuilder obj = new StringBuilder(txtHeyy.getText());
					//and delete last character
					obj.deleteCharAt(num);
					//next step StringBuilder back to into String  
					String str = obj.toString();
					//at the end String set "txtHeyy" object.
					txtHeyy.setText(str);					
				}				
			}
		});
		button_13.setFont(new Font("Tahoma", Font.PLAIN, 12));
		button_13.setBounds(104, 101, 91, 32);
		contentPane.add(button_13);
		
		 btnCe = new JButton(txtHeyy.getText()+"C");
		 btnCe.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		txtHeyy.setText("");
		 		label.setText("");
		 	}
		 });
		btnCe.setBounds(57, 101, 43, 32);
		contentPane.add(btnCe);
		
		label = new Label("");
		label.setForeground(Color.RED);
		label.setFont(new Font("Dialog", Font.BOLD, 12));
		label.setAlignment(Label.RIGHT);
		label.setBounds(142, 0, 51, 22);
		contentPane.add(label);
		
		 button_15 = new JButton("%");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(txtHeyy.getText());
				calculation = 6;
				txtHeyy.setText("");
				label.setText(num+"%");
			}
		});
		button_15.setBounds(57, 139, 43, 32);
		contentPane.add(button_15);
		
		 button_16 = new JButton("\u221A");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num = Double.parseDouble(txtHeyy.getText());
				calculation = 5;
				txtHeyy.setText("√");
				label.setText("√"+num);				
			}
		});
		button_16.setBounds(6, 139, 46, 32);
		contentPane.add(button_16);
		
		
		
		btnX_1 = new JButton("<html>Y<sup>x</sup></html>");
		btnX_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(txtHeyy.getText());
				calculation = 7;
				txtHeyy.setText("");
				label.setText(num+"^");
			}
		});
		btnX_1.setBounds(105, 139, 43, 32);
		contentPane.add(btnX_1);
		
		JLabel lblCreatednamiqbay = new JLabel("Created: @namiq_bay");
		lblCreatednamiqbay.setFont(new Font("Times New Roman", Font.ITALIC, 11));
		lblCreatednamiqbay.setBounds(45, 337, 154, 25);
		contentPane.add(lblCreatednamiqbay);
	}
}
