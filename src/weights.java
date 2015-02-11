import java.awt.EventQueue;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.GridBagLayout;

import javax.swing.JLabel;

import java.awt.GridBagConstraints;

import javax.swing.JTextField;

import java.awt.Insets;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.swing.JSeparator;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JTable;

public class weights {

	private JFrame frame;
	private JTextField setNumberField;
	private JComboBox textField_1;
	private JTextField lineSpeedField;
	private JLabel lblTargetWt;
	private JTextField targetWeightOneField;
	private JLabel lblRollsset;
	private JTextField rollsPerSetOneField;
	private JLabel lblProduct;
	private JLabel lblRollLength;
	private JTextField rollLengthField;
	private JLabel lblActualLbshr;
	private JLabel textField_6;
	private JTextField rollOneField;
	private JTextField rollThreeField;
	private JTextField rollFiveField;
	private JTextField rollSevenField;
	private JTextField rollNineField;
	private JTextField rollElevenField;
	private JTextField setTwoRollElevenField;
	private JTextField setTwoRollOneField;
	private JTextField setTwoRollThreeField;
	private JTextField setTwoRollFiveField;
	private JTextField setTwoRollSevenField;
	private JTextField setTwoRollNineField;
	private JTextField rollTwoField;
	private JTextField rollFourField;
	private JTextField rollSixField;
	private JTextField rollEightField;
	private JTextField rollTenField;
	private JTextField rollTwelveField;
	private JTextField setTwoRollTwelveField;
	private JTextField setTwoRollTwoField;
	private JTextField setTwoRollFourField;
	private JTextField setTwoRollSixField;
	private JTextField setTwoRollEightField;
	private JTextField setTwoRollTenField;
	private JButton btnSubmit;
	private JLabel rollOneLabel;
	private JLabel rollThreeLabel;
	private JLabel rollFiveLabel;
	private JLabel rollSevenLabel;
	private JLabel rollEightLabel;
	private JLabel rollNineLabel;
	private JLabel rollElevenLabel;
	private JLabel rollTwoLabel;
	private JLabel rollFourLabel;
	private JLabel rollSixLabel;
	private JLabel rollTenLabel;
	private JLabel rollTwelveLabel;
	private JLabel setTwoRollOneLabel;
	private JLabel setTwoRollTwoLabel;
	private JLabel setTwoRollThreeLabel;
	private JLabel setTwoRollFourLabel;
	private JLabel setTwoRollFiveLabel;
	private JLabel setTwoRollSixLabel;
	private JLabel setTwoRollSevenLabel;
	private JLabel setTwoRollEightLabel;
	private JLabel setTwoRollNineLabel;
	private JLabel setTwoRollTenLabel;
	private JLabel setTwoRollElevenLabel;
	private JLabel setTwoRollTwelveLabel;
	private JLabel lblRollsset_1;
	private JLabel lblTargetWt_1;
	private JTextField textField_7;
	private JTextField textField_8;
	private JLabel lblProduct_1;
	private JLabel lblActualSetWeight;
	private JLabel textField_33;
	private JLabel lblTargetSetWt;
	private JLabel textField_34;
	private JLabel lblActualSetWt;
	private JLabel textField_35;
	private JLabel lblTargetSetWt_1;
	private JLabel textField_36;
	private JLabel lblActualOf;
	private JLabel textField_37;
	private JButton btnHousekeepingAudit;
	private JButton btnQaAudit;
	private double wt1No;
	private double wt2No;
	private double wt3No;
	private double wt4No;
	private double wt5No;
	private double wt6No;
	private double wt7No;
	private double wt8No;
	private double wt9No;
	private double wt10No;
	private double wt11No;
	private double wt12No;
	private double wt13No;
	private double wt14No;
	private double wt15No;
	private double wt16No;
	private double wt17No;
	private double wt18No;
	private double wt19No;
	private double wt20No;
	private double wt21No;
	private double wt22No;
	private double wt23No;
	private double wt24No;
	private double p1RollSet;
	private double p1TgWt;
	private double p2RollSet;
	private double p2TgWt;
	private double sum;
	private double targetSum;
	private double sum2;
	private double targetSum2;
	private double poundsPerHour;
	private double rollLength;
	private double lineSpeed;
	static JTextField workOrderOneField;
	private JLabel lblProduct_2;
	static JTextField workOrderTwoField;
	private JLabel lblProduct_3;
	private JLabel lblLineNumber;
	static JComboBox comboBox;
	static Connection conn;
	private JLabel lblCompound;
	private JLabel label_24;
	private JLabel lblShift;
	private JComboBox comboBox_1;
	DecimalFormat df = new DecimalFormat("###0.00");
	String dateTime = "";
	String[] parts = dateTime.split(" ");
	String dateStamp = "";
	String timeStamp = "";
	String setNumber = "";
	int s2 = 0;
	String workOrder = " ";
	Integer workOrderInt = 0;
	String shift = "";
	int shiftInt = 0;
	String lineNumber = "";
	int lineNumberInt = 0;
	static DefaultTableModel model = new DefaultTableModel();
	static DefaultTableModel model2 = new DefaultTableModel();
	private JPanel panel;
	private JScrollPane scrollPane;
	private JScrollPane scrollPane_1;
	private JTable table;
	private JTable table_1;
	private JButton btnClearSets;
	qaChecks window = new qaChecks();
	private JButton btnRecalculateOf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					weights window = new weights();
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
	 * @throws SQLException
	 *             , ClassNotFoundException
	 */
	public weights() throws SQLException, ClassNotFoundException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings("unchecked")
	private void initialize() {
		frame = new JFrame("Set Weights");
		frame.setBounds(-1, -1, 900, 755);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		float newSize2 = 14;
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0, 51, 0,
				45, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0,
				1.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 1.0, 1.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		frame.getContentPane().setLayout(gridBagLayout);

		panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridwidth = 6;
		gbc_panel.gridheight = 25;
		gbc_panel.insets = new Insets(0, 0, 0, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		frame.getContentPane().add(panel, gbc_panel);
		panel.setLayout(new MigLayout("", "[][][][][]",
				"[][][][][][][][][][][][][][][][][][][][][][][][][][][][][][]"));

		JLabel lblItemNumber = new JLabel("Set Number");
		panel.add(lblItemNumber, "cell 0 0");
		lblItemNumber.setFont(lblItemNumber.getFont().deriveFont(newSize2));
		setNumberField = new JTextField();
		panel.add(setNumberField, "cell 1 0,growx");
		setNumberField.setFont(setNumberField.getFont().deriveFont(newSize2));
		setNumberField.setText("1");
		lblRollLength = new JLabel("Roll Length");
		panel.add(lblRollLength, "flowx,cell 2 0");
		lblRollLength.setFont(lblRollLength.getFont().deriveFont(newSize2));

		rollLengthField = new JTextField();
		panel.add(rollLengthField, "cell 3 0");
		rollLengthField.setColumns(10);

		JLabel lblNominalWeight = new JLabel("Target Lbs/Hr");
		panel.add(lblNominalWeight, "cell 0 2");
		lblNominalWeight.setFont(lblNominalWeight.getFont()
				.deriveFont(newSize2));
		// print target pounds per hour here
		label_24 = new JLabel();
		panel.add(label_24, "cell 1 2");
		label_24.setFont(label_24.getFont().deriveFont(newSize2));

		lblActualLbshr = new JLabel("Actual Lbs/Hr");
		panel.add(lblActualLbshr, "flowx,cell 2 2");
		lblActualLbshr.setFont(lblActualLbshr.getFont().deriveFont(newSize2));
		lblActualLbshr.setFont(lblActualLbshr.getFont().deriveFont(newSize2));

		textField_6 = new JLabel("0");
		panel.add(textField_6, "cell 3 2");

		JLabel lblLineSpeed = new JLabel("Line Speed");
		panel.add(lblLineSpeed, "cell 0 3");

		lineSpeedField = new JTextField();
		panel.add(lineSpeedField, "cell 1 3");
		lineSpeedField.setColumns(10);
		String[] lines = { "", "21", "22", "23", "24", "25" };
		lblLineNumber = new JLabel("Line Number");
		panel.add(lblLineNumber, "cell 2 3");
		comboBox = new JComboBox(lines);
		panel.add(comboBox, "cell 3 3,growx");
		String[] poundsPerHour = { "", "CRMF", "Omni", "PWGS", "PS", "SB",
				"SBT", "HT", "HWR", "LWJ", "BLG", "LGK", "Vitawrap F",
				"Omni MT", "PWMF", "MTR", "DS", "RCR", "RLGK", "SBX" };
		lblCompound = new JLabel("Compound");
		panel.add(lblCompound, "cell 0 4");
		textField_1 = new JComboBox(poundsPerHour);
		panel.add(textField_1, "cell 1 4");

		String[] shifts = { "", "1", "2" };
		lblShift = new JLabel("Shift");
		panel.add(lblShift, "cell 2 4");
		comboBox_1 = new JComboBox(shifts);
		panel.add(comboBox_1, "cell 3 4,growx");

		lblProduct_2 = new JLabel("Product 1 Weights");
		panel.add(lblProduct_2, "cell 0 5 5 1,alignx center");

		lblProduct = new JLabel("Work Order Number");
		panel.add(lblProduct, "cell 1 6");

		workOrderOneField = new JTextField();
		panel.add(workOrderOneField, "cell 2 6");
		workOrderOneField.setColumns(10);

		lblRollsset = new JLabel("Rolls/Set");
		panel.add(lblRollsset, "cell 1 7");

		rollsPerSetOneField = new JTextField();
		panel.add(rollsPerSetOneField, "cell 2 7");
		rollsPerSetOneField.setColumns(10);

		lblTargetWt = new JLabel("Target Wt.");
		panel.add(lblTargetWt, "cell 1 8");

		targetWeightOneField = new JTextField();
		panel.add(targetWeightOneField, "cell 2 8");
		targetWeightOneField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				targetSetWt1Calc();
			}
		});
		targetWeightOneField.setColumns(10);

		rollOneLabel = new JLabel("1");
		panel.add(rollOneLabel, "cell 0 9,alignx right");

		rollOneField = new JTextField();
		panel.add(rollOneField, "cell 1 9");
		rollOneField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				targetUpdate();
				percentCalc();
			}
		});
		rollOneField.setColumns(10);

		rollTwoLabel = new JLabel("2");
		panel.add(rollTwoLabel, "cell 2 9,alignx right");

		rollTwoField = new JTextField();
		panel.add(rollTwoField, "cell 3 9");
		rollTwoField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				targetUpdate();
				percentCalc();
			}
		});
		rollTwoField.setColumns(10);

		rollThreeLabel = new JLabel("3");
		panel.add(rollThreeLabel, "cell 0 10,alignx right");

		rollThreeField = new JTextField();
		panel.add(rollThreeField, "cell 1 10");
		rollThreeField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				targetUpdate();
				percentCalc();
			}
		});
		rollThreeField.setColumns(10);

		rollFourLabel = new JLabel("4");
		panel.add(rollFourLabel, "cell 2 10,alignx right");

		rollFourField = new JTextField();
		panel.add(rollFourField, "cell 3 10");
		rollFourField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				targetUpdate();
				percentCalc();

			}
		});
		rollFourField.setColumns(10);

		rollFiveLabel = new JLabel("5");
		panel.add(rollFiveLabel, "cell 0 11,alignx right");

		rollFiveField = new JTextField();
		panel.add(rollFiveField, "cell 1 11");
		rollFiveField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				targetUpdate();
				percentCalc();

			}
		});
		rollFiveField.setColumns(10);

		rollSixLabel = new JLabel("6");
		panel.add(rollSixLabel, "cell 2 11,alignx right");

		rollSixField = new JTextField();
		panel.add(rollSixField, "cell 3 11");
		rollSixField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				targetUpdate();
				percentCalc();

			}
		});
		rollSixField.setColumns(10);

		rollSevenLabel = new JLabel("7");
		panel.add(rollSevenLabel, "cell 0 12,alignx right");

		rollSevenField = new JTextField();
		panel.add(rollSevenField, "cell 1 12");
		rollSevenField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				targetUpdate();
				percentCalc();

			}
		});
		rollSevenField.setColumns(10);

		rollEightLabel = new JLabel("8");
		panel.add(rollEightLabel, "cell 2 12,alignx right");

		rollEightField = new JTextField();
		panel.add(rollEightField, "cell 3 12");
		rollEightField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				targetUpdate();
				percentCalc();

			}
		});
		rollEightField.setColumns(10);

		rollNineLabel = new JLabel("9");
		panel.add(rollNineLabel, "cell 0 13,alignx right");

		rollNineField = new JTextField();
		panel.add(rollNineField, "cell 1 13");
		rollNineField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				targetUpdate();
				percentCalc();

			}
		});
		rollNineField.setColumns(10);

		rollTenLabel = new JLabel("10");
		panel.add(rollTenLabel, "cell 2 13,alignx right");

		rollTenField = new JTextField();
		panel.add(rollTenField, "cell 3 13");
		rollTenField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				targetUpdate();
				percentCalc();

			}
		});
		rollTenField.setColumns(10);

		rollElevenLabel = new JLabel("11");
		panel.add(rollElevenLabel, "cell 0 14,alignx right");

		rollElevenField = new JTextField();
		panel.add(rollElevenField, "cell 1 14");
		rollElevenField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				targetUpdate();
				percentCalc();

			}
		});
		rollElevenField.setColumns(10);

		rollTwelveLabel = new JLabel("12");
		panel.add(rollTwelveLabel, "cell 2 14,alignx right");

		rollTwelveField = new JTextField();
		panel.add(rollTwelveField, "cell 3 14");
		rollTwelveField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				targetUpdate();
				percentCalc();
			}
		});
		rollTwelveField.setColumns(10);

		lblActualSetWt = new JLabel("Actual Set Wt");
		panel.add(lblActualSetWt, "cell 0 15");

		textField_35 = new JLabel();
		panel.add(textField_35, "cell 1 15");

		lblTargetSetWt_1 = new JLabel("Target Set Wt");
		panel.add(lblTargetSetWt_1, "cell 0 16");

		textField_36 = new JLabel();
		panel.add(textField_36, "cell 1 16");

		btnQaAudit = new JButton("QA Audit");
		panel.add(btnQaAudit, "cell 2 16,alignx center");

		btnHousekeepingAudit = new JButton("Housekeeping");
		panel.add(btnHousekeepingAudit, "cell 3 16");

		lblProduct_3 = new JLabel("Product 2 Weights");
		panel.add(lblProduct_3, "cell 0 17 4 1,alignx center");

		lblProduct_1 = new JLabel("Work Order Number");
		panel.add(lblProduct_1, "cell 1 18");

		workOrderTwoField = new JTextField();
		panel.add(workOrderTwoField, "cell 2 18");
		workOrderTwoField.setColumns(10);

		lblRollsset_1 = new JLabel("Rolls/Set");
		panel.add(lblRollsset_1, "cell 1 19");

		textField_7 = new JTextField();
		panel.add(textField_7, "cell 2 19");
		textField_7.setColumns(10);

		lblTargetWt_1 = new JLabel("Target Wt.");
		panel.add(lblTargetWt_1, "cell 1 20");

		textField_8 = new JTextField();
		panel.add(textField_8, "cell 2 20");
		textField_8.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				targetSetwt2Calc();
			}
		});
		textField_8.setColumns(10);

		setTwoRollOneLabel = new JLabel("1");
		panel.add(setTwoRollOneLabel, "cell 0 21,alignx right");

		setTwoRollOneField = new JTextField();
		panel.add(setTwoRollOneField, "cell 1 21");
		setTwoRollOneField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				targetUpdate();
				percentCalc();
			}
		});
		setTwoRollOneField.setColumns(10);

		setTwoRollTwoLabel = new JLabel("2");
		panel.add(setTwoRollTwoLabel, "cell 2 21,alignx right");

		setTwoRollTwoField = new JTextField();
		panel.add(setTwoRollTwoField, "cell 3 21");
		setTwoRollTwoField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				targetUpdate();
				percentCalc();
			}
		});
		setTwoRollTwoField.setColumns(10);

		setTwoRollThreeLabel = new JLabel("3");
		panel.add(setTwoRollThreeLabel, "cell 0 22,alignx right");

		setTwoRollThreeField = new JTextField();
		panel.add(setTwoRollThreeField, "cell 1 22");
		setTwoRollThreeField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				targetUpdate();
				percentCalc();
			}
		});
		setTwoRollThreeField.setColumns(10);

		setTwoRollFourLabel = new JLabel("4");
		panel.add(setTwoRollFourLabel, "cell 2 22,alignx right");

		setTwoRollFourField = new JTextField();
		panel.add(setTwoRollFourField, "cell 3 22");
		setTwoRollFourField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				targetUpdate();
				percentCalc();

			}
		});
		setTwoRollFourField.setColumns(10);

		setTwoRollFiveLabel = new JLabel("5");
		panel.add(setTwoRollFiveLabel, "cell 0 23,alignx right");

		setTwoRollFiveField = new JTextField();
		panel.add(setTwoRollFiveField, "cell 1 23");
		setTwoRollFiveField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				targetUpdate();
				percentCalc();

			}
		});
		setTwoRollFiveField.setColumns(10);

		setTwoRollSixLabel = new JLabel("6");
		panel.add(setTwoRollSixLabel, "cell 2 23,alignx right");

		setTwoRollSixField = new JTextField();
		panel.add(setTwoRollSixField, "cell 3 23");
		setTwoRollSixField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				targetUpdate();
				percentCalc();

			}
		});
		setTwoRollSixField.setColumns(10);

		setTwoRollSevenLabel = new JLabel("7");
		panel.add(setTwoRollSevenLabel, "cell 0 24,alignx right");

		setTwoRollSevenField = new JTextField();
		panel.add(setTwoRollSevenField, "cell 1 24");
		setTwoRollSevenField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				targetUpdate();
				percentCalc();

			}
		});
		setTwoRollSevenField.setColumns(10);

		setTwoRollEightLabel = new JLabel("8");
		panel.add(setTwoRollEightLabel, "cell 2 24,alignx right");

		setTwoRollEightField = new JTextField();
		panel.add(setTwoRollEightField, "cell 3 24");
		setTwoRollEightField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				targetUpdate();
				percentCalc();

			}
		});
		setTwoRollEightField.setColumns(10);

		setTwoRollNineLabel = new JLabel("9");
		panel.add(setTwoRollNineLabel, "cell 0 25,alignx right");

		setTwoRollNineField = new JTextField();
		panel.add(setTwoRollNineField, "cell 1 25");
		setTwoRollNineField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				targetUpdate();
				percentCalc();

			}
		});
		setTwoRollNineField.setColumns(10);

		setTwoRollTenLabel = new JLabel("10");
		panel.add(setTwoRollTenLabel, "cell 2 25,alignx right");

		setTwoRollTenField = new JTextField();
		panel.add(setTwoRollTenField, "cell 3 25");
		setTwoRollTenField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				targetUpdate();
				percentCalc();

			}
		});
		setTwoRollTenField.setColumns(10);

		setTwoRollElevenLabel = new JLabel("11");
		panel.add(setTwoRollElevenLabel, "cell 0 26,alignx right");

		setTwoRollElevenField = new JTextField();
		panel.add(setTwoRollElevenField, "cell 1 26");
		setTwoRollElevenField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				targetUpdate();
				percentCalc();

			}
		});
		setTwoRollElevenField.setColumns(10);

		setTwoRollTwelveLabel = new JLabel("12");
		panel.add(setTwoRollTwelveLabel, "cell 2 26,alignx right");
		float newSize3 = 17;
		setTwoRollTwelveField = new JTextField();
		panel.add(setTwoRollTwelveField, "cell 3 26");
		setTwoRollTwelveField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				targetUpdate();
				percentCalc();

			}
		});
		setTwoRollTwelveField.setColumns(10);

		lblActualSetWeight = new JLabel("Actual Set Wt");
		panel.add(lblActualSetWeight, "cell 0 27");

		textField_33 = new JLabel();
		panel.add(textField_33, "cell 1 27");

		lblActualOf = new JLabel("Actual % of Target");
		panel.add(lblActualOf, "cell 2 27");
		lblActualOf.setFont(lblActualOf.getFont().deriveFont(newSize2));

		textField_37 = new JLabel();
		panel.add(textField_37, "cell 3 27");
		textField_37.setFont(textField_37.getFont().deriveFont(newSize3));

		lblTargetSetWt = new JLabel("Target Set Wt");
		panel.add(lblTargetSetWt, "cell 0 28");

		textField_34 = new JLabel();
		panel.add(textField_34, "cell 1 28");

		btnSubmit = new JButton("Submit");
		panel.add(btnSubmit, "cell 2 28,alignx center");

		btnClearSets = new JButton("Clear Sets");
		btnClearSets.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				model.setRowCount(0);
				model2.setRowCount(0);
				setNumberField.setText("1");
			}
		});
		panel.add(btnClearSets, "cell 3 28");

		btnRecalculateOf = new JButton("Recalculate % of Target");
		btnRecalculateOf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				recalc();
			}
		});
		panel.add(btnRecalculateOf, "cell 2 29 2 1,alignx center");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					sqlConnection();
					submitSetSQL();
					checkFields();
					percentCalc();
					populateTable();
					clearFields();
					conn.close();
				} catch (ClassNotFoundException | SQLException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, e);
				}
			}

		});
		btnHousekeepingAudit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							housekeeping window = new housekeeping();
							window.getFrame().setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnQaAudit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							// populate work order fields from weights
							if (!(workOrderOneField == null))
								window.workOrder1Field
										.setText(weights.workOrderOneField
												.getText());

							if (!(weights.workOrderTwoField == null))
								window.workOrder2Field
										.setText(weights.workOrderTwoField
												.getText());
							window.getFrame().setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		textField_1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				printTargetLB();
			}
		});

		scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridheight = 14;
		gbc_scrollPane.gridwidth = 5;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 6;
		gbc_scrollPane.gridy = 0;
		frame.getContentPane().add(scrollPane, gbc_scrollPane);

		table = new JTable(model);
		scrollPane.setViewportView(table);
		weights.model.addColumn("Date");
		weights.model.addColumn("Time");
		weights.model.addColumn("Set Number");
		weights.model.addColumn("Roll Number");
		weights.model.addColumn("Roll Weight");

		scrollPane_1 = new JScrollPane();
		GridBagConstraints gbc_scrollPane_1 = new GridBagConstraints();
		gbc_scrollPane_1.gridheight = 11;
		gbc_scrollPane_1.gridwidth = 5;
		gbc_scrollPane_1.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_1.gridx = 6;
		gbc_scrollPane_1.gridy = 14;
		frame.getContentPane().add(scrollPane_1, gbc_scrollPane_1);

		table_1 = new JTable(model2);
		model2.addColumn("Set Number");
		model2.addColumn("Percent of Target");
		model2.addColumn("Actual Lbs/Hr");
		scrollPane_1.setViewportView(table_1);
	}

	public void calc() {
		// parse roll weights to double
		// product 1 wts
		if (!rollOneField.getText().equals(""))
			wt1No = parseInput(rollOneField.getText());
		else
			wt1No = 0;
		if (!rollTwoField.getText().equals(""))
			wt2No = parseInput(rollTwoField.getText());
		else
			wt2No = 0;
		if (!rollThreeField.getText().equals(""))
			wt3No = parseInput(rollThreeField.getText());
		else
			wt3No = 0;
		if (!rollFourField.getText().equals(""))
			wt4No = parseInput(rollFourField.getText());
		else
			wt4No = 0;
		if (!rollFiveField.getText().equals(""))
			wt5No = parseInput(rollFiveField.getText());
		else
			wt5No = 0;
		if (!rollSixField.getText().equals(""))
			wt6No = parseInput(rollSixField.getText());
		else
			wt6No = 0;
		if (!rollSevenField.getText().equals(""))
			wt7No = parseInput(rollSevenField.getText());
		else
			wt7No = 0;
		if (!rollEightField.getText().equals(""))
			wt8No = parseInput(rollEightField.getText());
		else
			wt8No = 0;
		if (!rollNineField.getText().equals(""))
			wt9No = parseInput(rollNineField.getText());
		else
			wt9No = 0;
		if (!rollTenField.getText().equals(""))
			wt10No = parseInput(rollTenField.getText());
		else
			wt10No = 0;
		if (!rollElevenField.getText().equals(""))
			wt11No = parseInput(rollElevenField.getText());
		else
			wt11No = 0;
		if (!rollTwelveField.getText().equals(""))
			wt12No = parseInput(rollTwelveField.getText());
		else
			wt12No = 0;

		// product 2 wts
		if (!setTwoRollOneField.getText().equals(""))
			wt13No = parseInput(setTwoRollOneField.getText());
		else
			wt13No = 0;
		if (!setTwoRollTwoField.getText().equals(""))
			wt14No = parseInput(setTwoRollTwoField.getText());
		else
			wt14No = 0;
		if (!setTwoRollThreeField.getText().equals(""))
			wt15No = parseInput(setTwoRollThreeField.getText());
		else
			wt15No = 0;
		if (!setTwoRollFourField.getText().equals(""))
			wt16No = parseInput(setTwoRollFourField.getText());
		else
			wt16No = 0;
		if (!setTwoRollFiveField.getText().equals(""))
			wt17No = parseInput(setTwoRollFiveField.getText());
		else
			wt17No = 0;
		if (!setTwoRollSixField.getText().equals(""))
			wt18No = parseInput(setTwoRollSixField.getText());
		else
			wt18No = 0;
		if (!setTwoRollSevenField.getText().equals(""))
			wt19No = parseInput(setTwoRollSevenField.getText());
		else
			wt19No = 0;
		if (!setTwoRollEightField.getText().equals(""))
			wt20No = parseInput(setTwoRollEightField.getText());
		else
			wt20No = 0;
		if (!setTwoRollNineField.getText().equals(""))
			wt21No = parseInput(setTwoRollNineField.getText());
		else
			wt21No = 0;
		if (!setTwoRollTenField.getText().equals(""))
			wt22No = parseInput(setTwoRollTenField.getText());
		else
			wt22No = 0;
		if (!setTwoRollElevenField.getText().equals(""))
			wt23No = parseInput(setTwoRollElevenField.getText());
		else
			wt23No = 0;
		if (!setTwoRollTwelveField.getText().equals(""))
			wt24No = parseInput(setTwoRollTwelveField.getText());
		else
			wt24No = 0;

		// Rolls per set and target wt for both products
		if (!rollsPerSetOneField.getText().equals(""))
			p1RollSet = Double.parseDouble(rollsPerSetOneField.getText());
		else
			p1RollSet = 0;
		if (!targetWeightOneField.getText().equals(""))
			p1TgWt = Double.parseDouble(targetWeightOneField.getText());
		else
			p1TgWt = 0;
		if (!textField_7.getText().equals(""))
			p2RollSet = Double.parseDouble(textField_7.getText());
		else
			p2RollSet = 0;
		if (!textField_8.getText().equals(""))
			p2TgWt = Double.parseDouble(textField_8.getText());
		else
			p2TgWt = 0;

	}

	private double parseInput(String text) {
		if (text.length() >= 5) {
			String t2 = text.substring(0, 5);
			double d1 = Double.parseDouble(t2);
			return d1;
		} else {
			double d2 = Double.parseDouble(text);
			return d2;
		}
	}

	private void targetUpdate() {
		// update actual set weight
		calc();
		sum = wt1No + wt2No + wt3No + wt4No + wt5No + wt6No + wt7No + wt8No
				+ wt9No + wt10No + wt11No + wt12No;
		String sumString = df.format(sum);
		textField_35.setText(sumString);

		sum2 = wt13No + wt14No + wt15No + wt16No + wt17No + wt18No + wt19No
				+ wt20No + wt21No + wt22No + wt23No + wt24No;
		String sum2String = df.format(sum2);
		textField_33.setText(sum2String);

	}

	private void targetSetWt1Calc() {
		// update target set weight-product 1
		calc();
		targetSum = p1RollSet * p1TgWt;
		String result = df.format(targetSum);
		textField_36.setText(result);

	}

	private void targetSetwt2Calc() {
		// update target set weight-product 2
		calc();
		targetSum = p1RollSet * p1TgWt;
		targetSum2 = p2RollSet * p2TgWt;
		String targetSumString2 = df.format(targetSum2);
		textField_34.setText(targetSumString2);
	}

	private void percentCalc() {
		// update actual set weight percentage
		calc();
		double percentOfTarget1 = (sum / targetSum) * 100;
		double percentOfTarget2 = (sum2 / targetSum2) * 100;

		// round to two decimal points
		double roundPercent1 = Math.round(percentOfTarget1 * 100.0) / 100.0;

		String percentSum = String.valueOf(roundPercent1);

		if (textField_8.getText().equals("")
				&& !targetWeightOneField.getText().equals(""))
			textField_37.setText(percentSum);
		else if (!textField_8.getText().equals("")) {
			double totalPercent = (percentOfTarget1 + percentOfTarget2) / 2;
			// round this one too
			double totalRound = Math.round(totalPercent * 100.0) / 100.0;
			String totalPercentString = String.valueOf(totalRound);
			textField_37.setText(totalPercentString);
		}
		actualLB();
	}

	private void actualLB() {
		// update actual pounds per hour
		if (!rollLengthField.getText().equals(""))
			rollLength = Double.parseDouble(rollLengthField.getText());
		else
			rollLength = 0;
		if (!lineSpeedField.getText().equals(""))
			lineSpeed = Double.parseDouble(lineSpeedField.getText());
		else
			lineSpeed = 0;
		targetUpdate();
		poundsPerHour = ((60 / (rollLength / lineSpeed)) * (sum + sum2));
		String poundsTest = String.valueOf(poundsPerHour);
		String poundsString = df.format(poundsPerHour);
		if (!poundsTest.equals("NaN"))
			textField_6.setText(poundsString);
		else
			textField_6.setText("0");
	}

	private void p1InfoSet() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		dateTime = dateFormat.format(cal.getTime());
		parts = dateTime.split(" ");
		dateStamp = parts[0];
		timeStamp = parts[1];
		setNumber = setNumberField.getText();
		if (!setNumber.equals("")) {
			s2 = Integer.valueOf(setNumber);
		} else
			s2 = 0;
		workOrder = workOrderOneField.getText();
		if (!workOrder.equals("")) {
			workOrderInt = Integer.valueOf(workOrder);
		} else
			workOrderInt = 0;
		shift = (String) comboBox_1.getSelectedItem();
		shiftInt = convertToInt(shift);

		lineNumber = (String) comboBox.getSelectedItem();
		lineNumberInt = convertToInt(lineNumber);
	}

	private void P1RollWeightSQL(JTextField field)
	// update each roll weight in db-product 1
			throws ClassNotFoundException, SQLException, IOException {
		String weight = field.getText().trim();
		double w2;
		if (!weight.equals("")) {
			w2 = Double.valueOf(weight);
		} else
			w2 = 0;
		try {
			CallableStatement cs = null;
			cs = conn.prepareCall("{call CalRollWeightInsert(?,?,?,?,?,?,?)}");
			cs.setString(1, dateTime);
			cs.setString(2, timeStamp);
			cs.setInt(3, shiftInt);
			cs.setInt(4, workOrderInt);
			cs.setInt(5, s2);
			cs.setDouble(6, w2);
			cs.setInt(7, lineNumberInt);
			cs.execute();
			cs.close();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		} finally {
		}
	}

	private void p2InfoSet() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		dateTime = dateFormat.format(cal.getTime());
		parts = dateTime.split(" ");
		dateStamp = parts[0];
		timeStamp = parts[1];
		setNumber = setNumberField.getText().trim();
		if (!setNumber.equals("")) {
			s2 = Integer.valueOf(setNumber);
		} else
			s2 = 0;
		workOrder = workOrderTwoField.getText().trim();
		if (!workOrder.equals("")) {
			workOrderInt = Integer.valueOf(workOrder);
		} else
			workOrderInt = 0;
		shift = (String) comboBox_1.getSelectedItem();
		shiftInt = convertToInt(shift);

		lineNumber = (String) comboBox.getSelectedItem();
		lineNumberInt = convertToInt(lineNumber);
	}

	private void P2RollWeightSQL(JTextField field)
			throws ClassNotFoundException, SQLException, IOException {
		// insert each roll weight in db-product 2
		String weight = field.getText().trim();
		double w2;
		if (!weight.equals("")) {
			w2 = Double.valueOf(weight);
		} else
			w2 = 0;

		try {
			CallableStatement cs = null;
			cs = conn.prepareCall("{call CalRollWeightInsert(?,?,?,?,?,?,?)}");
			cs.setString(1, dateTime);
			cs.setString(2, timeStamp);
			cs.setInt(3, shiftInt);
			cs.setInt(4, workOrderInt);
			cs.setInt(5, s2);
			cs.setDouble(6, w2);
			cs.setInt(7, lineNumberInt);
			cs.execute();
			cs.close();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		} finally {

		}
	}

	public void submitSetSQL() throws ClassNotFoundException, SQLException,
			IOException {
		// insert set weight data into weightTotal table

		// get date
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		String dateTime = dateFormat.format(cal.getTime());
		String[] parts = dateTime.split(" ");
		String dateStamp = parts[0];
		String timeStamp = parts[1];
		// get set number, change to int
		String setNumber = setNumberField.getText().trim();
		int s2 = convertToInt(setNumber);

		// get work product 1 work order number , change to int
		String workOrder1 = workOrderOneField.getText().trim();
		Integer workOrderInt1 = convertToInt(workOrder1);

		// get product 1 rolls per set, change to decimal
		String rollsPerSet1 = rollsPerSetOneField.getText().trim();
		Integer rollsPerSet1Int = convertToInt(rollsPerSet1);

		// get product 1 target wt, change to decimal
		String targetSet1Wt = textField_36.getText().trim();
		double target1Double = convertToDouble(targetSet1Wt);

		// get product 1 actual set weight, change to decimal
		String actualSet1Wt = textField_35.getText().trim();
		double actual1Double = convertToDouble(actualSet1Wt);

		// get product 2 work order number , change to int
		String workOrder2 = workOrderTwoField.getText().trim();
		Integer workOrder2Int = convertToInt(workOrder2);

		// get product 2 rolls per set, change to decimal
		String rollsPerSet2 = textField_7.getText().trim();
		Integer rollsPerSet2Int = convertToInt(rollsPerSet2);

		// get product 2 target set weight, change to decimal
		String targetSet2Wt = textField_34.getText().trim();
		double target2Double = convertToDouble(targetSet2Wt);

		// get product 2 actual set weight, change to decimal
		String actualSet2Wt = textField_33.getText().trim();
		double actual2Double = convertToDouble(actualSet2Wt);

		// get percent of target, change to decimal
		String percentOfTarget = textField_37.getText().trim();
		double percentOfTargetDouble = convertToDouble(percentOfTarget);

		// get compound, change to decimal
		String compound = (String) textField_1.getSelectedItem();

		// get target pounds per hour, change to int
		String targetlbsHr = label_24.getText().trim();
		int targetLb = convertToInt(targetlbsHr);

		// get actual pounds per hour, change to int
		String actuallbsHr = textField_6.getText().trim();
		double actualLB = convertToDouble(actuallbsHr);

		// get linespeed, change to int
		String lineSpeed = lineSpeedField.getText().trim();
		lineSpeed = lineSpeed.substring(0, 3);
		int lineInt = convertToInt(lineSpeed);

		// get line number
		String lineNumber = (String) comboBox.getSelectedItem();
		int lineNumberInt = convertToInt(lineNumber);

		String shift = (String) comboBox_1.getSelectedItem();
		int shiftInt = convertToInt(shift);
		try {
			CallableStatement cs = null;
			cs = conn
					.prepareCall("{call CalWeightTotalInsert(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
			cs.setString(1, dateTime);
			cs.setString(2, timeStamp);
			cs.setInt(3, shiftInt);
			cs.setInt(4, lineNumberInt);
			cs.setInt(5, s2);
			cs.setInt(6, workOrderInt1);
			cs.setInt(7, rollsPerSet1Int);
			cs.setDouble(8, target1Double);
			cs.setDouble(9, actual1Double);
			cs.setInt(10, workOrder2Int);
			cs.setInt(11, rollsPerSet2Int);
			cs.setDouble(12, target2Double);
			cs.setDouble(13, actual2Double);
			cs.setDouble(14, percentOfTargetDouble);
			cs.setString(15, compound);
			cs.setInt(16, targetLb);
			cs.setDouble(17, actualLB);
			cs.setInt(18, lineInt);
			cs.execute();
			cs.close();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		} finally {

		}
	}

	public void printTargetLB() {
		String value = (String) textField_1.getSelectedItem();
		switch (value) {
		case "":
			label_24.setText("");
			break;
		case "Omni":
			label_24.setText("958");
			break;
		case "PWGS":
			label_24.setText("860");
			break;
		case "PS":
			label_24.setText("958");
			break;
		case "RCR":
			label_24.setText("958");
			break;
		case "SB":
			label_24.setText("670");
			break;
		case "SBT":
			label_24.setText("670");
			break;
		case "SBX":
			label_24.setText("670");
			break;
		case "HT":
			label_24.setText("710");
			break;
		case "HWR":
			label_24.setText("795");
			break;
		case "LWJ":
			label_24.setText("680");
			break;
		case "BLG":
			label_24.setText("680");
			break;
		case "LGK":
			label_24.setText("660");
			break;
		case "RLGK":
			label_24.setText("660");
			break;
		case "Vitawrap F":
			label_24.setText("832");
			break;
		case "Omni MT":
			label_24.setText("900");
			break;
		case "PWMF":
			label_24.setText("958");
			break;
		case "DS":
			label_24.setText("958");
			break;
		case "MTR":
			label_24.setText("760");
			break;
		case "CRMF":
			label_24.setText("958");
			break;
		}
	}

	public static void sqlConnection() {
		try {
			Properties properties = new Properties();
			properties.load(new FileInputStream("lib/config.properties"));
			String userName = properties.getProperty("jdbc.username");
			String password = properties.getProperty("jdbc.password");
			String url = properties.getProperty("jdbc.url");
			Class.forName(properties.getProperty("jdbc.driver"));
			conn = DriverManager.getConnection(url, userName, password);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}

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

	private void checkFields() throws ClassNotFoundException, SQLException,
			IOException {
		p1InfoSet();
		if (!rollOneField.getText().equals(""))
			P1RollWeightSQL(rollOneField);
		if (!rollTwoField.getText().equals(""))
			P1RollWeightSQL(rollTwoField);

		if (!rollThreeField.getText().equals(""))
			P1RollWeightSQL(rollThreeField);

		if (!rollFourField.getText().equals(""))
			P1RollWeightSQL(rollFourField);

		if (!rollFiveField.getText().equals(""))
			P1RollWeightSQL(rollFiveField);

		if (!rollSixField.getText().equals(""))
			P1RollWeightSQL(rollSixField);

		if (!rollSevenField.getText().equals(""))
			P1RollWeightSQL(rollSevenField);

		if (!rollEightField.getText().equals(""))
			P1RollWeightSQL(rollEightField);

		if (!rollNineField.getText().equals(""))
			P1RollWeightSQL(rollNineField);

		if (!rollTenField.getText().equals(""))
			P1RollWeightSQL(rollTenField);

		if (!rollElevenField.getText().equals(""))
			P1RollWeightSQL(rollElevenField);

		if (!rollTwelveField.getText().equals(""))
			P1RollWeightSQL(rollTwelveField);

		// product 2 wts
		p2InfoSet();
		if (!setTwoRollOneField.getText().equals(""))
			P2RollWeightSQL(setTwoRollOneField);

		if (!setTwoRollTwoField.getText().equals(""))
			P2RollWeightSQL(setTwoRollTwoField);

		if (!setTwoRollThreeField.getText().equals(""))
			P2RollWeightSQL(setTwoRollThreeField);

		if (!setTwoRollFourField.getText().equals(""))
			P2RollWeightSQL(setTwoRollFourField);

		if (!setTwoRollFiveField.getText().equals(""))
			P2RollWeightSQL(setTwoRollFiveField);

		if (!setTwoRollSixField.getText().equals(""))
			P2RollWeightSQL(setTwoRollSixField);

		if (!setTwoRollSevenField.getText().equals(""))
			P2RollWeightSQL(setTwoRollSevenField);

		if (!setTwoRollEightField.getText().equals(""))
			P2RollWeightSQL(setTwoRollEightField);

		if (!setTwoRollNineField.getText().equals(""))
			P2RollWeightSQL(setTwoRollNineField);

		if (!setTwoRollTenField.getText().equals(""))
			P2RollWeightSQL(setTwoRollTenField);

		if (!setTwoRollElevenField.getText().equals(""))
			P2RollWeightSQL(setTwoRollElevenField);

		if (!setTwoRollTwelveField.getText().equals(""))
			P2RollWeightSQL(setTwoRollTwelveField);

	}

	private void clearFields() {
		rollOneField.setText("");
		rollThreeField.setText("");
		rollTwoField.setText("");
		rollFourField.setText("");
		rollFiveField.setText("");
		rollSixField.setText("");
		rollSevenField.setText("");
		rollEightField.setText("");
		rollNineField.setText("");
		rollTenField.setText("");
		rollElevenField.setText("");
		rollTwelveField.setText("");
		setTwoRollOneField.setText("");
		setTwoRollTwoField.setText("");
		setTwoRollThreeField.setText("");
		setTwoRollFourField.setText("");
		setTwoRollFiveField.setText("");
		setTwoRollSixField.setText("");
		setTwoRollSevenField.setText("");
		setTwoRollEightField.setText("");
		setTwoRollNineField.setText("");
		setTwoRollTenField.setText("");
		setTwoRollElevenField.setText("");
		setTwoRollTwelveField.setText("");

		// increment set number
		String num = setNumberField.getText();
		int num2 = Integer.valueOf(num);
		num2++;
		num = Integer.toString(num2);
		setNumberField.setText(num);
	}

	private void populateTable() {
		if (!rollOneField.getText().equals(""))
			check(rollOneField, rollOneLabel);
		if (!rollTwoField.getText().equals(""))
			check(rollTwoField, rollTwoLabel);
		if (!rollThreeField.getText().equals(""))
			check(rollThreeField, rollThreeLabel);

		if (!rollFourField.getText().equals(""))
			check(rollFourField, rollFourLabel);

		if (!rollFiveField.getText().equals(""))
			check(rollFiveField, rollFiveLabel);

		if (!rollSixField.getText().equals(""))
			check(rollSixField, rollSixLabel);

		if (!rollSevenField.getText().equals(""))
			check(rollSevenField, rollSevenLabel);

		if (!rollEightField.getText().equals(""))
			check(rollEightField, rollEightLabel);

		if (!rollNineField.getText().equals(""))
			check(rollNineField, rollNineLabel);

		if (!rollTenField.getText().equals(""))
			check(rollTenField, rollTenLabel);

		if (!rollElevenField.getText().equals(""))
			check(rollElevenField, rollElevenLabel);

		if (!rollTwelveField.getText().equals(""))
			check(rollTwelveField, rollTwelveLabel);

		// product 2 wts
		if (!setTwoRollOneField.getText().equals(""))
			check(setTwoRollOneField, setTwoRollOneLabel);

		if (!setTwoRollTwoField.getText().equals(""))
			check(setTwoRollTwoField, setTwoRollTwoLabel);

		if (!setTwoRollThreeField.getText().equals(""))
			check(setTwoRollThreeField, setTwoRollThreeLabel);

		if (!setTwoRollFourField.getText().equals(""))
			check(setTwoRollFourField, setTwoRollFourLabel);

		if (!setTwoRollFiveField.getText().equals(""))
			check(setTwoRollFiveField, setTwoRollFiveLabel);

		if (!setTwoRollSixField.getText().equals(""))
			check(setTwoRollSixField, setTwoRollSixLabel);

		if (!setTwoRollSevenField.getText().equals(""))
			check(setTwoRollSevenField, setTwoRollSevenLabel);

		if (!setTwoRollEightField.getText().equals(""))
			check(setTwoRollEightField, setTwoRollEightLabel);

		if (!setTwoRollNineField.getText().equals(""))
			check(setTwoRollNineField, setTwoRollNineLabel);

		if (!setTwoRollTenField.getText().equals(""))
			check(setTwoRollTenField, setTwoRollTenLabel);

		if (!setTwoRollElevenField.getText().equals(""))
			check(setTwoRollElevenField, setTwoRollElevenLabel);

		if (!setTwoRollTwelveField.getText().equals(""))
			check(setTwoRollTwelveField, setTwoRollTwelveLabel);

		String setNum = setNumberField.getText();
		String percentTarg = textField_37.getText();
		String actualPounds = textField_6.getText();
		model2.addRow(new Object[] { setNum, percentTarg, actualPounds });
	}

	private void check(JTextField field, JLabel label) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		dateTime = dateFormat.format(cal.getTime());
		parts = dateTime.split(" ");
		dateStamp = parts[0];
		timeStamp = parts[1];
		String shiftSelect = (String) comboBox_1.getSelectedItem();
		String setSelect = setNumberField.getText();
		String rollWeight = field.getText().trim();
		String rollNumber = label.getText();
		if (rollWeight.length() > 5)
			rollWeight = rollWeight.substring(0, 5);
		model.addRow(new Object[] { dateStamp, timeStamp, setSelect,
				rollNumber, rollWeight });
	}

	// re-calculates all fields by using current value from GUI-bottom button
	private void recalc() {
		targetUpdate();
		targetSetWt1Calc();
		targetSetwt2Calc();
		percentCalc();
		actualLB();
	}
}
