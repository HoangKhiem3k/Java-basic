package swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Choose extends JFrame implements ActionListener {

	private JPanel contentPane;
	static String name;
	JButton bBackToMenu;
	private JButton bProfessor;
	private JButton bStudent;
	private JButton bPeople;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Choose frame = new Choose(name);
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
	public Choose(String namefile) {
		name = namefile;
		super.setTitle("Choose to input ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbCHOOSE = new JLabel("Choose kind of member:");
		lbCHOOSE.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		lbCHOOSE.setForeground(Color.BLUE);
		lbCHOOSE.setBounds(101, 39, 245, 36);
		contentPane.add(lbCHOOSE);
		
		JButton bPeople = new JButton("PEOPLE");
		bPeople.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		bPeople.setBounds(16, 117, 122, 36);
		contentPane.add(bPeople);
		bPeople.addActionListener(this);
		
		JButton bStudent = new JButton("STUDENT");
		bStudent.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		bStudent.setBounds(159, 117, 124, 36);
		contentPane.add(bStudent);
		bStudent.addActionListener(this);
		
		JButton bProfessor = new JButton("PROFESSOR");
		bProfessor.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		bProfessor.setBounds(302, 117, 122, 36);
		contentPane.add(bProfessor);
		bProfessor.addActionListener(this);
		
		JButton bBackToMenu = new JButton("Back");
		bBackToMenu.setBounds(39, 216, 89, 23);
		contentPane.add(bBackToMenu);
		bBackToMenu.addActionListener(this);
		
		
		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand()=="Back") {
			new ListOfPeople(name).setVisible(true);
			this.hide();
		}
		if(e.getActionCommand()=="PEOPLE") {
			new InputPeople(name).setVisible(true);
			this.hide();
		}
		if(e.getActionCommand()=="STUDENT") {
			new InputStudent(name).setVisible(true);
			this.hide();
		}
		if(e.getActionCommand()=="PROFESSOR") {
			new InputProfessor(name).setVisible(true);
			this.hide();
		}
	}
}
