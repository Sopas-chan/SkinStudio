import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class help {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void help() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					help window = new help();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public help() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.getContentPane().setLayout(null);
		
		JLabel PrivacyLabel = new JLabel("Skin Studio FAQs");
		PrivacyLabel.setHorizontalAlignment(SwingConstants.CENTER);
		PrivacyLabel.setForeground(new Color(139, 69, 19));
		PrivacyLabel.setFont(new Font("Rockwell", Font.BOLD, 30));
		PrivacyLabel.setBounds(102, 11, 389, 30);
		frame.getContentPane().add(PrivacyLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(245, 245, 245));
		panel.setBounds(10, 63, 559, 285);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("What is Skin Studio?");
		lblNewLabel.setForeground(new Color(139, 69, 19));
		lblNewLabel.setFont(new Font("Rockwell", Font.BOLD, 13));
		lblNewLabel.setBounds(10, 11, 140, 21);
		panel.add(lblNewLabel);
		
		JLabel lblAccountProfileAnd = new JLabel("Account Profile and Settings");
		lblAccountProfileAnd.setForeground(new Color(139, 69, 19));
		lblAccountProfileAnd.setFont(new Font("Rockwell", Font.BOLD, 13));
		lblAccountProfileAnd.setBounds(10, 92, 180, 21);
		panel.add(lblAccountProfileAnd);
		
		JTextArea txtrSkinStudioIs = new JTextArea();
		txtrSkinStudioIs.setForeground(new Color(139, 69, 19));
		txtrSkinStudioIs.setFont(new Font("Rockwell", Font.PLAIN, 13));
		txtrSkinStudioIs.setText("Skin Studio is an Application Software that helps you find the best and suitable products\r\nfor your skin. This also helps a user to know more about skin types, skin care routines \r\nand many more.");
		txtrSkinStudioIs.setBounds(10, 33, 512, 59);
		panel.add(txtrSkinStudioIs);
		
		JTextArea txtrSkinStudioAccounts = new JTextArea();
		txtrSkinStudioAccounts.setText("Skin Studio accounts helps you to search and learn th right ingredients and products\r\nwhich are suitable for your skin. This also helps a user to know the right solutions for their\r\nskin problems.\r\n\r\nTo make an account:\r\nYou just need to sign up with your Phone Number, Username and Password\r\n\r\nTo Reset password:\r\nGo to forget password and input you username then reset and save.");
		txtrSkinStudioAccounts.setForeground(new Color(139, 69, 19));
		txtrSkinStudioAccounts.setFont(new Font("Rockwell", Font.PLAIN, 13));
		txtrSkinStudioAccounts.setBounds(10, 114, 512, 160);
		panel.add(txtrSkinStudioAccounts);
		
		JButton Close = new JButton("Close");
		Close.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.hide();
			}
		});
		Close.setForeground(new Color(240, 248, 255));
		Close.setFont(new Font("Rockwell", Font.BOLD, 13));
		Close.setBackground(new Color(139, 69, 19));
		Close.setBounds(237, 359, 89, 23);
		frame.getContentPane().add(Close);
		frame.setBounds(100, 100, 595, 440);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
