import java.awt.EventQueue;
import java.sql.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import net.proteanit.sql.DbUtils;

public class Members {

	private JFrame frame;
	private JTextField MName;
	private JTextField Mphone;
	private JTextField MAge;
	private JTextField MAmount;
	private JTable table;
	private JComboBox<String> coachcb;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Members window = new Members();
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
	public Members() {
		initialize();
		//GetCoach();
	}
	
	private void GetCoach() {
		
		
		}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 935, 638);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(104, 62, 17, -18);
		frame.getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.RED);
		panel_1.setBounds(0, 0, 234, 601);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(29, 167, 70, 48);
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\ARJUN\\Downloads\\coachlogo.png"));
		
		JLabel lblPayments = new JLabel("Payments");
		lblPayments.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 18));
		lblPayments.setBounds(109, 269, 84, 36);
		panel_1.add(lblPayments);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(29, 266, 57, 45);
		panel_1.add(lblNewLabel_2);
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\ARJUN\\Downloads\\paymentlogo.png"));
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(34, 366, 52, 40);
		panel_1.add(lblNewLabel_3);
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\ARJUN\\Downloads\\logout.png"));
		
		JButton btnCoach = new JButton("Coach");
		btnCoach.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Coach().setVisible(true);
			}
		});
		btnCoach.setBounds(109, 181, 85, 21);
		panel_1.add(btnCoach);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//new Members().setVisible(false);
				new gym().setVisible(true);
			}
		});
		btnLogout.setBounds(124, 376, 85, 21);
		panel_1.add(btnLogout);
		
		JLabel lblNewLabel_1_2 = new JLabel("Manage Member");
		lblNewLabel_1_2.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 24));
		lblNewLabel_1_2.setBounds(445, 41, 214, 40);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		MName = new JTextField();
		MName.setBounds(291, 151, 96, 19);
		frame.getContentPane().add(MName);
		MName.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Member Name");
		lblNewLabel.setBounds(291, 123, 96, 28);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblPhonenumber = new JLabel("PhoneNumber");
		lblPhonenumber.setBounds(291, 191, 96, 28);
		frame.getContentPane().add(lblPhonenumber);
		
		Mphone = new JTextField();
		Mphone.setColumns(10);
		Mphone.setBounds(291, 229, 96, 19);
		frame.getContentPane().add(Mphone);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setBounds(549, 123, 96, 28);
		frame.getContentPane().add(lblAge);
		
		MAge = new JTextField();
		MAge.setColumns(10);
		MAge.setBounds(549, 151, 96, 19);
		frame.getContentPane().add(MAge);
		
		JLabel lblPhonenumber_1_1 = new JLabel("Gender");
		lblPhonenumber_1_1.setBounds(678, 123, 96, 28);
		frame.getContentPane().add(lblPhonenumber_1_1);
		
		JComboBox MGen = new JComboBox();
		MGen.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female"}));
		MGen.setBounds(666, 150, 96, 21);
		frame.getContentPane().add(MGen);
		
		JLabel lblAmount = new JLabel("Amount");
		lblAmount.setBounds(291, 286, 96, 28);
		frame.getContentPane().add(lblAmount);
		
		MAmount = new JTextField();
		MAmount.setColumns(10);
		MAmount.setBounds(291, 324, 96, 19);
		frame.getContentPane().add(MAmount);
		
		JLabel lblPhonenumber_1_1_1 = new JLabel("select Coach");
		lblPhonenumber_1_1_1.setBounds(579, 217, 96, 28);
		frame.getContentPane().add(lblPhonenumber_1_1_1);
		
		JComboBox coachcb = new JComboBox();
		coachcb.setBounds(579, 271, 116, 21);
		frame.getContentPane().add(coachcb);
		
		JButton btnNewButton_1 = new JButton("Add");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(549, 365, 85, 21);
		frame.getContentPane().add(btnNewButton_1);
		
		try{
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection Con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","system","msc");
			Statement St = Con.createStatement();
			 String Query = " Select cname from coach";
			ResultSet Rs ;
			Rs = St.executeQuery(Query);
			while(Rs.next())
			{
				//coachcb.addItem(Rs.getString("Cname"));
				String Cname= Rs.getString(1);
				coachcb.addItem(Cname);
			}
		}catch(Exception e) {
			
		}
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setBackground(Color.RED);
		btnNewButton.addMouseListener(new MouseAdapter() {
			private JComboBox<String> mccoach;

			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		btnNewButton_1.addActionListener(new ActionListener() {
		
			
			public void actionPerformed(ActionEvent e) {
				Connection con = null;
				PreparedStatement pst = null;
				ResultSet Rs = null;
				Statement St = null;
				JComboBox<String> mccoach = null;
			
				
				{
					if(MName.getText().isEmpty() || Mphone.getText().isEmpty() || MAge.getText().isEmpty() || MGen.getSelectedIndex() == -1 )
					{
						JOptionPane.showMessageDialog(null,"Missing Information");
					}
					else
					{
						try {
							Class.forName("oracle.jdbc.driver.OracleDriver");
							Connection Con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","system","msc");
							PreparedStatement Add1 = Con.prepareStatement("insert into Members values(?,?,?,?,?,?)");
							Add1.setString(1, MName.getText());
							Add1.setString(2, Mphone.getText());
							Add1.setInt(3, Integer.valueOf(MAge.getText()));
							Add1.setInt(4, Integer.valueOf(MAmount.getText()));
							Add1.setString(5, MGen.getSelectedItem().toString());
							Add1.setString(6, mccoach.getSelectedItem().toString());
							
							int row =Add1.executeUpdate();
							JOptionPane.showMessageDialog(null, "Member data Saved");
							Con.close();
						}catch (Exception e1) {
							JOptionPane.showMessageDialog(null,e1);
						}
					}
				}
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection Con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","system","msc");
					Statement st = Con.createStatement();
					ResultSet rs = st.executeQuery("Select * from Members");
				String mname = MName.getText();
				String mphone = Mphone.getText();
				String mage  = MAge.getText();
				String mamount =  MAmount.getText();
				String mgender  =(String) MGen.getSelectedItem();
				String  mccoach1 = coachcb.getSelectedItem().toString();
				//String time = (String)MTimeing.getItemAt(MTimeing.getSelectedIndex());
				String qc="insert into Member values('"+mname+"','"+mphone+"','"+mage+"','"+mamount+"','"+mgender+",'"+coachcb+"')";
				st.executeUpdate(qc);
				System.out.println("value inserted");
				
			
			}catch(Exception e1) {
				System.out.println(e1);
			}
			}
			
			
		});
		
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
