package Cal;
import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.GridBagLayout;

import javax.swing.JCheckBox;

import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
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

public class housekeeping {

	private JFrame frame;
	private JTextField textField;
	private JCheckBox chckbxTransCansEmpty;
	private JCheckBox chckbxExitsKeptClear;
	private JCheckBox chckbxRazorBladesIn;
	private JCheckBox chckbxAreaSurroundingWinders;
	private JCheckBox chckbxDebrisCleanedFrom;
	private JCheckBox chckbxCollapserRoomFree;
	private JCheckBox chckbxWindersCleanedOf;
	private JCheckBox chckbxToolsAndChemicals;
	private JCheckBox chckbxWorkStationsKept;
	private JCheckBox chckbxNoExcessiveMaterials;
	private JCheckBox chckbxPathwayToEmergency;
	private JCheckBox chckbxMandrelsFromChangeovers;
	private JCheckBox chckbxOperatingControlsNo;
	private JCheckBox chckbxLimitSwitchesNo;
	private JCheckBox chckbxBrakeMechanismNo;
	private JCheckBox chckbxHooksNoBent;
	private JCheckBox chckbxSuspensionLugNo;
	private JCheckBox chckbxChainAdeqauteLubrication;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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

	/**
	 * Create the application.
	 */
	public housekeeping() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setFrame(new JFrame("Housekeeping and Hoist Audit"));
		getFrame().setBounds(100, 100, 574, 650);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 1.0, 0.0, 0.0,
				0.0, 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		getFrame().getContentPane().setLayout(gridBagLayout);

		chckbxTransCansEmpty = new JCheckBox("Trash Cans empty, lids in place");
		GridBagConstraints gbc_chckbxTransCansEmpty = new GridBagConstraints();
		gbc_chckbxTransCansEmpty.gridwidth = 7;
		gbc_chckbxTransCansEmpty.anchor = GridBagConstraints.WEST;
		gbc_chckbxTransCansEmpty.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxTransCansEmpty.gridx = 0;
		gbc_chckbxTransCansEmpty.gridy = 0;
		getFrame().getContentPane().add(chckbxTransCansEmpty,
				gbc_chckbxTransCansEmpty);

		chckbxExitsKeptClear = new JCheckBox(
				"Exits kept clear and unblocked, doors closed");
		GridBagConstraints gbc_chckbxExitsKeptClear = new GridBagConstraints();
		gbc_chckbxExitsKeptClear.gridwidth = 7;
		gbc_chckbxExitsKeptClear.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxExitsKeptClear.anchor = GridBagConstraints.WEST;
		gbc_chckbxExitsKeptClear.gridx = 0;
		gbc_chckbxExitsKeptClear.gridy = 1;
		getFrame().getContentPane().add(chckbxExitsKeptClear,
				gbc_chckbxExitsKeptClear);

		chckbxRazorBladesIn = new JCheckBox(
				"Razor blades in holders are stowed with covers on blades in place");
		GridBagConstraints gbc_chckbxRazorBladesIn = new GridBagConstraints();
		gbc_chckbxRazorBladesIn.anchor = GridBagConstraints.WEST;
		gbc_chckbxRazorBladesIn.gridwidth = 7;
		gbc_chckbxRazorBladesIn.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxRazorBladesIn.gridx = 0;
		gbc_chckbxRazorBladesIn.gridy = 2;
		getFrame().getContentPane().add(chckbxRazorBladesIn,
				gbc_chckbxRazorBladesIn);

		chckbxAreaSurroundingWinders = new JCheckBox(
				"Area surrounding winders swept clean");
		GridBagConstraints gbc_chckbxAreaSurroundingWinders = new GridBagConstraints();
		gbc_chckbxAreaSurroundingWinders.gridwidth = 7;
		gbc_chckbxAreaSurroundingWinders.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxAreaSurroundingWinders.anchor = GridBagConstraints.WEST;
		gbc_chckbxAreaSurroundingWinders.gridx = 0;
		gbc_chckbxAreaSurroundingWinders.gridy = 3;
		getFrame().getContentPane().add(chckbxAreaSurroundingWinders,
				gbc_chckbxAreaSurroundingWinders);

		chckbxDebrisCleanedFrom = new JCheckBox(
				"Debris cleaned from behind pallets and waste boxes");
		GridBagConstraints gbc_chckbxDebrisCleanedFrom = new GridBagConstraints();
		gbc_chckbxDebrisCleanedFrom.gridwidth = 7;
		gbc_chckbxDebrisCleanedFrom.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxDebrisCleanedFrom.anchor = GridBagConstraints.WEST;
		gbc_chckbxDebrisCleanedFrom.gridx = 0;
		gbc_chckbxDebrisCleanedFrom.gridy = 4;
		getFrame().getContentPane().add(chckbxDebrisCleanedFrom,
				gbc_chckbxDebrisCleanedFrom);

		chckbxCollapserRoomFree = new JCheckBox(
				"Collapser room free of debris and razor blades, doors kept closed");
		GridBagConstraints gbc_chckbxCollapserRoomFree = new GridBagConstraints();
		gbc_chckbxCollapserRoomFree.anchor = GridBagConstraints.WEST;
		gbc_chckbxCollapserRoomFree.gridwidth = 7;
		gbc_chckbxCollapserRoomFree.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxCollapserRoomFree.gridx = 0;
		gbc_chckbxCollapserRoomFree.gridy = 5;
		getFrame().getContentPane().add(chckbxCollapserRoomFree,
				gbc_chckbxCollapserRoomFree);

		chckbxWindersCleanedOf = new JCheckBox(
				"Winders cleaned of grease or other contaminants");
		GridBagConstraints gbc_chckbxWindersCleanedOf = new GridBagConstraints();
		gbc_chckbxWindersCleanedOf.gridwidth = 7;
		gbc_chckbxWindersCleanedOf.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxWindersCleanedOf.anchor = GridBagConstraints.WEST;
		gbc_chckbxWindersCleanedOf.gridx = 0;
		gbc_chckbxWindersCleanedOf.gridy = 6;
		getFrame().getContentPane().add(chckbxWindersCleanedOf,
				gbc_chckbxWindersCleanedOf);

		chckbxToolsAndChemicals = new JCheckBox(
				"Tools and chemicals policed up around the lines");
		GridBagConstraints gbc_chckbxToolsAndChemicals = new GridBagConstraints();
		gbc_chckbxToolsAndChemicals.gridwidth = 7;
		gbc_chckbxToolsAndChemicals.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxToolsAndChemicals.anchor = GridBagConstraints.WEST;
		gbc_chckbxToolsAndChemicals.gridx = 0;
		gbc_chckbxToolsAndChemicals.gridy = 7;
		getFrame().getContentPane().add(chckbxToolsAndChemicals,
				gbc_chckbxToolsAndChemicals);

		chckbxWorkStationsKept = new JCheckBox(
				"Work stations kept clean, dusted, and free of clutter");
		GridBagConstraints gbc_chckbxWorkStationsKept = new GridBagConstraints();
		gbc_chckbxWorkStationsKept.gridwidth = 7;
		gbc_chckbxWorkStationsKept.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxWorkStationsKept.anchor = GridBagConstraints.WEST;
		gbc_chckbxWorkStationsKept.gridx = 0;
		gbc_chckbxWorkStationsKept.gridy = 8;
		getFrame().getContentPane().add(chckbxWorkStationsKept,
				gbc_chckbxWorkStationsKept);

		chckbxNoExcessiveMaterials = new JCheckBox(
				"No excessive materials in the work area");
		GridBagConstraints gbc_chckbxNoExcessiveMaterials = new GridBagConstraints();
		gbc_chckbxNoExcessiveMaterials.gridwidth = 7;
		gbc_chckbxNoExcessiveMaterials.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxNoExcessiveMaterials.anchor = GridBagConstraints.WEST;
		gbc_chckbxNoExcessiveMaterials.gridx = 0;
		gbc_chckbxNoExcessiveMaterials.gridy = 9;
		getFrame().getContentPane().add(chckbxNoExcessiveMaterials,
				gbc_chckbxNoExcessiveMaterials);

		chckbxPathwayToEmergency = new JCheckBox(
				"Pathway to Emergency Exit is clear");
		GridBagConstraints gbc_chckbxPathwayToEmergency = new GridBagConstraints();
		gbc_chckbxPathwayToEmergency.gridwidth = 7;
		gbc_chckbxPathwayToEmergency.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxPathwayToEmergency.anchor = GridBagConstraints.WEST;
		gbc_chckbxPathwayToEmergency.gridx = 0;
		gbc_chckbxPathwayToEmergency.gridy = 10;
		getFrame().getContentPane().add(chckbxPathwayToEmergency,
				gbc_chckbxPathwayToEmergency);

		chckbxMandrelsFromChangeovers = new JCheckBox(
				"Mandrels from changeovers properly stowed");
		GridBagConstraints gbc_chckbxMandrelsFromChangeovers = new GridBagConstraints();
		gbc_chckbxMandrelsFromChangeovers.gridwidth = 7;
		gbc_chckbxMandrelsFromChangeovers.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxMandrelsFromChangeovers.anchor = GridBagConstraints.WEST;
		gbc_chckbxMandrelsFromChangeovers.gridx = 0;
		gbc_chckbxMandrelsFromChangeovers.gridy = 11;
		getFrame().getContentPane().add(chckbxMandrelsFromChangeovers,
				gbc_chckbxMandrelsFromChangeovers);

		JLabel lblOperatorDailyChecklist = new JLabel(
				"Operator DAILY Checklist for Hoist");
		GridBagConstraints gbc_lblOperatorDailyChecklist = new GridBagConstraints();
		gbc_lblOperatorDailyChecklist.insets = new Insets(0, 0, 5, 0);
		gbc_lblOperatorDailyChecklist.gridwidth = 7;
		gbc_lblOperatorDailyChecklist.gridx = 0;
		gbc_lblOperatorDailyChecklist.gridy = 13;
		getFrame().getContentPane().add(lblOperatorDailyChecklist,
				gbc_lblOperatorDailyChecklist);

		chckbxOperatingControlsNo = new JCheckBox(
				"Operating Controls: No deficiencies causing improper operation");
		GridBagConstraints gbc_chckbxOperatingControlsNo = new GridBagConstraints();
		gbc_chckbxOperatingControlsNo.gridwidth = 7;
		gbc_chckbxOperatingControlsNo.anchor = GridBagConstraints.WEST;
		gbc_chckbxOperatingControlsNo.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxOperatingControlsNo.gridx = 0;
		gbc_chckbxOperatingControlsNo.gridy = 14;
		getFrame().getContentPane().add(chckbxOperatingControlsNo,
				gbc_chckbxOperatingControlsNo);

		chckbxLimitSwitchesNo = new JCheckBox(
				"Limit Switches: No deficiencies causing improper operation");
		GridBagConstraints gbc_chckbxLimitSwitchesNo = new GridBagConstraints();
		gbc_chckbxLimitSwitchesNo.gridwidth = 7;
		gbc_chckbxLimitSwitchesNo.anchor = GridBagConstraints.WEST;
		gbc_chckbxLimitSwitchesNo.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxLimitSwitchesNo.gridx = 0;
		gbc_chckbxLimitSwitchesNo.gridy = 15;
		getFrame().getContentPane().add(chckbxLimitSwitchesNo,
				gbc_chckbxLimitSwitchesNo);

		chckbxBrakeMechanismNo = new JCheckBox(
				"Brake Mechanism: No slippage or excessive drift");
		GridBagConstraints gbc_chckbxBrakeMechanismNo = new GridBagConstraints();
		gbc_chckbxBrakeMechanismNo.gridwidth = 7;
		gbc_chckbxBrakeMechanismNo.anchor = GridBagConstraints.WEST;
		gbc_chckbxBrakeMechanismNo.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxBrakeMechanismNo.gridx = 0;
		gbc_chckbxBrakeMechanismNo.gridy = 16;
		getFrame().getContentPane().add(chckbxBrakeMechanismNo,
				gbc_chckbxBrakeMechanismNo);

		chckbxHooksNoBent = new JCheckBox(
				"Hooks: No bent, twisted, or damaged hook or hook latch");
		GridBagConstraints gbc_chckbxHooksNoBent = new GridBagConstraints();
		gbc_chckbxHooksNoBent.gridwidth = 7;
		gbc_chckbxHooksNoBent.anchor = GridBagConstraints.WEST;
		gbc_chckbxHooksNoBent.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxHooksNoBent.gridx = 0;
		gbc_chckbxHooksNoBent.gridy = 17;
		getFrame().getContentPane().add(chckbxHooksNoBent,
				gbc_chckbxHooksNoBent);

		chckbxSuspensionLugNo = new JCheckBox(
				"Suspension Lug: No cracks, excessive wear or other damage ");
		GridBagConstraints gbc_chckbxSuspensionLugNo = new GridBagConstraints();
		gbc_chckbxSuspensionLugNo.gridwidth = 7;
		gbc_chckbxSuspensionLugNo.anchor = GridBagConstraints.WEST;
		gbc_chckbxSuspensionLugNo.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxSuspensionLugNo.gridx = 0;
		gbc_chckbxSuspensionLugNo.gridy = 18;
		getFrame().getContentPane().add(chckbxSuspensionLugNo,
				gbc_chckbxSuspensionLugNo);

		chckbxChainAdeqauteLubrication = new JCheckBox(
				"Chain: Adeqaute lubrication, no excessive wear or damaged links");
		GridBagConstraints gbc_chckbxChainAdeqauteLubrication = new GridBagConstraints();
		gbc_chckbxChainAdeqauteLubrication.anchor = GridBagConstraints.WEST;
		gbc_chckbxChainAdeqauteLubrication.gridwidth = 7;
		gbc_chckbxChainAdeqauteLubrication.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxChainAdeqauteLubrication.gridx = 0;
		gbc_chckbxChainAdeqauteLubrication.gridy = 19;
		getFrame().getContentPane().add(chckbxChainAdeqauteLubrication,
				gbc_chckbxChainAdeqauteLubrication);

		JLabel lblSignature = new JLabel("Signature");
		GridBagConstraints gbc_lblSignature = new GridBagConstraints();
		gbc_lblSignature.anchor = GridBagConstraints.EAST;
		gbc_lblSignature.insets = new Insets(0, 0, 5, 5);
		gbc_lblSignature.gridx = 0;
		gbc_lblSignature.gridy = 20;
		getFrame().getContentPane().add(lblSignature, gbc_lblSignature);

		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 20;
		getFrame().getContentPane().add(textField, gbc_textField);
		textField.setColumns(10);

		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					submitHousekeepingSQL();
					JOptionPane.showMessageDialog(null,
							"Housekeeping Audit submitted");
				} catch (ClassNotFoundException e1) {
					e1.printStackTrace();
				} catch (SQLException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		GridBagConstraints gbc_btnSubmit = new GridBagConstraints();
		gbc_btnSubmit.insets = new Insets(0, 0, 0, 5);
		gbc_btnSubmit.gridx = 2;
		gbc_btnSubmit.gridy = 21;
		frame.getContentPane().add(btnSubmit, gbc_btnSubmit);
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public void submitHousekeepingSQL() throws ClassNotFoundException,
			SQLException, IOException {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		String dateTime = dateFormat.format(cal.getTime());
		int trashCans = setChecked(chckbxTransCansEmpty);
		int exits = setChecked(chckbxExitsKeptClear);
		int razor = setChecked(chckbxRazorBladesIn);
		int winderSwept = setChecked(chckbxAreaSurroundingWinders);
		int debris = setChecked(chckbxDebrisCleanedFrom);
		int collapser = setChecked(chckbxCollapserRoomFree);
		int winderClean = setChecked(chckbxWindersCleanedOf);
		int tools = setChecked(chckbxToolsAndChemicals);
		int workStation = setChecked(chckbxWorkStationsKept);
		int materials = setChecked(chckbxNoExcessiveMaterials);
		int emergencyExit = setChecked(chckbxPathwayToEmergency);
		int mandrels = setChecked(chckbxMandrelsFromChangeovers);
		int operatingControls = setChecked(chckbxOperatingControlsNo);
		int limitSwitches = setChecked(chckbxLimitSwitchesNo);
		int brakeMechanism = setChecked(chckbxBrakeMechanismNo);
		int hooks = setChecked(chckbxHooksNoBent);
		int suspensionLug = setChecked(chckbxSuspensionLugNo);
		int chain = setChecked(chckbxChainAdeqauteLubrication);
		int lineNumber = 0;
		if (!weights.comboBox.getSelectedItem().equals("")) {
			String ln = (String) weights.comboBox.getSelectedItem();
			ln = ln.trim();
			lineNumber = Integer.valueOf(ln);
		}
		String signature = textField.getText();
		weights.sqlConnection();
		try {
			CallableStatement cs = null;
			cs = weights.conn
					.prepareCall("{call InsertCalHousekeeping(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
			cs.setString(1, dateTime);
			cs.setInt(2, lineNumber);
			cs.setInt(3, trashCans);
			cs.setInt(4, exits);
			cs.setInt(5, razor);
			cs.setInt(6, winderSwept);
			cs.setInt(7, debris);
			cs.setInt(8, collapser);
			cs.setInt(9, winderClean);
			cs.setInt(10, tools);
			cs.setInt(11, workStation);
			cs.setInt(12, materials);
			cs.setInt(13, emergencyExit);
			cs.setInt(14, mandrels);
			cs.setInt(15, operatingControls);
			cs.setInt(16, limitSwitches);
			cs.setInt(17, brakeMechanism);
			cs.setInt(18, hooks);
			cs.setInt(19, suspensionLug);
			cs.setInt(20, chain);
			cs.setString(21, signature);
			cs.execute();
			cs.close();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		} finally {

		}
	}

	public int setChecked(JCheckBox j1) {
		if (j1.isSelected())
			return 1;
		else
			return 0;
	}
}
