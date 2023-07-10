import java.awt.EventQueue;
import java.sql.*;
import javax.swing.JOptionPane;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import net.proteanit.sql.DbUtils;

public class Coach {

	private JFrame frame;
	private JTextField CName;
	private JTextField CAge;
	private JTextField Cphone;

	/**
	 * Launch the application.
	 * @wbp.parser.entryPoint
	 */
	public static void main(String[] args) {
//
	EventQueue.invokeLater(new Runnable() {
//			
		public void run() {
//				
			try {
//					
				Coach window = new Coach();
//					
				window.frame.setVisible(true);
//				
				} catch (Exception e) {
//					
					e.printStackTrace();
//				
					}
//			
			}
//		
		});
	}

	/**
	 * Create the application.
	 */
	public Coach() {
		
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 772, 562);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new Members().setVisible(true);
				
			}
		});
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(0, 0, 758, 525);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.RED);
		panel_2.setBounds(0, 0, 178, 525);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblPayments = new JLabel("Payments");
		lblPayments.setBounds(85, 227, 83, 24);
		lblPayments.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 18));
		panel_2.add(lblPayments);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\ARJUN\\Downloads\\paymentlogo.png"));
		lblNewLabel_2.setBounds(18, 214, 57, 45);
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\ARJUN\\Downloads\\logout.png"));
		lblNewLabel_3.setBounds(23, 299, 52, 40);
		panel_2.add(lblNewLabel_3);
		
		JButton btnMembers = new JButton("Members");
		btnMembers.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new Members().setVisible(true);
			}
		});
		btnMembers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMembers.setBounds(85, 150, 85, 36);
		panel_2.add(btnMembers);
		
		JButton btnNewButton = new JButton("Logout");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new gym().setVisible(true);
				
			}
		});
		btnNewButton.setBounds(85, 299, 85, 40);
		panel_2.add(btnNewButton);
		
		JLabel lblNewLabel_1_2 = new JLabel("Manage Trainers");
		lblNewLabel_1_2.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 24));
		lblNewLabel_1_2.setBounds(320, 47, 214, 40);
		panel_1.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel = new JLabel("Trainer Name");
		lblNewLabel.setBounds(225, 112, 96, 28);
		panel_1.add(lblNewLabel);
		
		CName = new JTextField();
		CName.setColumns(10);
		CName.setBounds(225, 147, 96, 19);
		panel_1.add(CName);
		
		JLabel lblNewLabel_1 = new JLabel("Age");
		lblNewLabel_1.setBounds(362, 112, 96, 28);
		panel_1.add(lblNewLabel_1);
		
		CAge = new JTextField();
		CAge.setColumns(10);
		CAge.setBounds(362, 147, 96, 19);
		panel_1.add(CAge);
		
		Cphone = new JTextField();
		Cphone.setColumns(10);
		Cphone.setBounds(498, 147, 96, 19);
		panel_1.add(Cphone);
		
		JLabel lblNewLabel_1_1 = new JLabel("Mobile Number");
		lblNewLabel_1_1.setBounds(498, 112, 96, 28);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_4 = new JLabel("Gender");
		lblNewLabel_1_4.setBounds(630, 120, 96, 28);
		panel_1.add(lblNewLabel_1_4);
		
		JComboBox CGen = new JComboBox();
		CGen.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female"}));
		CGen.setBounds(630, 146, 96, 21);
		panel_1.add(CGen);
		
		JButton Add = new JButton("Add");
		Add.setForeground(Color.RED);
		Add.setBackground(Color.RED);
		Add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String tname = CName.getText();
			String age = CAge.getText();
			String mobile  = Cphone.getText();
			String gender = (String) CGen.getSelectedItem();
			
			
			
			
			
			}
			
		});
		Add.addMouseListener(new MouseAdapter() {
			
	
			public void mouseClicked(MouseEvent e) {
				new Members().setVisible(true);
				
			Connection con = null;
			PreparedStatement pst = null;
			ResultSet Rs = null;
			Statement St = null;
			
			{
				if(CName.getText().isEmpty() || Cphone.getText().isEmpty() || CAge.getText().isEmpty() || CGen.getSelectedIndex() == -1)
				{
					JOptionPane.showMessageDialog(null,"Missing Information");
				}
				else
				{
					try {
						Class.forName("oracle.jdbc.driver.OracleDriver");
						Connection Con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","system","msc");
						PreparedStatement Add1 = Con.prepareStatement("insert into Coach values(?,?,?,?)");
						Add1.setString(1, CName.getText());
						Add1.setString(2, Cphone.getText());
						Add1.setInt(3, Integer.valueOf(CAge.getText()));
						Add1.setString(4, CGen.getSelectedItem().toString());
						int row =Add1.executeUpdate();
						JOptionPane.showMessageDialog(null, "Trainer Saved");
						Con.close();
						
					}catch (Exception e1) {
						JOptionPane.showMessageDialog(null,e1);
					}
				}
			}
		}

			
			
			
		});
		Add.setBounds(614, 241, 85, 67);
		panel_1.add(Add);
		frame.setVisible(true);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
