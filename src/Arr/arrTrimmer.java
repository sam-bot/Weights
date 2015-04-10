package Arr;

import java.awt.Color;
import java.awt.EventQueue;
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
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class arrTrimmer {

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
	private JTextField minimumWeightField;
	private JTextField nominalWeightField;
	private JTextField maximumWeightField;
	private JTextField coreWeightField;
	private JTextField finishedWidthField;
	private JTextField extrudedItemNumberField;
	private JTable table;
	static DefaultTableModel model3 = new DefaultTableModel();
	private JTextField fgCoreTagNumberField;
	private JTextField rollWeightField;
	private JComboBox workStationBox;
	private JComboBox shiftBox;
	private ArrayList<JTextField> fieldList;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					arrTrimmer window = new arrTrimmer("user");
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
	public arrTrimmer(String userName) {
		initialize(userName);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String userName) {
		frame = new JFrame("Trimmer");
		frame.setBounds(100, 100, 668, 410);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(
				new MigLayout("", "[grow][grow][grow][grow]",
						"[][grow][][][63.00,grow][grow]"));

		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, "cell 0 0 4 1");
		panel.setLayout(new MigLayout("", "[][][30][][][30][][]", "[][]"));

		String[] trimmerLines = { "", "FCV340001", "FCV340002" };

		fieldList = new ArrayList<JTextField>();
		JLabel lblWorkstation = new JLabel("Workstation");
		panel.add(lblWorkstation, "cell 0 0");
		workStationBox = new JComboBox(trimmerLines);
		panel.add(workStationBox, "cell 1 0,growx");

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

		JLabel lblExtrudedRoll = new JLabel("Extruded Roll");
		lblExtrudedRoll.setForeground(Color.WHITE);
		extrudedRollPanel.add(lblExtrudedRoll);

		wipCoreTagNumberField = new JTextField();
		fieldList.add(wipCoreTagNumberField);
		frame.getContentPane().add(wipCoreTagNumberField, "cell 2 1,growx");
		wipCoreTagNumberField.setColumns(10);

		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, "cell 0 1 1 5,grow");
		panel_1.setLayout(new MigLayout("", "[grow][]",
				"[][][][][][][][grow][]"));

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

		JLabel lblCoreWeight = new JLabel("Core Weight");
		panel_1.add(lblCoreWeight, "cell 0 4,alignx center");

		coreWeightField = new JTextField();
		fieldList.add(coreWeightField);
		panel_1.add(coreWeightField, "cell 1 4");
		coreWeightField.setColumns(10);

		JLabel lblFinishedWidth = new JLabel("Finished Width");
		panel_1.add(lblFinishedWidth, "cell 0 5,alignx center");

		finishedWidthField = new JTextField();
		fieldList.add(finishedWidthField);
		panel_1.add(finishedWidthField, "cell 1 5");
		finishedWidthField.setColumns(10);

		JLabel lblExtrudedItemNumber = new JLabel("Extruded JNumber");
		panel_1.add(lblExtrudedItemNumber, "cell 0 6,alignx center");

		extrudedItemNumberField = new JTextField();
		fieldList.add(extrudedItemNumberField);
		panel_1.add(extrudedItemNumberField, "cell 1 6");
		extrudedItemNumberField.setColumns(10);

		JButton btnClearForm = new JButton("Clear Form");
		btnClearForm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clearForm();
			}
		});
		panel_1.add(btnClearForm, "cell 0 7");

		// scanner will send a tab command, firing this event
		rollWeightField = new JTextField();
		fieldList.add(rollWeightField);
		rollWeightField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				wipCoreTagNumberField.requestFocus();
				insertArrTrimmerSQL();
				wipCoreTagNumberField.setText("");
				rollWeightField.setText("");
				String fgCoreTagNumber = fgCoreTagNumberField.getText();
				long fgCoreTagNumberInt = Long.valueOf(fgCoreTagNumber);
				fgCoreTagNumberInt += 1;
				fgCoreTagNumber = String.valueOf(fgCoreTagNumberInt);
				fgCoreTagNumberField.setText(fgCoreTagNumber);
				model3.setRowCount(0);
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

		JPanel panel_2 = new JPanel();
		frame.getContentPane().add(panel_2, "cell 1 4 3 1,grow");
		panel_2.setLayout(new MigLayout("", "[][grow][grow][grow]",
				"[grow][][][]"));

		JPanel weightTolerancePanel = new JPanel();
		weightTolerancePanel.setBackground(Color.BLACK);
		panel_2.add(weightTolerancePanel, "cell 0 0 4 1,grow");

		JLabel lblarrWeights = new JLabel("Weight Tolerances");
		lblarrWeights.setForeground(Color.WHITE);
		weightTolerancePanel.add(lblarrWeights);

		JLabel lblNewLabel_1 = new JLabel("Low");
		panel_2.add(lblNewLabel_1, "cell 1 2,alignx center");

		JLabel lblTarget = new JLabel("Target");
		panel_2.add(lblTarget, "cell 2 2,alignx center");

		JLabel lblHigh = new JLabel("High");
		panel_2.add(lblHigh, "cell 3 2,alignx center");

		minimumWeightField = new JTextField();
		fieldList.add(minimumWeightField);
		panel_2.add(minimumWeightField, "cell 1 3,growx");
		minimumWeightField.setColumns(10);

		nominalWeightField = new JTextField();
		fieldList.add(nominalWeightField);
		panel_2.add(nominalWeightField, "cell 2 3,growx");
		nominalWeightField.setColumns(10);
		maximumWeightField = new JTextField();
		fieldList.add(maximumWeightField);
		panel_2.add(maximumWeightField, "cell 3 3,growx");
		maximumWeightField.setColumns(10);
		JScrollPane scrollPane = new JScrollPane();
		frame.getContentPane().add(scrollPane, "cell 1 5 3 1,grow");
		table = new JTable(arrTrimmer.model3);
		arrTrimmer.model3.addColumn("Lot Code Out");
		arrTrimmer.model3.addColumn("Lot Code In");
		arrTrimmer.model3.addColumn("Date / Time");
		arrTrimmer.model3.addColumn("Wgt");
		scrollPane.setViewportView(table);
	}

	private void insertArrTrimmerSQL() {
		arrWeights.sqlConnection();
		String workStation = (String) workStationBox.getSelectedItem();
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
		String minimumWeight = minimumWeightField.getText();
		double minimumWeightDouble = convertToDouble(minimumWeight);
		String nominalWeight = nominalWeightField.getText();
		double nominalWeightDouble = convertToDouble(nominalWeight);
		String maximumWeight = maximumWeightField.getText();
		double maximumWeightDouble = convertToDouble(maximumWeight);
		String piw = piwField.getText();
		double piwDouble = convertToDouble(piw);
		String formula = formulaField.getText();
		double formulaDouble = convertToDouble(formula);
		String gauge = gaugeField.getText();
		double gaugeDouble = convertToDouble(gauge);
		String length = lengthField.getText();
		double lengthDouble = convertToDouble(length);
		String coreWeight = coreWeightField.getText();
		double coreWeightDouble = convertToDouble(coreWeight);
		String finishedWidth = finishedWidthField.getText();
		double finishedWidthDouble = convertToDouble(finishedWidth);
		String extrudedItemNumber = extrudedItemNumberField.getText();
		double extrudedItemNumberField = convertToDouble(extrudedItemNumber);
		model3.addRow(new Object[] { wipCoreTagNumber, fgCoreTagNumber,
				dateTime, rollWeight });
		try {
			CallableStatement cs = null;
			cs = arrWeights.conn
					.prepareCall("{call InsertArrTrimmer(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
			cs.setString(1, workStation);
			cs.setString(2, shift);
			cs.setString(3, operator);
			cs.setString(4, dateTime);
			cs.setDouble(5, workOrderDouble);
			cs.setDouble(6, itemNumberDouble);
			cs.setString(7, wipCoreTagNumber);
			cs.setString(8, fgCoreTagNumber);
			cs.setDouble(9, rollWeightDouble);
			cs.setDouble(10, minimumWeightDouble);
			cs.setDouble(11, nominalWeightDouble);
			cs.setDouble(12, maximumWeightDouble);
			cs.setDouble(13, piwDouble);
			cs.setDouble(14, formulaDouble);
			cs.setDouble(15, gaugeDouble);
			cs.setDouble(16, lengthDouble);
			cs.setDouble(17, coreWeightDouble);
			cs.setDouble(18, finishedWidthDouble);
			cs.setDouble(19, extrudedItemNumberField);
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

	public double convertToDouble(String val) {
		double newVal;
		if (!val.equals("")) {
			newVal = Double.valueOf(val);
			return newVal;
		} else
			return 0;
	}

	private void clearForm() {
		for (JTextField t : fieldList)
			t.setText("");
		workStationBox.setSelectedIndex(0);
		shiftBox.setSelectedIndex(0);
	}

	public Window getFrame() {
		return frame;
	}
}
