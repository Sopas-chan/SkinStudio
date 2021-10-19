import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JPanel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Toolkit;

public class Homepage {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Homepage window = new Homepage();
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
	public Homepage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(new Color(139, 69, 19));
		frame.setResizable(false);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Stacy Mae\\OneDrive - National University\\Desktop\\STEH FILES\\beautybox\\Skin Studio Logo.png"));
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(null);
		
		JButton login = new JButton("Log in");
		login.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				login.setBackground(new Color(190, 112, 75));
			}
		});
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login Home = new Login();
				Home.Login();
				frame.hide();
			}
		});
		login.setBackground(new Color(160, 82, 45));
		login.setForeground(new Color(255, 153, 153));
		login.setFont(new Font("Rockwell", Font.BOLD, 15));
		login.setBounds(664, 75, 100, 28);
		frame.getContentPane().add(login); 
		
		JButton signup = new JButton("Sign up");
		signup.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				signup.setBackground(new Color(190, 112, 75));
			}
		});
		signup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SignupPage Home = new SignupPage();
				Home.SignupPage();
				frame.hide();
			}
		});
		signup.setBackground(new Color(160, 82, 45));
		signup.setForeground(new Color(255, 153, 153));
		signup.setFont(new Font("Rockwell", Font.BOLD, 15));
		signup.setBounds(774, 75, 100, 28);
		frame.getContentPane().add(signup);
		
		JLabel tag1 = new JLabel("Make your skin shine,");
		tag1.setForeground(new Color(160, 82, 45));
		tag1.setFont(new Font("Rockwell", Font.BOLD, 17));
		tag1.setBounds(114, 4, 194, 33);
		frame.getContentPane().add(tag1);
		
		JLabel tag2 = new JLabel("Let your skin breathe.");
		tag2.setForeground(new Color(160, 82, 45));
		tag2.setFont(new Font("Rockwell", Font.BOLD, 17));
		tag2.setBounds(310, 11, 194, 19);
		frame.getContentPane().add(tag2);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(245, 245, 245));
		panel.setBounds(10, 31, 633, 445);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Stacy Mae\\OneDrive - National University\\Desktop\\STEH FILES\\beautybox\\bbgif.gif"));
		lblNewLabel.setBounds(0, 0, 633, 445);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Stacy Mae\\OneDrive - National University\\Desktop\\STEH FILES\\beautybox\\skin care routine.gif"));
		lblNewLabel_1.setBounds(653, 150, 231, 265);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel help = new JLabel("Help");
		help.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				help Home = new help();
				Home.help();
			}
		});
		help.setFont(new Font("Rockwell", Font.PLAIN, 13));
		help.setHorizontalAlignment(SwingConstants.CENTER);
		help.setBounds(20, 481, 46, 14);
		frame.getContentPane().add(help);
		
		JLabel termsofuse = new JLabel("Terms of Use");
		termsofuse.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TermsofUse use = new TermsofUse();
				use.TermsofUse();
			}
		});
		termsofuse.setFont(new Font("Rockwell", Font.PLAIN, 13));
		termsofuse.setHorizontalAlignment(SwingConstants.CENTER);
		termsofuse.setBounds(60, 481, 88, 14);
		frame.getContentPane().add(termsofuse);
		
		JLabel privacy = new JLabel("Privacy Policy");
		privacy.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				PrivacyPolicy policy = new PrivacyPolicy();
				policy.PrivacyPolicy();
			}
		});
		privacy.setFont(new Font("Rockwell", Font.PLAIN, 13));
		privacy.setHorizontalAlignment(SwingConstants.CENTER);
		privacy.setBounds(148, 481, 88, 14);
		frame.getContentPane().add(privacy);
		frame.setBounds(100, 100, 910, 545);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
