import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.GridBagLayout;

import javax.swing.JLabel;

import java.awt.GridBagConstraints;

import javax.swing.JTextField;

import java.awt.Insets;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class qaChecks {

	private JFrame frame;
	private JTextField actualWidthField;
	private JTextField collapserTensionSettingsField;
	private JTextField centerStandTensionSettingsField;
	private JTextField winderTensionSettingsField;
	private JTextField collapserTemperatureField;
	private JTextField setNumberField;
	private JTextField workOrder1Field;
	private JComboBox rollEndsField;
	private JComboBox coreQualityField;
	private JComboBox wrinklesField;
	private JComboBox dieLinesField;
	private JComboBox dieLinesField_1;
	private JComboBox holesField;
	private JComboBox gelsParticlesField;
	private JComboBox rollColorClarityField;
	private JComboBox packagingField;
	private JComboBox palletField;
	private JComboBox coreCenteringField;
	private JTextField workOrder2Field;
	private JTextArea commentsField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					qaChecks window = new qaChecks();
					window.getFrame().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public qaChecks() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setFrame(new JFrame("QA Inspection"));
		getFrame().setBounds(100, 100, 450, 650);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE };
		getFrame().getContentPane().setLayout(gridBagLayout);

		JLabel lblSetNumber = new JLabel("Set Number");
		GridBagConstraints gbc_lblSetNumber = new GridBagConstraints();
		gbc_lblSetNumber.anchor = GridBagConstraints.EAST;
		gbc_lblSetNumber.insets = new Insets(0, 0, 5, 5);
		gbc_lblSetNumber.gridx = 0;
		gbc_lblSetNumber.gridy = 0;
		frame.getContentPane().add(lblSetNumber, gbc_lblSetNumber);

		setNumberField = new JTextField("1");
		GridBagConstraints gbc_setNumberField = new GridBagConstraints();
		gbc_setNumberField.insets = new Insets(0, 0, 5, 0);
		gbc_setNumberField.fill = GridBagConstraints.HORIZONTAL;
		gbc_setNumberField.gridx = 1;
		gbc_setNumberField.gridy = 0;
		frame.getContentPane().add(setNumberField, gbc_setNumberField);
		setNumberField.setColumns(10);

		JLabel lblWorkOrderNumber = new JLabel("Work Order 1");
		GridBagConstraints gbc_lblWorkOrderNumber = new GridBagConstraints();
		gbc_lblWorkOrderNumber.anchor = GridBagConstraints.EAST;
		gbc_lblWorkOrderNumber.insets = new Insets(0, 0, 5, 5);
		gbc_lblWorkOrderNumber.gridx = 0;
		gbc_lblWorkOrderNumber.gridy = 1;
		frame.getContentPane().add(lblWorkOrderNumber, gbc_lblWorkOrderNumber);

		workOrder1Field = new JTextField();
		if (!(weights.workOrderOneField == null))
			workOrder1Field.setText(weights.workOrderOneField.getText());
		GridBagConstraints gbc_workOrder1Field = new GridBagConstraints();
		gbc_workOrder1Field.insets = new Insets(0, 0, 5, 0);
		gbc_workOrder1Field.fill = GridBagConstraints.HORIZONTAL;
		gbc_workOrder1Field.gridx = 1;
		gbc_workOrder1Field.gridy = 1;
		frame.getContentPane().add(workOrder1Field, gbc_workOrder1Field);
		workOrder1Field.setColumns(10);

		JLabel lblWorkOrder = new JLabel("Work Order 2");
		GridBagConstraints gbc_lblWorkOrder = new GridBagConstraints();
		gbc_lblWorkOrder.anchor = GridBagConstraints.EAST;
		gbc_lblWorkOrder.insets = new Insets(0, 0, 5, 5);
		gbc_lblWorkOrder.gridx = 0;
		gbc_lblWorkOrder.gridy = 2;
		frame.getContentPane().add(lblWorkOrder, gbc_lblWorkOrder);

		workOrder2Field = new JTextField();
		if (!(weights.workOrderTwoField == null))
		workOrder2Field.setText(weights.workOrderTwoField.getText());
		GridBagConstraints gbc_workOrder2Field = new GridBagConstraints();
		gbc_workOrder2Field.insets = new Insets(0, 0, 5, 0);
		gbc_workOrder2Field.fill = GridBagConstraints.HORIZONTAL;
		gbc_workOrder2Field.gridx = 1;
		gbc_workOrder2Field.gridy = 2;
		frame.getContentPane().add(workOrder2Field, gbc_workOrder2Field);
		workOrder2Field.setColumns(10);

		JLabel lblActualWidth = new JLabel("Actual Width");
		GridBagConstraints gbc_lblActualWidth = new GridBagConstraints();
		gbc_lblActualWidth.insets = new Insets(0, 0, 5, 5);
		gbc_lblActualWidth.anchor = GridBagConstraints.EAST;
		gbc_lblActualWidth.gridx = 0;
		gbc_lblActualWidth.gridy = 3;
		getFrame().getContentPane().add(lblActualWidth, gbc_lblActualWidth);

		actualWidthField = new JTextField();
		GridBagConstraints gbc_actualWidthField = new GridBagConstraints();
		gbc_actualWidthField.insets = new Insets(0, 0, 5, 0);
		gbc_actualWidthField.fill = GridBagConstraints.HORIZONTAL;
		gbc_actualWidthField.gridx = 1;
		gbc_actualWidthField.gridy = 3;
		getFrame().getContentPane().add(actualWidthField, gbc_actualWidthField);
		actualWidthField.setColumns(10);
		String[] ends = { "", "smooth", "fuzzy", "uneven", "beveled", "bulging" };
		JLabel lblRollEnds = new JLabel("Roll Ends");
		GridBagConstraints gbc_lblRollEnds = new GridBagConstraints();
		gbc_lblRollEnds.anchor = GridBagConstraints.EAST;
		gbc_lblRollEnds.insets = new Insets(0, 0, 5, 5);
		gbc_lblRollEnds.gridx = 0;
		gbc_lblRollEnds.gridy = 4;
		getFrame().getContentPane().add(lblRollEnds, gbc_lblRollEnds);

		rollEndsField = new JComboBox(ends);
		GridBagConstraints gbc_rollEndsField = new GridBagConstraints();
		gbc_rollEndsField.insets = new Insets(0, 0, 5, 0);
		gbc_rollEndsField.fill = GridBagConstraints.HORIZONTAL;
		gbc_rollEndsField.gridx = 1;
		gbc_rollEndsField.gridy = 4;
		getFrame().getContentPane().add(rollEndsField, gbc_rollEndsField);
		rollEndsField.setEditable(true);

		JLabel lblCoreCentering = new JLabel("Core Centering");
		GridBagConstraints gbc_lblCoreCentering = new GridBagConstraints();
		gbc_lblCoreCentering.anchor = GridBagConstraints.EAST;
		gbc_lblCoreCentering.insets = new Insets(0, 0, 5, 5);
		gbc_lblCoreCentering.gridx = 0;
		gbc_lblCoreCentering.gridy = 5;
		getFrame().getContentPane().add(lblCoreCentering, gbc_lblCoreCentering);

		String[] coreCentering = { "", "centered", "not centered" };
		coreCenteringField = new JComboBox(coreCentering);
		GridBagConstraints gbc_coreCenteringField = new GridBagConstraints();
		gbc_coreCenteringField.insets = new Insets(0, 0, 5, 0);
		gbc_coreCenteringField.fill = GridBagConstraints.HORIZONTAL;
		gbc_coreCenteringField.gridx = 1;
		gbc_coreCenteringField.gridy = 5;
		getFrame().getContentPane().add(coreCenteringField,
				gbc_coreCenteringField);
		coreCenteringField.setEditable(true);

		JLabel lblCoreQuality = new JLabel("Core Quality");
		GridBagConstraints gbc_lblCoreQuality = new GridBagConstraints();
		gbc_lblCoreQuality.anchor = GridBagConstraints.EAST;
		gbc_lblCoreQuality.insets = new Insets(0, 0, 5, 5);
		gbc_lblCoreQuality.gridx = 0;
		gbc_lblCoreQuality.gridy = 6;
		getFrame().getContentPane().add(lblCoreQuality, gbc_lblCoreQuality);

		String[] coreQuality = { "", "cores in spec", "length short",
				"length long", "varying length", "uneven length" };
		coreQualityField = new JComboBox(coreQuality);
		GridBagConstraints gbc_coreQualityField = new GridBagConstraints();
		gbc_coreQualityField.insets = new Insets(0, 0, 5, 0);
		gbc_coreQualityField.fill = GridBagConstraints.HORIZONTAL;
		gbc_coreQualityField.gridx = 1;
		gbc_coreQualityField.gridy = 6;
		getFrame().getContentPane().add(coreQualityField, gbc_coreQualityField);
		coreQualityField.setEditable(true);

		JLabel lblWrinkles = new JLabel("Wrinkles");
		GridBagConstraints gbc_lblWrinkles = new GridBagConstraints();
		gbc_lblWrinkles.anchor = GridBagConstraints.EAST;
		gbc_lblWrinkles.insets = new Insets(0, 0, 5, 5);
		gbc_lblWrinkles.gridx = 0;
		gbc_lblWrinkles.gridy = 7;
		getFrame().getContentPane().add(lblWrinkles, gbc_lblWrinkles);

		String[] wrinkles = { "", "none", "few", "many", "near edge",
				"warped roll" };
		wrinklesField = new JComboBox(wrinkles);
		GridBagConstraints gbc_wrinklesField = new GridBagConstraints();
		gbc_wrinklesField.insets = new Insets(0, 0, 5, 0);
		gbc_wrinklesField.fill = GridBagConstraints.HORIZONTAL;
		gbc_wrinklesField.gridx = 1;
		gbc_wrinklesField.gridy = 7;
		getFrame().getContentPane().add(wrinklesField, gbc_wrinklesField);
		wrinklesField.setEditable(true);

		JLabel lblDieLines = new JLabel("Die Lines");
		GridBagConstraints gbc_lblDieLines = new GridBagConstraints();
		gbc_lblDieLines.anchor = GridBagConstraints.EAST;
		gbc_lblDieLines.insets = new Insets(0, 0, 5, 5);
		gbc_lblDieLines.gridx = 0;
		gbc_lblDieLines.gridy = 8;
		getFrame().getContentPane().add(lblDieLines, gbc_lblDieLines);

		String[] dieLines = { "", "none", "yes-not splitting", "yes-splitting" };
		dieLinesField = new JComboBox(dieLines);
		GridBagConstraints gbc_dieLinesField = new GridBagConstraints();
		gbc_dieLinesField.insets = new Insets(0, 0, 5, 0);
		gbc_dieLinesField.fill = GridBagConstraints.HORIZONTAL;
		gbc_dieLinesField.gridx = 1;
		gbc_dieLinesField.gridy = 8;
		getFrame().getContentPane().add(dieLinesField, gbc_dieLinesField);
		dieLinesField.setEditable(true);

		JLabel lblColdFlow = new JLabel("Cold Flow");
		GridBagConstraints gbc_lblColdFlow = new GridBagConstraints();
		gbc_lblColdFlow.anchor = GridBagConstraints.EAST;
		gbc_lblColdFlow.insets = new Insets(0, 0, 5, 5);
		gbc_lblColdFlow.gridx = 0;
		gbc_lblColdFlow.gridy = 9;
		getFrame().getContentPane().add(lblColdFlow, gbc_lblColdFlow);

		String[] coldFlow = { "", "yes", "no" };
		dieLinesField_1 = new JComboBox(coldFlow);
		GridBagConstraints gbc_dieLinesField_1 = new GridBagConstraints();
		gbc_dieLinesField_1.insets = new Insets(0, 0, 5, 0);
		gbc_dieLinesField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_dieLinesField_1.gridx = 1;
		gbc_dieLinesField_1.gridy = 9;
		getFrame().getContentPane().add(dieLinesField_1, gbc_dieLinesField_1);
		dieLinesField_1.setEditable(true);

		JLabel lblHoles = new JLabel("Holes");
		GridBagConstraints gbc_lblHoles = new GridBagConstraints();
		gbc_lblHoles.anchor = GridBagConstraints.EAST;
		gbc_lblHoles.insets = new Insets(0, 0, 5, 5);
		gbc_lblHoles.gridx = 0;
		gbc_lblHoles.gridy = 10;
		getFrame().getContentPane().add(lblHoles, gbc_lblHoles);

		String[] holes = { "", "none", "few", "many" };
		holesField = new JComboBox(holes);
		GridBagConstraints gbc_holesField = new GridBagConstraints();
		gbc_holesField.insets = new Insets(0, 0, 5, 0);
		gbc_holesField.fill = GridBagConstraints.HORIZONTAL;
		gbc_holesField.gridx = 1;
		gbc_holesField.gridy = 10;
		getFrame().getContentPane().add(holesField, gbc_holesField);
		holesField.setEditable(true);

		JLabel lblGelsparticles = new JLabel("Gels/Particles");
		GridBagConstraints gbc_lblGelsparticles = new GridBagConstraints();
		gbc_lblGelsparticles.anchor = GridBagConstraints.EAST;
		gbc_lblGelsparticles.insets = new Insets(0, 0, 5, 5);
		gbc_lblGelsparticles.gridx = 0;
		gbc_lblGelsparticles.gridy = 11;
		getFrame().getContentPane().add(lblGelsparticles, gbc_lblGelsparticles);

		gelsParticlesField = new JComboBox(holes);
		GridBagConstraints gbc_gelsParticlesField = new GridBagConstraints();
		gbc_gelsParticlesField.insets = new Insets(0, 0, 5, 0);
		gbc_gelsParticlesField.fill = GridBagConstraints.HORIZONTAL;
		gbc_gelsParticlesField.gridx = 1;
		gbc_gelsParticlesField.gridy = 11;
		getFrame().getContentPane().add(gelsParticlesField,
				gbc_gelsParticlesField);
		gelsParticlesField.setEditable(true);

		JLabel lblRollColorclarity = new JLabel("Roll Color/Clarity");
		GridBagConstraints gbc_lblRollColorclarity = new GridBagConstraints();
		gbc_lblRollColorclarity.anchor = GridBagConstraints.EAST;
		gbc_lblRollColorclarity.insets = new Insets(0, 0, 5, 5);
		gbc_lblRollColorclarity.gridx = 0;
		gbc_lblRollColorclarity.gridy = 12;
		getFrame().getContentPane().add(lblRollColorclarity,
				gbc_lblRollColorclarity);

		String[] color = { "", "color in spec", "not in spec-green",
				"not in spec-blue", "not in spec-metallic", "not in spec-clear" };
		rollColorClarityField = new JComboBox(color);
		GridBagConstraints gbc_rollColorClarityField = new GridBagConstraints();
		gbc_rollColorClarityField.insets = new Insets(0, 0, 5, 0);
		gbc_rollColorClarityField.fill = GridBagConstraints.HORIZONTAL;
		gbc_rollColorClarityField.gridx = 1;
		gbc_rollColorClarityField.gridy = 12;
		getFrame().getContentPane().add(rollColorClarityField,
				gbc_rollColorClarityField);
		rollColorClarityField.setEditable(true);

		JLabel lblPackaging = new JLabel("Packaging");
		GridBagConstraints gbc_lblPackaging = new GridBagConstraints();
		gbc_lblPackaging.anchor = GridBagConstraints.EAST;
		gbc_lblPackaging.insets = new Insets(0, 0, 5, 5);
		gbc_lblPackaging.gridx = 0;
		gbc_lblPackaging.gridy = 13;
		getFrame().getContentPane().add(lblPackaging, gbc_lblPackaging);

		String[] packaging = { "", "packaging correct", "core tag wrong",
				"box label wrong", "box label not square", "box label torn",
				"box label print inconsistent" };
		packagingField = new JComboBox(packaging);
		GridBagConstraints gbc_packagingField = new GridBagConstraints();
		gbc_packagingField.insets = new Insets(0, 0, 5, 0);
		gbc_packagingField.fill = GridBagConstraints.HORIZONTAL;
		gbc_packagingField.gridx = 1;
		gbc_packagingField.gridy = 13;
		getFrame().getContentPane().add(packagingField, gbc_packagingField);
		packagingField.setEditable(true);

		JLabel lblPallet = new JLabel("Pallet");
		GridBagConstraints gbc_lblPallet = new GridBagConstraints();
		gbc_lblPallet.anchor = GridBagConstraints.EAST;
		gbc_lblPallet.insets = new Insets(0, 0, 5, 5);
		gbc_lblPallet.gridx = 0;
		gbc_lblPallet.gridy = 14;
		getFrame().getContentPane().add(lblPallet, gbc_lblPallet);

		String[] pallet = { "", "correct type, good condition",
				"broken deck boards", "contamination: mold, dirt, pests",
				"exposed nails", "missing nails" };
		palletField = new JComboBox(pallet);
		GridBagConstraints gbc_palletField = new GridBagConstraints();
		gbc_palletField.insets = new Insets(0, 0, 5, 0);
		gbc_palletField.fill = GridBagConstraints.HORIZONTAL;
		gbc_palletField.gridx = 1;
		gbc_palletField.gridy = 14;
		getFrame().getContentPane().add(palletField, gbc_palletField);
		palletField.setEditable(true);

		JLabel lblTensionSettings = new JLabel("Tension Settings:");
		GridBagConstraints gbc_lblTensionSettings = new GridBagConstraints();
		gbc_lblTensionSettings.insets = new Insets(0, 0, 5, 5);
		gbc_lblTensionSettings.gridx = 0;
		gbc_lblTensionSettings.gridy = 15;
		getFrame().getContentPane().add(lblTensionSettings,
				gbc_lblTensionSettings);

		JLabel lblCollapser = new JLabel("Collapser");
		GridBagConstraints gbc_lblCollapser = new GridBagConstraints();
		gbc_lblCollapser.anchor = GridBagConstraints.EAST;
		gbc_lblCollapser.insets = new Insets(0, 0, 5, 5);
		gbc_lblCollapser.gridx = 0;
		gbc_lblCollapser.gridy = 16;
		getFrame().getContentPane().add(lblCollapser, gbc_lblCollapser);

		collapserTensionSettingsField = new JTextField();
		GridBagConstraints gbc_collapserTensionSettingsField = new GridBagConstraints();
		gbc_collapserTensionSettingsField.insets = new Insets(0, 0, 5, 0);
		gbc_collapserTensionSettingsField.fill = GridBagConstraints.HORIZONTAL;
		gbc_collapserTensionSettingsField.gridx = 1;
		gbc_collapserTensionSettingsField.gridy = 16;
		getFrame().getContentPane().add(collapserTensionSettingsField,
				gbc_collapserTensionSettingsField);
		collapserTensionSettingsField.setColumns(10);

		JLabel lblCenterStand = new JLabel("Center Stand");
		GridBagConstraints gbc_lblCenterStand = new GridBagConstraints();
		gbc_lblCenterStand.anchor = GridBagConstraints.EAST;
		gbc_lblCenterStand.insets = new Insets(0, 0, 5, 5);
		gbc_lblCenterStand.gridx = 0;
		gbc_lblCenterStand.gridy = 17;
		getFrame().getContentPane().add(lblCenterStand, gbc_lblCenterStand);

		centerStandTensionSettingsField = new JTextField();
		GridBagConstraints gbc_centerStandTensionSettingsField = new GridBagConstraints();
		gbc_centerStandTensionSettingsField.insets = new Insets(0, 0, 5, 0);
		gbc_centerStandTensionSettingsField.fill = GridBagConstraints.HORIZONTAL;
		gbc_centerStandTensionSettingsField.gridx = 1;
		gbc_centerStandTensionSettingsField.gridy = 17;
		getFrame().getContentPane().add(centerStandTensionSettingsField,
				gbc_centerStandTensionSettingsField);
		centerStandTensionSettingsField.setColumns(10);

		JLabel lblWinder = new JLabel("Winder");
		GridBagConstraints gbc_lblWinder = new GridBagConstraints();
		gbc_lblWinder.anchor = GridBagConstraints.EAST;
		gbc_lblWinder.insets = new Insets(0, 0, 5, 5);
		gbc_lblWinder.gridx = 0;
		gbc_lblWinder.gridy = 18;
		getFrame().getContentPane().add(lblWinder, gbc_lblWinder);

		winderTensionSettingsField = new JTextField();
		GridBagConstraints gbc_winderTensionSettingsField = new GridBagConstraints();
		gbc_winderTensionSettingsField.insets = new Insets(0, 0, 5, 0);
		gbc_winderTensionSettingsField.fill = GridBagConstraints.HORIZONTAL;
		gbc_winderTensionSettingsField.gridx = 1;
		gbc_winderTensionSettingsField.gridy = 18;
		getFrame().getContentPane().add(winderTensionSettingsField,
				gbc_winderTensionSettingsField);
		winderTensionSettingsField.setColumns(10);

		JLabel lblCollapserTemperature = new JLabel("Collapser Temperature");
		GridBagConstraints gbc_lblCollapserTemperature = new GridBagConstraints();
		gbc_lblCollapserTemperature.anchor = GridBagConstraints.EAST;
		gbc_lblCollapserTemperature.insets = new Insets(0, 0, 5, 5);
		gbc_lblCollapserTemperature.gridx = 0;
		gbc_lblCollapserTemperature.gridy = 19;
		getFrame().getContentPane().add(lblCollapserTemperature,
				gbc_lblCollapserTemperature);

		collapserTemperatureField = new JTextField();
		GridBagConstraints gbc_collapserTemperatureField = new GridBagConstraints();
		gbc_collapserTemperatureField.insets = new Insets(0, 0, 5, 0);
		gbc_collapserTemperatureField.fill = GridBagConstraints.HORIZONTAL;
		gbc_collapserTemperatureField.gridx = 1;
		gbc_collapserTemperatureField.gridy = 19;
		getFrame().getContentPane().add(collapserTemperatureField,
				gbc_collapserTemperatureField);
		collapserTemperatureField.setColumns(10);

		JLabel lblComments = new JLabel("Comments");
		GridBagConstraints gbc_lblComments = new GridBagConstraints();
		gbc_lblComments.insets = new Insets(0, 0, 5, 5);
		gbc_lblComments.gridx = 0;
		gbc_lblComments.gridy = 20;
		getFrame().getContentPane().add(lblComments, gbc_lblComments);

		commentsField = new JTextArea();
		GridBagConstraints gbc_commentsField = new GridBagConstraints();
		gbc_commentsField.insets = new Insets(0, 0, 5, 0);
		gbc_commentsField.fill = GridBagConstraints.BOTH;
		gbc_commentsField.gridx = 1;
		gbc_commentsField.gridy = 20;
		frame.getContentPane().add(commentsField, gbc_commentsField);

		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					submitQASQL();
					// increment set number
					String num = setNumberField.getText();
					int num2 = Integer.valueOf(num);
					num2++;
					num = Integer.toString(num2);
					setNumberField.setText(num);
					JOptionPane.showMessageDialog(null, "QA Audit submitted");
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				} catch (SQLException e) {
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		GridBagConstraints gbc_btnSubmit = new GridBagConstraints();
		gbc_btnSubmit.gridx = 1;
		gbc_btnSubmit.gridy = 21;
		frame.getContentPane().add(btnSubmit, gbc_btnSubmit);
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public void submitQASQL() throws ClassNotFoundException, SQLException,
			IOException {
		// get date
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		String dateTime = dateFormat.format(cal.getTime());
		String setNumber = setNumberField.getText().trim();
		int setInt = convertToInt(setNumber);
		String workOrder1 = workOrder1Field.getText().trim();
		String workOrder2 = workOrder2Field.getText().trim();
		int workInt1 = convertToInt(workOrder1);
		int workInt2 = convertToInt(workOrder2);
		String width = actualWidthField.getText();
		String rollEnds = (String) rollEndsField.getSelectedItem();
		String coreCentering = (String) coreCenteringField.getSelectedItem();
		String coreQuality = (String) coreQualityField.getSelectedItem();
		String wrinkles = (String) wrinklesField.getSelectedItem();
		String dieLines = (String) dieLinesField.getSelectedItem();
		String coldFlow = (String) dieLinesField_1.getSelectedItem();
		String holes = (String) holesField.getSelectedItem();
		String gels = (String) gelsParticlesField.getSelectedItem();
		String rollColor = (String) rollColorClarityField.getSelectedItem();
		String packaging = (String) packagingField.getSelectedItem();
		String pallet = (String) palletField.getSelectedItem();
		String collapserTension = collapserTensionSettingsField.getText()
				.trim();
		String centerStandTension = centerStandTensionSettingsField.getText()
				.trim();
		String winderTension = winderTensionSettingsField.getText().trim();
		String collapserTemperature = collapserTemperatureField.getText()
				.trim();
		String comments = commentsField.getText().trim();

		weights.sqlConnection();
		try {
			CallableStatement cs = null;
			cs = weights.conn
					.prepareCall("{call InsertCalQaAudit(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
			cs.setString(1, dateTime);
			cs.setInt(2, setInt);
			cs.setInt(3, workInt1);
			cs.setInt(4, workInt2);
			cs.setString(5, width);
			cs.setString(6, rollEnds);
			cs.setString(7, coreCentering);
			cs.setString(8, coreQuality);
			cs.setString(9, wrinkles);
			cs.setString(10, dieLines);
			cs.setString(11, coldFlow);
			cs.setString(12, holes);
			cs.setString(13, gels);
			cs.setString(14, rollColor);
			cs.setString(15, packaging);
			cs.setString(16, pallet);
			cs.setString(17, collapserTension);
			cs.setString(18, centerStandTension);
			cs.setString(19, winderTension);
			cs.setString(20, collapserTemperature);
			cs.setString(21, comments);
			cs.execute();
			cs.close();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		} finally {
		}
	}

	public int convertToInt(String val) {
		int newVal;
		if (!val.equals("")) {
			newVal = Integer.valueOf(val);
			return newVal;
		} else
			return 0;
	}

	public double converToDouble(String val) {
		double newVal;
		if (!val.equals("")) {
			newVal = Double.valueOf(val);
			return newVal;
		} else
			return 0;
	}
}
