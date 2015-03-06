package Arr;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;

import net.miginfocom.swing.MigLayout;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class arrHousekeeping {

	private JFrame frame;
	private JTextField workstationField;
	private JTextField shiftField;
	private JTextField dateField;
	private ArrayList<JCheckBox> list;
	private JCheckBox boxSweepTableFloor;
	private JCheckBox boxGuardHopperLid;
	private JCheckBox boxGuardExtruderRight;
	private JCheckBox boxGuardExtruderLeft;
	private JCheckBox boxContainmentDoors;
	private JCheckBox boxGrinderChute;
	private JCheckBox boxGrinderLatch;
	private JCheckBox boxGrinderDoor;
	private JCheckBox boxWinderRightFront;
	private JCheckBox boxWinderRightRear;
	private JCheckBox boxWinderLeftFront;
	private JCheckBox boxWinderLeftRear;
	private JCheckBox boxCleanTroughTake;
	private JCheckBox boxScrapCoreInspection;
	private JCheckBox boxNo;
	private JCheckBox boxYes;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					arrHousekeeping window = new arrHousekeeping();
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
	public arrHousekeeping() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setFrame(new JFrame("Extrusion Checklist"));
		getFrame().setBounds(100, 100, 531, 444);
		getFrame().setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getFrame().getContentPane().setLayout(
				new MigLayout("", "[266.00,grow][grow]",
						"[][][][][][][][][grow][]"));
		list = new ArrayList<JCheckBox>();
		JPanel panel_2 = new JPanel();
		getFrame().getContentPane().add(panel_2, "cell 0 0 2 1,growx");
		panel_2.setLayout(new MigLayout("", "[][][][][][]", "[][]"));

		JLabel lblWorkstation = new JLabel("Workstation");
		panel_2.add(lblWorkstation, "cell 0 0,alignx trailing");

		workstationField = new JTextField();
		panel_2.add(workstationField, "cell 1 0");
		workstationField.setColumns(10);

		JLabel lblShift = new JLabel("Shift");
		panel_2.add(lblShift, "cell 2 0,alignx trailing");

		shiftField = new JTextField();
		panel_2.add(shiftField, "cell 3 0");
		shiftField.setColumns(10);

		JLabel lblDate = new JLabel("Date");
		panel_2.add(lblDate, "cell 4 0,alignx trailing");

		dateField = new JTextField();
		panel_2.add(dateField, "cell 5 0");
		dateField.setColumns(10);

		JPanel housekeepingChecklistPanel = new JPanel();
		getFrame().getContentPane().add(housekeepingChecklistPanel,
				"flowx,cell 0 1,growx");
		JLabel lblhousekeepingChecklist = new JLabel(
				"*** Housekeeping Checklist ***");
		housekeepingChecklistPanel.add(lblhousekeepingChecklist);
		housekeepingChecklistPanel.setBackground(Color.BLACK);

		JPanel dailyMachinePanel = new JPanel();
		getFrame().getContentPane().add(dailyMachinePanel, "cell 1 1,growx");

		JLabel lblDailyMachine = new JLabel(
				"*** Daily Machine Guarding Checklist ***");
		dailyMachinePanel.add(lblDailyMachine);
		dailyMachinePanel.setBackground(Color.BLACK);
		lblDailyMachine.setForeground(Color.WHITE);
		boxSweepTableFloor = new JCheckBox("Sweep Table Floor Around Mixer");
		list.add(boxSweepTableFloor);
		getFrame().getContentPane().add(boxSweepTableFloor, "cell 0 2");
		lblhousekeepingChecklist.setForeground(Color.WHITE);

		JPanel panel_1 = new JPanel();
		getFrame().getContentPane().add(panel_1, "cell 1 2 1 8,grow");
		panel_1.setLayout(new MigLayout("", "[]", "[][][][][][][][][][][]"));

		boxGuardHopperLid = new JCheckBox("Guard Hopper Lid");
		list.add(boxGuardHopperLid);
		panel_1.add(boxGuardHopperLid, "cell 0 0");

		boxGuardExtruderRight = new JCheckBox("Guard Extruder Right");
		list.add(boxGuardExtruderRight);
		panel_1.add(boxGuardExtruderRight, "cell 0 1,growx");

		boxGuardExtruderLeft = new JCheckBox("Guard Extruder Left");
		panel_1.add(boxGuardExtruderLeft, "cell 0 2");
		list.add(boxGuardExtruderLeft);

		boxContainmentDoors = new JCheckBox("Containment Doors");
		list.add(boxContainmentDoors);
		panel_1.add(boxContainmentDoors, "cell 0 3");

		boxGrinderChute = new JCheckBox("Grinder Chute");
		list.add(boxGrinderChute);
		panel_1.add(boxGrinderChute, "cell 0 4");

		boxGrinderLatch = new JCheckBox("Grinder Latch");
		list.add(boxGrinderLatch);
		panel_1.add(boxGrinderLatch, "cell 0 5");

		boxGrinderDoor = new JCheckBox("Grinder Door");
		list.add(boxGrinderDoor);
		panel_1.add(boxGrinderDoor, "cell 0 6");

		boxWinderRightFront = new JCheckBox("Winder Right Front");
		list.add(boxWinderRightFront);
		panel_1.add(boxWinderRightFront, "cell 0 7");

		boxWinderRightRear = new JCheckBox("Winder Right Rear");
		list.add(boxWinderRightRear);
		panel_1.add(boxWinderRightRear, "cell 0 8");

		boxWinderLeftFront = new JCheckBox("Winder Left Front");
		list.add(boxWinderLeftFront);
		panel_1.add(boxWinderLeftFront, "cell 0 9");

		boxWinderLeftRear = new JCheckBox("Winder Left Rear");
		list.add(boxWinderLeftRear);
		panel_1.add(boxWinderLeftRear, "cell 0 10");
		boxCleanTroughTake = new JCheckBox(
				"Clean Trough Take Up Area with Air Nozzle");
		list.add(boxCleanTroughTake);
		getFrame().getContentPane().add(boxCleanTroughTake, "cell 0 3");

		boxScrapCoreInspection = new JCheckBox("Scrap Core Inspection");
		list.add(boxScrapCoreInspection);
		getFrame().getContentPane().add(boxScrapCoreInspection, "cell 0 4");

		JPanel panel = new JPanel();
		getFrame().getContentPane().add(panel, "flowx,cell 0 5 1 4,growy");
		panel.setLayout(new MigLayout("", "[][][]", "[][][]"));

		JPanel scrapUsagePanel = new JPanel();
		panel.add(scrapUsagePanel, "cell 0 0 3 1,growx");

		JLabel lblScrapUsage = new JLabel("*** Scrap Usage ***");
		scrapUsagePanel.add(lblScrapUsage);
		scrapUsagePanel.setBackground(Color.BLACK);
		lblScrapUsage.setForeground(Color.WHITE);

		boxNo = new JCheckBox("No");
		list.add(boxNo);
		panel.add(boxNo, "cell 2 1");

		JLabel lblverifyTheType = new JLabel(
				"<html>Verify the Type and Quality of scrap usage is being logged on Regrind Usage Forms.</html>");
		panel.add(lblverifyTheType, "cell 0 1 1 2");

		boxYes = new JCheckBox("Yes");
		list.add(boxYes);
		panel.add(boxYes, "cell 2 2");

		JPanel panel_3 = new JPanel();
		getFrame().getContentPane().add(panel_3, "cell 0 9");

		JButton btnAbortChanges = new JButton("Abort Changes");
		btnAbortChanges.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_3.add(btnAbortChanges);

		JButton btnSaveInformation = new JButton("Save Information");
		btnSaveInformation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				insertHousekeepingSQL();
				JOptionPane.showMessageDialog(null, "Checklist submitted");
			}

		});
		panel_3.add(btnSaveInformation);
	}

	private void insertHousekeepingSQL() {
		arrWeights.sqlConnection();
		String workStation = workstationField.getText();
		String shift = shiftField.getText();
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		String dateTime = dateFormat.format(cal.getTime());
		int sweepMixer = isChecked(boxSweepTableFloor);
		int cleanTrough = isChecked(boxCleanTroughTake);
		int scrapCoreInspection = isChecked(boxScrapCoreInspection);
		int scrapUsageVerify = 0;
		if (isChecked(boxYes) == 1)
			scrapUsageVerify = 1;
		else if (isChecked(boxNo) == 1)
			scrapUsageVerify = 0;
		int guardHopperLid = isChecked(boxGuardHopperLid);
		int guardExtruderRight = isChecked(boxGuardExtruderRight);
		int guardExtruderLeft = isChecked(boxGuardExtruderLeft);
		int containmentDoors = isChecked(boxContainmentDoors);
		int grinderChute = isChecked(boxGrinderChute);
		int grinderLatch = isChecked(boxGrinderLatch);
		int grinderDoor = isChecked(boxGrinderDoor);
		int winderRightFront = isChecked(boxWinderRightFront);
		int winderRightRear = isChecked(boxWinderRightRear);
		int winderLeftFront = isChecked(boxWinderLeftFront);
		int winderLeftRear = isChecked(boxWinderLeftRear);
		try {
			CallableStatement cs = null;
			cs = arrWeights.conn
					.prepareCall("{call InsertArrHousekeeping(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
			cs.setString(1, workStation);
			cs.setString(2, shift);
			cs.setString(3, dateTime);
			cs.setInt(4, sweepMixer);
			cs.setInt(5, cleanTrough);
			cs.setInt(6, scrapCoreInspection);
			cs.setInt(7, scrapUsageVerify);
			cs.setInt(8, guardHopperLid);
			cs.setInt(9, guardExtruderRight);
			cs.setInt(10, guardExtruderLeft);
			cs.setInt(11, containmentDoors);
			cs.setInt(12, grinderChute);
			cs.setInt(13, grinderLatch);
			cs.setInt(14, grinderDoor);
			cs.setInt(15, winderRightFront);
			cs.setInt(16, winderRightRear);
			cs.setInt(17, winderLeftFront);
			cs.setInt(18, winderLeftRear);
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

	private static int isChecked(JCheckBox j) {
		if (j.isSelected())
			return 1;
		return 0;

	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
}
