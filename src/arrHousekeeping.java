import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;

import net.miginfocom.swing.MigLayout;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class arrHousekeeping {

	private JFrame frame;
	private JTextField workstationField;
	private JTextField shiftField;
	private JTextField dateField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					arrHousekeeping window = new arrHousekeeping();
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
	public arrHousekeeping() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Extrusion Checklist");
		frame.setBounds(100, 100, 531, 444);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(
				new MigLayout("", "[266.00,grow][grow]", "[][][][][][][][][grow][]"));
		
		JPanel panel_2 = new JPanel();
		frame.getContentPane().add(panel_2, "cell 0 0 2 1,growx");
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
		frame.getContentPane().add(housekeepingChecklistPanel, "flowx,cell 0 1,growx");
		JLabel lblhousekeepingChecklist = new JLabel(
				"*** Housekeeping Checklist ***");
		housekeepingChecklistPanel.add(lblhousekeepingChecklist);
		housekeepingChecklistPanel.setBackground(Color.BLACK);
		
		JPanel dailyMachinePanel = new JPanel();
		frame.getContentPane().add(dailyMachinePanel, "cell 1 1,growx");
		
		JLabel lblDailyMachine = new JLabel("*** Daily Machine Guarding Checklist ***");
		dailyMachinePanel.add(lblDailyMachine);
		dailyMachinePanel.setBackground(Color.BLACK);
		lblDailyMachine.setForeground(Color.WHITE);
		JCheckBox chckbxSweepTableFloor = new JCheckBox(
				"Sweep Table Floor Around Mixer");
		frame.getContentPane().add(chckbxSweepTableFloor, "cell 0 2");
		lblhousekeepingChecklist.setForeground(Color.WHITE);
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, "cell 1 2 1 8,grow");
		panel_1.setLayout(new MigLayout("", "[]", "[][][][][][][][][][][]"));
		
		JCheckBox chckbxGuardHopperLid = new JCheckBox("Guard Hopper Lid");
		panel_1.add(chckbxGuardHopperLid, "cell 0 0");
		
		JCheckBox chckbxGuardExtruderRight = new JCheckBox("Guard Extruder Right");
		panel_1.add(chckbxGuardExtruderRight, "cell 0 1,growx");
		
		JCheckBox chckbxGuardExtruderLeft = new JCheckBox("Guard Extruder Left");
		panel_1.add(chckbxGuardExtruderLeft, "cell 0 2");
		
		JCheckBox chckbxContainmentDoors = new JCheckBox("Containment Doors");
		panel_1.add(chckbxContainmentDoors, "cell 0 3");
		
		JCheckBox chckbxGrinderChute = new JCheckBox("Grinder Chute");
		panel_1.add(chckbxGrinderChute, "cell 0 4");
		
		JCheckBox chckbxGrinderLatch = new JCheckBox("Grinder Latch");
		panel_1.add(chckbxGrinderLatch, "cell 0 5");
		
		JCheckBox chckbxGrinderDoor = new JCheckBox("Grinder Door");
		panel_1.add(chckbxGrinderDoor, "cell 0 6");
		
		JCheckBox chckbxWinderRightFront = new JCheckBox("Winder Right Front");
		panel_1.add(chckbxWinderRightFront, "cell 0 7");
		
		JCheckBox chckbxWinderRightRear = new JCheckBox("Winder Right Rear");
		panel_1.add(chckbxWinderRightRear, "cell 0 8");
		
		JCheckBox chckbxWinderLeftFront = new JCheckBox("Winder Left Front");
		panel_1.add(chckbxWinderLeftFront, "cell 0 9");
		
		JCheckBox chckbxWinderLeftRear = new JCheckBox("Winder Left Rear");
		panel_1.add(chckbxWinderLeftRear, "cell 0 10");
		JCheckBox chckbxCleanTroughTake = new JCheckBox(
				"Clean Trough Take Up Area with Air Nozzle");
		frame.getContentPane().add(chckbxCleanTroughTake, "cell 0 3");

		JCheckBox chckbxScrapCoreInspection = new JCheckBox(
				"Scrap Core Inspection");
		frame.getContentPane().add(chckbxScrapCoreInspection, "cell 0 4");
		
		JPanel processChecklistPanel = new JPanel();
		frame.getContentPane().add(processChecklistPanel, "flowx,cell 0 5,growx");
		processChecklistPanel.setBackground(Color.BLACK);
		JLabel lblProcessChecklist = new JLabel("*** Process Checklist ***");
		lblProcessChecklist.setForeground(Color.WHITE);
		processChecklistPanel.add(lblProcessChecklist);
		JCheckBox checkBox = new JCheckBox("Extruder Water Screens Cleaned");
		frame.getContentPane().add(checkBox, "cell 0 6,aligny top");
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, "flowx,cell 0 7 1 2,aligny bottom");
		panel.setLayout(new MigLayout("", "[][][]", "[][][]"));
		
		JPanel scrapUsagePanel = new JPanel();
		panel.add(scrapUsagePanel, "cell 0 0 3 1,growx");
		
				JLabel lblScrapUsage = new JLabel("*** Scrap Usage ***");
				scrapUsagePanel.add(lblScrapUsage);
				scrapUsagePanel.setBackground(Color.BLACK);
				lblScrapUsage.setForeground(Color.WHITE);
		
		JCheckBox chckbxNo = new JCheckBox("No");
		panel.add(chckbxNo, "cell 2 1");
		
		JLabel lblverifyTheType = new JLabel("<html>Verify the Type and Quality of scrap usage is being logged on Regrind Usage Forms.</html>");
		panel.add(lblverifyTheType, "cell 0 1 1 2");
		
		JCheckBox chckbxYes = new JCheckBox("Yes");
		panel.add(chckbxYes, "cell 2 2");
		
		JPanel panel_3 = new JPanel();
		frame.getContentPane().add(panel_3, "cell 0 9");
		
		JButton btnAbortChanges = new JButton("Abort Changes");
		btnAbortChanges.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_3.add(btnAbortChanges);
		
		JButton btnSaveInformation = new JButton("Save Information");
		panel_3.add(btnSaveInformation);
	}

}
