package Arr;

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
import java.util.ArrayList;

public class createUser {

	private JFrame frame;
	private JTextField userNameField;
	private JTextField passwordField;
	private ArrayList<JTextField> list;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					createUser window = new createUser();
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
	public createUser() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Create New Users");
		frame.setBounds(100, 100, 330, 134);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(
				new MigLayout("", "[][grow]", "[][][][]"));
		// add all textfields to one collection
		list = new ArrayList<JTextField>();
		JLabel lblUserName = new JLabel("User Name");
		frame.getContentPane().add(lblUserName, "cell 0 0,alignx trailing");

		userNameField = new JTextField();
		frame.getContentPane().add(userNameField, "cell 1 0,growx");
		userNameField.setColumns(10);
		list.add(userNameField);

		JLabel lblPassword = new JLabel("Password");
		frame.getContentPane().add(lblPassword, "cell 0 1,alignx trailing");

		passwordField = new JTextField();
		frame.getContentPane().add(passwordField, "cell 1 1,growx");
		passwordField.setColumns(10);
		list.add(passwordField);

		JButton btnSubmit = new JButton("Create");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				insertUserSQL();
				clearFields();
			}

		});
		frame.getContentPane().add(btnSubmit, "flowx,cell 1 3,alignx center");

		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				deleteUserSQL();
				clearFields();
			}
		});
		frame.getContentPane().add(btnDelete, "cell 1 3");
	}

	private void insertUserSQL() {
		arrWeights.sqlConnection();
		String userName = userNameField.getText();
		String password = passwordField.getText();
		try {
			CallableStatement cs = null;
			cs = arrWeights.conn.prepareCall("{call InsertArrUsers(?,?)}");
			cs.setString(1, userName);
			cs.setString(2, password);
			cs.execute();
			cs.close();
			JOptionPane.showMessageDialog(null, "User " + userName + " created");
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

	private void deleteUserSQL() {
		arrWeights.sqlConnection();
		String userName = userNameField.getText();
		try {
			CallableStatement cs = null;
			cs = arrWeights.conn.prepareCall("{call DeleteArrUsers(?)}");
			cs.setString(1, userName);
			cs.execute();
			cs.close();
			JOptionPane.showMessageDialog(null, "User " + userName + " deleted");
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

	// clear textfields
	private void clearFields() {
		for (JTextField j : list)
			j.setText("");
	}
}
