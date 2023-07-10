import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;

public class Payments {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Payments window = new Payments();
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
	public Payments() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 673, 486);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 659, 1);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.RED);
		panel_1.setBounds(0, 0, 173, 449);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblPayments = new JLabel("Payments");
		lblPayments.setBounds(80, 227, 83, 24);
		lblPayments.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 18));
		panel_1.add(lblPayments);
		
		JLabel lblLogout = new JLabel("Logout");
		lblLogout.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 18));
		lblLogout.setBounds(79, 285, 84, 36);
		panel_1.add(lblLogout);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\ARJUN\\Downloads\\paymentlogo.png"));
		lblNewLabel_2.setBounds(13, 216, 57, 45);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\ARJUN\\Downloads\\logout.png"));
		lblNewLabel_3.setBounds(17, 281, 52, 40);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblCoach = new JLabel("Coach");
		lblCoach.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 18));
		lblCoach.setBounds(80, 165, 83, 24);
		panel_1.add(lblCoach);
		
		JLabel lblNewLabel_1_2 = new JLabel("Manage Finance");
		lblNewLabel_1_2.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 24));
		lblNewLabel_1_2.setBounds(290, 39, 214, 40);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblMonth = new JLabel("Month");
		lblMonth.setBounds(211, 114, 57, 28);
		frame.getContentPane().add(lblMonth);
		
		JLabel lblNewLabel_1 = new JLabel("Member Name");
		lblNewLabel_1.setBounds(202, 192, 96, 28);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(202, 226, 96, 19);
		frame.getContentPane().add(textField);
		
		JLabel lblNewLabel_1_1 = new JLabel("Amount");
		lblNewLabel_1_1.setBounds(202, 273, 96, 28);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(202, 293, 96, 19);
		frame.getContentPane().add(textField_1);
		
		JButton btnPay = new JButton("Pay");
		btnPay.setBounds(183, 336, 85, 21);
		frame.getContentPane().add(btnPay);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(278, 336, 85, 21);
		frame.getContentPane().add(btnReset);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setBounds(412, 147, 85, 21);
		frame.getContentPane().add(btnSearch);
		
		JButton btnRefresh = new JButton("Refresh");
		btnRefresh.setBounds(529, 147, 85, 21);
		frame.getContentPane().add(btnRefresh);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(436, 119, 138, 19);
		frame.getContentPane().add(textField_2);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerDateModel(new Date(1679337000000L), new Date(953699400000L), null, Calendar.DAY_OF_WEEK_IN_MONTH));
		spinner.setBounds(202, 152, 96, 20);
		frame.getContentPane().add(spinner);
	}
}
