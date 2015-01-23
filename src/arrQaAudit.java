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
	private JTextField workStationField;
	private JTextField shiftDateField;
	private JComboBox shiftComboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					arrQaAudit window = new arrQaAudit();
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
	public arrQaAudit() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Product Quality Audit");
		frame.setBounds(100, 100, 628, 384);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(
				new MigLayout("", "[][][][][]",
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
		frame.getContentPane().add(lblUsername, "cell 0 0,alignx right");

		usernameField = new JTextField();
		frame.getContentPane().add(usernameField, "cell 1 0 2 1,growx");
		usernameField.setColumns(10);

		JLabel lblWorkStation = new JLabel("Work Station");
		frame.getContentPane().add(lblWorkStation, "cell 3 0,alignx right");

		workStationField = new JTextField();
		frame.getContentPane().add(workStationField, "cell 4 0,growx");
		workStationField.setColumns(10);

		JLabel lblShiftDate = new JLabel("Date & Time");
		frame.getContentPane().add(lblShiftDate, "cell 0 1,alignx trailing");

		shiftDateField = new JTextField();
		frame.getContentPane().add(shiftDateField, "cell 1 1 2 1,growx");
		shiftDateField.setColumns(10);
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		String dateTime = dateFormat.format(cal.getTime());
		shiftDateField.setText(dateTime);
		shiftDateField.setEditable(false);

		JLabel lblShift = new JLabel("Shift");
		frame.getContentPane().add(lblShift, "cell 3 1,alignx trailing");
		String[] shifts = { "", "A", "B", "C", "D" };
		shiftComboBox = new JComboBox(shifts);
		frame.getContentPane().add(shiftComboBox, "cell 4 1,growx");
		JLabel lblKnifeMovement = new JLabel("Knife Movement");
		frame.getContentPane().add(lblKnifeMovement, "cell 0 2,alignx right");

		JRadioButton knifeInSpec = new JRadioButton("In Spec");

		frame.getContentPane().add(knifeInSpec, "flowx,cell 1 2");

		JRadioButton knifeOutOfSpec = new JRadioButton("Out of Spec");

		frame.getContentPane().add(knifeOutOfSpec, "cell 1 2");

		JLabel lblRollId = new JLabel("Roll ID");
		frame.getContentPane().add(lblRollId, "cell 3 2,alignx right");

		rollIdField = new JTextField();
		frame.getContentPane().add(rollIdField, "cell 4 2,growx");
		rollIdField.setColumns(10);

		JLabel lblCenteredOnCore = new JLabel("Centered On Core");
		frame.getContentPane().add(lblCenteredOnCore, "cell 0 3,alignx right");

		JRadioButton centeredInSpec = new JRadioButton("In Spec");

		frame.getContentPane().add(centeredInSpec, "flowx,cell 1 3");

		JRadioButton centeredOutOfSpec = new JRadioButton("Out of Spec");

		frame.getContentPane().add(centeredOutOfSpec, "cell 1 3");

		JLabel lblWidth = new JLabel("Width");
		frame.getContentPane().add(lblWidth, "cell 3 3,alignx right");

		JRadioButton widthInSpec = new JRadioButton("In Spec");
		frame.getContentPane().add(widthInSpec, "flowx,cell 4 3");

		JLabel lblCounter = new JLabel("Counter");
		frame.getContentPane().add(lblCounter, "cell 0 4,alignx right");

		JRadioButton counterInSpec = new JRadioButton("In Spec");
		frame.getContentPane().add(counterInSpec, "flowx,cell 1 4");

		JLabel lblEdgeQuality = new JLabel("Edge Quality");
		frame.getContentPane().add(lblEdgeQuality, "cell 3 4,alignx right");

		JRadioButton edgeInSpec = new JRadioButton("In Spec");
		frame.getContentPane().add(edgeInSpec, "flowx,cell 4 4");

		JLabel lblHardWrinkles = new JLabel("Hard Wrinkles");
		frame.getContentPane().add(lblHardWrinkles, "cell 0 5,alignx right");

		JRadioButton wrinklesInSpec = new JRadioButton("In Spec");
		frame.getContentPane().add(wrinklesInSpec, "flowx,cell 1 5");

		JLabel lblBurn = new JLabel("Burn");
		frame.getContentPane().add(lblBurn, "cell 3 5,alignx right");

		JRadioButton burnInSpec = new JRadioButton("In Spec");
		frame.getContentPane().add(burnInSpec, "flowx,cell 4 5");

		JLabel lblPackaging = new JLabel("Packaging");
		frame.getContentPane().add(lblPackaging, "cell 0 6,alignx right");

		JRadioButton packagingInSpec = new JRadioButton("In Spec");
		frame.getContentPane().add(packagingInSpec, "flowx,cell 1 6");

		JLabel lblWeight = new JLabel("Weight");
		frame.getContentPane().add(lblWeight, "cell 3 6,alignx right");

		JRadioButton weightInSpec = new JRadioButton("In Spec");
		frame.getContentPane().add(weightInSpec, "flowx,cell 4 6");

		JLabel lblDieLines = new JLabel("Die Lines");
		frame.getContentPane().add(lblDieLines, "cell 0 7,alignx right");

		JRadioButton dieLinesNo = new JRadioButton("No");
		frame.getContentPane().add(dieLinesNo, "flowx,cell 1 7");

		JLabel lblComments = new JLabel("Comments");
		frame.getContentPane().add(lblComments, "cell 0 8,alignx right");

		commentsArea = new JTextArea();
		frame.getContentPane().add(commentsArea, "cell 1 8 2 3,grow");

		JRadioButton widthOutOfSpec = new JRadioButton("Out of Spec");
		frame.getContentPane().add(widthOutOfSpec, "cell 4 3");

		JRadioButton edgeOutOfSpec = new JRadioButton("Out of Spec");
		frame.getContentPane().add(edgeOutOfSpec, "cell 4 4");

		JRadioButton burnOutOfSpec = new JRadioButton("Out of Spec");
		frame.getContentPane().add(burnOutOfSpec, "cell 4 5");

		JRadioButton weightUnder = new JRadioButton("Under");
		frame.getContentPane().add(weightUnder, "cell 4 6");

		JRadioButton counterOutOfSpec = new JRadioButton("Out of Spec");
		frame.getContentPane().add(counterOutOfSpec, "cell 1 4");

		JRadioButton wrinklesOutOfSpec = new JRadioButton("Out of Spec");
		frame.getContentPane().add(wrinklesOutOfSpec, "cell 1 5");

		JRadioButton packagingOutOfSpec = new JRadioButton("Out of Spec");
		frame.getContentPane().add(packagingOutOfSpec, "cell 1 6");

		JRadioButton dieLinesYes = new JRadioButton("Yes");
		frame.getContentPane().add(dieLinesYes, "cell 1 7");

		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, "cell 0 11 4 1,grow");
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
		panel.add(btnReturnToExtrusion, "cell 6 0");

		// add all radio buttons to their groups
		knifeGroup.add(knifeInSpec);
		knifeGroup.add(knifeOutOfSpec);
		coreGroup.add(centeredInSpec);
		coreGroup.add(centeredOutOfSpec);
		counterGroup.add(counterInSpec);
		counterGroup.add(counterOutOfSpec);
		hardWrinklesGroup.add(wrinklesInSpec);
		hardWrinklesGroup.add(wrinklesOutOfSpec);
		packagingGroup.add(packagingInSpec);
		packagingGroup.add(packagingOutOfSpec);
		dieLinesGroup.add(dieLinesNo);
		dieLinesGroup.add(dieLinesYes);
		widthGroup.add(widthInSpec);
		widthGroup.add(widthOutOfSpec);
		edgeQualityGroup.add(edgeInSpec);
		edgeQualityGroup.add(edgeOutOfSpec);
		burnGroup.add(burnInSpec);
		burnGroup.add(burnOutOfSpec);
		weightGroup.add(weightInSpec);
		weightGroup.add(weightUnder);
		JRadioButton weightOver = new JRadioButton("Over");
		frame.getContentPane().add(weightOver, "cell 4 6");
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
		weights.sqlConnection();
		String userName = usernameField.getText();
		String workStation = workStationField.getText();
		String dateTime = shiftDateField.getText();
		String shift = (String) shiftComboBox.getSelectedItem();
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
			cs = weights.conn
					.prepareCall("{call InsertArrQaAudit(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
			cs.setString(1, userName);
			cs.setString(2, workStation);
			cs.setString(3, dateTime);
			cs.setString(4, shift);
			cs.setString(5, rollID);
			cs.setString(6, knifeMovement);
			cs.setString(7, centeredOnCore);
			cs.setString(8, counter);
			cs.setString(9, hardWrinkles);
			cs.setString(10, packaging);
			cs.setString(11, dieLines);
			cs.setString(12, width);
			cs.setString(13, edgeQuality);
			cs.setString(14, burn);
			cs.setString(15, weight);
			cs.setString(16, comments);
			cs.execute();
			cs.close();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		} finally {
			try {
				if (weights.conn != null)
					weights.conn.close();
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
}
