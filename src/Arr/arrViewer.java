package Arr;

import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;

import net.miginfocom.swing.MigLayout;

import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JPanel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.JButton;

// view information from all production areas
public class arrViewer extends JFrame {
	JComboBox<String> departmentBox;
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
	private JTextField dateField;
	private JLabel lblFormulation;
	private JComboBox formulationBox;
	private JLabel lblGauge;
	private JTextField gaugeBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					arrViewer window = new arrViewer();
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
	public arrViewer() {
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
		String[] departments = { "", "Driller", "Trimmer", "Extrusion",
				"SOC's", "Housekeeping Audits", "QA Audits" };
		panel = new JPanel();
		frame.getContentPane().add(panel, "cell 0 0 2 1,growx,aligny top");
		panel.setLayout(new MigLayout(
				"",
				"[grow][grow][grow][grow][grow][grow][][grow][grow][grow][grow][grow][grow]",
				"[]"));
		JLabel lblSelectDepartment = new JLabel("Select Department");
		panel.add(lblSelectDepartment, "cell 0 0,alignx trailing");

		departmentBox = new JComboBox(departments);
		departmentBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (departmentBox.getSelectedItem() == "Driller") {
					workstationBox.removeAllItems();
					workstationBox.addItem("");
					workstationBox.addItem("FCV340005");
				} else if (departmentBox.getSelectedItem() == "Trimmer") {
					workstationBox.removeAllItems();
					workstationBox.addItem("");
					workstationBox.addItem("FCV340001");
					workstationBox.addItem("FCV340002");
				} else if (departmentBox.getSelectedItem() == "Extrusion") {
					workstationBox.removeAllItems();
					workstationBox.addItem("");
					workstationBox.addItem("FEX340001");
					workstationBox.addItem("FEX340002");
					workstationBox.addItem("FEX340003");
					workstationBox.addItem("FEX340004");
					workstationBox.addItem("FEX340006");
					workstationBox.addItem("FEX340007");
					workstationBox.addItem("FEX340008");
				} else if (departmentBox.getSelectedItem() == "SOC's") {
					workstationBox.removeAllItems();
					workstationBox.addItem("");
					workstationBox.addItem("FEX340001");
					workstationBox.addItem("FEX340002");
					workstationBox.addItem("FEX340003");
					workstationBox.addItem("FEX340004");
					workstationBox.addItem("FEX340006");
					workstationBox.addItem("FEX340007");
					workstationBox.addItem("FEX340008");
				} else if (departmentBox.getSelectedItem() == "QA Audits") {
					workstationBox.removeAllItems();
					workstationBox.addItem("");
					workstationBox.addItem("FEX340001");
					workstationBox.addItem("FEX340002");
					workstationBox.addItem("FEX340003");
					workstationBox.addItem("FEX340004");
					workstationBox.addItem("FEX340006");
					workstationBox.addItem("FEX340007");
					workstationBox.addItem("FEX340008");
				} else if (departmentBox.getSelectedItem() == "Housekeeping Audits") {
					workstationBox.removeAllItems();
					workstationBox.addItem("");
					workstationBox.addItem("FEX340001");
					workstationBox.addItem("FEX340002");
					workstationBox.addItem("FEX340003");
					workstationBox.addItem("FEX340004");
					workstationBox.addItem("FEX340006");
					workstationBox.addItem("FEX340007");
					workstationBox.addItem("FEX340008");
					workstationBox.addItem("FCV340001");
					workstationBox.addItem("FCV340002");
					workstationBox.addItem("FCV340005");
				}
			}
		});
		panel.add(departmentBox, "cell 1 0");
		String[] placeholder = { "" };

		lblSelectWorkstation = new JLabel("Select Workstation");
		panel.add(lblSelectWorkstation, "cell 2 0,alignx trailing");
		workstationBox = new JComboBox(placeholder);
		panel.add(workstationBox, "cell 3 0");

		lblDate = new JLabel("Date");
		panel.add(lblDate, "cell 4 0,alignx trailing");

		dateField = new JTextField();
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/YYYY");
		Calendar cal = Calendar.getInstance();
		String dateTime = dateFormat.format(cal.getTime());
		dateField.setText(dateTime);
		panel.add(dateField, "cell 5 0");
		dateField.setColumns(10);

		lblWorkOrder = new JLabel("Work Order");
		panel.add(lblWorkOrder, "cell 6 0,alignx trailing");

		workOrderField = new JTextField();
		panel.add(workOrderField, "cell 7 0");
		workOrderField.setColumns(10);
		String[] formulations = { "CRMF", };
		lblFormulation = new JLabel("Formulation");
		panel.add(lblFormulation, "cell 8 0,alignx trailing");

		formulationBox = new JComboBox(formulations);
		panel.add(formulationBox, "flowx,cell 9 0");

		lblGauge = new JLabel("Gauge");
		panel.add(lblGauge, "cell 10 0,alignx trailing");

		gaugeBox = new JTextField();
		panel.add(gaugeBox, "cell 11 0");
		gaugeBox.setColumns(10);

		btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (departmentBox.getSelectedItem() == "Driller") {
					arrViewer.model4.setColumnCount(0);
					arrViewer.model4.addColumn("Work Order");
					arrViewer.model4.addColumn("Operator");
					arrViewer.model4.addColumn("Shift");
					arrViewer.model4.addColumn("Date Time");
					arrViewer.model4.addColumn("Extruded Item");
					arrViewer.model4.addColumn("Extruded Core Tag");
					arrViewer.model4.addColumn("Drilled Core Tag Item");
					arrViewer.model4.addColumn("Drilled Item");
					arrViewer.model4.addColumn("Formula");
					arrViewer.model4.addColumn("Gauge");
					arrViewer.model4.addColumn("Length");
					arrViewer.model4.addColumn("Width");
					arrViewer.model4.addColumn("Weight");
				} else if (departmentBox.getSelectedItem() == "Trimmer") {
					arrViewer.model4.setColumnCount(0);
					arrViewer.model4.addColumn("Work Order");
					arrViewer.model4.addColumn("Operator");
					arrViewer.model4.addColumn("Shift");
					arrViewer.model4.addColumn("Date Time");
					arrViewer.model4.addColumn("Extruded Item");
					arrViewer.model4.addColumn("Extruded Core Tag");
					arrViewer.model4.addColumn("Formula");
					arrViewer.model4.addColumn("Gauge");
					arrViewer.model4.addColumn("Length");
					arrViewer.model4.addColumn("Finished Width");
					arrViewer.model4.addColumn("Weight");
				} else if (departmentBox.getSelectedItem() == "Extrusion") {
					arrViewer.model4.setColumnCount(0);
					arrViewer.model4.addColumn("Operator");
					arrViewer.model4.addColumn("Shift");
					arrViewer.model4.addColumn("Date Time");
					arrViewer.model4.addColumn("Workstation");
					arrViewer.model4.addColumn("Work Order 1");
					arrViewer.model4.addColumn("Item Number 1");
					arrViewer.model4.addColumn("Work Order 2");
					arrViewer.model4.addColumn("Item Number 2");
					arrViewer.model4.addColumn("Work Order 3");
					arrViewer.model4.addColumn("Item Number 3");
					arrViewer.model4.addColumn("Work Order 4");
					arrViewer.model4.addColumn("Item Number 4");
				} else if (departmentBox.getSelectedItem() == "SOC's") {
					viewSOCs();
				} else if (departmentBox.getSelectedItem() == "QA Audits") {
					arrViewer.model4.setColumnCount(0);
					arrViewer.model4.addColumn("Work Order");
					arrViewer.model4.addColumn("User");
					arrViewer.model4.addColumn("DateTime");
					arrViewer.model4.addColumn("Shift");
					arrViewer.model4.addColumn("Roll ID");
					arrViewer.model4.addColumn("Knife Movement");
					arrViewer.model4.addColumn("Core Centering");
					arrViewer.model4.addColumn("Counter");
					arrViewer.model4.addColumn("Wrinkles");
					arrViewer.model4.addColumn("Packaging");
					arrViewer.model4.addColumn("Die Lines");
					arrViewer.model4.addColumn("Width");
					arrViewer.model4.addColumn("Edge Quality");
					arrViewer.model4.addColumn("Burn");
					arrViewer.model4.addColumn("Weight");
					arrViewer.model4.addColumn("Comments");
				} else if (departmentBox.getSelectedItem() == "Housekeeping Audits") {
					arrViewer.model4.setColumnCount(0);
					arrViewer.model4.addColumn("WorkStation");
					arrViewer.model4.addColumn("Shift");
					arrViewer.model4.addColumn("DateTime");
					arrViewer.model4.addColumn("Sweep Mixer");
					arrViewer.model4.addColumn("Clean Trough");
					arrViewer.model4.addColumn("Scrap Core Inspection");
					arrViewer.model4.addColumn("Extruder Screens");
					arrViewer.model4.addColumn("Scrap Usage");
					arrViewer.model4.addColumn("Guard Hopper Lid");
					arrViewer.model4.addColumn("Guard Extruder Right");
					arrViewer.model4.addColumn("Guard Extruder Left");
					arrViewer.model4.addColumn("Containment Doors");
					arrViewer.model4.addColumn("Grinder Chute");
					arrViewer.model4.addColumn("Grinder Latch");
					arrViewer.model4.addColumn("Grinder Door");
					arrViewer.model4.addColumn("Winder Right Front");
					arrViewer.model4.addColumn("Winder Right Rear");
					arrViewer.model4.addColumn("Winder Left Front");
					arrViewer.model4.addColumn("Winder Left Rear");
				} else if (departmentBox.getSelectedItem() == "") {
					arrViewer.model4.setColumnCount(0);
				}
				columnWidth();
			}
		});
		panel.add(btnSubmit, "cell 12 0,alignx center");

		scrollPane = new JScrollPane();
		frame.getContentPane().add(scrollPane, "cell 0 1 2 1,grow");

		table = new JTable(arrViewer.model4) {
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

	public void columnWidth() {
		for (int i = 0; i < table.getColumnCount(); i++) {
			DefaultTableColumnModel colModel = (DefaultTableColumnModel) table
					.getColumnModel();
			TableColumn col = colModel.getColumn(i);
			int width = 0;

			TableCellRenderer renderer = col.getHeaderRenderer();
			if (renderer == null) {
				renderer = table.getTableHeader().getDefaultRenderer();
			}
			Component comp = renderer.getTableCellRendererComponent(table,
					col.getHeaderValue(), false, false, 0, 0);
			width = comp.getPreferredSize().width;
			col.setPreferredWidth(width + 2);
		}

	}

	private void viewSOCs() {
		arrViewer.model4.setColumnCount(0);
		arrViewer.model4.addColumn("Date");
		arrViewer.model4.addColumn("Shift");
		arrViewer.model4.addColumn("Operator");
		arrViewer.model4.addColumn("Gauge");
		arrViewer.model4.addColumn("PIW");
		arrViewer.model4.addColumn("Formula");
		arrViewer.model4.addColumn("Feet Per Roll");
		arrViewer.model4.addColumn("Work Order 1");
		arrViewer.model4.addColumn("Work Order 2");
		arrViewer.model4.addColumn("Work Order 3");
		arrViewer.model4.addColumn("Work Order 4");
		arrViewer.model4.addColumn("J Number");
		if (workstationBox.getSelectedItem().equals("FEX340001")) {
			arrViewer.model4.addColumn("Table Speed");
			arrViewer.model4.addColumn("Screw Speed");
			arrViewer.model4.addColumn("Die Number");
			arrViewer.model4.addColumn("RB Temp");
			arrViewer.model4.addColumn("Screen Pack");
			arrViewer.model4.addColumn("Extruder Amps");
			arrViewer.model4.addColumn("Extruder PSI");
			arrViewer.model4.addColumn("Stretch");
			arrViewer.model4.addColumn("Scrap");
			arrViewer.model4.addColumn("Air Ring Speed");
			arrViewer.model4.addColumn("Air Ring Temp");
			arrViewer.model4.addColumn("Drum NIP");
			arrViewer.model4.addColumn("Winder Nip Roll");
			arrViewer.model4.addColumn("Winder Nip Speed");
			arrViewer.model4.addColumn("Collapsing Shield Speed");
			arrViewer.model4.addColumn("Collapsing Shield Temperature");
			arrViewer.model4.addColumn("Plenum Temp");
			arrViewer.model4.addColumn("Air Ring Gap");
			arrViewer.model4.addColumn("Trim Puller Speed");
			arrViewer.model4.addColumn("Zone 0 Setting");
			arrViewer.model4.addColumn("Zone 0 Actual");
			arrViewer.model4.addColumn("Zone 1 Setting");
			arrViewer.model4.addColumn("Zone 1 Actual");
			arrViewer.model4.addColumn("Zone 2 Setting");
			arrViewer.model4.addColumn("Zone 2 Actual");
			arrViewer.model4.addColumn("Zone 3 Setting");
			arrViewer.model4.addColumn("Zone 3 Actual");
			arrViewer.model4.addColumn("Zone 4 Setting");
			arrViewer.model4.addColumn("Zone 4 Actual");
			arrViewer.model4.addColumn("Zone 5 Setting");
			arrViewer.model4.addColumn("Zone 5 Actual");
			arrViewer.model4.addColumn("Zone 6 Setting");
			arrViewer.model4.addColumn("Zone 6 Actual");
			arrViewer.model4.addColumn("Zone 7 Setting");
			arrViewer.model4.addColumn("Zone 7 Actual");
			arrViewer.model4.addColumn("Zone 8 Setting");
			arrViewer.model4.addColumn("Zone 8 Actual");
			arrViewer.model4.addColumn("Zone 9 Setting");
			arrViewer.model4.addColumn("Zone 9 Actual");
			arrViewer.model4.addColumn("Zone B1 Setting");
			arrViewer.model4.addColumn("Zone B1 Actual");
			arrViewer.model4.addColumn("Zone B2 Setting");
			arrViewer.model4.addColumn("Zone B2 Actual");
		} else if (workstationBox.getSelectedItem().equals("FEX340002")) {
			arrViewer.model4.addColumn("Table Speed");
			arrViewer.model4.addColumn("Screw Speed");
			arrViewer.model4.addColumn("Die Number");
			arrViewer.model4.addColumn("RB Temp");
			arrViewer.model4.addColumn("Screen Pack");
			arrViewer.model4.addColumn("Extruder Amps");
			arrViewer.model4.addColumn("Extruder PSI");
			arrViewer.model4.addColumn("Stretch");
			arrViewer.model4.addColumn("Scrap");
			arrViewer.model4.addColumn("Air Ring Speed");
			arrViewer.model4.addColumn("Air Ring Temp");
			arrViewer.model4.addColumn("Drum NIP");
			arrViewer.model4.addColumn("Winder Nip Roll");
			arrViewer.model4.addColumn("Winder NIP Speed");
			arrViewer.model4.addColumn("Collapsing Shield Speed");
			arrViewer.model4.addColumn("Collapsing Shield Temperature");
			arrViewer.model4.addColumn("Plenum Temp");
			arrViewer.model4.addColumn("Air Ring Gap");
			arrViewer.model4.addColumn("Finger Adjust Left");
			arrViewer.model4.addColumn("Finger Adjust Right");
			arrViewer.model4.addColumn("Trim Puller Speed");
			arrViewer.model4.addColumn("Mandrel Air Pressure");
			arrViewer.model4.addColumn("Zone 1 Setting");
			arrViewer.model4.addColumn("Zone 1 Actual");
			arrViewer.model4.addColumn("Zone 2 Setting");
			arrViewer.model4.addColumn("Zone 2 Actual");
			arrViewer.model4.addColumn("Zone 3 Setting");
			arrViewer.model4.addColumn("Zone 3 Actual");
			arrViewer.model4.addColumn("Zone 4 Setting");
			arrViewer.model4.addColumn("Zone 4 Actual");
			arrViewer.model4.addColumn("Zone 5 Setting");
			arrViewer.model4.addColumn("Zone 5 Actual");
			arrViewer.model4.addColumn("Zone 6 Setting");
			arrViewer.model4.addColumn("Zone 6 Actual");
			arrViewer.model4.addColumn("Zone 7 Setting");
			arrViewer.model4.addColumn("Zone 7 Actual");
			arrViewer.model4.addColumn("Zone 8 Setting");
			arrViewer.model4.addColumn("Zone 8 Actual");
			arrViewer.model4.addColumn("Zone 9 Setting");
			arrViewer.model4.addColumn("Zone 9 Actual");
			arrViewer.model4.addColumn("Zone 10 Setting");
			arrViewer.model4.addColumn("Zone 10 Actual");
			arrViewer.model4.addColumn("Zone 11 Setting");
			arrViewer.model4.addColumn("Zone 11 Actual");
			arrViewer.model4.addColumn("Zone 12 Setting");
			arrViewer.model4.addColumn("Zone 12 Actual");
			arrViewer.model4.addColumn("Zone 13 Setting");
			arrViewer.model4.addColumn("Zone 13 Actual");
		} else if (workstationBox.getSelectedItem().equals("FEX340003")) {
			arrViewer.model4.addColumn("Table Speed");
			arrViewer.model4.addColumn("Screw Speed");
			arrViewer.model4.addColumn("Die Number");
			arrViewer.model4.addColumn("RB Temp");
			arrViewer.model4.addColumn("Screen Pack");
			arrViewer.model4.addColumn("Extruder Amps");
			arrViewer.model4.addColumn("Stretch");
			arrViewer.model4.addColumn("Scrap");
			arrViewer.model4.addColumn("Drum Temp");
			arrViewer.model4.addColumn("Pinch Roll Temp");
			arrViewer.model4.addColumn("Air Ring Speed");
			arrViewer.model4.addColumn("Air Ring Temp");
			arrViewer.model4.addColumn("Trim Left Measure");
			arrViewer.model4.addColumn("Trim Right Measure");
			arrViewer.model4.addColumn("Air Ring Gap");
			arrViewer.model4.addColumn("Trim Puller Speed");
			arrViewer.model4.addColumn("Feed Valves");
			arrViewer.model4.addColumn("Doors");
			arrViewer.model4.addColumn("Zone 1 Setting");
			arrViewer.model4.addColumn("Zone 1 Actual");
			arrViewer.model4.addColumn("Zone 2 Setting");
			arrViewer.model4.addColumn("Zone 3 Setting");
			arrViewer.model4.addColumn("Zone 3 Actual");
			arrViewer.model4.addColumn("Zone 4 Setting");
			arrViewer.model4.addColumn("Zone 4 Actual");
			arrViewer.model4.addColumn("Zone 5 Setting");
			arrViewer.model4.addColumn("Zone 5 Actual");
			arrViewer.model4.addColumn("Zone 6 Setting");
			arrViewer.model4.addColumn("Zone 6 Actual");
			arrViewer.model4.addColumn("Zone 8 Setting");
			arrViewer.model4.addColumn("Zone 8 Actual");
			arrViewer.model4.addColumn("Zone 9 Setting");
			arrViewer.model4.addColumn("Zone 9 Actual");
			arrViewer.model4.addColumn("Zone 10 Setting");
			arrViewer.model4.addColumn("Zone 10 Actual");
		} else if (workstationBox.getSelectedItem().equals("FEX340004")) {
			arrViewer.model4.addColumn("Table Speed");
			arrViewer.model4.addColumn("Screw Speed");
			arrViewer.model4.addColumn("Die Number");
			arrViewer.model4.addColumn("RB Temp");
			arrViewer.model4.addColumn("Screen Pack");
			arrViewer.model4.addColumn("Extruder Amps");
			arrViewer.model4.addColumn("Stretch");
			arrViewer.model4.addColumn("Scrap");
			arrViewer.model4.addColumn("Drum Temp");
			arrViewer.model4.addColumn("Pinch Roll Temp");
			arrViewer.model4.addColumn("Air Ring Speed");
			arrViewer.model4.addColumn("Air Ring Temp");
			arrViewer.model4.addColumn("Trim Left Measure");
			arrViewer.model4.addColumn("Trim Right Measure");
			arrViewer.model4.addColumn("Air Ring Gap");
			arrViewer.model4.addColumn("Trim Puller Speed");
			arrViewer.model4.addColumn("Feed Valves");
			arrViewer.model4.addColumn("Doors");
			arrViewer.model4.addColumn("Zone 1 Setting");
			arrViewer.model4.addColumn("Zone 1 Actual");
			arrViewer.model4.addColumn("Zone 2 Setting");
			arrViewer.model4.addColumn("Zone 3 Setting");
			arrViewer.model4.addColumn("Zone 3 Actual");
			arrViewer.model4.addColumn("Zone 4 Setting");
			arrViewer.model4.addColumn("Zone 4 Actual");
			arrViewer.model4.addColumn("Zone 5 Setting");
			arrViewer.model4.addColumn("Zone 5 Actual");
			arrViewer.model4.addColumn("Zone 6 Setting");
			arrViewer.model4.addColumn("Zone 6 Actual");
			arrViewer.model4.addColumn("Zone 8 Setting");
			arrViewer.model4.addColumn("Zone 8 Actual");
			arrViewer.model4.addColumn("Zone 9 Setting");
			arrViewer.model4.addColumn("Zone 9 Actual");
			arrViewer.model4.addColumn("Zone 10 Setting");
			arrViewer.model4.addColumn("Zone 10 Actual");
		} else if (workstationBox.getSelectedItem().equals("FEX340006")) {
			arrViewer.model4.addColumn("Prime Nip Speed");
			arrViewer.model4.addColumn("2nd Nip Speed");
			arrViewer.model4.addColumn("Prime Winder Speed");
			arrViewer.model4.addColumn("2nd Winder Speed");
			arrViewer.model4.addColumn("Scerw Speed");
			arrViewer.model4.addColumn("RB Temp");
			arrViewer.model4.addColumn("Screen Pack");
			arrViewer.model4.addColumn("Extruder Amps");
			arrViewer.model4.addColumn("Extruder PSI");
			arrViewer.model4.addColumn("Scrap");
			arrViewer.model4.addColumn("Air Ring Speed");
			arrViewer.model4.addColumn("Air Ring Temp");
			arrViewer.model4.addColumn("Winder Nip Roll");
			arrViewer.model4.addColumn("Mix Drop Temp");
			arrViewer.model4.addColumn("Plenum Temp");
			arrViewer.model4.addColumn("Plenum Speed");
			arrViewer.model4.addColumn("Air Ring Gap");
			arrViewer.model4.addColumn("Trim Puller Speed");
			arrViewer.model4.addColumn("Feed Valves");
			arrViewer.model4.addColumn("Doors");
			arrViewer.model4.addColumn("Feed Valves Open %");
			arrViewer.model4.addColumn("Zone 1 Setting");
			arrViewer.model4.addColumn("Zone 1 Actual");
			arrViewer.model4.addColumn("Zone 2 Setting");
			arrViewer.model4.addColumn("Zone 3 Setting");
			arrViewer.model4.addColumn("Zone 3 Actual");
			arrViewer.model4.addColumn("Zone 4 Setting");
			arrViewer.model4.addColumn("Zone 4 Actual");
			arrViewer.model4.addColumn("Zone 5 Setting");
			arrViewer.model4.addColumn("Zone 5 Actual");
			arrViewer.model4.addColumn("Zone 6 Setting");
			arrViewer.model4.addColumn("Zone 6 Actual");
			arrViewer.model4.addColumn("Zone 7-A Setting");
			arrViewer.model4.addColumn("Zone 7-A Actual");
			arrViewer.model4.addColumn("Zone 7-B Setting");
			arrViewer.model4.addColumn("Zone 7-B Actual");
			arrViewer.model4.addColumn("Zone 7-C Setting");
			arrViewer.model4.addColumn("Zone 7-C Actual");
			arrViewer.model4.addColumn("Zone 8 Setting");
			arrViewer.model4.addColumn("Zone 8 Actual");
			arrViewer.model4.addColumn("Zone 9 Setting");
			arrViewer.model4.addColumn("Zone 9 Actual");
			arrViewer.model4.addColumn("Zone 10 Setting");
			arrViewer.model4.addColumn("Zone 10 Actual");
			arrViewer.model4.addColumn("Core Out Diameter Primary");
			arrViewer.model4.addColumn("Roll Length Primary");
			arrViewer.model4.addColumn("End Rol Warning Primary");
			arrViewer.model4.addColumn("End Roll Transfer Primary");
			arrViewer.model4.addColumn("Force Set Point Primary");
			arrViewer.model4.addColumn("Drum to Nip Trim Primary");
			arrViewer.model4.addColumn("Core Out Diameter Secondary");
			arrViewer.model4.addColumn("Roll Length Primary Secondary");
			arrViewer.model4.addColumn("Roll Length Primary Secondary");
			arrViewer.model4.addColumn("End Roll Warning Secondary");
			arrViewer.model4.addColumn("End Roll Transfer Secondary");
			arrViewer.model4.addColumn("Force Set Point Secondary");
			arrViewer.model4.addColumn("Drum to Nip Trim Secondary");
		} else if (workstationBox.getSelectedItem().equals("FEX340007")) {
			arrViewer.model4.addColumn("Table Speed");
			arrViewer.model4.addColumn("Screw Speed");
			arrViewer.model4.addColumn("Die Number");
			arrViewer.model4.addColumn("RB Temp");
			arrViewer.model4.addColumn("Screen Pack");
			arrViewer.model4.addColumn("Extruder Amps");
			arrViewer.model4.addColumn("Stretch");
			arrViewer.model4.addColumn("Scrap");
			arrViewer.model4.addColumn("Drum Temp");
			arrViewer.model4.addColumn("Pinch Roll Temp");
			arrViewer.model4.addColumn("Air Ring Speed");
			arrViewer.model4.addColumn("Trim Left Measure");
			arrViewer.model4.addColumn("Trim Right Measure");
			arrViewer.model4.addColumn("Air Ring Gap");
			arrViewer.model4.addColumn("Curtain Links");
			arrViewer.model4.addColumn("Trim Puller Speed");
			arrViewer.model4.addColumn("Feed Valves");
			arrViewer.model4.addColumn("Zone 1 Setting");
			arrViewer.model4.addColumn("Zone 1 Actual");
			arrViewer.model4.addColumn("Zone 2 Setting");
			arrViewer.model4.addColumn("Zone 2 Actual");
			arrViewer.model4.addColumn("Zone 3 Setting");
			arrViewer.model4.addColumn("Zone 3 Actual");
			arrViewer.model4.addColumn("Zone 4 Setting");
			arrViewer.model4.addColumn("Zone 4 Actual");
			arrViewer.model4.addColumn("Zone 5 Setting");
			arrViewer.model4.addColumn("Zone 5 Actual");
			arrViewer.model4.addColumn("Zone 6 Setting");
			arrViewer.model4.addColumn("Zone 6 Actual");
			arrViewer.model4.addColumn("Zone 7 Setting");
			arrViewer.model4.addColumn("Zone 7 Actual");
			arrViewer.model4.addColumn("Zone 8 Setting");
			arrViewer.model4.addColumn("Zone 8 Actual");
			arrViewer.model4.addColumn("Zone 9 Setting");
			arrViewer.model4.addColumn("Zone 9 Actual");
			arrViewer.model4.addColumn("Zone 10 Setting");
			arrViewer.model4.addColumn("Zone 10 Actual");
			arrViewer.model4.addColumn("Zone 11 Setting");
			arrViewer.model4.addColumn("Zone 11 Actual");
			arrViewer.model4.addColumn("Hot Roll 1 Setting");
			arrViewer.model4.addColumn("Hot Roll 1 Actual");
			arrViewer.model4.addColumn("Hot Roll 2 Setting");
			arrViewer.model4.addColumn("Hot Roll 2 Actual");
			arrViewer.model4.addColumn("Chill Roll Setting");
			arrViewer.model4.addColumn("Chill Roll Actual");
		} else if (workstationBox.getSelectedItem().equals("FEX340008")) {
			arrViewer.model4.addColumn("Table Speed");
			arrViewer.model4.addColumn("Screw Speed");
			arrViewer.model4.addColumn("Die Number");
			arrViewer.model4.addColumn("RB Temp");
			arrViewer.model4.addColumn("Screen Pack");
			arrViewer.model4.addColumn("Extruder Amps");
			arrViewer.model4.addColumn("Stretch");
			arrViewer.model4.addColumn("Scrap");
			arrViewer.model4.addColumn("Drum Temp");
			arrViewer.model4.addColumn("Pinch Roll Temp");
			arrViewer.model4.addColumn("Air Ring Speed");
			arrViewer.model4.addColumn("Trim Left Measure");
			arrViewer.model4.addColumn("Trim Right Measure");
			arrViewer.model4.addColumn("Air Ring Gap");
			arrViewer.model4.addColumn("Curtain Links");
			arrViewer.model4.addColumn("Feed Valves");
			arrViewer.model4.addColumn("Zone 1 Setting");
			arrViewer.model4.addColumn("Zone 1 Actual");
			arrViewer.model4.addColumn("Zone 2 Setting");
			arrViewer.model4.addColumn("Zone 2 Actual");
			arrViewer.model4.addColumn("Zone 3 Setting");
			arrViewer.model4.addColumn("Zone 3 Actual");
			arrViewer.model4.addColumn("Zone 4 Setting");
			arrViewer.model4.addColumn("Zone 4 Actual");
			arrViewer.model4.addColumn("Zone 5 Setting");
			arrViewer.model4.addColumn("Zone 5 Actual");
			arrViewer.model4.addColumn("Zone 6 Setting");
			arrViewer.model4.addColumn("Zone 6 Actual");
			arrViewer.model4.addColumn("Zone 7 Setting");
			arrViewer.model4.addColumn("Zone 7 Actual");
			arrViewer.model4.addColumn("Zone 8 Setting");
			arrViewer.model4.addColumn("Zone 8 Actual");
			arrViewer.model4.addColumn("Zone 9 Setting");
			arrViewer.model4.addColumn("Zone 9 Actual");
			arrViewer.model4.addColumn("Zone 10 Setting");
			arrViewer.model4.addColumn("Zone 10 Actual");
			arrViewer.model4.addColumn("Zone 11 Setting");
			arrViewer.model4.addColumn("Zone 11 Actual");
			arrViewer.model4.addColumn("Hot Roll 1 Setting");
			arrViewer.model4.addColumn("Hot Roll 1 Actual");
			arrViewer.model4.addColumn("Hot Roll 2 Setting");
			arrViewer.model4.addColumn("Hot Roll 2 Actual");
			arrViewer.model4.addColumn("Chill Roll Setting");
			arrViewer.model4.addColumn("Chill Roll Actual");
		}
	}
}
