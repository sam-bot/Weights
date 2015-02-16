package Arr;
import java.awt.EventQueue;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;

import java.awt.Color;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;

public class arrExtrusion {

	private JFrame frame;
	private ArrayList<JTextField> fieldList;
	private JComboBox<String> workStationBox;
	private JTextField operatorField;
	private JTextField workOrderField;
	private JComboBox<String> shiftBox;
	private JTextField dateTimeField;
	private JTextField itemNumberField;
	private JLabel fgCoreTagNumberField;
	private JPanel panel_1;
	private JLabel lblWorkOrder;
	private JLabel lblItemNumber_1;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JTextField itemNumberOne;
	private JTextField workOrderOneField;
	private JTextField workOrderTwoField;
	private JTextField itemNumberTwo;
	private JTextField workOrderThreeField;
	private JTextField itemNumberThree;
	private JTextField workOrderFourField;
	private JTextField itemNumberFour;
	private JLabel lblProductionWidth;
	private JTextField targetWeightOne;
	private JTextField targetWeightTwo;
	private JTextField targetWeightThree;
	private JTextField targetWeightFour;
	private JPanel panel_2;
	private JLabel label_4;
	private JTextField coreTagNumberField;
	private JTextField rollWeightField;
	private JScrollPane scrollPane;
	private JTable table;
	static DefaultTableModel model5 = new DefaultTableModel();
	private JPanel panel_3;
	private JButton btnAudit;
	private JButton btnSoc;
	private JButton btnShiftChecklist;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					arrExtrusion window = new arrExtrusion();
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
	public arrExtrusion() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Extrusion");
		frame.setBounds(100, 100, 673, 492);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(
				new MigLayout("", "[grow][grow][grow]", "[][][][grow][grow]"));

		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, "cell 0 0 3 1");
		panel.setLayout(new MigLayout("", "[][][30][][][30][][]", "[][]"));

		String[] extrusionLines = { "", "FEX340001", "FEX340002", "FEX340003",
				"FEX340004", "FEX340006", "FEX340007", "FEX340008" };

		fieldList = new ArrayList<JTextField>();
		JLabel lblWorkstation = new JLabel("Workstation");
		panel.add(lblWorkstation, "cell 0 0");
		workStationBox = new JComboBox(extrusionLines);
		panel.add(workStationBox, "cell 1 0,growx");

		JLabel lblOperator = new JLabel("Operator");
		panel.add(lblOperator, "cell 3 0");

		operatorField = new JTextField();
		panel.add(operatorField, "cell 4 0,growx");
		operatorField.setColumns(10);
		fieldList.add(operatorField);

		JLabel lblNewLabel = new JLabel("Work Order");
		panel.add(lblNewLabel, "cell 6 0");

		workOrderField = new JTextField();
		fieldList.add(workOrderField);
		panel.add(workOrderField, "cell 7 0,growx");
		workOrderField.setColumns(10);

		JLabel lblShift = new JLabel("Shift");
		panel.add(lblShift, "cell 0 1");
		String[] shifts = { "", "A", "B", "C", "D" };
		shiftBox = new JComboBox(shifts);
		panel.add(shiftBox, "cell 1 1,growx");

		JLabel lblDatetime = new JLabel("Date");
		panel.add(lblDatetime, "cell 3 1");

		dateTimeField = new JTextField();
		fieldList.add(dateTimeField);
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/YYYY");
		Calendar cal = Calendar.getInstance();
		String dateTime = dateFormat.format(cal.getTime());
		dateTimeField.setText(dateTime);
		panel.add(dateTimeField, "cell 4 1,growx");
		dateTimeField.setColumns(10);

		JLabel lblItemNumber = new JLabel("Item Number");
		panel.add(lblItemNumber, "cell 6 1");

		itemNumberField = new JTextField();
		fieldList.add(itemNumberField);
		panel.add(itemNumberField, "cell 7 1,growx");
		itemNumberField.setColumns(10);

		panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, "cell 0 1 3 1,growx");
		panel_1.setLayout(new MigLayout("", "[grow][grow][grow][grow]", "[][][][][]"));

		lblWorkOrder = new JLabel("Work Order");
		panel_1.add(lblWorkOrder, "cell 1 0");

		lblItemNumber_1 = new JLabel("Item Number");
		panel_1.add(lblItemNumber_1, "cell 2 0");
		
				lblProductionWidth = new JLabel("Target Weight");
				panel_1.add(lblProductionWidth, "cell 3 0");

		label = new JLabel("#1");
		panel_1.add(label, "cell 0 1,alignx trailing");

		workOrderOneField = new JTextField();
		panel_1.add(workOrderOneField, "cell 1 1");
		workOrderOneField.setColumns(10);

		itemNumberOne = new JTextField();
		panel_1.add(itemNumberOne, "cell 2 1");
		itemNumberOne.setColumns(10);
		
		targetWeightOne = new JTextField();
		targetWeightOne.setColumns(10);
		panel_1.add(targetWeightOne, "cell 3 1");

		label_1 = new JLabel("#2");
		panel_1.add(label_1, "cell 0 2,alignx trailing");

		workOrderTwoField = new JTextField();
		workOrderTwoField.setColumns(10);
		panel_1.add(workOrderTwoField, "cell 1 2");

		itemNumberTwo = new JTextField();
		panel_1.add(itemNumberTwo, "cell 2 2");
		itemNumberTwo.setColumns(10);
		
		targetWeightTwo = new JTextField();
		targetWeightTwo.setColumns(10);
		panel_1.add(targetWeightTwo, "cell 3 2");

		label_2 = new JLabel("#3");
		panel_1.add(label_2, "cell 0 3,alignx trailing");

		workOrderThreeField = new JTextField();
		panel_1.add(workOrderThreeField, "cell 1 3");
		workOrderThreeField.setColumns(10);

		itemNumberThree = new JTextField();
		panel_1.add(itemNumberThree, "cell 2 3");
		itemNumberThree.setColumns(10);
		
		targetWeightThree = new JTextField();
		targetWeightThree.setColumns(10);
		panel_1.add(targetWeightThree, "cell 3 3");

		label_3 = new JLabel("#4");
		panel_1.add(label_3, "cell 0 4,alignx trailing");

		workOrderFourField = new JTextField();
		panel_1.add(workOrderFourField, "cell 1 4");
		workOrderFourField.setColumns(10);

		itemNumberFour = new JTextField();
		panel_1.add(itemNumberFour, "cell 2 4");
		itemNumberFour.setColumns(10);
		
		targetWeightFour = new JTextField();
		targetWeightFour.setColumns(10);
		panel_1.add(targetWeightFour, "cell 3 4");
		
		panel_2 = new JPanel();
		panel_2.setBackground(Color.BLACK);
		frame.getContentPane().add(panel_2, "cell 0 2,growx");
		
		label_4 = new JLabel("Extruded Roll");
		label_4.setForeground(Color.WHITE);
		panel_2.add(label_4);
		
		coreTagNumberField = new JTextField();
		frame.getContentPane().add(coreTagNumberField, "flowx,cell 1 2,growx");
		coreTagNumberField.setColumns(10);
		
		rollWeightField = new JTextField();
		frame.getContentPane().add(rollWeightField, "cell 2 2,growx");
		rollWeightField.setColumns(10);
		
		scrollPane = new JScrollPane();
		frame.getContentPane().add(scrollPane, "cell 0 3 3 1,grow");
		
		table = new JTable(arrExtrusion.model5);
		arrExtrusion.model5.addColumn("Work Order#");
		arrExtrusion.model5.addColumn("Set#");
		arrExtrusion.model5.addColumn("Part#");
		arrExtrusion.model5.addColumn("Roll#");
		arrExtrusion.model5.addColumn("DateTime");
		arrExtrusion.model5.addColumn("Film#s");
		scrollPane.setViewportView(table);
		
		panel_3 = new JPanel();
		frame.getContentPane().add(panel_3, "cell 0 4 3 1,grow");
		panel_3.setLayout(new MigLayout("", "[grow][grow][grow]", "[][]"));
		
		btnAudit = new JButton("Audit");
		panel_3.add(btnAudit, "cell 0 0,alignx center");
		
		btnSoc = new JButton("SOC");
		panel_3.add(btnSoc, "cell 1 0,alignx center");
		
		btnShiftChecklist = new JButton("Shift Checklist");
		panel_3.add(btnShiftChecklist, "cell 2 0,alignx center");
	}

}
