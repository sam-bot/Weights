package Arr;

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

public class arrWeights {

	private JFrame frame;
	private JTextField textField;
	private JComboBox textField_1;
	private JTextField textField_2;
	private JLabel lblTargetWt;
	private JTextField textField_3;
	private JLabel lblRollsset;
	private JTextField textField_4;
	private JLabel lblProduct;
	private JLabel lblRollLength;
	private JTextField textField_5;
	private JLabel lblActualLbshr;
	private JLabel textField_6;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JButton btnSubmit;
	private JLabel label;
	private JLabel label_2;
	private JLabel label_4;
	private JLabel label_6;
	private JLabel label_7;
	private JLabel label_8;
	private JLabel label_10;
	private JLabel label_13;
	private JLabel label_15;
	private JLabel label_17;
	private JLabel label_21;
	private JLabel label_23;
	private JLabel label_1;
	private JLabel label_3;
	private JLabel label_5;
	private JLabel label_9;
	private JLabel label_11;
	private JLabel label_12;
	private JLabel label_14;
	private JLabel label_16;
	private JLabel label_18;
	private JLabel label_19;
	private JLabel label_20;
	private JLabel label_22;
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
	private JTextField textField_38;
	private JLabel lblProduct_2;
	private JTextField textField_39;
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
	arrQaAudit window = new arrQaAudit();
	private JButton btnRecalculateOf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					arrWeights window = new arrWeights();
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
	public arrWeights() throws SQLException, ClassNotFoundException {
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
		textField = new JTextField();
		panel.add(textField, "cell 1 0,growx");
		textField.setFont(textField.getFont().deriveFont(newSize2));
		textField.setText("1");

		lblRollLength = new JLabel("Roll Length");
		panel.add(lblRollLength, "flowx,cell 2 0");
		lblRollLength.setFont(lblRollLength.getFont().deriveFont(newSize2));

		textField_5 = new JTextField();
		panel.add(textField_5, "cell 3 0");
		textField_5.setColumns(10);

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

		textField_2 = new JTextField();
		panel.add(textField_2, "cell 1 3");
		textField_2.setColumns(10);
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

		textField_38 = new JTextField();
		panel.add(textField_38, "cell 2 6");
		textField_38.setColumns(10);

		lblRollsset = new JLabel("Rolls/Set");
		panel.add(lblRollsset, "cell 1 7");

		textField_4 = new JTextField();
		panel.add(textField_4, "cell 2 7");
		textField_4.setColumns(10);

		lblTargetWt = new JLabel("Target Wt.");
		panel.add(lblTargetWt, "cell 1 8");

		textField_3 = new JTextField();
		panel.add(textField_3, "cell 2 8");
		textField_3.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				targetSetWt1Calc();
			}
		});
		textField_3.setColumns(10);

		label = new JLabel("1");
		panel.add(label, "cell 0 9,alignx right");

		textField_9 = new JTextField();
		panel.add(textField_9, "cell 1 9");
		textField_9.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				targetUpdate();
				percentCalc();
			}
		});
		textField_9.setColumns(10);

		label_13 = new JLabel("2");
		panel.add(label_13, "cell 2 9,alignx right");

		textField_21 = new JTextField();
		panel.add(textField_21, "cell 3 9");
		textField_21.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				targetUpdate();
				percentCalc();
			}
		});
		textField_21.setColumns(10);

		label_2 = new JLabel("3");
		panel.add(label_2, "cell 0 10,alignx right");

		textField_10 = new JTextField();
		panel.add(textField_10, "cell 1 10");
		textField_10.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				targetUpdate();
				percentCalc();
			}
		});
		textField_10.setColumns(10);

		label_15 = new JLabel("4");
		panel.add(label_15, "cell 2 10,alignx right");

		textField_22 = new JTextField();
		panel.add(textField_22, "cell 3 10");
		textField_22.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				targetUpdate();
				percentCalc();

			}
		});
		textField_22.setColumns(10);

		label_4 = new JLabel("5");
		panel.add(label_4, "cell 0 11,alignx right");

		textField_11 = new JTextField();
		panel.add(textField_11, "cell 1 11");
		textField_11.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				targetUpdate();
				percentCalc();

			}
		});
		textField_11.setColumns(10);

		label_17 = new JLabel("6");
		panel.add(label_17, "cell 2 11,alignx right");

		textField_23 = new JTextField();
		panel.add(textField_23, "cell 3 11");
		textField_23.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				targetUpdate();
				percentCalc();

			}
		});
		textField_23.setColumns(10);

		label_6 = new JLabel("7");
		panel.add(label_6, "cell 0 12,alignx right");

		textField_12 = new JTextField();
		panel.add(textField_12, "cell 1 12");
		textField_12.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				targetUpdate();
				percentCalc();

			}
		});
		textField_12.setColumns(10);

		label_7 = new JLabel("8");
		panel.add(label_7, "cell 2 12,alignx right");

		textField_24 = new JTextField();
		panel.add(textField_24, "cell 3 12");
		textField_24.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				targetUpdate();
				percentCalc();

			}
		});
		textField_24.setColumns(10);

		label_8 = new JLabel("9");
		panel.add(label_8, "cell 0 13,alignx right");

		textField_13 = new JTextField();
		panel.add(textField_13, "cell 1 13");
		textField_13.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				targetUpdate();
				percentCalc();

			}
		});
		textField_13.setColumns(10);

		label_21 = new JLabel("10");
		panel.add(label_21, "cell 2 13,alignx right");

		textField_25 = new JTextField();
		panel.add(textField_25, "cell 3 13");
		textField_25.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				targetUpdate();
				percentCalc();

			}
		});
		textField_25.setColumns(10);

		label_10 = new JLabel("11");
		panel.add(label_10, "cell 0 14,alignx right");

		textField_14 = new JTextField();
		panel.add(textField_14, "cell 1 14");
		textField_14.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				targetUpdate();
				percentCalc();

			}
		});
		textField_14.setColumns(10);

		label_23 = new JLabel("12");
		panel.add(label_23, "cell 2 14,alignx right");

		textField_26 = new JTextField();
		panel.add(textField_26, "cell 3 14");
		textField_26.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				targetUpdate();
				percentCalc();
			}
		});
		textField_26.setColumns(10);

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

		textField_39 = new JTextField();
		panel.add(textField_39, "cell 2 18");
		textField_39.setColumns(10);

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

		label_1 = new JLabel("1");
		panel.add(label_1, "cell 0 21,alignx right");

		textField_16 = new JTextField();
		panel.add(textField_16, "cell 1 21");
		textField_16.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				targetUpdate();
				percentCalc();
			}
		});
		textField_16.setColumns(10);

		label_3 = new JLabel("2");
		panel.add(label_3, "cell 2 21,alignx right");

		textField_28 = new JTextField();
		panel.add(textField_28, "cell 3 21");
		textField_28.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				targetUpdate();
				percentCalc();
			}
		});
		textField_28.setColumns(10);

		label_5 = new JLabel("3");
		panel.add(label_5, "cell 0 22,alignx right");

		textField_17 = new JTextField();
		panel.add(textField_17, "cell 1 22");
		textField_17.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				targetUpdate();
				percentCalc();
			}
		});
		textField_17.setColumns(10);

		label_9 = new JLabel("4");
		panel.add(label_9, "cell 2 22,alignx right");

		textField_29 = new JTextField();
		panel.add(textField_29, "cell 3 22");
		textField_29.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				targetUpdate();
				percentCalc();

			}
		});
		textField_29.setColumns(10);

		label_11 = new JLabel("5");
		panel.add(label_11, "cell 0 23,alignx right");

		textField_18 = new JTextField();
		panel.add(textField_18, "cell 1 23");
		textField_18.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				targetUpdate();
				percentCalc();

			}
		});
		textField_18.setColumns(10);

		label_12 = new JLabel("6");
		panel.add(label_12, "cell 2 23,alignx right");

		textField_30 = new JTextField();
		panel.add(textField_30, "cell 3 23");
		textField_30.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				targetUpdate();
				percentCalc();

			}
		});
		textField_30.setColumns(10);

		label_14 = new JLabel("7");
		panel.add(label_14, "cell 0 24,alignx right");

		textField_19 = new JTextField();
		panel.add(textField_19, "cell 1 24");
		textField_19.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				targetUpdate();
				percentCalc();

			}
		});
		textField_19.setColumns(10);

		label_16 = new JLabel("8");
		panel.add(label_16, "cell 2 24,alignx right");

		textField_31 = new JTextField();
		panel.add(textField_31, "cell 3 24");
		textField_31.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				targetUpdate();
				percentCalc();

			}
		});
		textField_31.setColumns(10);

		label_18 = new JLabel("9");
		panel.add(label_18, "cell 0 25,alignx right");

		textField_20 = new JTextField();
		panel.add(textField_20, "cell 1 25");
		textField_20.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				targetUpdate();
				percentCalc();

			}
		});
		textField_20.setColumns(10);

		label_19 = new JLabel("10");
		panel.add(label_19, "cell 2 25,alignx right");

		textField_32 = new JTextField();
		panel.add(textField_32, "cell 3 25");
		textField_32.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				targetUpdate();
				percentCalc();

			}
		});
		textField_32.setColumns(10);

		label_20 = new JLabel("11");
		panel.add(label_20, "cell 0 26,alignx right");

		textField_15 = new JTextField();
		panel.add(textField_15, "cell 1 26");
		textField_15.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				targetUpdate();
				percentCalc();

			}
		});
		textField_15.setColumns(10);

		label_22 = new JLabel("12");
		panel.add(label_22, "cell 2 26,alignx right");
		float newSize3 = 17;
		textField_27 = new JTextField();
		panel.add(textField_27, "cell 3 26");
		textField_27.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				targetUpdate();
				percentCalc();

			}
		});
		textField_27.setColumns(10);

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
				textField.setText("1");
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
		arrWeights.model.addColumn("Date");
		arrWeights.model.addColumn("Time");
		arrWeights.model.addColumn("Set Number");
		arrWeights.model.addColumn("Roll Number");
		arrWeights.model.addColumn("Roll Weight");

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
		if (!textField_9.getText().equals(""))
			wt1No = parseInput(textField_9.getText());
		else
			wt1No = 0;
		if (!textField_21.getText().equals(""))
			wt2No = parseInput(textField_21.getText());
		else
			wt2No = 0;
		if (!textField_10.getText().equals(""))
			wt3No = parseInput(textField_10.getText());
		else
			wt3No = 0;
		if (!textField_22.getText().equals(""))
			wt4No = parseInput(textField_22.getText());
		else
			wt4No = 0;
		if (!textField_11.getText().equals(""))
			wt5No = parseInput(textField_11.getText());
		else
			wt5No = 0;
		if (!textField_23.getText().equals(""))
			wt6No = parseInput(textField_23.getText());
		else
			wt6No = 0;
		if (!textField_12.getText().equals(""))
			wt7No = parseInput(textField_12.getText());
		else
			wt7No = 0;
		if (!textField_24.getText().equals(""))
			wt8No = parseInput(textField_24.getText());
		else
			wt8No = 0;
		if (!textField_13.getText().equals(""))
			wt9No = parseInput(textField_13.getText());
		else
			wt9No = 0;
		if (!textField_25.getText().equals(""))
			wt10No = parseInput(textField_25.getText());
		else
			wt10No = 0;
		if (!textField_14.getText().equals(""))
			wt11No = parseInput(textField_14.getText());
		else
			wt11No = 0;
		if (!textField_26.getText().equals(""))
			wt12No = parseInput(textField_26.getText());
		else
			wt12No = 0;

		// product 2 wts
		if (!textField_16.getText().equals(""))
			wt13No = parseInput(textField_16.getText());
		else
			wt13No = 0;
		if (!textField_28.getText().equals(""))
			wt14No = parseInput(textField_28.getText());
		else
			wt14No = 0;
		if (!textField_17.getText().equals(""))
			wt15No = parseInput(textField_17.getText());
		else
			wt15No = 0;
		if (!textField_29.getText().equals(""))
			wt16No = parseInput(textField_29.getText());
		else
			wt16No = 0;
		if (!textField_18.getText().equals(""))
			wt17No = parseInput(textField_18.getText());
		else
			wt17No = 0;
		if (!textField_30.getText().equals(""))
			wt18No = parseInput(textField_30.getText());
		else
			wt18No = 0;
		if (!textField_19.getText().equals(""))
			wt19No = parseInput(textField_19.getText());
		else
			wt19No = 0;
		if (!textField_31.getText().equals(""))
			wt20No = parseInput(textField_31.getText());
		else
			wt20No = 0;
		if (!textField_20.getText().equals(""))
			wt21No = parseInput(textField_20.getText());
		else
			wt21No = 0;
		if (!textField_32.getText().equals(""))
			wt22No = parseInput(textField_32.getText());
		else
			wt22No = 0;
		if (!textField_15.getText().equals(""))
			wt23No = parseInput(textField_15.getText());
		else
			wt23No = 0;
		if (!textField_27.getText().equals(""))
			wt24No = parseInput(textField_27.getText());
		else
			wt24No = 0;

		// Rolls per set and target wt for both products
		if (!textField_4.getText().equals(""))
			p1RollSet = Double.parseDouble(textField_4.getText());
		else
			p1RollSet = 0;
		if (!textField_3.getText().equals(""))
			p1TgWt = Double.parseDouble(textField_3.getText());
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
				&& !textField_3.getText().equals(""))
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
		if (!textField_5.getText().equals(""))
			rollLength = Double.parseDouble(textField_5.getText());
		else
			rollLength = 0;
		if (!textField_2.getText().equals(""))
			lineSpeed = Double.parseDouble(textField_2.getText());
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
		setNumber = textField.getText();
		if (!setNumber.equals("")) {
			s2 = Integer.valueOf(setNumber);
		} else
			s2 = 0;
		workOrder = textField_38.getText();
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
		setNumber = textField.getText().trim();
		if (!setNumber.equals("")) {
			s2 = Integer.valueOf(setNumber);
		} else
			s2 = 0;
		workOrder = textField_39.getText().trim();
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
		String setNumber = textField.getText().trim();
		int s2 = convertToInt(setNumber);

		// get work product 1 work order number , change to int
		String workOrder1 = textField_38.getText().trim();
		Integer workOrderInt1 = convertToInt(workOrder1);

		// get product 1 rolls per set, change to decimal
		String rollsPerSet1 = textField_4.getText().trim();
		Integer rollsPerSet1Int = convertToInt(rollsPerSet1);

		// get product 1 target wt, change to decimal
		String targetSet1Wt = textField_36.getText().trim();
		double target1Double = convertToDouble(targetSet1Wt);

		// get product 1 actual set weight, change to decimal
		String actualSet1Wt = textField_35.getText().trim();
		double actual1Double = convertToDouble(actualSet1Wt);

		// get product 2 work order number , change to int
		String workOrder2 = textField_39.getText().trim();
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
		String lineSpeed = textField_2.getText().trim();
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
		if (!textField_9.getText().equals(""))
			P1RollWeightSQL(textField_9);
		if (!textField_21.getText().equals(""))
			P1RollWeightSQL(textField_21);

		if (!textField_10.getText().equals(""))
			P1RollWeightSQL(textField_10);

		if (!textField_22.getText().equals(""))
			P1RollWeightSQL(textField_22);

		if (!textField_11.getText().equals(""))
			P1RollWeightSQL(textField_11);

		if (!textField_23.getText().equals(""))
			P1RollWeightSQL(textField_23);

		if (!textField_12.getText().equals(""))
			P1RollWeightSQL(textField_12);

		if (!textField_24.getText().equals(""))
			P1RollWeightSQL(textField_24);

		if (!textField_13.getText().equals(""))
			P1RollWeightSQL(textField_13);

		if (!textField_25.getText().equals(""))
			P1RollWeightSQL(textField_25);

		if (!textField_14.getText().equals(""))
			P1RollWeightSQL(textField_14);

		if (!textField_26.getText().equals(""))
			P1RollWeightSQL(textField_26);

		// product 2 wts
		p2InfoSet();
		if (!textField_16.getText().equals(""))
			P2RollWeightSQL(textField_16);

		if (!textField_28.getText().equals(""))
			P2RollWeightSQL(textField_28);

		if (!textField_17.getText().equals(""))
			P2RollWeightSQL(textField_17);

		if (!textField_29.getText().equals(""))
			P2RollWeightSQL(textField_29);

		if (!textField_18.getText().equals(""))
			P2RollWeightSQL(textField_18);

		if (!textField_30.getText().equals(""))
			P2RollWeightSQL(textField_30);

		if (!textField_19.getText().equals(""))
			P2RollWeightSQL(textField_19);

		if (!textField_31.getText().equals(""))
			P2RollWeightSQL(textField_31);

		if (!textField_20.getText().equals(""))
			P2RollWeightSQL(textField_20);

		if (!textField_32.getText().equals(""))
			P2RollWeightSQL(textField_32);

		if (!textField_15.getText().equals(""))
			P2RollWeightSQL(textField_15);

		if (!textField_27.getText().equals(""))
			P2RollWeightSQL(textField_27);

	}

	private void clearFields() {
		textField_9.setText("");
		textField_10.setText("");
		textField_21.setText("");
		textField_22.setText("");
		textField_11.setText("");
		textField_23.setText("");
		textField_12.setText("");
		textField_24.setText("");
		textField_13.setText("");
		textField_25.setText("");
		textField_14.setText("");
		textField_26.setText("");
		textField_16.setText("");
		textField_28.setText("");
		textField_17.setText("");
		textField_29.setText("");
		textField_18.setText("");
		textField_30.setText("");
		textField_19.setText("");
		textField_31.setText("");
		textField_20.setText("");
		textField_32.setText("");
		textField_15.setText("");
		textField_27.setText("");

		// increment set number
		String num = textField.getText();
		int num2 = Integer.valueOf(num);
		num2++;
		num = Integer.toString(num2);
		textField.setText(num);
	}

	private void populateTable() {
		if (!textField_9.getText().equals(""))
			check(textField_9);
		if (!textField_21.getText().equals(""))
			check(textField_21);
		if (!textField_10.getText().equals(""))
			check(textField_10);

		if (!textField_22.getText().equals(""))
			check(textField_22);

		if (!textField_11.getText().equals(""))
			check(textField_11);

		if (!textField_23.getText().equals(""))
			check(textField_23);

		if (!textField_12.getText().equals(""))
			check(textField_12);

		if (!textField_24.getText().equals(""))
			check(textField_24);

		if (!textField_13.getText().equals(""))
			check(textField_13);

		if (!textField_25.getText().equals(""))
			check(textField_25);

		if (!textField_14.getText().equals(""))
			check(textField_14);

		if (!textField_26.getText().equals(""))
			check(textField_26);

		// product 2 wts
		if (!textField_16.getText().equals(""))
			check(textField_16);

		if (!textField_28.getText().equals(""))
			check(textField_28);

		if (!textField_17.getText().equals(""))
			check(textField_17);

		if (!textField_29.getText().equals(""))
			check(textField_29);

		if (!textField_18.getText().equals(""))
			check(textField_18);

		if (!textField_30.getText().equals(""))
			check(textField_30);

		if (!textField_19.getText().equals(""))
			check(textField_19);

		if (!textField_31.getText().equals(""))
			check(textField_31);

		if (!textField_20.getText().equals(""))
			check(textField_20);

		if (!textField_32.getText().equals(""))
			check(textField_32);

		if (!textField_15.getText().equals(""))
			check(textField_15);

		if (!textField_27.getText().equals(""))
			check(textField_27);

		String setNum = textField.getText();
		String percentTarg = textField_37.getText();
		String actualPounds = textField_6.getText();
		model2.addRow(new Object[] { setNum, percentTarg, actualPounds });
	}

	private void check(JTextField field) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		dateTime = dateFormat.format(cal.getTime());
		parts = dateTime.split(" ");
		dateStamp = parts[0];
		timeStamp = parts[1];
		String shiftSelect = (String) comboBox_1.getSelectedItem();
		String setSelect = textField.getText();
		String rollWeight = field.getText().trim();
		if (rollWeight.length() > 5)
			rollWeight = rollWeight.substring(0, 5);
		model.addRow(new Object[] { dateStamp, timeStamp, shiftSelect,
				setSelect, rollWeight });
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
