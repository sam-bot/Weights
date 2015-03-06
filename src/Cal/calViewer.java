package Cal;

import java.awt.EventQueue;

import javax.swing.JFrame;

import net.miginfocom.swing.MigLayout;

import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.JButton;

// view information from all production areas
public class calViewer extends JFrame {
	JComboBox<String> reportBox;
	private JFrame frame;
	private JPanel panel;
	private JLabel lblSelectWorkstation;
	private JComboBox workstationBox;
	private JLabel lblWorkOrder;
	private JTextField workOrderField;
	private JScrollPane scrollPane;
	private JTable table;
	static DefaultTableModel model4 = new DefaultTableModel();
	private JButton btnSubmit;
	private JLabel lblDate;
	private JTextField startDateField;
	private JLabel lblFormulation;
	private JComboBox formulationBox;
	private JLabel lblGauge;
	private JTextField gaugeBox;
	private JComboBox shiftBox;
	private JLabel label;
	private JTextField endDateField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calViewer window = new calViewer();
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
	public calViewer() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Viewer");
		frame.setBounds(100, 50, 1232, 654);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(
				new MigLayout("", "[][grow]", "[][grow]"));
		String[] reports = { "", "Set Weights", "Roll Weights", "QA Audits" };
		panel = new JPanel();
		frame.getContentPane().add(panel, "cell 0 0 2 1,growx,aligny top");
		panel.setLayout(new MigLayout(
				"",
				"[grow][grow][grow][grow][grow][grow][][grow][grow][grow][grow][grow][grow][grow][grow]",
				"[]"));
		JLabel lblSelectDepartment = new JLabel("Select Report");
		panel.add(lblSelectDepartment, "cell 0 0,alignx trailing");

		reportBox = new JComboBox(reports);
		panel.add(reportBox, "cell 1 0");
		lblSelectWorkstation = new JLabel("Select Workstation");
		panel.add(lblSelectWorkstation, "cell 2 0,alignx trailing");
		workstationBox = new JComboBox();
		panel.add(workstationBox, "cell 3 0");
		workstationBox.addItem("");
		workstationBox.addItem("21");
		workstationBox.addItem("22");
		workstationBox.addItem("23");
		workstationBox.addItem("24");
		workstationBox.addItem("25");

		lblDate = new JLabel("Start Date");
		panel.add(lblDate, "cell 4 0,alignx trailing");

		startDateField = new JTextField();
		DateFormat dateFormat = new SimpleDateFormat("YYYY/MM/dd");
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, -1);
		String dateTime = dateFormat.format(cal.getTime());
		startDateField.setText(dateTime);
		panel.add(startDateField, "cell 5 0");
		startDateField.setColumns(10);

		label = new JLabel("End Date");
		panel.add(label, "cell 6 0,alignx trailing");

		endDateField = new JTextField();
		cal = Calendar.getInstance();
		dateTime = dateFormat.format(cal.getTime());
		endDateField.setText(dateTime);
		endDateField.setColumns(10);
		panel.add(endDateField, "cell 7 0,growx");

		lblWorkOrder = new JLabel("Work Order");
		panel.add(lblWorkOrder, "cell 8 0,alignx trailing");

		workOrderField = new JTextField();
		panel.add(workOrderField, "cell 9 0");
		workOrderField.setColumns(10);
		String[] formulations = { "", "CRMF", "Omni", "PWGS", "PS", "SB",
				"SBT", "HT", "HWR", "LWJ", "BLG", "LGK", "Vitawrap F",
				"Omni MT", "PWMF", "MTR", "DS", "RCR", "RLGK", "SBX" };
		lblFormulation = new JLabel("Formulation");
		panel.add(lblFormulation, "cell 10 0,alignx trailing");

		formulationBox = new JComboBox(formulations);
		panel.add(formulationBox, "flowx,cell 11 0");

		lblGauge = new JLabel("Shift");
		panel.add(lblGauge, "cell 12 0,alignx trailing");

		btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (reportBox.getSelectedItem() == "Set Weights") {
					calViewer.model4.setColumnCount(0);
					calViewer.model4.addColumn("ID");
					calViewer.model4.addColumn("Date");
					calViewer.model4.addColumn("Time");
					calViewer.model4.addColumn("Shift");
					calViewer.model4.addColumn("Line");
					calViewer.model4.addColumn("Set Number");
					calViewer.model4.addColumn("Work Order 1");
					calViewer.model4.addColumn("Rolls Per Set 1");
					calViewer.model4.addColumn("Target Set Weight 1");
					calViewer.model4.addColumn("Actual Set Weight 1");
					calViewer.model4.addColumn("Work Order 2");
					calViewer.model4.addColumn("Rolls Per Set 2");
					calViewer.model4.addColumn("Target Set Weight 2");
					calViewer.model4.addColumn("Actual Set Weight 2");
					calViewer.model4.addColumn("Percent of Target");
					calViewer.model4.addColumn("Compound");
					calViewer.model4.addColumn("Target Pounds per Hour");
					calViewer.model4.addColumn("Actual Pounds per Hour");
					calViewer.model4.addColumn("Line Speed");
				} else if (reportBox.getSelectedItem() == "Roll Weights") {
					calViewer.model4.setColumnCount(0);
					calViewer.model4.addColumn("ID");
					calViewer.model4.addColumn("Date");
					calViewer.model4.addColumn("Time");
					calViewer.model4.addColumn("Shift");
					calViewer.model4.addColumn("Work Order");
					calViewer.model4.addColumn("Set Number");
					calViewer.model4.addColumn("Roll Weight");
					calViewer.model4.addColumn("Line Number");
					calViewer.model4.addColumn("Compound");
				} else if (reportBox.getSelectedItem() == "QA Audits") {
					calViewer.model4.setColumnCount(0);
					calViewer.model4.addColumn("ID");
					calViewer.model4.addColumn("DateTime");
					calViewer.model4.addColumn("Set");
					calViewer.model4.addColumn("Work Order 1");
					calViewer.model4.addColumn("Work Order 2");
					calViewer.model4.addColumn("Width");
					calViewer.model4.addColumn("Edges");
					calViewer.model4.addColumn("Core Centering");
					calViewer.model4.addColumn("Core Quality");
					calViewer.model4.addColumn("Wrinkles");
					calViewer.model4.addColumn("Die Lines");
					calViewer.model4.addColumn("Cold Flow");
					calViewer.model4.addColumn("Holes");
					calViewer.model4.addColumn("Gels");
					calViewer.model4.addColumn("Roll Color");
					calViewer.model4.addColumn("Packaging");
					calViewer.model4.addColumn("Pallet");
					calViewer.model4.addColumn("Collapser Tension");
					calViewer.model4.addColumn("Center Stand Tension");
					calViewer.model4.addColumn("Winder Tension");
					calViewer.model4.addColumn("Collapser Temperature");
					calViewer.model4.addColumn("Comments");
					calViewer.model4.addColumn("Line Number");
					calViewer.model4.addColumn("Compound");
					calViewer.model4.addColumn("Shift");
				} else if (reportBox.getSelectedItem() == "") {
					calViewer.model4.setColumnCount(0);
					JOptionPane.showMessageDialog(frame, "Select a report ");
				}
				if (dateValidator()
						|| (startDateField.getText().equals("") && (endDateField
								.getText().equals(""))))
					displaySets();
			}
		});
		String[] shifts = { "", "1", "2" };
		shiftBox = new JComboBox(shifts);
		panel.add(shiftBox, "cell 13 0");
		panel.add(btnSubmit, "cell 14 0,alignx center");

		scrollPane = new JScrollPane();
		frame.getContentPane().add(scrollPane, "cell 0 1 2 1,grow");

		table = new JTable(calViewer.model4) {
			@Override
			public boolean getScrollableTracksViewportWidth() {
				return getPreferredSize().width < getParent().getWidth();
			}

			@Override
			public void doLayout() {
				TableColumn resizingColumn = null;
				if (tableHeader != null)
					resizingColumn = tableHeader.getResizingColumn();
				// Viewport size changed. May need to increase columns widths
				if (resizingColumn == null) {
					setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
					super.doLayout();
				}
				// Specific column resized. Reset preferred widths
				else {
					TableColumnModel tcm = getColumnModel();
					for (int i = 0; i < tcm.getColumnCount(); i++) {
						TableColumn tc = tcm.getColumn(i);
						tc.setPreferredWidth(tc.getWidth());
					}
					// Columns don't fill the viewport, invoke default layout
					if (tcm.getTotalColumnWidth() < getParent().getWidth())
						setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
					super.doLayout();
				}
				setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
			}
		};
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		scrollPane.setViewportView(table);
	}

	public void displaySets() {
		weights.sqlConnection();
		sqlSelect();
		try {
			weights.conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void sqlSelect() {
		String whereClause = "WHERE ";
		String startDate = "";
		String endDate = "";
		String shiftChoice = "";
		String lineChoice = "";
		String workOrder = "";
		String formulation = "";
		if ((!startDateField.equals(""))
				&& (!shiftBox.getSelectedItem().equals(""))
				&& (!workstationBox.getSelectedItem().equals(""))
				&& (!workOrderField.getText().equals(""))
				&& (!formulationBox.getSelectedItem().equals(""))) {
			whereClause = "";
		} else {
			if (!startDateField.getText().equals("")
					&& (!endDateField.getText().equals(""))) {
				if (reportBox.getSelectedItem().equals("QA Audits")) {
					startDate = startDateField.getText();
					endDate = endDateField.getText();
					whereClause += ("dateTimeStamp between '" + startDate
							+ "' and '" + endDate + " 23:59:59'");
				} else {
					startDate = startDateField.getText();
					endDate = endDateField.getText();
					whereClause += ("dateStamp between '" + startDate
							+ "' and '" + endDate + " 23:59:59'");
				}
			}
			if (!shiftBox.getSelectedItem().equals("")) {
				shiftChoice = (String) shiftBox.getSelectedItem();
				whereClause += "AND shift = " + shiftChoice;
			}
			if (!workstationBox.getSelectedItem().equals("")) {
				lineChoice = (String) workstationBox.getSelectedItem();
				whereClause += "AND lineNumber = " + lineChoice;
			}
			if (reportBox.getSelectedItem().equals("Roll Weights")) {
				if (!workOrderField.getText().equals("")) {
					workOrder = workOrderField.getText();
					whereClause += "AND workOrder = " + workOrder;
				}
			} else {
				if (!workOrderField.getText().equals("")) {
					workOrder = workOrderField.getText();
					whereClause += "AND workOrder1 = " + workOrder
							+ " OR workOrder2 = " + workOrder;
				}
			}
			if (!formulationBox.getSelectedItem().equals("")) {
				formulation = (String) formulationBox.getSelectedItem();
				whereClause += "AND compound = '" + formulation + "'";
			}
		}

		try {
			if (reportBox.getSelectedItem().equals("Set Weights")) {
				CallableStatement cs = null;
				cs = weights.conn.prepareCall("{call SelectCalWeightTotal(?)}");
				cs.setString(1, whereClause);
				ResultSet rs = cs.executeQuery();
				model4.setRowCount(0);
				java.sql.ResultSetMetaData rsmd = rs.getMetaData();
				int colNo = rsmd.getColumnCount();
				while (rs.next()) {
					Object[] objects = new Object[colNo];
					for (int i = 0; i < colNo; i++) {
						objects[i] = rs.getObject(i + 1);
					}
					model4.addRow(objects);
				}
				cs.close();
			} else if (reportBox.getSelectedItem().equals("Roll Weights")) {
				CallableStatement cs = null;
				cs = weights.conn.prepareCall("{call SelectCalRollWeight(?)}");
				cs.setString(1, whereClause);
				ResultSet rs = cs.executeQuery();
				model4.setRowCount(0);
				java.sql.ResultSetMetaData rsmd = rs.getMetaData();
				int colNo = rsmd.getColumnCount();
				while (rs.next()) {
					Object[] objects = new Object[colNo];
					for (int i = 0; i < colNo; i++) {
						objects[i] = rs.getObject(i + 1);
					}
					model4.addRow(objects);
				}
				cs.close();
			} else if (reportBox.getSelectedItem().equals("QA Audits")) {
				CallableStatement cs = null;
				cs = weights.conn.prepareCall("{call SelectCalQaAudit(?)}");
				cs.setString(1, whereClause);
				ResultSet rs = cs.executeQuery();
				model4.setRowCount(0);
				java.sql.ResultSetMetaData rsmd = rs.getMetaData();
				int colNo = rsmd.getColumnCount();
				while (rs.next()) {
					Object[] objects = new Object[colNo];
					for (int i = 0; i < colNo; i++) {
						objects[i] = rs.getObject(i + 1);
					}
					model4.addRow(objects);
				}
				cs.close();
			}
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		} finally {
		}

	}

	private Boolean dateValidator() {
		String startDate = startDateField.getText();
		String endDate = endDateField.getText();
		String expectedPattern = "yyyy/MM/dd";
		SimpleDateFormat formatter = new SimpleDateFormat(expectedPattern);
		try {
			java.util.Date date2 = formatter.parse(startDate);
			java.util.Date date3 = formatter.parse(endDate);
			return true;
		} catch (ParseException e) {
			// execution will come here if the String that is given
			// does not match the expected format.
			JOptionPane.showMessageDialog(frame,
					"Re-enter date in correct format: yyyy/MM/dd ");
			return false;
		}
	}
}
