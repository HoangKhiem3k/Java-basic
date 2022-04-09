package swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.ArrayOfPeople;
import processfile.ReadFile;
import processfile.WriteFile;
import people.Date;
import people.People;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.FileNotFoundException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;

public class InputPeople extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JLabel lbpeople,lbID,lbFName,lbMiddleName,lbDate,lbCellPhone,lbHomePhone;
	private JTextField tfCodeID,tfFirstName,tfMiddleName,tfDay, tfMonth, tfYear,tfCellPhone,tfHomePhone;
	private JButton bSave, bBack,bReset;
	private JPanel pButton, panel;
	static String name;
	private JTextField tfFamilyNam;
	private JLabel lblNewLabel;
	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InputPeople frame = new InputPeople(name);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public InputPeople(String namef) {
		name = namef;
		super.setTitle("Input Information People");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 607);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lbpeople = new JLabel("Input Information For People");
		lbpeople.setForeground(Color.BLUE);
		lbpeople.setBounds(232, 0, 284, 42);
		lbpeople.setFont(new Font("Times New Roman", Font.BOLD, 20));
		contentPane.add(lbpeople);
		
		bSave = new JButton("SAVE");
		bSave.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		bSave.setBounds(423, 28, 134, 31);
		
		bBack = new JButton("BACK");
		bBack.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		bBack.setBounds(35, 28, 122, 31);
		
		pButton = new JPanel();
		pButton.setBounds(60, 501, 589, 69);
		pButton.setLayout(null);
		pButton.add(bSave);
		pButton.add(bBack);
		contentPane.add(pButton);
		
		bReset = new JButton("RESET");
		bReset.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		bReset.setBounds(217, 28, 129, 31);
		pButton.add(bReset);
		
		panel = new JPanel();
		panel.setBounds(10, 35, 699, 460);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lbID = new JLabel("Code ID :");
		lbID.setBounds(36, 10, 94, 28);
		panel.add(lbID);
		lbID.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		
		lbFName = new JLabel("First Name :");
		lbFName.setBounds(36, 60, 105, 28);
		panel.add(lbFName);
		lbFName.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		
		lbMiddleName = new JLabel("Middle Name :");
		lbMiddleName.setBounds(36, 110, 120, 28);
		panel.add(lbMiddleName);
		lbMiddleName.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		
		tfYear = new JTextField();
		tfYear.setBounds(422, 212, 94, 27);
		panel.add(tfYear);
		tfYear.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tfYear.setColumns(10);
		
		tfMonth = new JTextField();
		tfMonth.setBounds(322, 212, 94, 28);
		panel.add(tfMonth);
		tfMonth.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tfMonth.setColumns(10);
		
		tfDay = new JTextField();
		tfDay.setBounds(218, 212, 94, 27);
		panel.add(tfDay);
		tfDay.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tfDay.setColumns(10);
		
		lbDate = new JLabel("Birth Day :");
		lbDate.setBounds(36, 212, 105, 28);
		panel.add(lbDate);
		lbDate.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		
		
		tfMiddleName = new JTextField();
		tfMiddleName.setBounds(218, 110, 213, 27);
		panel.add(tfMiddleName);
		tfMiddleName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tfMiddleName.setColumns(10);
		
		tfFirstName = new JTextField();
		tfFirstName.setBounds(218, 60, 213, 27);
		panel.add(tfFirstName);
		tfFirstName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tfFirstName.setColumns(10);
		
		tfCodeID = new JTextField();
		tfCodeID.setBounds(218, 10, 213, 27);
		panel.add(tfCodeID);
		tfCodeID.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tfCodeID.setColumns(10);
		
		lbHomePhone = new JLabel("Home Phone Number :");
		lbHomePhone.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lbHomePhone.setBounds(36, 312, 172, 32);
		panel.add(lbHomePhone);
		
		lbCellPhone = new JLabel("Cell Phone Number :");
		lbCellPhone.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lbCellPhone.setBounds(36, 261, 172, 37);
		panel.add(lbCellPhone);
		
		tfCellPhone = new JTextField();
		tfCellPhone.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tfCellPhone.setBounds(218, 264, 213, 31);
		panel.add(tfCellPhone);
		tfCellPhone.setColumns(10);
		
		tfHomePhone = new JTextField();
		tfHomePhone.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tfHomePhone.setBounds(218, 315, 213, 29);
		panel.add(tfHomePhone);
		tfHomePhone.setColumns(10);
		
		JLabel lbFamilyNam = new JLabel("Family Name :");
		lbFamilyNam.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lbFamilyNam.setBounds(36, 159, 120, 28);
		panel.add(lbFamilyNam);
		
		tfFamilyNam = new JTextField();
		tfFamilyNam.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tfFamilyNam.setColumns(10);
		tfFamilyNam.setBounds(218, 160, 213, 27);
		panel.add(tfFamilyNam);
		
		lblNewLabel = new JLabel("DD/MM/YYYY");
		lblNewLabel.setBounds(526, 212, 94, 24);
		panel.add(lblNewLabel);
		
		
		bSave.addActionListener(this);
		bReset.addActionListener(this);
		bBack.addActionListener(this);
		
		
		
	}


	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==bSave) {
			
				people.People s= new people.People();
				Date d= new Date();
				
				s.setCodeID(tfCodeID.getText());
				s.setFirstName(tfFirstName.getText());
				s.setMiddleName(tfMiddleName.getText());
				s.setFamilyName(tfFamilyNam.getText());
				d.setDay(Integer.parseInt(tfDay.getText()));
				d.setMonth(Integer.parseInt(tfMonth.getText()));
				d.setYear(Integer.parseInt(tfYear.getText()));
				s.setDayOfBirth(d);
				s.setHomePhoneNumber(tfHomePhone.getText());
				s.setCellPhoneNumber(tfCellPhone.getText());
				
			
				
				ReadFile r= new ReadFile();
				
				ArrayOfPeople p=new ArrayOfPeople(r.read(name),name);
				p.add(s);
				

				
				WriteFile w= new WriteFile(name);
				People peo[]=p.returnNewArray();

				try {
					w.writeFile(peo);
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				this.dispose();
				new ListOfPeople(name).setVisible(true);;
			
		}
		if(e.getSource()==bReset) {
			this.dispose();
			new InputPeople(name).setVisible(true);
		}
		if(e.getSource()==bBack) {
			this.dispose();
			new Choose(name).setVisible(true);
		}
	}
	
}
