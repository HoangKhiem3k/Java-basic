package swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;

public class OpenFile extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtNameOfFile;
	static String name;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OpenFile frame = new OpenFile();
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
	public OpenFile() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setTitle("Input Name of File ");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNameFile = new JLabel("Enter Name of File: ");
		lblNameFile.setForeground(Color.BLUE);
		lblNameFile.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNameFile.setBounds(10, 11, 124, 33);
		contentPane.add(lblNameFile);
		
		txtNameOfFile = new JTextField();
		txtNameOfFile.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		txtNameOfFile.setHorizontalAlignment(SwingConstants.LEFT);
		txtNameOfFile.setBounds(170, 11, 187, 33);
		contentPane.add(txtNameOfFile);
		txtNameOfFile.setColumns(10);
		
		JButton bFindFile = new JButton("Open");
		bFindFile.setBounds(45, 146, 124, 40);
		bFindFile.addActionListener(this);
		
		contentPane.add(bFindFile);
		
		JButton bBacktoMenu = new JButton("Back");
		bBacktoMenu.addActionListener(this);
		bBacktoMenu.setBounds(281, 146, 115, 40);
		contentPane.add(bBacktoMenu);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand()=="Back") {
			 new Welcome().setVisible(true);;
			 this.hide();
		}
		if(e.getActionCommand()=="Open") {
			if(txtNameOfFile.getText().equals("")) {
				JOptionPane.showMessageDialog(this, "File name is empty, Enter name of file");
			}
			else {
				name=txtNameOfFile.getText()+".txt";
				File f=new File(name);
				if(f.exists()) {
					this.dispose();
					new ListOfPeople(name).setVisible(true);
					
				}
				else {
					JOptionPane.showMessageDialog(this, "File not found !");
				}
				
				
			}
			 
		}
		
	}

}
