import java.awt.EventQueue;

import javax.swing.JFrame;

import net.miginfocom.swing.MigLayout;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

public class loginUser {

	private JFrame frame;
	private JTextField userNameField;
	private JTextField passwordField;
	private JButton btnSubmit;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginUser window = new loginUser();
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
	public loginUser() {
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

		passwordField = new JTextField();
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
		weights.sqlConnection();
		String userName = userNameField.getText();
		String password = passwordField.getText();
		try {
			CallableStatement cs = null;
			cs = weights.conn.prepareCall("{? =call checkUser(?,?)}");
			cs.setString(2, userName);
			cs.setString(3, password);
			cs.registerOutParameter(1, Types.INTEGER);
			cs.execute();
			int returnValue = cs.getInt(1);
			if (returnValue == 1) {
				processConditions window = new processConditions(userName);
				window.getFrame().setVisible(true);
			} else if (returnValue == 0) {
				JOptionPane.showMessageDialog(null,
						"Incorrect user name or password");
			}
			cs.close();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		} finally {
			try {
				if (weights.conn != null)
					weights.conn.close();
			} catch (SQLException e) {
				System.err.println(e);
			}
		}
	}
}
