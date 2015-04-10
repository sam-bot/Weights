package Arr;

import java.awt.EventQueue;

import javax.swing.JFrame;

import net.miginfocom.swing.MigLayout;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JPanel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Enumeration;

import javax.swing.JTextField;
import javax.swing.JComboBox;

public class arrQaAudit {
	private ArrayList<ButtonGroup> allButtons;
	private JFrame frame;
	private JTextArea commentsArea;
	private ButtonGroup knifeGroup = new ButtonGroup();
	private ButtonGroup coreGroup = new ButtonGroup();
	private ButtonGroup counterGroup = new ButtonGroup();
	private ButtonGroup hardWrinklesGroup = new ButtonGroup();
	private ButtonGroup packagingGroup = new ButtonGroup();
	private ButtonGroup dieLinesGroup = new ButtonGroup();
	private ButtonGroup widthGroup = new ButtonGroup();
	private ButtonGroup edgeQualityGroup = new ButtonGroup();
	private ButtonGroup burnGroup = new ButtonGroup();
	private ButtonGroup weightGroup = new ButtonGroup();
	private JTextField rollIdField;
	private JTextField usernameField;
	private JTextField shiftDateField;
	private JComboBox shiftComboBox;
	private JTextField workOrderField;
	private JComboBox formulationBox;
	private JComboBox workstationBox;
	static arrQaAudit qaWindow;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					qaWindow = new arrQaAudit("user");
					qaWindow.getFrame().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public arrQaAudit(String userName) {
		initialize(userName);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String userName) {
		setFrame(new JFrame("Product Quality Audit"));
		getFrame().setBounds(100, 100, 628, 384);
		getFrame().setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getFrame().getContentPane().setLayout(
				new MigLayout("", "[][][][][grow]",
						"[grow][][][][][][][][grow][grow][][]"));

		// button groups to create toggle switches for each label
		knifeGroup = new ButtonGroup();
		coreGroup = new ButtonGroup();
		counterGroup = new ButtonGroup();
		hardWrinklesGroup = new ButtonGroup();
		packagingGroup = new ButtonGroup();
		dieLinesGroup = new ButtonGroup();
		widthGroup = new ButtonGroup();
		edgeQualityGroup = new ButtonGroup();
		burnGroup = new ButtonGroup();
		weightGroup = new ButtonGroup();
		allButtons = new ArrayList<ButtonGroup>();

		JLabel lblUsername = new JLabel("Username");
		getFrame().getContentPane().add(lblUsername, "cell 0 0,alignx right");

		usernameField = new JTextField(userName);
		usernameField.setEditable(false);
		getFrame().getContentPane().add(usernameField, "cell 1 0 2 1,growx");
		usernameField.setColumns(10);

		JLabel lblWorkStation = new JLabel("Work Station");
		getFrame().getContentPane().add(lblWorkStation,
				"cell 3 0,alignx trailing");
		String[] extrusionLines = { "", "FEX340001", "FEX340002", "FEX340003",
				"FEX340004", "FEX340006", "FEX340007", "FEX340008" };
		workstationBox = new JComboBox(extrusionLines);
		frame.getContentPane().add(workstationBox, "cell 4 0,growx");

		JLabel lblShiftDate = new JLabel("Date & Time");
		getFrame().getContentPane().add(lblShiftDate,
				"cell 0 1,alignx trailing");

		shiftDateField = new JTextField();
		getFrame().getContentPane().add(shiftDateField, "cell 1 1 2 1,growx");
		shiftDateField.setColumns(10);
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/YYYY HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		String dateTime = dateFormat.format(cal.getTime());
		shiftDateField.setText(dateTime);
		shiftDateField.setEditable(false);

		JLabel lblShift = new JLabel("Shift");
		getFrame().getContentPane().add(lblShift, "cell 3 1,alignx trailing");
		String[] shifts = { "", "A", "B", "C", "D" };
		shiftComboBox = new JComboBox(shifts);
		getFrame().getContentPane().add(shiftComboBox, "cell 4 1,growx");

		JLabel lblRollId = new JLabel("Roll ID");
		getFrame().getContentPane().add(lblRollId, "cell 0 2,alignx right");

		rollIdField = new JTextField();
		getFrame().getContentPane().add(rollIdField, "cell 1 2,growx");
		rollIdField.setColumns(10);
		String[] formulations = { "", "CRMF", "Digi Shrink", "Gold Cutterbox",
				"Gold Meat", "Gold Mushroom", "Gold Mushroom PWMF",
				"Gold Revolution RHW", "Green Produce", "HW Revolution",
				"Omni MT", "Premium MT", "Premium Processor",
				"Premium Supermarket", "Shrink", };

		JLabel lblWorkOrder = new JLabel("Work Order");
		frame.getContentPane().add(lblWorkOrder, "cell 3 2,alignx trailing");

		workOrderField = new JTextField();
		frame.getContentPane().add(workOrderField, "cell 4 2,growx");
		workOrderField.setColumns(10);

		JLabel lblFormulation = new JLabel("Formulation");
		frame.getContentPane().add(lblFormulation, "cell 0 3,alignx trailing");
		formulationBox = new JComboBox(formulations);
		frame.getContentPane().add(formulationBox, "cell 1 3,growx");

		JLabel lblPackaging = new JLabel("Packaging");
		getFrame().getContentPane().add(lblPackaging, "cell 3 3,alignx right");

		JRadioButton packagingInSpec = new JRadioButton("In Spec");
		getFrame().getContentPane().add(packagingInSpec, "flowx,cell 4 3");
		packagingGroup.add(packagingInSpec);
		JLabel lblKnifeMovement = new JLabel("Knife Movement");
		getFrame().getContentPane().add(lblKnifeMovement,
				"cell 0 4,alignx right");

		JRadioButton knifeInSpec = new JRadioButton("In Spec");

		getFrame().getContentPane().add(knifeInSpec, "flowx,cell 1 4");

		// add all radio buttons to their groups
		knifeGroup.add(knifeInSpec);

		JLabel lblDieLines = new JLabel("Die Lines");
		getFrame().getContentPane().add(lblDieLines, "cell 3 4,alignx right");

		JRadioButton dieLinesNo = new JRadioButton("No");
		getFrame().getContentPane().add(dieLinesNo, "flowx,cell 4 4");
		dieLinesGroup.add(dieLinesNo);

		JLabel lblCenteredOnCore = new JLabel("Centered On Core");
		getFrame().getContentPane().add(lblCenteredOnCore,
				"cell 0 5,alignx right");

		JRadioButton centeredInSpec = new JRadioButton("In Spec");

		getFrame().getContentPane().add(centeredInSpec, "flowx,cell 1 5");
		coreGroup.add(centeredInSpec);

		JLabel lblWidth = new JLabel("Width");
		getFrame().getContentPane().add(lblWidth, "cell 3 5,alignx right");

		JRadioButton widthInSpec = new JRadioButton("In Spec");
		getFrame().getContentPane().add(widthInSpec, "flowx,cell 4 5");
		widthGroup.add(widthInSpec);

		JLabel lblCounter = new JLabel("Counter");
		getFrame().getContentPane().add(lblCounter, "cell 0 6,alignx right");

		JRadioButton counterInSpec = new JRadioButton("In Spec");
		getFrame().getContentPane().add(counterInSpec, "flowx,cell 1 6");
		counterGroup.add(counterInSpec);

		JLabel lblEdgeQuality = new JLabel("Edge Quality");
		getFrame().getContentPane()
				.add(lblEdgeQuality, "cell 3 6,alignx right");

		JRadioButton edgeInSpec = new JRadioButton("In Spec");
		getFrame().getContentPane().add(edgeInSpec, "flowx,cell 4 6");
		edgeQualityGroup.add(edgeInSpec);

		JLabel lblHardWrinkles = new JLabel("Hard Wrinkles");
		getFrame().getContentPane().add(lblHardWrinkles,
				"cell 0 7,alignx right");

		JRadioButton wrinklesInSpec = new JRadioButton("In Spec");
		getFrame().getContentPane().add(wrinklesInSpec, "flowx,cell 1 7");
		hardWrinklesGroup.add(wrinklesInSpec);

		JLabel lblBurn = new JLabel("Burn");
		getFrame().getContentPane().add(lblBurn, "cell 3 7,alignx right");

		JRadioButton burnInSpec = new JRadioButton("In Spec");
		getFrame().getContentPane().add(burnInSpec, "flowx,cell 4 7");
		burnGroup.add(burnInSpec);

		JLabel lblComments = new JLabel("Comments");
		getFrame().getContentPane().add(lblComments, "cell 0 8,alignx right");

		commentsArea = new JTextArea();
		getFrame().getContentPane().add(commentsArea, "cell 1 8 2 3,grow");

		JLabel lblWeight = new JLabel("Weight");
		getFrame().getContentPane().add(lblWeight, "cell 3 8,alignx right");

		JRadioButton weightInSpec = new JRadioButton("In Spec");
		getFrame().getContentPane().add(weightInSpec, "flowx,cell 4 8");
		weightGroup.add(weightInSpec);

		JPanel panel = new JPanel();
		getFrame().getContentPane().add(panel, "cell 0 11 4 1,grow");
		panel.setLayout(new MigLayout("", "[][][][][][][]", "[]"));

		JButton btnSaveAudit = new JButton("Save Audit");
		btnSaveAudit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (allFieldsFilled()) {
					insertAuditSQL();
					JOptionPane.showMessageDialog(null, "Audit submitted");
				} else
					JOptionPane.showMessageDialog(null, "No blanks permitted");
			}
		});
		panel.add(btnSaveAudit, "cell 0 0");

		JButton btnClearButtons = new JButton("Clear Buttons");
		btnClearButtons.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (ButtonGroup j : allButtons) {
					j.clearSelection();
					commentsArea.setText("");
					rollIdField.setText("");
					shiftComboBox.setSelectedIndex(0);
				}

			}
		});
		panel.add(btnClearButtons, "cell 3 0");

		JButton btnReturnToExtrusion = new JButton("Return to Extrusion");
		btnReturnToExtrusion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				arrExtrusion.qaWindow.getFrame().setVisible(false);
			}
		});
		panel.add(btnReturnToExtrusion, "cell 6 0");

		JRadioButton knifeOutOfSpec = new JRadioButton("Out of Spec");

		getFrame().getContentPane().add(knifeOutOfSpec, "cell 1 4");
		knifeGroup.add(knifeOutOfSpec);

		JRadioButton centeredOutOfSpec = new JRadioButton("Out of Spec");

		getFrame().getContentPane().add(centeredOutOfSpec, "cell 1 5");
		coreGroup.add(centeredOutOfSpec);

		JRadioButton counterOutOfSpec = new JRadioButton("Out of Spec");
		getFrame().getContentPane().add(counterOutOfSpec, "cell 1 6");
		counterGroup.add(counterOutOfSpec);

		JRadioButton wrinklesOutOfSpec = new JRadioButton("Out of Spec");
		getFrame().getContentPane().add(wrinklesOutOfSpec, "cell 1 7");
		hardWrinklesGroup.add(wrinklesOutOfSpec);

		JRadioButton packagingOutOfSpec = new JRadioButton("Out of Spec");
		getFrame().getContentPane().add(packagingOutOfSpec, "cell 4 3");
		packagingGroup.add(packagingOutOfSpec);

		JRadioButton dieLinesYes = new JRadioButton("Yes");
		getFrame().getContentPane().add(dieLinesYes, "cell 4 4");
		dieLinesGroup.add(dieLinesYes);

		JRadioButton widthOutOfSpec = new JRadioButton("Out of Spec");
		getFrame().getContentPane().add(widthOutOfSpec, "cell 4 5");
		widthGroup.add(widthOutOfSpec);

		JRadioButton edgeOutOfSpec = new JRadioButton("Out of Spec");
		getFrame().getContentPane().add(edgeOutOfSpec, "cell 4 6");
		edgeQualityGroup.add(edgeOutOfSpec);

		JRadioButton burnOutOfSpec = new JRadioButton("Out of Spec");
		getFrame().getContentPane().add(burnOutOfSpec, "cell 4 7");
		burnGroup.add(burnOutOfSpec);

		JRadioButton weightUnder = new JRadioButton("Under");
		getFrame().getContentPane().add(weightUnder, "cell 4 8");
		weightGroup.add(weightUnder);
		JRadioButton weightOver = new JRadioButton("Over");
		getFrame().getContentPane().add(weightOver, "cell 4 8");
		weightGroup.add(weightOver);
		// add all buttonGroups to an ArrayList for manipulation purposes
		allButtons.add(knifeGroup);
		allButtons.add(coreGroup);
		allButtons.add(counterGroup);
		allButtons.add(hardWrinklesGroup);
		allButtons.add(packagingGroup);
		allButtons.add(dieLinesGroup);
		allButtons.add(widthGroup);
		allButtons.add(edgeQualityGroup);
		allButtons.add(burnGroup);
		allButtons.add(weightGroup);

	}

	// insert data into arrQaAudit
	private void insertAuditSQL() {
		arrWeights.sqlConnection();
		String userName = usernameField.getText();
		String workStation = (String) workstationBox.getSelectedItem();
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		String dateTime = dateFormat.format(cal.getTime());
		String shift = (String) shiftComboBox.getSelectedItem();
		String workOrder = (String) workOrderField.getText();
		String formulation = (String) formulationBox.getSelectedItem();
		String rollID = rollIdField.getText();
		String knifeMovement = getSelectedButtonText(knifeGroup);
		String centeredOnCore = getSelectedButtonText(coreGroup);
		String counter = getSelectedButtonText(counterGroup);
		String hardWrinkles = getSelectedButtonText(hardWrinklesGroup);
		String packaging = getSelectedButtonText(packagingGroup);
		String dieLines = getSelectedButtonText(dieLinesGroup);
		String width = getSelectedButtonText(widthGroup);
		String edgeQuality = getSelectedButtonText(edgeQualityGroup);
		String burn = getSelectedButtonText(burnGroup);
		String weight = getSelectedButtonText(weightGroup);
		String comments = commentsArea.getText();

		try {
			CallableStatement cs = null;
			cs = arrWeights.conn
					.prepareCall("{call InsertArrQaAudit(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
			cs.setString(1, userName);
			cs.setString(2, workStation);
			cs.setString(3, dateTime);
			cs.setString(4, shift);
			cs.setString(5, formulation);
			cs.setString(6, workOrder);
			cs.setString(7, rollID);
			cs.setString(8, knifeMovement);
			cs.setString(9, centeredOnCore);
			cs.setString(10, counter);
			cs.setString(11, hardWrinkles);
			cs.setString(12, packaging);
			cs.setString(13, dieLines);
			cs.setString(14, width);
			cs.setString(15, edgeQuality);
			cs.setString(16, burn);
			cs.setString(17, weight);
			cs.setString(18, comments);
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

	public static String getSelectedButtonText(ButtonGroup buttonGroup) {
		for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons
				.hasMoreElements();) {
			AbstractButton button = buttons.nextElement();
			if (button.isSelected()) {
				return button.getText();
			}
		}

		return null;
	}

	public Boolean allFieldsFilled() {
		for (ButtonGroup b : allButtons) {
			if (b.getSelection() == null)
				return false;
		}
		if (rollIdField.getText().equals(""))
			return false;
		if (shiftComboBox.getSelectedItem().equals(""))
			return false;
		return true;
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

}
