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

import java.awt.event.ActionListener;

import java.io.FileNotFoundException;
import java.awt.event.ActionEvent;

public class InputProfessor extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lbProfess,lbCodeID,lbFirstName,lbMiddleName,lbDate,lbRank,
	lbDepartment,lbOfficeNumber,lbOfficePhone;
	private JTextField tfCodeID,tfFirstName,tfMiddleName,tfDay, tfMonth, tfYear,tfDepartment,tfOfficeNumber,tfOfficePhone;
	private JButton bSave, bBack,bReset;
	private JPanel pButton, panel;
	private JLabel lbHomePhone;
	private JLabel lbCellPhone;
	private JTextField tfCellPhone;
	private JTextField tfHomePhone;
	static String name;
	private JComboBox comboBox;
	private JLabel lblFamilyName;
	private JTextField tfFamilyNam;
	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InputProfessor frame = new InputProfessor(name);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public InputProfessor(String namef) {
		name=namef;
		super.setTitle("Input Professor ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 684);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lbProfess = new JLabel("Input Information For Professor");
		lbProfess.setForeground(Color.BLUE);
		lbProfess.setBounds(232, 0, 318, 42);
		lbProfess.setFont(new Font("Times New Roman", Font.BOLD, 20));
		contentPane.add(lbProfess);
		
		bSave = new JButton("SAVE");
		bSave.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		bSave.setBounds(29, 28, 92, 31);
		
		bBack = new JButton("BACK");
		bBack.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		bBack.setBounds(470, 28, 84, 31);
		
		pButton = new JPanel();
		pButton.setBounds(60, 565, 589, 69);
		pButton.setLayout(null);
		pButton.add(bSave);
		pButton.add(bBack);
		contentPane.add(pButton);
		
		bReset = new JButton("RESET");
		bReset.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		bReset.setBounds(255, 28, 92, 31);
		pButton.add(bReset);
		
		panel = new JPanel();
		panel.setBounds(10, 35, 699, 519);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lbCodeID = new JLabel("Code ID :");
		lbCodeID.setBounds(36, 10, 94, 28);
		panel.add(lbCodeID);
		lbCodeID.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		
		lbFirstName = new JLabel("First Name :");
		lbFirstName.setBounds(36, 60, 94, 28);
		panel.add(lbFirstName);
		lbFirstName.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		
		lbMiddleName = new JLabel("Middle Name :");
		lbMiddleName.setBounds(36, 110, 289, 28);
		panel.add(lbMiddleName);
		lbMiddleName.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		
		tfYear = new JTextField();
		tfYear.setBounds(426, 214, 94, 27);
		panel.add(tfYear);
		tfYear.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tfYear.setColumns(10);
		
		tfMonth = new JTextField();
		tfMonth.setBounds(322, 214, 94, 28);
		panel.add(tfMonth);
		tfMonth.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tfMonth.setColumns(10);
		
		tfDay = new JTextField();
		tfDay.setBounds(218, 214, 94, 27);
		panel.add(tfDay);
		tfDay.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tfDay.setColumns(10);
		
		lbDate = new JLabel("Birth Day :");
		lbDate.setBounds(36, 214, 105, 28);
		panel.add(lbDate);
		lbDate.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		
		lbRank = new JLabel("Rank :");
		lbRank.setBounds(36, 344, 94, 28);
		panel.add(lbRank);
		lbRank.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		
		lbDepartment = new JLabel("Department :");
		lbDepartment.setBounds(36, 383, 105, 28);
		panel.add(lbDepartment);
		lbDepartment.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		
		lbOfficeNumber = new JLabel("Office Number :");
		lbOfficeNumber.setBounds(36, 422, 160, 28);
		panel.add(lbOfficeNumber);
		lbOfficeNumber.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		
		lbOfficePhone = new JLabel("Office Phone Number :");
		lbOfficePhone.setBounds(32, 469, 176, 28);
		panel.add(lbOfficePhone);
		lbOfficePhone.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		
		tfOfficePhone = new JTextField();
		tfOfficePhone.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tfOfficePhone.setBounds(218, 469, 213, 27);
		panel.add(tfOfficePhone);
		tfOfficePhone.setColumns(10);
		
		tfOfficeNumber = new JTextField();
		tfOfficeNumber.setBounds(218, 422, 213, 28);
		panel.add(tfOfficeNumber);
		tfOfficeNumber.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tfOfficeNumber.setColumns(10);
		
		tfDepartment = new JTextField();
		tfDepartment.setBounds(218, 383, 210, 28);
		panel.add(tfDepartment);
		tfDepartment.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tfDepartment.setColumns(10);
		
	    comboBox = new JComboBox();
		comboBox.setBounds(218, 344, 255, 29);
		panel.add(comboBox);
		comboBox.setBackground(Color.GREEN);
		comboBox.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"None", "Assistant Professor", "Associate Professor", "Professor", "Assistant Teaching Professor", "Associate Teaching Professor", "Teaching Professor"}));
		
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
		lbHomePhone.setBounds(32, 301, 172, 32);
		panel.add(lbHomePhone);
		
		lbCellPhone = new JLabel("Cell Phone Number :");
		lbCellPhone.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lbCellPhone.setBounds(36, 253, 187, 37);
		panel.add(lbCellPhone);
		
		tfCellPhone = new JTextField();
		tfCellPhone.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tfCellPhone.setBounds(218, 256, 213, 31);
		panel.add(tfCellPhone);
		tfCellPhone.setColumns(10);
		
		tfHomePhone = new JTextField();
		tfHomePhone.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tfHomePhone.setBounds(218, 302, 213, 31);
		panel.add(tfHomePhone);
		tfHomePhone.setColumns(10);
		
		lblFamilyName = new JLabel("Family Name :");
		lblFamilyName.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblFamilyName.setBounds(36, 159, 116, 28);
		panel.add(lblFamilyName);
		
		tfFamilyNam = new JTextField();
		tfFamilyNam.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tfFamilyNam.setColumns(10);
		tfFamilyNam.setBounds(218, 159, 213, 27);
		panel.add(tfFamilyNam);

		
		bSave.addActionListener(this);
		bReset.addActionListener(this);
		bBack.addActionListener(this);
		
		
		
	}
	

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==bSave) {
			
			
				people.Professor s= new people.Professor();
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
				Object a=comboBox.getSelectedItem();
				String b=(String) a;
				s.setRank(b);
				s.setDepartment(tfDepartment.getText());
				s.setOfficeNumber(tfOfficeNumber.getText());
				s.setOfficePhoneNumber(tfOfficePhone.getText());
			
				ReadFile r= new ReadFile();
				
				ArrayOfPeople p=new ArrayOfPeople(r.read(name),name);
				p.add(s);
				
				WriteFile w= new WriteFile(name);
				People peo[]=p.returnNewArray();

				try {
					w.writeFile(peo);
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				}
				this.dispose();
				new ListOfPeople(name).setVisible(true);;
			}
		
		if(e.getSource()==bReset) {
			this.dispose();
			new InputProfessor(name).setVisible(true);
		}
		if(e.getSource()==bBack) {
			this.dispose();
			new ListOfPeople(name).setVisible(true);
		}
	}
	
}

