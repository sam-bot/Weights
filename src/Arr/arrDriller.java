package Arr;

import java.awt.AWTException;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Robot;
import java.awt.Window;

import javax.swing.JFrame;

import net.miginfocom.swing.MigLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyEvent;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class arrDriller {

	private JFrame frame;
	private JTextField operatorField;
	private JTextField dateTimeField;
	private JTextField workOrderField;
	private JTextField itemNumberField;
	private JTextField wipCoreTagNumberField;
	private JTextField piwField;
	private JTextField formulaField;
	private JTextField gaugeField;
	private JTextField lengthField;
	private JTextField nominalWeightField;
	private JTextField finishedWidthField;
	private JTextField extrudedItemNumberField;
	private JTable table;
	static DefaultTableModel model3 = new DefaultTableModel();
	private JTextField fgCoreTagNumberField;
	private JTextField rollWeightField;
	private JTextField workStationField;
	private JComboBox shiftBox;
	private ArrayList<JTextField> fieldList;
	private JTextField trimmedItemNumberField;
	private Robot robot;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					arrDriller window = new arrDriller("user");
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application. Stored in plant server.
	 */
	public arrDriller(String userName) {
		initialize(userName);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String userName) {
		frame = new JFrame("Driller");
		frame.setBounds(100, 100, 764, 368);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(
				new MigLayout("", "[grow][grow][grow][grow]",
						"[][grow][][][63.00,grow][]"));

		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, "cell 0 0 4 1");
		panel.setLayout(new MigLayout("", "[][88.00][30][][][30][][]", "[][]"));

		fieldList = new ArrayList<JTextField>();
		JLabel lblWorkstation = new JLabel("Workstation");
		panel.add(lblWorkstation, "cell 0 0");
		workStationField = new JTextField("FCV340005");
		workStationField.setEditable(false);
		panel.add(workStationField, "cell 1 0,growx");

		JLabel lblOperator = new JLabel("Operator");
		panel.add(lblOperator, "cell 3 0");

		operatorField = new JTextField(userName);
		operatorField.setEditable(false);
		panel.add(operatorField, "cell 4 0,growx");
		operatorField.setColumns(10);
		fieldList.add(operatorField);

		JLabel lblNewLabel = new JLabel("Work Order");
		panel.add(lblNewLabel, "cell 6 0");

		workOrderField = new JTextField();
		fieldList.add(workOrderField);
		workOrderField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				fgCoreTagNumberField.setText(workOrderField.getText() + "0001");
			}
		});
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

		JPanel extrudedRollPanel = new JPanel();
		extrudedRollPanel.setBackground(Color.BLACK);
		frame.getContentPane().add(extrudedRollPanel, "cell 1 1,grow");

		JLabel lblExtrudedRoll = new JLabel("Scan Barcode");
		lblExtrudedRoll.setForeground(Color.WHITE);
		extrudedRollPanel.add(lblExtrudedRoll);

		wipCoreTagNumberField = new JTextField();
		fieldList.add(wipCoreTagNumberField);
		frame.getContentPane().add(wipCoreTagNumberField, "cell 2 1,growx");
		wipCoreTagNumberField.setColumns(10);

		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, "cell 0 1 1 5,grow");
		panel_1.setLayout(new MigLayout("", "[grow][grow]",
				"[][][][][][][][][40.00,grow]"));

		JLabel lblPiw = new JLabel("PIW");
		panel_1.add(lblPiw, "cell 0 0,alignx center");

		piwField = new JTextField();
		fieldList.add(piwField);
		panel_1.add(piwField, "cell 1 0");
		piwField.setColumns(10);

		JLabel lblFormula = new JLabel("Formula");
		panel_1.add(lblFormula, "cell 0 1,alignx center");

		formulaField = new JTextField();
		fieldList.add(formulaField);
		panel_1.add(formulaField, "cell 1 1");
		formulaField.setColumns(10);

		JLabel lblGauge = new JLabel("Gauge");
		panel_1.add(lblGauge, "cell 0 2,alignx center");

		gaugeField = new JTextField();
		fieldList.add(gaugeField);
		panel_1.add(gaugeField, "cell 1 2");
		gaugeField.setColumns(10);

		JLabel lblLength = new JLabel("Length");
		panel_1.add(lblLength, "cell 0 3,alignx center");

		lengthField = new JTextField();
		fieldList.add(lengthField);
		panel_1.add(lengthField, "cell 1 3");
		lengthField.setColumns(10);

		JLabel lblFinishedWidth = new JLabel("Finished Width");
		panel_1.add(lblFinishedWidth, "cell 0 4,alignx center");

		finishedWidthField = new JTextField();
		fieldList.add(finishedWidthField);
		panel_1.add(finishedWidthField, "cell 1 4");
		finishedWidthField.setColumns(10);

		JLabel lblExtrudedItemNumber = new JLabel("Extruded JNumber");
		panel_1.add(lblExtrudedItemNumber, "cell 0 5,alignx center");

		JButton btnClearForm = new JButton("Clear Form");
		btnClearForm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clearForm();
			}
		});

		extrudedItemNumberField = new JTextField();
		fieldList.add(extrudedItemNumberField);
		panel_1.add(extrudedItemNumberField, "cell 1 5");
		extrudedItemNumberField.setColumns(10);

		JLabel label = new JLabel("Trimmed Item Number");
		panel_1.add(label, "cell 0 6,alignx center");

		trimmedItemNumberField = new JTextField();
		fieldList.add(trimmedItemNumberField);
		trimmedItemNumberField.setColumns(10);
		panel_1.add(trimmedItemNumberField, "cell 1 6");

		JLabel lblTarget = new JLabel("Weight Target");
		panel_1.add(lblTarget, "cell 0 7,alignx center");

		nominalWeightField = new JTextField();
		panel_1.add(nominalWeightField, "cell 1 7");
		fieldList.add(nominalWeightField);
		nominalWeightField.setColumns(10);
		panel_1.add(btnClearForm, "cell 0 8 2 1,alignx center");

		// scanner will send a tab command, firing this event
		rollWeightField = new JTextField();
		fieldList.add(rollWeightField);
		rollWeightField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				wipCoreTagNumberField.requestFocus();
				insertArrDrillerSQL();
				wipCoreTagNumberField.setText("");
				rollWeightField.setText("");
				String fgCoreTagNumber = fgCoreTagNumberField.getText();
				long fgCoreTagNumberInt = Long.valueOf(fgCoreTagNumber);
				fgCoreTagNumberInt += 1;
				fgCoreTagNumber = String.valueOf(fgCoreTagNumberInt);
				fgCoreTagNumberField.setText(fgCoreTagNumber);
				model3.setRowCount(0);
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
		frame.getContentPane().add(rollWeightField, "cell 3 1,growx");
		rollWeightField.setColumns(10);
		JButton btnNextSequenceRoll = new JButton("Next Sequence Roll Number");
		btnNextSequenceRoll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String coreTagNumber = fgCoreTagNumberField.getText();
				long coreTagLong = Long.valueOf(coreTagNumber);
				coreTagLong++;
				coreTagNumber = String.valueOf(coreTagLong);
				fgCoreTagNumberField.setText(coreTagNumber);
			}
		});
		frame.getContentPane().add(btnNextSequenceRoll,
				"cell 1 2,alignx center");

		fgCoreTagNumberField = new JTextField();
		fieldList.add(fgCoreTagNumberField);
		frame.getContentPane().add(fgCoreTagNumberField, "cell 2 2,growx");
		fgCoreTagNumberField.setColumns(10);

		JButton btnResetSequencer = new JButton("Reset Sequencer");
		btnResetSequencer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fgCoreTagNumberField.setText(workOrderField.getText() + "0001");
			}
		});
		frame.getContentPane().add(btnResetSequencer, "cell 3 2,alignx center");
		JScrollPane scrollPane = new JScrollPane();
		frame.getContentPane().add(scrollPane, "cell 1 5 3 1,grow");
		table = new JTable(arrDriller.model3);
		arrDriller.model3.addColumn("Lot Code Out");
		arrDriller.model3.addColumn("Lot Code In");
		arrDriller.model3.addColumn("Date / Time");
		arrDriller.model3.addColumn("Wgt");
		scrollPane.setViewportView(table);
	}

	void insertArrDrillerSQL() {
		arrWeights.sqlConnection();
		String workStation = (String) workStationField.getText();
		String operator = operatorField.getText();
		String workOrder = workOrderField.getText();
		double workOrderDouble = convertToDouble(workOrder);
		String shift = (String) shiftBox.getSelectedItem();
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		String dateTime = dateFormat.format(cal.getTime());
		String itemNumber = itemNumberField.getText();
		double itemNumberDouble = convertToDouble(itemNumber);
		String wipCoreTagNumber = wipCoreTagNumberField.getText();
		String fgCoreTagNumber = fgCoreTagNumberField.getText();
		String rollWeight = rollWeightField.getText();
		double rollWeightDouble = convertToDouble(rollWeight);
		String nominalWeight = nominalWeightField.getText();
		double nominalWeightDouble = convertToDouble(nominalWeight);
		String piw = piwField.getText();
		double piwDouble = convertToDouble(piw);
		String formula = formulaField.getText();
		double formulaDouble = convertToDouble(formula);
		String gauge = gaugeField.getText();
		double gaugeDouble = convertToDouble(gauge);
		String length = lengthField.getText();
		double lengthDouble = convertToDouble(length);
		String finishedWidth = finishedWidthField.getText();
		double finishedWidthDouble = convertToDouble(finishedWidth);
		String extrudedItemNumber = extrudedItemNumberField.getText();
		double extrudedItemNumberField = convertToDouble(extrudedItemNumber);
		String trimmedItemNumber = trimmedItemNumberField.getText();
		double trimmedItemNumberDouble = convertToDouble(trimmedItemNumber);
		model3.addRow(new Object[] { wipCoreTagNumber, fgCoreTagNumber,
				dateTime, rollWeight });
		try {
			CallableStatement cs = null;
			cs = arrWeights.conn
					.prepareCall("{call InsertArrDriller(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
			cs.setString(1, workStation);
			cs.setString(2, shift);
			cs.setString(3, operator);
			cs.setString(4, dateTime);
			cs.setDouble(5, workOrderDouble);
			cs.setDouble(6, itemNumberDouble);
			cs.setString(7, wipCoreTagNumber);
			cs.setString(8, fgCoreTagNumber);
			cs.setDouble(9, nominalWeightDouble);
			cs.setDouble(10, rollWeightDouble);
			cs.setDouble(11, piwDouble);
			cs.setDouble(12, formulaDouble);
			cs.setDouble(13, gaugeDouble);
			cs.setDouble(14, lengthDouble);
			cs.setDouble(15, finishedWidthDouble);
			cs.setDouble(16, extrudedItemNumberField);
			cs.setDouble(17, trimmedItemNumberDouble);
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

	}

	public static double convertToDouble(String val) {
		double newVal;
		if (!val.equals("")) {
			newVal = Double.valueOf(val);
			return newVal;
		} else
			return 0;
	}

	void clearForm() {
		for (JTextField t : fieldList)
			t.setText("");
		shiftBox.setSelectedIndex(0);
	}

	public Window getFrame() {
		return frame;
	}
}
