package Arr;

import java.awt.EventQueue;

import javax.swing.JFrame;

import net.miginfocom.swing.MigLayout;

import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JPanel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;

// view information from all production areas
public class arrViewer {
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
				new MigLayout("", "[grow][grow]", "[][grow]"));
		String[] departments = { "", "Driller", "Trimmer", "Extrusion",
				"SOC's", "Housekeeping Audits", "QA Audits" };

		panel = new JPanel();
		frame.getContentPane().add(panel, "cell 0 0 2 1,grow");
		panel.setLayout(new MigLayout("", "[][grow][][grow]", "[][]"));
		JLabel lblSelectDepartment = new JLabel("Select Department");
		panel.add(lblSelectDepartment, "cell 0 0");

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

		lblSelectWorkstation = new JLabel("Select Workstation");
		panel.add(lblSelectWorkstation, "cell 2 0,alignx trailing");
		String[] placeholder = { "" };
		workstationBox = new JComboBox(placeholder);
		panel.add(workstationBox, "cell 3 0");

		lblWorkOrder = new JLabel("Work Order");
		panel.add(lblWorkOrder, "cell 0 1,alignx trailing");

		workOrderField = new JTextField();
		panel.add(workOrderField, "cell 1 1");
		workOrderField.setColumns(10);

		btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (departmentBox.getSelectedItem() == "Driller") {
					arrViewer.model4.setColumnCount(0);
					arrViewer.model4.addColumn("Operator");
					arrViewer.model4.addColumn("Work Order");
					arrViewer.model4.addColumn("Shift");
					arrViewer.model4.addColumn("Date Time");
					arrViewer.model4.addColumn("Extruded Item");
					arrViewer.model4.addColumn("Trimmed Item");
					arrViewer.model4.addColumn("Drilled Item");
					arrViewer.model4.addColumn("Formula");
					arrViewer.model4.addColumn("Gauge");
					arrViewer.model4.addColumn("Length");
					arrViewer.model4.addColumn("Width");
					arrViewer.model4.addColumn("Weight");
				} else if (departmentBox.getSelectedItem() == "Trimmer") {
				} else if (departmentBox.getSelectedItem() == "Extrusion") {
				} else if (departmentBox.getSelectedItem() == "SOC's") {
				} else if (departmentBox.getSelectedItem() == "QA Audits") {
				} else if (departmentBox.getSelectedItem() == "Housekeeping Audits") {
				} else if (departmentBox.getSelectedItem() == "") {
					arrViewer.model4.setColumnCount(0);
				}
			}
		});
		panel.add(btnSubmit, "cell 2 1");

		scrollPane = new JScrollPane();
		frame.getContentPane().add(scrollPane, "cell 0 1 2 1,grow");

		table = new JTable(arrViewer.model4);
		scrollPane.setViewportView(table);
	}

}
