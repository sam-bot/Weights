package Arr;

import java.awt.AWTException;
import java.awt.EventQueue;
import java.awt.Robot;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyEvent;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;

import java.awt.Color;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JSeparator;

public class arrExtrusion {

	private JFrame frame;
	private ArrayList<JTextField> fieldList;
	private JComboBox<String> workStationBox;
	private JTextField operatorField;
	private String operator;
	private JComboBox<String> shiftBox;
	private JLabel fgCoreTagNumberField;
	private JPanel panel_1;
	private JLabel lblWorkOrder;
	private JLabel lblItemNumber_1;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JTextField itemNumberOneField;
	private JTextField workOrderOneField;
	private JTextField workOrderTwoField;
	private JTextField itemNumberTwoField;
	private JTextField workOrderThreeField;
	private JTextField itemNumberThreeField;
	private JTextField workOrderFourField;
	private JTextField itemNumberFourField;
	private JLabel lblProductionWidth;
	private JTextField targetWeightOneField;
	private JTextField targetWeightTwoField;
	private JTextField targetWeightThreeField;
	private JTextField targetWeightFourField;
	private JPanel panel_2;
	private JLabel label_4;
	private JTextField coreTagNumberField;
	private JTextField rollWeightField;
	private JScrollPane scrollPane;
	private JTable rollWeightsTable;
	static DefaultTableModel model5 = new DefaultTableModel();
	static DefaultTableModel model6 = new DefaultTableModel();
	private JPanel panel_3;
	private JButton btnAudit;
	private JButton btnSoc;
	private JButton btnShiftChecklist;
	private arrQaAudit qaWindow = new arrQaAudit();
	private arrHousekeeping housekeepingWindow = new arrHousekeeping();
	private processConditions socWindow;
	private JLabel lblRollWeights;
	private JScrollPane scrollPane_1;
	private JTable setWeightsTable;
	private JLabel lblSetWeights;
	private JLabel lblRollsPerSet;
	private JTextField rollsPerSetOneField;
	private JTextField rollsPerSetTwoField;
	private JTextField rollsPerSetThreeField;
	private JTextField rollsPerSetFourField;
	private JButton btnSubmit;
	private JLabel lblSetNumber;
	private JTextField setNumberField;
	private JLabel lblActualPercentOf;
	private JLabel percentOfTargetLbl;
	private JLabel label_5;
	private JLabel label_6;
	private JSeparator separator;
	private JTextField targetSetWeightOneField;
	private JTextField actualSetWeightOneField;
	private JTextField targetSetWeightTwoField;
	private JTextField actualSetWeightTwoField;
	private JTextField targetSetWeightThreeField;
	private JTextField actualSetWeightThreeField;
	private JTextField targetSetWeightFourField;
	private JTextField actualSetWeightFourField;
	private JButton btnResetForm;
	private Robot robot;

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
				new MigLayout("", "[grow][grow][grow]",
						"[][][][][][][grow][][grow][][grow]"));

		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, "cell 0 0 3 1");
		panel.setLayout(new MigLayout("",
				"[grow][grow][grow][grow][grow][grow][grow][grow][grow][grow]",
				"[][]"));

		String[] extrusionLines = { "", "FEX340001", "FEX340002", "FEX340003",
				"FEX340004", "FEX340006", "FEX340007", "FEX340008" };
		float newSize2 = 14;
		float newSize3 = 17;
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
		String[] shifts = { "", "A", "B", "C", "D" };

		JLabel lblShift = new JLabel("Shift");
		panel.add(lblShift, "cell 6 0");
		shiftBox = new JComboBox(shifts);
		panel.add(shiftBox, "cell 7 0,growx");

		lblSetNumber = new JLabel("Set Number");
		panel.add(lblSetNumber, "cell 8 0,alignx trailing");

		setNumberField = new JTextField();
		panel.add(setNumberField, "cell 9 0");
		setNumberField.setColumns(10);
		setNumberField.setText("1");
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/YYYY");
		Calendar cal = Calendar.getInstance();
		String dateTime = dateFormat.format(cal.getTime());

		panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, "cell 0 1 3 1,growx");
		panel_1.setLayout(new MigLayout("",
				"[grow][grow][grow][grow][grow][grow][][grow]", "[][][][][]"));

		lblWorkOrder = new JLabel("Work Order");
		panel_1.add(lblWorkOrder, "cell 1 0");

		lblItemNumber_1 = new JLabel("Item Number");
		panel_1.add(lblItemNumber_1, "cell 2 0");

		lblProductionWidth = new JLabel("Target Weight");
		panel_1.add(lblProductionWidth, "cell 3 0");

		lblRollsPerSet = new JLabel("Rolls Per Set");
		panel_1.add(lblRollsPerSet, "cell 4 0");

		label_5 = new JLabel("Target Set Weight");
		panel_1.add(label_5, "cell 5 0");

		separator = new JSeparator();
		panel_1.add(separator, "cell 6 0");

		label_6 = new JLabel("Actual Set Weight");
		panel_1.add(label_6, "cell 7 0");

		label = new JLabel("#1");
		panel_1.add(label, "cell 0 1,alignx trailing");

		workOrderOneField = new JTextField();
		panel_1.add(workOrderOneField, "cell 1 1");
		workOrderOneField.setColumns(10);

		itemNumberOneField = new JTextField();
		panel_1.add(itemNumberOneField, "cell 2 1");
		itemNumberOneField.setColumns(10);

		targetWeightOneField = new JTextField();
		targetWeightOneField.setColumns(10);
		panel_1.add(targetWeightOneField, "cell 3 1");

		rollsPerSetOneField = new JTextField();
		rollsPerSetOneField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				String targetWeightOne = targetWeightOneField.getText();
				double targetWeightOneDouble = 0;
				if (!targetWeightOne.equals("")) {
					targetWeightOneDouble = convertToDouble(targetWeightOne);
				}
				String rollsPerSetOne = rollsPerSetOneField.getText();
				double rollsPerSetOneDouble = 0;
				if (!rollsPerSetOne.equals("")) {
					rollsPerSetOneDouble = convertToDouble(rollsPerSetOne);
				}
				double targetSetWeightOne = targetWeightOneDouble
						* rollsPerSetOneDouble;
				String targetSetWeightOneString = Double
						.toString(targetSetWeightOne);
				targetSetWeightOneField.setText(targetSetWeightOneString);
				workOrderTwoField.requestFocus();
			}
		});
		panel_1.add(rollsPerSetOneField, "cell 4 1");
		rollsPerSetOneField.setColumns(10);

		targetSetWeightOneField = new JTextField();
		targetSetWeightOneField.setEditable(false);
		;
		panel_1.add(targetSetWeightOneField, "cell 5 1,growx");
		targetSetWeightOneField.setColumns(10);

		actualSetWeightOneField = new JTextField();
		actualSetWeightOneField.setEditable(false);
		actualSetWeightOneField.setColumns(10);
		panel_1.add(actualSetWeightOneField, "cell 7 1,growx");

		label_1 = new JLabel("#2");
		panel_1.add(label_1, "cell 0 2,alignx trailing");

		workOrderTwoField = new JTextField();
		workOrderTwoField.setColumns(10);
		panel_1.add(workOrderTwoField, "cell 1 2");

		itemNumberTwoField = new JTextField();
		panel_1.add(itemNumberTwoField, "cell 2 2");
		itemNumberTwoField.setColumns(10);

		targetWeightTwoField = new JTextField();
		targetWeightTwoField.setColumns(10);
		panel_1.add(targetWeightTwoField, "cell 3 2");

		rollsPerSetTwoField = new JTextField();
		rollsPerSetTwoField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				String targetWeightTwo = targetWeightTwoField.getText();
				double targetWeightTwoDouble = 0;
				if (!targetWeightTwo.equals("")) {
					targetWeightTwoDouble = convertToDouble(targetWeightTwo);
				}
				String rollsPerSetTwo = rollsPerSetTwoField.getText();
				double rollsPerSetTwoDouble = 0;
				if (!rollsPerSetTwo.equals("")) {
					rollsPerSetTwoDouble = convertToDouble(rollsPerSetTwo);
				}
				double targetSetWeightTwo = targetWeightTwoDouble
						* rollsPerSetTwoDouble;
				String targetSetWeightTwoString = Double
						.toString(targetSetWeightTwo);
				targetSetWeightTwoField.setText(targetSetWeightTwoString);
				workOrderThreeField.requestFocus();
			}
		});
		panel_1.add(rollsPerSetTwoField, "cell 4 2");
		rollsPerSetTwoField.setColumns(10);

		targetSetWeightTwoField = new JTextField();
		targetSetWeightTwoField.setColumns(10);
		targetSetWeightTwoField.setEditable(false);
		panel_1.add(targetSetWeightTwoField, "cell 5 2,growx");

		actualSetWeightTwoField = new JTextField();
		actualSetWeightTwoField.setColumns(10);
		actualSetWeightTwoField.setEditable(false);
		panel_1.add(actualSetWeightTwoField, "cell 7 2,growx");

		label_2 = new JLabel("#3");
		panel_1.add(label_2, "cell 0 3,alignx trailing");

		workOrderThreeField = new JTextField();
		panel_1.add(workOrderThreeField, "cell 1 3");
		workOrderThreeField.setColumns(10);

		itemNumberThreeField = new JTextField();
		panel_1.add(itemNumberThreeField, "cell 2 3");
		itemNumberThreeField.setColumns(10);

		targetWeightThreeField = new JTextField();
		targetWeightThreeField.setColumns(10);
		panel_1.add(targetWeightThreeField, "cell 3 3");

		rollsPerSetThreeField = new JTextField();
		rollsPerSetThreeField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				String targetWeightThree = targetWeightThreeField.getText();
				double targetWeightThreeDouble = 0;
				if (!targetWeightThree.equals("")) {
					targetWeightThreeDouble = convertToDouble(targetWeightThree);
				}
				String rollsPerSetThree = rollsPerSetThreeField.getText();
				double rollsPerSetThreeDouble = 0;
				if (!rollsPerSetThree.equals("")) {
					rollsPerSetThreeDouble = convertToDouble(rollsPerSetThree);
				}
				double targetSetWeightThree = targetWeightThreeDouble
						* rollsPerSetThreeDouble;
				String targetSetWeightThreeString = Double
						.toString(targetSetWeightThree);
				targetSetWeightThreeField.setText(targetSetWeightThreeString);
				workOrderFourField.requestFocus();
			}
		});
		panel_1.add(rollsPerSetThreeField, "cell 4 3");
		rollsPerSetThreeField.setColumns(10);

		targetSetWeightThreeField = new JTextField();
		targetSetWeightThreeField.setColumns(10);
		targetSetWeightThreeField.setEditable(false);
		panel_1.add(targetSetWeightThreeField, "cell 5 3,growx");

		actualSetWeightThreeField = new JTextField();
		actualSetWeightThreeField.setColumns(10);
		actualSetWeightThreeField.setEditable(false);
		panel_1.add(actualSetWeightThreeField, "cell 7 3,growx");

		label_3 = new JLabel("#4");
		panel_1.add(label_3, "cell 0 4,alignx trailing");

		workOrderFourField = new JTextField();
		panel_1.add(workOrderFourField, "cell 1 4");
		workOrderFourField.setColumns(10);

		itemNumberFourField = new JTextField();
		panel_1.add(itemNumberFourField, "cell 2 4");
		itemNumberFourField.setColumns(10);

		targetWeightFourField = new JTextField();
		targetWeightFourField.setColumns(10);
		panel_1.add(targetWeightFourField, "cell 3 4");

		rollsPerSetFourField = new JTextField();
		rollsPerSetFourField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				String targetWeightFour = targetWeightFourField.getText();
				double targetWeightFourDouble = 0;
				if (!targetWeightFour.equals("")) {
					targetWeightFourDouble = convertToDouble(targetWeightFour);
				}
				String rollsPerSetFour = rollsPerSetFourField.getText();
				double rollsPerSetFourDouble = 0;
				if (!rollsPerSetFour.equals("")) {
					rollsPerSetFourDouble = convertToDouble(rollsPerSetFour);
				}
				double targetSetWeightFour = targetWeightFourDouble
						* rollsPerSetFourDouble;
				String targetSetWeightFourString = Double
						.toString(targetSetWeightFour);
				targetSetWeightFourField.setText(targetSetWeightFourString);
				coreTagNumberField.requestFocus();
			}
		});
		panel_1.add(rollsPerSetFourField, "cell 4 4");
		rollsPerSetFourField.setColumns(10);

		targetSetWeightFourField = new JTextField();
		targetSetWeightFourField.setColumns(10);
		targetSetWeightFourField.setEditable(false);
		panel_1.add(targetSetWeightFourField, "cell 5 4,growx");

		actualSetWeightFourField = new JTextField();
		actualSetWeightFourField.setEditable(false);
		actualSetWeightFourField.setColumns(10);
		panel_1.add(actualSetWeightFourField, "cell 7 4,growx");

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
		rollWeightField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				InsertRollWeightSQL();
				int returnCheck = updatePercentOfTarget();
				if (returnCheck == 0)
					return;
				coreTagNumberField.setText("");
				rollWeightField.setText("");
				coreTagNumberField.requestFocus();
			}
			@Override
			public void focusGained(FocusEvent e) {
				try {
					robot = new Robot();
				    robot.keyPress(KeyEvent.VK_F11);
				    robot.keyRelease(KeyEvent.VK_F11);
				} catch (AWTException e1) {
					e1.printStackTrace();
				}
			}
		});
		frame.getContentPane().add(rollWeightField, "cell 2 2,growx");
		rollWeightField.setColumns(10);

		lblActualPercentOf = new JLabel("Actual % of Target");
		lblActualPercentOf.setFont(lblActualPercentOf.getFont().deriveFont(
				newSize2));
		frame.getContentPane().add(lblActualPercentOf,
				"cell 0 3 2 1,alignx right");

		percentOfTargetLbl = new JLabel("");
		frame.getContentPane().add(percentOfTargetLbl, "cell 2 3");
		percentOfTargetLbl.setFont(percentOfTargetLbl.getFont().deriveFont(
				newSize3));
		lblRollWeights = new JLabel("Roll Weights");
		frame.getContentPane()
				.add(lblRollWeights, "cell 0 5 3 1,alignx center");

		scrollPane = new JScrollPane();
		frame.getContentPane().add(scrollPane, "cell 0 6 3 1,grow");

		rollWeightsTable = new JTable(arrExtrusion.model5);
		arrExtrusion.model5.addColumn("DateTime");
		arrExtrusion.model5.addColumn("Roll#");
		arrExtrusion.model5.addColumn("Target Roll#");
		arrExtrusion.model5.addColumn("Actual Roll#");
		arrExtrusion.model5.addColumn("Set Number");
		scrollPane.setViewportView(rollWeightsTable);

		lblSetWeights = new JLabel("Set Weights");
		frame.getContentPane().add(lblSetWeights, "cell 0 7 3 1,alignx center");

		scrollPane_1 = new JScrollPane();
		frame.getContentPane().add(scrollPane_1, "cell 0 8 3 1,grow");

		setWeightsTable = new JTable(arrExtrusion.model6);
		arrExtrusion.model6.addColumn("Set#");
		arrExtrusion.model6.addColumn("DateTime");
		arrExtrusion.model6.addColumn("Percent of Target");
		scrollPane_1.setViewportView(setWeightsTable);

		panel_3 = new JPanel();
		frame.getContentPane().add(panel_3, "cell 0 10 3 1,grow");
		panel_3.setLayout(new MigLayout("", "[grow][grow][grow][grow][grow]",
				"[][]"));

		btnAudit = new JButton("Audit");
		btnAudit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							qaWindow.getFrame().setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});

		panel_3.add(btnAudit, "cell 0 0,alignx center");

		btnSoc = new JButton("SOC");
		btnSoc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							socWindow = new processConditions("placeholder");
							socWindow.getFrame().setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		panel_3.add(btnSoc, "cell 1 0,alignx center");

		btnShiftChecklist = new JButton("Shift Checklist");
		btnShiftChecklist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							housekeepingWindow.getFrame().setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		panel_3.add(btnShiftChecklist, "cell 2 0,alignx center");

		btnSubmit = new JButton("Submit Set");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SubmitSetSQL();
				int setNumber = convertToInt(setNumberField.getText());
				setNumber++;
				String setString = Integer.toString(setNumber);
				setNumberField.setText(setString);
			}
		});
		panel_3.add(btnSubmit, "cell 3 0,alignx center");

		btnResetForm = new JButton("Reset Form");
		btnResetForm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model5.setRowCount(0);
				model6.setRowCount(0);
				workStationBox.setSelectedIndex(0);
				operatorField.setText("");
				shiftBox.setSelectedIndex(0);
				setNumberField.setText("1");
				workOrderOneField.setText("");
				workOrderTwoField.setText("");
				workOrderThreeField.setText("");
				workOrderFourField.setText("");
				itemNumberOneField.setText("");
				itemNumberTwoField.setText("");
				itemNumberThreeField.setText("");
				itemNumberFourField.setText("");
				targetWeightOneField.setText("");
				targetWeightTwoField.setText("");
				targetWeightThreeField.setText("");
				targetWeightFourField.setText("");
				rollsPerSetOneField.setText("");
				rollsPerSetTwoField.setText("");
				rollsPerSetThreeField.setText("");
				rollsPerSetFourField.setText("");
				targetSetWeightOneField.setText("");
				targetSetWeightTwoField.setText("");
				targetSetWeightThreeField.setText("");
				targetSetWeightFourField.setText("");
				actualSetWeightOneField.setText("");
				actualSetWeightTwoField.setText("");
				actualSetWeightThreeField.setText("");
				actualSetWeightFourField.setText("");
				coreTagNumberField.setText("");
				rollWeightField.setText("");
			}
		});
		panel_3.add(btnResetForm, "cell 4 0,alignx center");
	}

	private int updatePercentOfTarget() {
		Object[][] tableData = getTableData();
		if ((workOrderOneField.getText().equals(""))
				&& (workOrderTwoField.getText().equals(""))
				&& (workOrderThreeField.getText().equals(""))
				&& (workOrderFourField.getText().equals(""))) {
			JOptionPane.showMessageDialog(null, "Enter a work order number");
			return 0;
		} else if (!(workOrderOneField.getText().equals(""))
				&& (workOrderTwoField.getText().equals(""))
				&& (workOrderThreeField.getText().equals(""))
				&& (workOrderFourField.getText().equals(""))) {
			String targetRollWeightOne = targetWeightOneField.getText();
			double targetRollWeightOneInt = convertToDouble(targetRollWeightOne);
			String rollsPerSetOne = rollsPerSetOneField.getText();
			int rollsPersetOneInt = convertToInt(rollsPerSetOne);
			double targetSetWeightOne = targetRollWeightOneInt
					* rollsPersetOneInt;
			double actualSetWeightOne = 0;
			for (int i = 0; i < tableData.length; i++) {
				if (tableData[i][0] != null) {
					actualSetWeightOne += (double) tableData[i][3];
				}
			}
			double percentOfTarget = (actualSetWeightOne / targetSetWeightOne) * 100;
			percentOfTarget = Math.round(percentOfTarget * 100.0) / 100.0;
			String percentOfTargetString = String.valueOf(percentOfTarget);
			percentOfTargetLbl.setText(percentOfTargetString);
		} else if (!(workOrderOneField.getText().equals(""))
				&& !(workOrderTwoField.getText().equals(""))
				&& (workOrderThreeField.getText().equals(""))
				&& (workOrderFourField.getText().equals(""))) {
			String targetRollWeightOne = targetWeightOneField.getText();
			double targetRollWeightOneInt = convertToDouble(targetRollWeightOne);
			String rollsPerSetOne = rollsPerSetOneField.getText();
			int rollsPersetOneInt = convertToInt(rollsPerSetOne);
			double targetSetWeightOne = targetRollWeightOneInt
					* rollsPersetOneInt;
			double actualSetWeightOne = 0;

			String targetRollWeightTwo = targetWeightTwoField.getText();
			double targetRollWeightTwoInt = convertToDouble(targetRollWeightTwo);
			String rollsPerSetTwo = rollsPerSetTwoField.getText();
			int rollsPersetTwoInt = convertToInt(rollsPerSetTwo);
			double targetSetWeightTwo = targetRollWeightTwoInt
					* rollsPersetTwoInt;
			double actualSetWeightTwo = 0;

			for (int i = 0; i < tableData.length; i++) {
				if (tableData[i][0] != null) {
					String workOrder = (String) tableData[i][1];
					workOrder = workOrder.substring(1, 9);
					if (workOrder.equals((String) workOrderOneField.getText())) {
						actualSetWeightOne += (double) tableData[i][3];
					} else if (workOrder.equals((String) workOrderTwoField
							.getText())) {
						actualSetWeightTwo += (double) tableData[i][3];
					}
				}
			}

			double percentOfTargetOne = (actualSetWeightOne / targetSetWeightOne);
			double percentOfTargetTwo = (actualSetWeightTwo / targetSetWeightTwo);
			double percentOfTargetTotal = ((percentOfTargetOne + percentOfTargetTwo) / 2) * 100;
			percentOfTargetTotal = Math.round(percentOfTargetTotal * 100.0) / 100.0;
			String percentOfTargetString = String.valueOf(percentOfTargetTotal);
			percentOfTargetLbl.setText(percentOfTargetString);
		} else if (!(workOrderOneField.getText().equals(""))
				&& !(workOrderTwoField.getText().equals(""))
				&& !(workOrderThreeField.getText().equals(""))
				&& (workOrderFourField.getText().equals(""))) {

			String targetRollWeightOne = targetWeightOneField.getText();
			double targetRollWeightOneInt = convertToDouble(targetRollWeightOne);
			String rollsPerSetOne = rollsPerSetOneField.getText();
			int rollsPersetOneInt = convertToInt(rollsPerSetOne);
			double targetSetWeightOne = targetRollWeightOneInt
					* rollsPersetOneInt;
			double actualSetWeightOne = 0;

			String targetRollWeightTwo = targetWeightTwoField.getText();
			double targetRollWeightTwoInt = convertToDouble(targetRollWeightTwo);
			String rollsPerSetTwo = rollsPerSetTwoField.getText();
			int rollsPersetTwoInt = convertToInt(rollsPerSetTwo);
			double targetSetWeightTwo = targetRollWeightTwoInt
					* rollsPersetTwoInt;
			double actualSetWeightTwo = 0;

			String targetRollWeightThree = targetWeightThreeField.getText();
			double targetRollWeightThreeInt = convertToDouble(targetRollWeightThree);
			String rollsPerSetThree = rollsPerSetThreeField.getText();
			int rollsPersetThreeInt = convertToInt(rollsPerSetThree);
			double targetSetWeightThree = targetRollWeightThreeInt
					* rollsPersetThreeInt;
			double actualSetWeightThree = 0;

			for (int i = 0; i < tableData.length; i++) {
				if (tableData[i][0] != null) {
					String workOrder = (String) tableData[i][1];
					workOrder = workOrder.substring(1, 9);
					if (workOrder.equals((String) workOrderOneField.getText())) {
						actualSetWeightOne += (double) tableData[i][3];
					} else if (workOrder.equals((String) workOrderTwoField
							.getText())) {
						actualSetWeightTwo += (double) tableData[i][3];
					} else if (workOrder.equals((String) workOrderThreeField
							.getText())) {
						actualSetWeightThree += (double) tableData[i][3];
					}
				}
			}

			double percentOfTargetOne = (actualSetWeightOne / targetSetWeightOne);
			double percentOfTargetTwo = (actualSetWeightTwo / targetSetWeightTwo);
			double percentOfTargetThree = (actualSetWeightThree / targetSetWeightThree);
			double percentOfTargetTotal = ((percentOfTargetOne
					+ percentOfTargetTwo + percentOfTargetThree) / 3) * 100;
			percentOfTargetTotal = Math.round(percentOfTargetTotal * 100.0) / 100.0;
			String percentOfTargetString = String.valueOf(percentOfTargetTotal);
			percentOfTargetLbl.setText(percentOfTargetString);

		} else if (!(workOrderOneField.getText().equals(""))
				&& !(workOrderTwoField.getText().equals(""))
				&& !(workOrderThreeField.getText().equals(""))
				&& !(workOrderFourField.getText().equals(""))) {

			String targetRollWeightOne = targetWeightOneField.getText();
			double targetRollWeightOneInt = convertToDouble(targetRollWeightOne);
			String rollsPerSetOne = rollsPerSetOneField.getText();
			int rollsPersetOneInt = convertToInt(rollsPerSetOne);
			double targetSetWeightOne = targetRollWeightOneInt
					* rollsPersetOneInt;
			double actualSetWeightOne = 0;

			String targetRollWeightTwo = targetWeightTwoField.getText();
			double targetRollWeightTwoInt = convertToDouble(targetRollWeightTwo);
			String rollsPerSetTwo = rollsPerSetTwoField.getText();
			int rollsPersetTwoInt = convertToInt(rollsPerSetTwo);
			double targetSetWeightTwo = targetRollWeightTwoInt
					* rollsPersetTwoInt;
			double actualSetWeightTwo = 0;

			String targetRollWeightThree = targetWeightThreeField.getText();
			double targetRollWeightThreeInt = convertToDouble(targetRollWeightThree);
			String rollsPerSetThree = rollsPerSetThreeField.getText();
			int rollsPersetThreeInt = convertToInt(rollsPerSetThree);
			double targetSetWeightThree = targetRollWeightThreeInt
					* rollsPersetThreeInt;
			double actualSetWeightThree = 0;

			String targetRollWeightFour = targetWeightFourField.getText();
			double targetRollWeightFourInt = convertToDouble(targetRollWeightFour);
			String rollsPerSetFour = rollsPerSetFourField.getText();
			int rollsPersetFourInt = convertToInt(rollsPerSetFour);
			double targetSetWeightFour = targetRollWeightFourInt
					* rollsPersetFourInt;
			double actualSetWeightFour = 0;

			for (int i = 0; i < tableData.length; i++) {
				if (tableData[i][0] != null) {
					String workOrder = (String) tableData[i][1];
					workOrder = workOrder.substring(1, 9);
					if (workOrder.equals((String) workOrderOneField.getText())) {
						actualSetWeightOne += (double) tableData[i][3];
					} else if (workOrder.equals((String) workOrderTwoField
							.getText())) {
						actualSetWeightTwo += (double) tableData[i][3];
					} else if (workOrder.equals((String) workOrderThreeField
							.getText())) {
						actualSetWeightThree += (double) tableData[i][3];
					} else if (workOrder.equals((String) workOrderFourField
							.getText())) {
						actualSetWeightFour += (double) tableData[i][3];
					}
				}
			}

			double percentOfTargetOne = (actualSetWeightOne / targetSetWeightOne);
			double percentOfTargetTwo = (actualSetWeightTwo / targetSetWeightTwo);
			double percentOfTargetThree = (actualSetWeightThree / targetSetWeightThree);
			double percentOfTargetFour = (actualSetWeightFour / targetSetWeightFour);
			double percentOfTargetTotal = ((percentOfTargetOne
					+ percentOfTargetTwo + percentOfTargetThree + percentOfTargetFour) / 4) * 100;
			percentOfTargetTotal = Math.round(percentOfTargetTotal * 100.0) / 100.0;
			String percentOfTargetString = String.valueOf(percentOfTargetTotal);
			percentOfTargetLbl.setText(percentOfTargetString);

		}
		return 1;
	}

	private void InsertRollWeightSQL() {
		arrWeights.sqlConnection();
		String workStation = (String) workStationBox.getSelectedItem();
		String operator = operatorField.getText();
		String shift = (String) shiftBox.getSelectedItem();
		String setNumber = setNumberField.getText();
		int setNumberInt = convertToInt(setNumber);
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		String dateTime = dateFormat.format(cal.getTime());
		String coreTagNumber = coreTagNumberField.getText();
		String rollWeight = rollWeightField.getText();
		rollWeight = rollWeight.substring(7,10);
		double rollWeightDouble = convertToDouble(rollWeight);
		String workOrder = coreTagNumber.substring(1, 9);
		String workOrderOne = workOrderOneField.getText();
		String workOrderTwo = workOrderTwoField.getText();
		String workOrderThree = workOrderThreeField.getText();
		String workOrderFour = workOrderFourField.getText();
		int workOrderInt = 0;
		String itemNumber = "";
		double itemNumberDouble = 0;
		String targetWeight = "";
		double targetWeightDouble = 0;
		String rollsPerSet = "";
		double rollsPerSetDouble = 0;
		if (workOrderOne.equals(workOrder)) {
			workOrder = workOrderOne;
			workOrderInt = convertToInt(workOrder);
			itemNumber = itemNumberOneField.getText();
			itemNumberDouble = convertToDouble(itemNumber);
			targetWeight = targetWeightOneField.getText();
			targetWeightDouble = convertToDouble(targetWeight);
			rollsPerSet = rollsPerSetOneField.getText();
			rollsPerSetDouble = convertToDouble(rollsPerSet);
			String actualSetWeightOne = actualSetWeightOneField.getText();
			double actualSetWeightOneDouble = convertToDouble(actualSetWeightOne);
			actualSetWeightOneDouble += rollWeightDouble;
			actualSetWeightOne = String.valueOf(actualSetWeightOneDouble);
			actualSetWeightOneField.setText(actualSetWeightOne);
		} else if (workOrderTwo.equals(workOrder)) {
			workOrder = workOrderTwo;
			workOrderInt = convertToInt(workOrder);
			itemNumber = itemNumberTwoField.getText();
			itemNumberDouble = convertToDouble(itemNumber);
			targetWeight = targetWeightTwoField.getText();
			targetWeightDouble = convertToDouble(targetWeight);
			rollsPerSet = rollsPerSetTwoField.getText();
			rollsPerSetDouble = convertToDouble(rollsPerSet);
			String actualSetWeightTwo = actualSetWeightTwoField.getText();
			double actualSetWeightTwoDouble = convertToDouble(actualSetWeightTwo);
			actualSetWeightTwoDouble += rollWeightDouble;
			actualSetWeightTwo = String.valueOf(actualSetWeightTwoDouble);
			actualSetWeightTwoField.setText(actualSetWeightTwo);
		} else if (workOrderThree.equals(workOrder)) {
			workOrder = workOrderThree;
			workOrderInt = convertToInt(workOrder);
			itemNumber = itemNumberThreeField.getText();
			itemNumberDouble = convertToDouble(itemNumber);
			targetWeight = targetWeightThreeField.getText();
			targetWeightDouble = convertToDouble(targetWeight);
			rollsPerSet = rollsPerSetThreeField.getText();
			rollsPerSetDouble = convertToDouble(rollsPerSet);
			String actualSetWeightThree = actualSetWeightThreeField.getText();
			double actualSetWeightThreeDouble = convertToDouble(actualSetWeightThree);
			actualSetWeightThreeDouble += rollWeightDouble;
			actualSetWeightThree = String.valueOf(actualSetWeightThreeDouble);
			actualSetWeightThreeField.setText(actualSetWeightThree);
		} else if (workOrderFour.equals(workOrder)) {
			workOrder = workOrderFour;
			workOrderInt = convertToInt(workOrder);
			itemNumber = itemNumberFourField.getText();
			itemNumberDouble = convertToDouble(itemNumber);
			targetWeight = targetWeightFourField.getText();
			targetWeightDouble = convertToDouble(targetWeight);
			rollsPerSet = rollsPerSetFourField.getText();
			rollsPerSetDouble = convertToDouble(rollsPerSet);
			String actualSetWeightFour = actualSetWeightFourField.getText();
			double actualSetWeightFourDouble = convertToDouble(actualSetWeightFour);
			actualSetWeightFourDouble += rollWeightDouble;
			actualSetWeightFour = String.valueOf(actualSetWeightFourDouble);
			actualSetWeightFourField.setText(actualSetWeightFour);
		}
		try {
			CallableStatement cs = null;
			cs = arrWeights.conn
					.prepareCall("{call InsertArrRollWeight(?,?,?,?,?,?,?,?,?,?,?)}");
			cs.setString(1, workStation);
			cs.setString(2, operator);
			cs.setString(3, shift);
			cs.setInt(4, setNumberInt);
			cs.setString(5, dateTime);
			cs.setInt(6, workOrderInt);
			cs.setDouble(7, itemNumberDouble);
			cs.setDouble(8, targetWeightDouble);
			cs.setDouble(9, rollsPerSetDouble);
			cs.setString(10, coreTagNumber);
			cs.setDouble(11, rollWeightDouble);
			cs.execute();
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
		model5.addRow(new Object[] { dateTime, coreTagNumber,
				targetWeightDouble, rollWeightDouble, setNumberInt });
	}

	private void SubmitSetSQL() {
		arrWeights.sqlConnection();
		String workStation = (String) workStationBox.getSelectedItem();
		String operator = operatorField.getText();
		String shift = (String) shiftBox.getSelectedItem();
		String setNumber = setNumberField.getText();
		int setNumberInt = convertToInt(setNumber);
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		String dateTime = dateFormat.format(cal.getTime());
		String actualPercentOfTarget = percentOfTargetLbl.getText();
		double actualPercentOfTargetDouble = 0;
		actualPercentOfTargetDouble = convertToDouble(actualPercentOfTarget);

		String workOrderOne = workOrderOneField.getText();
		int workOrderOneInt = convertToInt(workOrderOne);
		String itemNumberOne = itemNumberOneField.getText();
		double itemNumberOneDouble = convertToDouble(itemNumberOne);
		String targetWeightOne = targetWeightOneField.getText();
		double targetWeightOneDouble = convertToDouble(targetWeightOne);
		String rollsPerSetOne = rollsPerSetOneField.getText();
		double rollsPerSetOneDouble = convertToDouble(rollsPerSetOne);
		String targetSetWeightOne = targetSetWeightOneField.getText();
		double targetSetWeightOneDouble = convertToDouble(targetSetWeightOne);
		String actualSetWeightOne = actualSetWeightOneField.getText();
		double actualSetWeightOneDouble = convertToDouble(actualSetWeightOne);

		String workOrderTwo = workOrderTwoField.getText();
		int workOrderTwoInt = convertToInt(workOrderTwo);
		String itemNumberTwo = itemNumberTwoField.getText();
		double itemNumberTwoDouble = convertToDouble(itemNumberTwo);
		String targetWeightTwo = targetWeightTwoField.getText();
		double targetWeightTwoDouble = convertToDouble(targetWeightTwo);
		String rollsPerSetTwo = rollsPerSetTwoField.getText();
		double rollsPerSetTwoDouble = convertToDouble(rollsPerSetTwo);
		String targetSetWeightTwo = targetSetWeightTwoField.getText();
		double targetSetWeightTwoDouble = convertToDouble(targetSetWeightTwo);
		String actualSetWeightTwo = actualSetWeightTwoField.getText();
		double actualSetWeightTwoDouble = convertToDouble(actualSetWeightTwo);

		String workOrderThree = workOrderThreeField.getText();
		int workOrderThreeInt = convertToInt(workOrderThree);
		String itemNumberThree = itemNumberThreeField.getText();
		double itemNumberThreeDouble = convertToDouble(itemNumberThree);
		String targetWeightThree = targetWeightThreeField.getText();
		double targetWeightThreeDouble = convertToDouble(targetWeightThree);
		String rollsPerSetThree = rollsPerSetThreeField.getText();
		double rollsPerSetThreeDouble = convertToDouble(rollsPerSetThree);
		String targetSetWeightThree = targetSetWeightThreeField.getText();
		double targetSetWeightThreeDouble = convertToDouble(targetSetWeightThree);
		String actualSetWeightThree = actualSetWeightThreeField.getText();
		double actualSetWeightThreeDouble = convertToDouble(actualSetWeightThree);

		String workOrderFour = workOrderFourField.getText();
		int workOrderFourInt = convertToInt(workOrderFour);
		String itemNumberFour = itemNumberFourField.getText();
		double itemNumberFourDouble = convertToDouble(itemNumberFour);
		String targetWeightFour = targetWeightFourField.getText();
		double targetWeightFourDouble = convertToDouble(targetWeightFour);
		String rollsPerSetFour = rollsPerSetFourField.getText();
		double rollsPerSetFourDouble = convertToDouble(rollsPerSetFour);
		String targetSetWeightFour = targetSetWeightFourField.getText();
		double targetSetWeightFourDouble = convertToDouble(targetSetWeightFour);
		String actualSetWeightFour = actualSetWeightFourField.getText();
		double actualSetWeightFourDouble = convertToDouble(actualSetWeightFour);

		try {
			CallableStatement cs = null;
			cs = arrWeights.conn
					.prepareCall("{call InsertArrWeightTotal(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
			cs.setString(1, workStation);
			cs.setString(2, operator);
			cs.setString(3, shift);
			cs.setInt(4, setNumberInt);
			cs.setString(5, dateTime);
			cs.setDouble(6, actualPercentOfTargetDouble);
			cs.setInt(7, workOrderOneInt);
			cs.setDouble(8, itemNumberOneDouble);
			cs.setDouble(9, targetWeightOneDouble);
			cs.setDouble(10, rollsPerSetOneDouble);
			cs.setDouble(11, targetSetWeightOneDouble);
			cs.setDouble(12, actualSetWeightOneDouble);
			cs.setInt(13, workOrderTwoInt);
			cs.setDouble(14, itemNumberTwoDouble);
			cs.setDouble(15, targetWeightTwoDouble);
			cs.setDouble(16, rollsPerSetTwoDouble);
			cs.setDouble(17, targetSetWeightTwoDouble);
			cs.setDouble(18, actualSetWeightTwoDouble);
			cs.setInt(19, workOrderThreeInt);
			cs.setDouble(20, itemNumberThreeDouble);
			cs.setDouble(21, targetWeightThreeDouble);
			cs.setDouble(22, rollsPerSetThreeDouble);
			cs.setDouble(23, targetSetWeightThreeDouble);
			cs.setDouble(24, actualSetWeightThreeDouble);
			cs.setInt(25, workOrderFourInt);
			cs.setDouble(26, itemNumberFourDouble);
			cs.setDouble(27, targetWeightFourDouble);
			cs.setDouble(28, rollsPerSetFourDouble);
			cs.setDouble(29, targetSetWeightFourDouble);
			cs.setDouble(30, actualSetWeightFourDouble);
			cs.execute();
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
		model6.addRow(new Object[] { setNumberInt, dateTime,
				actualPercentOfTargetDouble });
	}

	public int convertToInt(String val) {
		int newVal;
		if (!val.equals("")) {
			newVal = Integer.valueOf(val.trim());
			return newVal;
		} else
			return 0;
	}

	public double convertToDouble(String val) {
		double newVal;
		if (!val.equals("")) {
			newVal = Double.valueOf(val.trim());
			return newVal;
		} else
			return 0;
	}

	public Object[][] getTableData() {
		int setNumber = convertToInt(setNumberField.getText());
		int nRow = model5.getRowCount(), nCol = model5.getColumnCount();
		Object[][] tableData = new Object[nRow][nCol];
		for (int i = 0; i < nRow; i++) {
			if ((int) model5.getValueAt(i, 4) == setNumber) {
				for (int j = 0; j < nCol; j++) {
					tableData[i][j] = model5.getValueAt(i, j);
				}
			}
		}
		return tableData;
	}
}
