import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JToolBar;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JFormattedTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JToggleButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.Cursor;

public class Login {

	 JFrame frame;
	public static ArrayList <String> email = new ArrayList();
    public static ArrayList <String> password = new ArrayList();
    public static ArrayList <String> cpnum = new ArrayList();
	private JTextField txtUsername;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void Login() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public static void Loginu() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		email.add("user");
        password.add("user123");
		frame = new JFrame();
		frame.setAlwaysOnTop(true);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(null);
		
		JLabel tag1 = new JLabel("Make your skin shine,");
		tag1.setForeground(new Color(160, 82, 45));
		tag1.setFont(new Font("Rockwell", Font.BOLD, 17));
		tag1.setBounds(400, 29, 194, 41);
		frame.getContentPane().add(tag1);
		
		JLabel tag2 = new JLabel("Let your skin breathe.");
		tag2.setForeground(new Color(160, 82, 45));
		tag2.setFont(new Font("Rockwell", Font.BOLD, 17));
		tag2.setBounds(400, 65, 194, 19);
		frame.getContentPane().add(tag2);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(245, 245, 245));
		panel.setBounds(7, 11, 349, 414);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Stacy Mae\\OneDrive - National University\\Desktop\\STEH FILES\\beautybox\\user.png"));
		lblNewLabel.setBounds(32, 92, 28, 36);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Stacy Mae\\OneDrive - National University\\Desktop\\STEH FILES\\beautybox\\padlock.png"));
		lblNewLabel_2.setBounds(32, 139, 35, 36);
		
		txtUsername = new JTextField();
		txtUsername.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (txtUsername.getText().equals("Username")) {
					txtUsername.setText("");
				}
			}
			@Override
			public void focusLost(FocusEvent e) {//word username
				if (txtUsername.getText().equals(""))
					txtUsername.setText("Username");
			}
		});
		txtUsername.setForeground(new Color(139, 69, 19));
		txtUsername.setFont(new Font("Rockwell", Font.BOLD, 14));
		txtUsername.setBounds(76, 92, 233, 30);
		txtUsername.setColumns(10);
		panel.setLayout(null);
		
		
		JLabel forgotpassword = new JLabel("Forgot Password?");
		forgotpassword.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {//will redirect to the forgot password window
				forgot Home = new forgot();
				Home.abc();
				frame.hide();
				
				
			}
		});
		forgotpassword.setFont(new Font("Rockwell", Font.BOLD, 12));
		forgotpassword.setForeground(new Color(139, 69, 19));
		forgotpassword.setBounds(203, 175, 106, 25);
		panel.add(forgotpassword);
		panel.add(lblNewLabel);
		panel.add(lblNewLabel_2);
		panel.add(txtUsername);
		
		JButton back = new JButton("Back");
		back.addMouseListener(new MouseAdapter() {
			
		});
		back.setFont(new Font("Rockwell", Font.BOLD, 15));
		back.setForeground(new Color(240, 248, 255));
		back.setBackground(new Color(255, 218, 185));
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Homepage Home = new Homepage();//will redirect back to the homepage.
				Home.main(null);
				frame.hide();
			}
		});
		back.setBounds(209, 206, 100, 27);
		panel.add(back);
		
		JLabel Login = new JLabel("Login");
		Login.setHorizontalAlignment(SwingConstants.CENTER);
		Login.setForeground(new Color(139, 69, 19));
		Login.setFont(new Font("Rockwell", Font.BOLD, 50));
		Login.setBounds(80, 11, 199, 70);
		panel.add(Login);
		
		passwordField = new JPasswordField();
		passwordField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (passwordField.getText().equals("Password")) {
					passwordField.setText("");
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if (passwordField.getText().equals(""))
					passwordField.setText("Password");
			}
		});
		passwordField.setFont(new Font("Rockwell", Font.BOLD, 14));
		passwordField.setForeground(new Color(139, 69, 19));
		passwordField.setBounds(77, 139, 232, 30);
		panel.add(passwordField);
		
		JButton login = new JButton("Login");
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String usernameVerif = txtUsername.getText();
                String passcodeVerif = passwordField.getText();

                if ((email.contains(usernameVerif) || cpnum.contains(usernameVerif)) && password.contains(passcodeVerif)) {
                    Dashboard Frame3 = new Dashboard();
                    Frame3.Dashboard();
                    //Frame3.setUndecorated(true);
                    Frame3.setVisible(true);
                    frame.hide();
                    
                    JOptionPane.showMessageDialog(frame,"Successfully Login" );
                }
                else if ((!email.contains(usernameVerif) || !cpnum.contains(usernameVerif)) && password.contains(passcodeVerif)) {
                   
                    JOptionPane.showMessageDialog(frame,"Invalid Email or Username" );
                }
                else if (!password.contains(passcodeVerif) && email.contains(usernameVerif) || cpnum.contains(usernameVerif)) {

                    JOptionPane.showMessageDialog(frame,"Invalid Password" );
                }
                else if ((!email.contains(usernameVerif) || !cpnum.contains(usernameVerif)) && !password.contains(passcodeVerif)) {

                    JOptionPane.showMessageDialog(frame,"Your Both Username and password is incorrect" );
                    }
			}
		});
		login.setForeground(new Color(240, 248, 255));
		login.setFont(new Font("Rockwell", Font.BOLD, 15));
		login.setBackground(new Color(255, 218, 185));
		login.setBounds(76, 206, 100, 27);
		panel.add(login);
		
		JLabel lblForgotUsername = new JLabel("Forgot Username:");
		lblForgotUsername.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				forgotuser Home = new forgotuser();
				Home.hotdog();
				frame.hide();
				
			}
		});
		lblForgotUsername.setForeground(new Color(139, 69, 19));
		lblForgotUsername.setFont(new Font("Rockwell", Font.BOLD, 12));
		lblForgotUsername.setBounds(76, 175, 106, 25);
		panel.add(lblForgotUsername);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Stacy Mae\\OneDrive - National University\\Desktop\\STEH FILES\\beautybox\\skin care routine.gif"));
		lblNewLabel_1.setBounds(366, 120, 248, 281);
		frame.getContentPane().add(lblNewLabel_1);
		frame.setBounds(100, 100, 640, 475);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
