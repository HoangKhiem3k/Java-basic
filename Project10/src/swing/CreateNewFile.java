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
import java.io.File;
import java.io.IOException;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;

public class CreateNewFile extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField tfNameOfFile;
	static String name;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateNewFile frame = new CreateNewFile();
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
	public CreateNewFile() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNameofFile = new JLabel("Enter Name of File you want to create :");
		lblNameofFile.setForeground(Color.BLUE);
		lblNameofFile.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNameofFile.setBounds(10, 11, 258, 43);
		contentPane.add(lblNameofFile);
		
		tfNameOfFile = new JTextField();
		tfNameOfFile.setBounds(10, 47, 226, 38);
		contentPane.add(tfNameOfFile);
		tfNameOfFile.setColumns(10);
		
		JButton bCreatFile = new JButton("Create File");
		bCreatFile.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		bCreatFile.setBounds(53, 143, 123, 43);
		bCreatFile.addActionListener(this);
		contentPane.add(bCreatFile);
		
		JButton bBacktoMenu = new JButton("Back");
		bBacktoMenu.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		bBacktoMenu.setBounds(265, 143, 114, 43);
		bBacktoMenu.addActionListener(this);
		contentPane.add(bBacktoMenu);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand()=="Back") {
			 new Welcome().setVisible(true);;
			 this.hide();
		}
		if(e.getActionCommand()=="Create File") {
			if(tfNameOfFile.getText().equals("")) 
				JOptionPane.showMessageDialog(this, "File name is empty, Enter name of file");
			
			else {
				name=tfNameOfFile.getText()+".txt";
				File f=new File(name);
				if(!f.exists()) {
					try {
						f.createNewFile();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					this.dispose();
					new ListOfPeople(name).setVisible(true);
					this.hide();
				}
				else {
					JOptionPane.showMessageDialog(this, "File already exists, please create another file!");
				}
				
				
			}
			
		}
	}
}
