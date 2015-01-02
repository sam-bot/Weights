import java.awt.EventQueue;
import java.awt.Font;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JFrame;

import net.miginfocom.swing.MigLayout;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.IOException;

import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

import java.awt.GridLayout;

public class previousSets {

	public JFrame frame;
	private JTextField textField;
	String dateStamp = "";
	String timeStamp = "";
	String shift = "";
	String lineNumber = "";
	String setNumber = "";
	String workOrder1 = "";
	String rollsPerSet1 = "";
	String targetSet1Weight = "";
	String actualSet1Weight = "";
	String workOrder2 = "";
	String rollsPerSet2 = "";
	String targetSet2Weight = "";
	String actualSet2Weight = "";
	String percentOfTarget = "";
	String compound = "";
	String targetPoundsHour = "";
	String actualPoundsHour = "";
	String lineSpeed = "";
	String dateTimeStamp = "";
	String rollWorkOrder = "";
	String rollSetNumber = "";
	String rollWeight = "";
	String rollDateStamp = "";
	String rollTimeStamp = "";
	String rollShift = "";

	String[][] table4Vals = { { percentOfTarget, compound, targetPoundsHour,
			actualPoundsHour, lineSpeed } };

	JComboBox comboBox;
	JComboBox comboBox_1;
	JComboBox comboBox_2;
	private JTable table_5;
	DefaultTableModel model = new DefaultTableModel();
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					previousSets window = new previousSets();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * 
	 * @throws ParseException
	 */
	public previousSets() throws ParseException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * 
	 * @throws ParseException
	 */
	private void initialize() throws ParseException {
		frame = new JFrame("Set Weight Viewer");
		frame.setBounds(100, 10, 950, 475);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane()
				.setLayout(
						new MigLayout(
								"",
								"[grow][][grow][grow]",
								"[][][][][][][][][][][grow][][][][][][18.00,grow][grow][grow][grow][][][grow][grow]"));

		String[] setNumber = { "1", "2", "3", "4", "5", "6", "7", "8", "9",
				"10", "11", "12", "13", "14", "15", "16", "17", "18", "19",
				"20" };

		JLabel lblDate = new JLabel("Date");
		frame.getContentPane().add(lblDate, "flowx,cell 0 0,alignx center");

		JLabel lblNewLabel = new JLabel("Set Number");
		frame.getContentPane().add(lblNewLabel, "flowx,cell 3 0,alignx center");

		JLabel lblShift = new JLabel("Shift");
		frame.getContentPane().add(lblShift, "flowx,cell 0 2,alignx center");

		String[] shift = { "1", "2" };

		JButton btnSubmit = new JButton("Display Set");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (dateValidator())
					try {
						displaySet();
					} catch (ClassNotFoundException e) {
						e.printStackTrace();
					} catch (SQLException e) {
						e.printStackTrace();
					} catch (ParseException e) {
						e.printStackTrace();
					} catch (IOException e) {
						e.printStackTrace();
					}
				;
			}
		});
		String[] lines = { "21", "22", "23", "24", "25" };

		JLabel lblLineNumber = new JLabel("Line Number");
		frame.getContentPane().add(lblLineNumber,
				"flowx,cell 3 2,alignx center");
		frame.getContentPane().add(btnSubmit,
				"flowx,cell 0 4 4 1,alignx center");

		textField = new JTextField();
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		Calendar cal = Calendar.getInstance();
		String dateTime = dateFormat.format(cal.getTime());
		textField.setText(dateTime);
		frame.getContentPane().add(textField, "cell 0 0,growx");
		textField.setColumns(10);
		comboBox_1 = new JComboBox(shift);
		frame.getContentPane().add(comboBox_1, "cell 0 2,growx");
		comboBox = new JComboBox(setNumber);
		frame.getContentPane().add(comboBox, "cell 3 0,growx");
		comboBox_2 = new JComboBox(lines);
		frame.getContentPane().add(comboBox_2, "cell 3 2,growx");

		JLabel lblPercentOfTarget = new JLabel("Percent of Target");
		frame.getContentPane().add(lblPercentOfTarget, "flowx,cell 0 5");

		JLabel lblTargetLbhr = new JLabel("Target Lb/Hr");
		frame.getContentPane().add(lblTargetLbhr, "flowx,cell 0 6");

		JLabel lblActualLbhr = new JLabel("Actual Lb/Hr");
		frame.getContentPane().add(lblActualLbhr, "flowx,cell 2 6");

		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, "cell 0 10 4 1,grow");
		panel.setLayout(new GridLayout(1, 0, 0, 0));

		JScrollPane scrollPane_5 = new JScrollPane();
		frame.getContentPane().add(scrollPane_5, "cell 0 12 4 1,grow");

		table_5 = new JTable(model);
		model.addColumn("Date");
		model.addColumn("Time");
		model.addColumn("Shift");
		model.addColumn("Work Order");
		model.addColumn("Set Number");
		model.addColumn("Roll Weight");
		scrollPane_5.setViewportView(table_5);

		textField_1 = new JTextField();
		frame.getContentPane().add(textField_1, "cell 0 5,growx");
		textField_1.setColumns(10);

		JLabel lblLineSpeed = new JLabel("Line Speed");
		frame.getContentPane().add(lblLineSpeed, "flowx,cell 2 5");

		textField_2 = new JTextField();
		frame.getContentPane().add(textField_2, "cell 2 5,growx");
		textField_2.setColumns(10);

		textField_3 = new JTextField();
		frame.getContentPane().add(textField_3, "cell 0 6,growx");
		textField_3.setColumns(10);

		textField_4 = new JTextField();
		frame.getContentPane().add(textField_4, "cell 2 6,growx");
		textField_4.setColumns(10);

		JButton btnDisplayAllSets = new JButton("Display All Sets for Shift");
		btnDisplayAllSets.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (dateValidator())
					try {
						displayShift();
					} catch (ClassNotFoundException e) {
						e.printStackTrace();
					} catch (SQLException e) {
						e.printStackTrace();
					} catch (ParseException e) {
						e.printStackTrace();
					} catch (IOException e) {
						e.printStackTrace();
					}
				;
			}
		});
		frame.getContentPane().add(btnDisplayAllSets, "cell 3 4");

	}

	private Boolean dateValidator() {
		String date = textField.getText();
		String expectedPattern = "yyyy/MM/dd";
		SimpleDateFormat formatter = new SimpleDateFormat(expectedPattern);
		try {
			Date date2 = formatter.parse(date);
			return true;
		} catch (ParseException e) {
			// execution will come here if the String that is given
			// does not match the expected format.
			JOptionPane.showMessageDialog(frame,
					"Re-enter date in correct format: yyyy/MM/dd ");
			return false;
		}
	}

	private void displaySet() throws ClassNotFoundException, SQLException,
			ParseException, IOException {
		String date = textField.getText();
		weights.sqlConnection();
		sqlSelect();
		rollSQL();
		weights.conn.close();
	}

	private void displayShift() throws ClassNotFoundException, SQLException,
			ParseException, IOException {
		String date = textField.getText();
		weights.sqlConnection();
		sqlSelect();
		rollSQLNoSet();
		weights.conn.close();
	}

	private void sqlSelect() throws ParseException {
		String date = textField.getText();
		String setChoice = (String) comboBox.getSelectedItem();
		int setInt = Integer.valueOf(setChoice);
		String shiftChoice = (String) comboBox_1.getSelectedItem();
		int shiftInt = Integer.valueOf(shiftChoice);
		String lineChoice = (String) comboBox_2.getSelectedItem();
		int lineInt = Integer.valueOf(lineChoice);

		try {
			CallableStatement cs = null;
			cs = weights.conn
					.prepareCall("{call SelectCalWeightTotal(?,?,?,?)}");
			cs.setString(1, date);
			cs.setInt(2, setInt);
			cs.setInt(3, shiftInt);
			cs.setInt(4, lineInt);
			ResultSet rs = cs.executeQuery();
			while (rs.next()) {
				textField_1.setText(rs.getString("percentOfTarget"));
				textField_3.setText(rs.getString("targetPoundsHour"));
				textField_4.setText(rs.getString("actualPoundsHour"));
				textField_2.setText(rs.getString("lineSpeed"));

			}
			cs.close();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		} finally {
		}
	}

	private void rollSQL() throws ParseException {
		String date = textField.getText();
		String setChoice = (String) comboBox.getSelectedItem();
		int setInt = Integer.valueOf(setChoice);
		String shiftChoice = (String) comboBox_1.getSelectedItem();
		int shiftInt = Integer.valueOf(shiftChoice);
		String lineChoice = (String) comboBox_2.getSelectedItem();
		int lineInt = Integer.valueOf(lineChoice);

		try {
			CallableStatement cs = null;
			cs = weights.conn
					.prepareCall("{call SelectCalRollWeight(?,?,?,?)}");
			cs.setString(1, date);
			cs.setInt(2, setInt);
			cs.setInt(3, shiftInt);
			cs.setInt(4, lineInt);
			ResultSet rs = cs.executeQuery();
			int i = 0;
			model.setRowCount(0);
			while (rs.next()) {
				String t1 = rs.getString("dateStamp");
				Object t1a = t1;
				String t2 = rs.getString("timeStamp");
				Object t2a = t2;
				String t3 = rs.getString("shift");
				Object t3a = t3;
				String t4 = rs.getString("workorder");
				Object t4a = t4;
				String t5 = rs.getString("setNumber");
				Object t5a = t5;
				String t6 = rs.getString("rollWeight");
				Object t6a = t6;
				model.addRow(new Object[] { t1a, t2a, t3a, t4a, t5a, t6a });
				i++;
			}
			table_5.repaint();
			cs.close();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		} finally {

		}
	}

	private void rollSQLNoSet() throws ParseException {
		String date = textField.getText();
		String shiftChoice = (String) comboBox_1.getSelectedItem();
		int shiftInt = Integer.valueOf(shiftChoice);
		String lineChoice = (String) comboBox_2.getSelectedItem();
		int lineInt = Integer.valueOf(lineChoice);

		try {
			CallableStatement cs = null;
			cs = weights.conn
					.prepareCall("{call SelectCalRollWeightNoSet(?,?,?)}");
			cs.setString(1, date);
			cs.setInt(2, shiftInt);
			cs.setInt(3, lineInt);
			ResultSet rs = cs.executeQuery();
			int i = 0;
			model.setRowCount(0);
			while (rs.next()) {
				String t1 = rs.getString("dateStamp");
				Object t1a = t1;
				String t2 = rs.getString("timeStamp");
				Object t2a = t2;
				String t3 = rs.getString("shift");
				Object t3a = t3;
				String t4 = rs.getString("workorder");
				Object t4a = t4;
				String t5 = rs.getString("setNumber");
				Object t5a = t5;
				String t6 = rs.getString("rollWeight");
				Object t6a = t6;
				model.addRow(new Object[] { t1a, t2a, t3a, t4a, t5a, t6a });
				i++;
			}
			table_5.repaint();
			cs.close();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		} finally {

		}
	}
}
