package Arr;

import java.awt.EventQueue;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;

import net.miginfocom.swing.MigLayout;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class viewUsers {

	private JFrame frame;
	private JTable table;
	static DefaultTableModel model7 = new DefaultTableModel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					viewUsers window = new viewUsers();
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
	public viewUsers() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("User Names and Passwords");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new MigLayout("", "[grow]", "[grow]"));
		JScrollPane scrollPane = new JScrollPane();
		frame.getContentPane().add(scrollPane, "cell 0 0,grow");
		table = new JTable(model7);
		scrollPane.setViewportView(table);
		viewUsers.model7.addColumn("User IDs");
		viewUsers.model7.addColumn("User Name");
		viewUsers.model7.addColumn("Password");
		SQLSelect();
	}

	private void SQLSelect() {
		arrWeights.sqlConnection();
		try {
			CallableStatement cs = null;
			String whereClause = "";
			cs = arrWeights.conn.prepareCall("{call SelectArrUsers(?)}");
			cs.setString(1, whereClause);
			ResultSet rs = cs.executeQuery();
			model7.setRowCount(0);
			java.sql.ResultSetMetaData rsmd = rs.getMetaData();
			int colNo = rsmd.getColumnCount();
			while (rs.next()) {
				Object[] objects = new Object[colNo];
				for (int i = 0; i < colNo; i++) {
					objects[i] = rs.getObject(i + 1);
				}
				model7.addRow(objects);
			}
			cs.close();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		} finally {
		}
	}

}
