import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class TermsofUse {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void TermsofUse() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TermsofUse window = new TermsofUse();
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
	public TermsofUse() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setAlwaysOnTop(true);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Stacy Mae\\OneDrive - National University\\Desktop\\STEH FILES\\beautybox\\Skin Studio Logo.png"));
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.getContentPane().setLayout(null);
		
		JTextArea TermsBody = new JTextArea();
		TermsBody.setForeground(new Color(139, 69, 19));
		TermsBody.setText("Your access to and use of the Service is conditioned on your acceptance of and\r\ncompliance with these Terms. These Terms apply to all visitors, users and others\r\nwho access or use the Service.\r\n\r\nBy accessing or using the Service you agree to be bound by these Terms. If you disagree\r\nwith any part of the terms then you may not access the Service.\r\n\r\nThe User must at all times:\r\n\r\nAvoid transmitting any content that is offensive, inappropriate or illegal, or otherwise\r\nin conflict with these Terms.\r\nAvoid posting any content that infringes or violates another person\u2019s rights\r\n(including intellectual property rights, and rights of privacy and publicity).\r\n\r\nThe User is responsible for complying with the laws and regulations of the territory\r\nfrom which the App is accessed or used.\r\n\r\n");
		TermsBody.setFont(new Font("Rockwell", Font.BOLD, 13));
		TermsBody.setBackground(new Color(245, 245, 245));
		TermsBody.setBounds(10, 65, 560, 261);
		frame.getContentPane().add(TermsBody);
		
		JButton Close = new JButton("Close");
		Close.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.hide();
			}
		});
		Close.setBackground(new Color(139, 69, 19));
		Close.setForeground(new Color(240, 248, 255));
		Close.setFont(new Font("Rockwell", Font.BOLD, 13));
		Close.setBounds(238, 337, 89, 23);
		frame.getContentPane().add(Close);
		
		JLabel TermsLabel = new JLabel("Skin Studio Terms of Use");
		TermsLabel.setHorizontalAlignment(SwingConstants.CENTER);
		TermsLabel.setForeground(new Color(139, 69, 19));
		TermsLabel.setFont(new Font("Rockwell", Font.BOLD, 30));
		TermsLabel.setBounds(99, 11, 389, 43);
		frame.getContentPane().add(TermsLabel);
		frame.setBounds(100, 100, 595, 410);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
