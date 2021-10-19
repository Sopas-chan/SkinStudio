import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Panel;

import javax.swing.JLayeredPane;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Dashboard extends JFrame {


	
	private JFrame frame;
	public static ArrayList <String> email = new ArrayList();
    public static ArrayList <String> cpnum = new ArrayList();
	/**
	 * Launch the application.
	 */
	public static void Dashboard() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dashboard window = new Dashboard();
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
	public Dashboard() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Stacy Mae\\OneDrive - National University\\Desktop\\STEH FILES\\beautybox\\Skin Studio Logo.png"));
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 910, 544);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(245, 245, 245));
		panel.setBounds(10, 11, 220, 484);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel skinstudiologo = new JLabel("");
		skinstudiologo.setIcon(new ImageIcon("C:\\Users\\Stacy Mae\\OneDrive - National University\\Desktop\\STEH FILES\\beautybox\\Skin Studio Logo.png"));
		skinstudiologo.setBounds(29, 11, 162, 162);
		panel.add(skinstudiologo);
		
		JButton btn1 = new JButton("HOME");
		btn1.setBackground(new Color(205, 133, 63));
		btn1.setForeground(new Color(240, 248, 255));
		btn1.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		btn1.setBounds(10, 201, 200, 39);
		panel.add(btn1);
		
		JButton btn2 = new JButton("SKIN TYPE");
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				SkinType page = new SkinType();
				page.SkinType();
				frame.hide();
				
			}
		});
		btn2.setBackground(new Color(205, 133, 63));
		btn2.setForeground(new Color(240, 248, 255));
		btn2.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		btn2.setBounds(10, 251, 200, 39);
		panel.add(btn2);
		
		JButton btn3 = new JButton("SKIN GUIDE");
		btn3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				SkinGuide page = new SkinGuide();
				page.SkinGuide();
				frame.hide();
			}
		});
		btn3.setBackground(new Color(205, 133, 63));
		btn3.setForeground(new Color(240, 248, 255));
		btn3.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		btn3.setBounds(10, 301, 200, 39);
		panel.add(btn3);
		
		JButton btn4 = new JButton("SKIN CONCERN");
		btn4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				SkinConcern page = new SkinConcern();
				page.SkinConcern();
				frame.hide();
			}
		});
		btn4.setBackground(new Color(205, 133, 63));
		btn4.setForeground(new Color(240, 248, 255));
		btn4.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 15));
		btn4.setBounds(10, 351, 200, 39);
		panel.add(btn4);
		
		JButton signout = new JButton("Sign out");
		signout.setFont(new Font("Rockwell", Font.BOLD, 12));
		signout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Homepage Home = new Homepage();
				Home.main(null);
				frame.dispose();
			}
		});
		signout.setForeground(new Color(240, 248, 255));
		signout.setBackground(new Color(205, 133, 63));
		signout.setBounds(55, 400, 107, 23);
		panel.add(signout);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(240, 11, 644, 484);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Stacy Mae\\OneDrive - National University\\Desktop\\STEH FILES\\beautybox\\homebar.gif"));
		lblNewLabel.setBounds(0, 0, 644, 484);
		panel_1.add(lblNewLabel);
	}
}
