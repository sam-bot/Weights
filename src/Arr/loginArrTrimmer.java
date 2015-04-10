package Arr;

import java.awt.EventQueue;

import javax.swing.JFrame;

import net.miginfocom.swing.MigLayout;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

public class loginArrTrimmer {

	private JFrame frame;
	static JTextField userNameField;
	private JPasswordField passwordField;
	private JButton btnSubmit;
	static loginArrTrimmer loginWindow;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginWindow = new loginArrTrimmer();
					loginWindow.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public loginArrTrimmer() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Login Screen");
		frame.setBounds(100, 100, 330, 134);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(
				new MigLayout("", "[][grow]", "[][][]"));

		JLabel lblUsername = new JLabel("User Name");
		frame.getContentPane().add(lblUsername, "cell 0 0,alignx trailing");

		userNameField = new JTextField();
		frame.getContentPane().add(userNameField, "cell 1 0,growx");
		userNameField.setColumns(10);

		JLabel lblPassword = new JLabel("Password");
		frame.getContentPane().add(lblPassword, "cell 0 1,alignx trailing");

		passwordField = new JPasswordField();
		frame.getContentPane().add(passwordField, "cell 1 1,growx");
		passwordField.setColumns(10);

		btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkUsernamePassword();
			}
		});
		frame.getContentPane().add(btnSubmit, "cell 1 2,alignx center");
	}

	private void checkUsernamePassword() {
		arrWeights.sqlConnection();
		String userName = userNameField.getText();
		String password = passwordField.getText();
		try {
			CallableStatement cs = null;
			cs = arrWeights.conn.prepareCall("{? =call checkUser(?,?)}");
			cs.setString(2, userName);
			cs.setString(3, password);
			cs.registerOutParameter(1, Types.INTEGER);
			cs.execute();
			int returnValue = cs.getInt(1);
			if (returnValue == 1) {
				arrTrimmer window = new arrTrimmer(userName);
				window.getFrame().setVisible(true);
				loginWindow.frame.setVisible(false);
			} else if (returnValue == 0) {
				JOptionPane.showMessageDialog(null,
						"Incorrect user name or password");
			}
			cs.close();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		} finally {
			try {
				if (arrWeights.conn != null)
					arrWeights.conn.close();
			} catch (SQLException e) {
				System.err.println(e);
			}
		}
	}
}
