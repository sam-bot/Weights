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
				} else if (departmentBox.getSelectedItem() == "Extrusion") {
				} else if (departmentBox.getSelectedItem() == "SOC's") {

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
		panel.add(btnSubmit, "cell 2 1");

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
}
