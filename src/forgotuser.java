import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class forgotuser extends JFrame {

	private JPanel contentPane;
	public static ArrayList <String> emailForgot = new ArrayList();
	public static ArrayList <String> passwordForgot = new ArrayList();
	public static ArrayList <String> cpnumForgot = new ArrayList();
	private JTextField pnum;
	private JTextField uename;
	private JButton backbttn;
	private JLabel forgotpass;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;

	/**
	 * Launch the application.
	 */
	public static void forgotuser() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					forgotuser frame = new forgotuser();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public static void hotdog() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					forgotuser frame = new forgotuser();
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
	public forgotuser() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 595, 412);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		forgotpass = new JLabel("Find your Skin Station account");
		forgotpass.setHorizontalAlignment(SwingConstants.CENTER);
		forgotpass.setForeground(new Color(139, 69, 19));
		forgotpass.setFont(new Font("Rockwell", Font.BOLD, 30));
		forgotpass.setBounds(38, 11, 504, 43);
		contentPane.add(forgotpass);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(245, 245, 245));
		panel.setBounds(10, 65, 559, 290);
		contentPane.add(panel);
		panel.setLayout(null);
		
		pnum = new JTextField();
		pnum.setBounds(20, 79, 198, 23);
		panel.add(pnum);
		pnum.setColumns(10);
		
		JButton resetbttn = new JButton("Reset");
		resetbttn.setBounds(20, 113, 100, 27);
		panel.add(resetbttn);
		resetbttn.setForeground(new Color(255, 255, 255));
		resetbttn.setBackground(new Color(139, 69, 19));
		resetbttn.setFont(new Font("Rockwell", Font.BOLD, 13));
		
		uename = new JTextField();
		uename.setBounds(20, 174, 198, 23);
		panel.add(uename);
		uename.setColumns(10);
		
		JButton Savepass = new JButton("Save");
		Savepass.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Savepass.setBounds(20, 209, 100, 27);
		panel.add(Savepass);
		Savepass.setForeground(new Color(255, 255, 255));
		Savepass.setBackground(new Color(139, 69, 19));
		Savepass.setFont(new Font("Rockwell", Font.BOLD, 13));
		
		
		
		backbttn = new JButton("Back");
		backbttn.setBackground(new Color(139, 69, 19));
		backbttn.setForeground(new Color(255, 255, 255));
		backbttn.setFont(new Font("Rockwell", Font.BOLD, 13));
		backbttn.setBounds(230, 256, 89, 23);
		panel.add(backbttn);
		
		lblNewLabel = new JLabel("To recover your account, begin by entering your username.");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(139, 69, 19));
		lblNewLabel.setFont(new Font("Rockwell", Font.BOLD, 15));
		lblNewLabel.setBounds(54, 11, 480, 20);
		panel.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Stacy Mae\\OneDrive - National University\\Desktop\\STEH FILES\\beautybox\\Skin Studio Logo.png"));
		lblNewLabel_1.setBounds(355, 53, 162, 169);
		panel.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Phone Number:");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setForeground(new Color(139, 69, 19));
		lblNewLabel_2.setFont(new Font("Rockwell", Font.BOLD, 13));
		lblNewLabel_2.setBounds(20, 53, 190, 15);
		panel.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("New username:");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3.setForeground(new Color(139, 69, 19));
		lblNewLabel_3.setFont(new Font("Rockwell", Font.BOLD, 13));
		lblNewLabel_3.setBounds(20, 151, 190, 15);
		panel.add(lblNewLabel_3);
		backbttn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Login Frame1 = new Login();
				Frame1.Login();
				//Frame1.setLocationRelativeTo(null);
				//Frame1.setUndecorated(true);
				//Frame1.setVisible(true);
			}
		});
		Savepass.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String passF = uename.getText();
				Login.cpnum.add(passF);
			}
		});
		resetbttn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String emailF = pnum.getText();
				
				if (emailForgot.contains(emailF)) {
					Login.email.remove(0);
				}
			}
		});
	}
}
