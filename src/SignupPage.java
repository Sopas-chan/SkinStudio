import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JCheckBox;
import java.awt.Toolkit;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class SignupPage {

	private JFrame frame;
	private JTextField fn;
	private JTextField ln;
	private JTextField cpnum;
	private JPasswordField pass1;
	private JTextField uname;

	/**
	 * Launch the application.
	 */
	public static void SignupPage() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignupPage window = new SignupPage();
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
	public SignupPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setAlwaysOnTop(true);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Stacy Mae\\OneDrive - National University\\Desktop\\STEH FILES\\beautybox\\Skin Studio Logo.png"));
		frame.setBackground(new Color(205, 133, 63));
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(null);
		
		JLabel prompt = new JLabel("");
		prompt.setBounds(393, 364, 194, 14);
		frame.getContentPane().add(prompt);
		
		JLabel lblNewLabel_1 = new JLabel("Make your skin shine,");
		lblNewLabel_1.setForeground(new Color(160, 82, 45));
		lblNewLabel_1.setFont(new Font("Rockwell", Font.BOLD, 17));
		lblNewLabel_1.setBounds(441, 37, 194, 41);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Let your skin breathe.");
		lblNewLabel_1_1.setForeground(new Color(160, 82, 45));
		lblNewLabel_1_1.setFont(new Font("Rockwell", Font.BOLD, 17));
		lblNewLabel_1_1.setBounds(441, 75, 194, 19);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(245, 245, 245));
		panel.setBounds(10, 11, 407, 410);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		fn = new JTextField();
		fn.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (fn.getText().equals("First Name"))
					fn.setText("");
			}
			@Override
			public void focusLost(FocusEvent e) {
				if (fn.getText().equals(""))
					fn.setText("First Name");
			}
		});
		
		ln = new JTextField();
		ln.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (ln.getText().equals("Last Name"))
					ln.setText("");
			}
			@Override
			public void focusLost(FocusEvent e) {
				if (ln.getText().equals(""))
					ln.setText("Last Name");
			}
		});
		
		JLabel one = new JLabel("");
		one.setHorizontalAlignment(SwingConstants.CENTER);
		one.setFont(new Font("Rockwell", Font.BOLD, 13));
		one.setForeground(new Color(255, 0, 0));
		one.setBounds(86, 83, 128, 14);
		panel.add(one);
		ln.setBackground(Color.WHITE);
		ln.setForeground(new Color(139, 69, 19));
		ln.setFont(new Font("Rockwell", Font.BOLD, 13));
		ln.setColumns(10);
		ln.setBounds(231, 107, 137, 28);
		panel.add(ln);
		fn.setForeground(new Color(139, 69, 19));
		fn.setBackground(Color.WHITE);
		fn.setFont(new Font("Rockwell", Font.BOLD, 13));
		fn.setBounds(86, 107, 135, 28);
		panel.add(fn);
		fn.setColumns(10);
		
		JLabel five =  new JLabel("");
		five.setHorizontalAlignment(SwingConstants.CENTER);
		five.setForeground(new Color(255, 0, 0));
		five.setFont(new Font("Rockwell", Font.BOLD, 13));
		five.setBounds(240, 274, 128, 14);
		panel.add(five);
		
		JLabel three = new JLabel("");
		three.setHorizontalAlignment(SwingConstants.CENTER);
		three.setForeground(new Color(255, 0, 0));
		three.setFont(new Font("Rockwell", Font.BOLD, 13));
		three.setBounds(86, 274, 128, 14);
		panel.add(three);
		
		JLabel four = new JLabel("");
		four.setHorizontalAlignment(SwingConstants.CENTER);
		four.setForeground(new Color(255, 0, 0));
		four.setFont(new Font("Rockwell", Font.BOLD, 13));
		four.setBounds(86, 211, 288, 14);
		panel.add(four);
		
		JLabel two = new JLabel("");
		two.setHorizontalAlignment(SwingConstants.CENTER);
		two.setForeground(new Color(255, 0, 0));
		two.setFont(new Font("Rockwell", Font.BOLD, 13));
		two.setBounds(239, 83, 117, 14);
		panel.add(two);
		
		JLabel lblNewLabel_2 = new JLabel("Sign-up to Skin Studio");
		lblNewLabel_2.setBounds(10, 11, 253, 50);
		panel.add(lblNewLabel_2);
		lblNewLabel_2.setForeground(new Color(139, 69, 19));
		lblNewLabel_2.setFont(new Font("Rockwell", Font.BOLD | Font.ITALIC, 25));
		
		JLabel lblNewLabel_5 = new JLabel("Join our community and seek for skincare advice");
		lblNewLabel_5.setForeground(new Color(139, 69, 19));
		lblNewLabel_5.setFont(new Font("Rockwell Condensed", Font.BOLD, 14));
		lblNewLabel_5.setBounds(10, 45, 289, 28);
		panel.add(lblNewLabel_5);
		
		JLabel byear = new JLabel("Birthyear:");
		byear.setHorizontalAlignment(SwingConstants.RIGHT);
		byear.setForeground(new Color(139, 69, 19));
		byear.setFont(new Font("Rockwell Condensed", Font.BOLD, 13));
		byear.setBounds(298, 146, 70, 14);
		panel.add(byear);
		
		JLabel bday = new JLabel("Birthday:");
		bday.setHorizontalAlignment(SwingConstants.RIGHT);
		bday.setForeground(new Color(139, 69, 19));
		bday.setFont(new Font("Rockwell Condensed", Font.BOLD, 13));
		bday.setBounds(181, 146, 70, 14);
		panel.add(bday);
		
		JLabel bmonth = new JLabel("Birthmonth:");
		bmonth.setHorizontalAlignment(SwingConstants.RIGHT);
		bmonth.setForeground(new Color(139, 69, 19));
		bmonth.setFont(new Font("Rockwell Condensed", Font.BOLD, 13));
		bmonth.setBounds(118, 146, 70, 14);
		panel.add(bmonth);
		
		JComboBox year = new JComboBox();
		year.setModel(new DefaultComboBoxModel(new String[] {"2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971"}));
		year.setFont(new Font("Tahoma", Font.BOLD, 13));
		year.setForeground(new Color(240, 248, 255));
		year.setBackground(new Color(139, 69, 19));
		year.setBounds(264, 171, 104, 28);
		panel.add(year);
		
		JComboBox day = new JComboBox();
		day.setForeground(new Color(240, 248, 255));
		day.setBackground(new Color(139, 69, 19));
		day.setFont(new Font("Rockwell", Font.BOLD, 13));
		day.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		day.setBounds(203, 171, 48, 28);
		panel.add(day);
		
		JComboBox month = new JComboBox();
		month.setForeground(new Color(240, 248, 255));
		month.setBackground(new Color(139, 69, 19));
		month.setFont(new Font("Rockwell", Font.BOLD, 13));
		month.setModel(new DefaultComboBoxModel(new String[] {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}));
		month.setBounds(86, 171, 102, 28);
		panel.add(month);
		
		cpnum = new JTextField();
		cpnum.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (cpnum.getText().equals("Phone Number"))
					cpnum.setText("");
			}
			@Override
			public void focusLost(FocusEvent e) {
				if (cpnum.getText().equals(""))
					cpnum.setText("Phone Number");
			}
		});
		cpnum.setForeground(new Color(139, 69, 19));
		cpnum.setFont(new Font("Rockwell", Font.BOLD, 13));
		cpnum.setColumns(10);
		cpnum.setBackground(Color.WHITE);
		cpnum.setBounds(86, 235, 282, 28);
		panel.add(cpnum);
		
		pass1 = new JPasswordField();
		pass1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (pass1.getText().equals("Password")) {
					pass1.setEchoChar((char)0);
					pass1.setText("");
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if (pass1.getText().equals("")) {
					pass1.setEchoChar((char)0);
					pass1.setText("Password");
			}
			}
		});
		pass1.setBackground(Color.WHITE);
		pass1.setForeground(new Color(139, 69, 19));
		pass1.setFont(new Font("Rockwell", Font.BOLD, 13));
		pass1.setBounds(235, 294, 133, 28);
		panel.add(pass1);
		
		uname = new JTextField();
		uname.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (uname.getText().equals("Username")) {
					uname.setText("");
			} else {
                uname.selectAll();
			}
		}
			@Override
			public void focusLost(FocusEvent e) {
				if (uname.getText().equals("")) {
					uname.setText("Username");
			}
			}
		});
		uname.setForeground(new Color(139, 69, 19));
		uname.setFont(new Font("Rockwell", Font.BOLD, 13));
		uname.setColumns(10);
		uname.setBackground(Color.WHITE);
		uname.setBounds(86, 293, 135, 28);
		panel.add(uname);
		
		
		JButton btnSignUp = new JButton("Sign up");
		btnSignUp.setBounds(181, 333, 89, 27);
		panel.add(btnSignUp);
		btnSignUp.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (fn.getText().equals("")) {
                    one.setText("Fill this out!");
                } if(ln.getText().equals("")){
                    two.setText("Fill this out!");
                }
                 if(uname.getText().equals("")) {
                    three.setText("Fill this out!");
                 }
                 if (cpnum.getText().equals("")) {
                	 four.setText("Fill this out!");
                 }
                 if(pass1.getText().equals("")) {
                    five.setText("Fill this out!");
                }
                else {
                    String fname = fn.getText();
                    String password = pass1.getText();
                    String lname = ln.getText();
                    String un = uname.getText();
                    String cpno = cpnum.getText();
                    String fishball = cpnum.getText();

                    JOptionPane.showMessageDialog(frame,"You can proceed to login now!" );
                    Login h = new Login();
                    Login.email.add(un);
                    Login.cpnum.add(cpno);
                    Login.password.add(password);
                    Login.email.add(fishball);
                    
                    forgot.emailForgot.add(un);
    				forgot.passwordForgot.add(password);
    				forgotuser.cpnumForgot.add(fishball);
    				forgotuser.emailForgot.add(un);
               
			}
			}       
			@Override
			public void mouseEntered(MouseEvent e) {
				btnSignUp.setBackground(new Color(190, 112, 75));
			}
		});
		
              
		btnSignUp.setForeground(new Color(240, 248, 255));
		btnSignUp.setFont(new Font("Rockwell", Font.BOLD, 15));
		btnSignUp.setBackground(new Color(139, 69, 19));
		
		JLabel gif = new JLabel("");
		gif.setIcon(new ImageIcon("C:\\Users\\Stacy Mae\\OneDrive - National University\\Desktop\\STEH FILES\\beautybox\\skin care routine.gif"));
		gif.setBounds(427, 127, 238, 226);
		frame.getContentPane().add(gif);
		
		JButton back = new JButton("Back");
		back.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				back.setBackground(new Color(190, 112, 75));
			}
		});
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Homepage Home = new Homepage();//will redirect you to back to the homepage
				Home.main(null);
				frame.hide();
			}
		});
		back.setForeground(new Color(240, 248, 255));
		back.setBackground(new Color(139, 69, 19));
		back.setFont(new Font("Rockwell", Font.BOLD, 13));
		back.setBounds(546, 375, 102, 27);
		frame.getContentPane().add(back);
		
		JButton loginnow = new JButton("Login Now");
		loginnow.setBackground(new Color(139, 69, 19));
		loginnow.setForeground(Color.WHITE);
		loginnow.setFont(new Font("Rockwell", Font.BOLD, 13));
		
		loginnow.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			    Login Home = new Login();
 				Home.Login();
 				frame.hide();
                
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				loginnow.setBackground(new Color(190, 112, 75));
			}
		});
		loginnow.setBounds(441, 376, 102, 27);
		frame.getContentPane().add(loginnow);
		frame.setBounds(100, 100, 693, 467);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
