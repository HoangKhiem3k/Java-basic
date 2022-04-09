package swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Welcome extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblMenu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Welcome frame = new Welcome();
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
	public Welcome() {
		super.setTitle("Welcome");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		lblMenu = new JLabel("Personal Information Manager");
		lblMenu.setForeground(Color.BLUE);
		lblMenu.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		lblMenu.setBounds(97, 43, 242, 34);
		contentPane.add(lblMenu);
		
		JButton ButtonOpenFile = new JButton("Open FILE");
		ButtonOpenFile.addActionListener(this);
		ButtonOpenFile.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		ButtonOpenFile.setBounds(38, 137, 136, 34);
		contentPane.add(ButtonOpenFile);
		
		JButton ButtonNewFile = new JButton("Creat New FILE");
		ButtonNewFile.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		ButtonNewFile.setBounds(253, 137, 136, 34);
		ButtonNewFile.addActionListener(this);
		contentPane.add(ButtonNewFile);
		
		JButton ButtonExit = new JButton("Close");
		ButtonExit.addActionListener(this);
		ButtonExit.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		ButtonExit.setBounds(161, 216, 109, 34);
		contentPane.add(ButtonExit);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand()=="Open FILE") {
			new OpenFile().setVisible(true);
			this.hide();
		}
		if(e.getActionCommand()=="Creat New FILE") {
			new CreateNewFile().setVisible(true);
			this.hide();
		}
		
		if(e.getActionCommand()=="Close") {
//			JOptionPane.showMessageDialog(this, "Are you sure ?");
//			System.exit(0);
			if (JOptionPane.showConfirmDialog(this, "Do you want to close ?", "Close Window?",JOptionPane.YES_NO_OPTION,
		            JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
		            System.exit(0);
		        }
		}		
		
	}
}
