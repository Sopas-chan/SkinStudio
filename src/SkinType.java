import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SkinType {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void SkinType() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SkinType window = new SkinType();
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
	public SkinType() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 910, 545);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(245, 245, 245));
		panel.setBounds(10, 11, 220, 484);
		frame.getContentPane().add(panel);
		
		JLabel skinstudiologo = new JLabel("");
		skinstudiologo.setIcon(new ImageIcon("C:\\Users\\Stacy Mae\\OneDrive - National University\\Desktop\\STEH FILES\\beautybox\\Skin Studio Logo.png"));
		skinstudiologo.setBounds(29, 11, 162, 162);
		panel.add(skinstudiologo);
		
		JButton btn1 = new JButton("HOME");
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Dashboard page = new Dashboard();
				page.Dashboard();
				frame.hide();
			}
		});
		btn1.setForeground(new Color(240, 248, 255));
		btn1.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		btn1.setBackground(new Color(205, 133, 63));
		btn1.setBounds(10, 201, 200, 39);
		panel.add(btn1);
		
		JButton btn2 = new JButton("SKIN TYPE");
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				SkinGuide page = new SkinGuide();
				page.SkinGuide();
				frame.hide();
			}
		});
		btn2.setForeground(new Color(240, 248, 255));
		btn2.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		btn2.setBackground(new Color(205, 133, 63));
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
		btn3.setForeground(new Color(240, 248, 255));
		btn3.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		btn3.setBackground(new Color(205, 133, 63));
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
		btn4.setForeground(new Color(240, 248, 255));
		btn4.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 15));
		btn4.setBackground(new Color(205, 133, 63));
		btn4.setBounds(10, 351, 200, 39);
		panel.add(btn4);
		
		JButton signout = new JButton("Sign out");
		signout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Homepage Home = new Homepage();
				Home.main(null);
				frame.dispose();
			}
		});
		signout.setForeground(new Color(240, 248, 255));
		signout.setFont(new Font("Rockwell", Font.BOLD, 12));
		signout.setBackground(new Color(205, 133, 63));
		signout.setBounds(55, 400, 107, 23);
		panel.add(signout);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 250, 240));
		panel_1.setBounds(240, 11, 644, 484);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Stacy Mae\\OneDrive - National University\\Desktop\\STEH FILES\\beautybox\\skintype.png"));
		lblNewLabel_3.setBounds(0, 0, 644, 484);
		panel_1.add(lblNewLabel_3);
	}

}
