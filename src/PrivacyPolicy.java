import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Toolkit;
import javax.swing.JScrollBar;
import javax.swing.JTextPane;

public class PrivacyPolicy {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void PrivacyPolicy() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrivacyPolicy window = new PrivacyPolicy();
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
	public PrivacyPolicy() {
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
		
		JLabel PrivacyLabel = new JLabel("Skin Studio Privacy Policy");
		PrivacyLabel.setForeground(new Color(139, 69, 19));
		PrivacyLabel.setFont(new Font("Rockwell", Font.BOLD, 30));
		PrivacyLabel.setBounds(99, 11, 389, 30);
		frame.getContentPane().add(PrivacyLabel);
		
		JButton Close = new JButton("Close\r\n");
		Close.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.hide();
			}
		});
		Close.setFont(new Font("Rockwell", Font.BOLD, 13));
		Close.setBackground(new Color(139, 69, 19));
		Close.setForeground(new Color(240, 248, 255));
		Close.setBounds(236, 313, 89, 23);
		frame.getContentPane().add(Close);
		
		JTextArea PrivacyBody = new JTextArea();
		PrivacyBody.setForeground(new Color(139, 69, 19));
		PrivacyBody.setText("Skin Studio's important priority is protecting our user's private infromation.\r\n\r\nWe do not collect any personal information about you unless you voluntarily provide us.\r\nHowever, You may be required to provide certain information such as:\r\n\r\nAccount Information:\r\nIn order to access Skin Studio's services, Our system automatically collect\r\ninformation like name, age, phone number/username and password when you register\r\nby signing up on Skin Studio. \r\n\r\nDevice Information:\r\nwe collect information from and about the computers, phones, and other web-connected\r\ndevices you use that integrate with our Products, and we combine this information\r\nacross different devices you use. \r\n\r\n\r\n\r\n");
		PrivacyBody.setFont(new Font("Rockwell", Font.BOLD, 13));
		PrivacyBody.setBackground(new Color(245, 245, 245));
		PrivacyBody.setBounds(10, 65, 560, 237);
		frame.getContentPane().add(PrivacyBody);
		frame.setBounds(100, 100, 595, 390);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
