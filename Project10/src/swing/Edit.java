package swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;

public class Edit extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField tfCodeID;
	private JButton bBack;
	private JButton bNext;
	static String name;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Edit frame = new Edit(name);
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
	public Edit(String namef) {
		name = namef;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter Code ID of member who you want to edit :");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel.setBounds(24, 33, 424, 14);
		contentPane.add(lblNewLabel);
		
		tfCodeID = new JTextField();
		tfCodeID.setBounds(34, 58, 169, 20);
		contentPane.add(tfCodeID);
		tfCodeID.setColumns(10);
		
		bBack = new JButton("Back");
		bBack.setBounds(62, 167, 89, 23);
		contentPane.add(bBack);
		bBack.addActionListener(this);
		bNext = new JButton("Next");
		bNext.setBounds(300, 167, 89, 23);
		contentPane.add(bNext);
		bNext.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==bBack) {
			this.dispose();
			new ListOfPeople(name).setVisible(true);
		}
		if(e.getSource()==bNext) {
			
			this.dispose();
			
		}
	}
}
