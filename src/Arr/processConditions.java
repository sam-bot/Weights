package Arr;

import java.awt.EventQueue;

import javax.swing.JFrame;

import net.miginfocom.swing.MigLayout;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPanel;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

import javax.swing.JTextArea;

import java.awt.Insets;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import javax.swing.JSeparator;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.IOException;

import javax.swing.JComboBox;
import javax.swing.JTabbedPane;

public class processConditions {

	private JFrame frame;
	private JTextField gaugeField;
	private JTextField formulaField;
	private JTextField piwField;
	private JTextField primeNipSpeedField;
	private JLabel lblndNipSpeed;
	private JTextField secondNipSpeedField;
	private JLabel lblPrimeWinderSpeed;
	private JLabel lblndWinderSpeed;
	private JLabel lblScrewSpeed;
	private JTextField primeWinderSpeedField;
	private JTextField secondWinderSpeedField;
	private JTextField screwSpeedField;
	private JLabel lblRbTemp;
	private JTextField rbTempField;
	private JLabel lblScreenPack;
	private JTextField screenPackField;
	private JLabel lblExtruderAmps;
	private JTextField extruderAmpsField;
	private JLabel lblExtruderPsi;
	private JTextField extruderPSIField;
	private JLabel lblScrap;
	private JTextField scrapField;
	private JLabel lblAirRingSpeed;
	private JTextField airRingSpeedField;
	private JLabel lblAirRingTemp;
	private JTextField airRingTempField;
	private JLabel lblWinderNipRoll;
	private JTextField winderNipRollField;
	private JLabel lblMixDropTemp;
	private JTextField mixDropTempField;
	private JLabel lblPlenumTemp;
	private JTextField plenumTempField;
	private JLabel lblPlenumSpeed;
	private JTextField plenumSpeedField;
	private JLabel lblAirRingGap;
	private JTextField airRingGapField;
	private JLabel lblTrimPullerSpeed;
	private JTextField trimPullerSpeedField;
	private JLabel lblFeedValves;
	private JTextField feedValvesField;
	private JLabel lblDoors;
	private JTextField doorsField;
	private JLabel lblFeedValvesOpen;
	private JTextField feedValvesOpenPercentField;
	private JLabel lblSetting;
	private JLabel lblActual;
	private JLabel lblZone;
	private JLabel lblZone_1;
	private JLabel lblZone_2;
	private JLabel lblZone_3;
	private JLabel lblZone_4;
	private JLabel lblZone_5;
	private JLabel lblZonea;
	private JLabel lblZoneb;
	private JLabel lblZonec;
	private JLabel lblZone_6;
	private JLabel lblZone_7;
	private JLabel lblZone_8;
	private JTextField zone1SetField;
	private JTextField zone1ActField;
	private JTextField zone2SetField;
	private JTextField zone2ActField;
	private JTextField zone3SetField;
	private JTextField zone3ActField;
	private JTextField zone4SetField;
	private JTextField zone4ActField;
	private JTextField zone5SetField;
	private JTextField zone5ActField;
	private JTextField zone6SetField;
	private JTextField zone6ActField;
	private JTextField zone7ASetField;
	private JTextField zone7AActField;
	private JTextField zone7BSetField;
	private JTextField zone7BActField;
	private JTextField zone7CSetField;
	private JTextField zone7CActField;
	private JTextField zone8SetField;
	private JTextField zone8ActField;
	private JTextField zone9SetField;
	private JTextField zone9ActField;
	private JTextField zone10SetField;
	private JTextField zone10ActField;
	private JPanel panel_1;
	private JLabel lblCoreOutDiameter;
	private JLabel lblCoreOutDiameter_1;
	private JTextField coreOutDiameterPrimaryField;
	private JTextField coreOutDiameterSecondaryField;
	private JLabel lblRollLengthPrimary;
	private JLabel lblEndRollWarning;
	private JLabel lblEndRollTransfer;
	private JLabel lblForceSetPoint;
	private JLabel lblDrumToNip;
	private JTextField rollLengthPrimaryField;
	private JTextField endRollWarningPrimaryField;
	private JTextField endRollTransferPrimaryField;
	private JTextField forceSetPointPrimaryField;
	private JTextField drumtoNipTrimPrimaryField;
	private JLabel lblRollLengthPrimary_1;
	private JTextField rollLengthPrimarySecondaryField;
	private JLabel lblEndRollWarning_1;
	private JTextField endRollWarningSecondaryField;
	private JLabel lblEndRollTransfer_1;
	private JTextField endRollTransferSecondaryField;
	private JLabel lblForceSetPoint_1;
	private JTextField forceSetPointSecondaryField;
	private JLabel lblDrumToNip_1;
	private JTextField drumToNipTrimSecondaryField;
	private JButton btnSubmit;
	private JLabel label;
	private JTextField shiftDateField;
	private JLabel label_1;
	private JTextField shiftField;
	private JLabel label_2;
	private JTextField operatorField;
	private JLabel label_3;
	private JTextField feetPerRollField;
	private JLabel label_4;
	private JTextField tableSpeedField;
	private JLabel label_5;
	private JTextField dieNumberField;
	private JLabel label_6;
	private JTextField stretchField;
	private JLabel label_7;
	private JTextField drumTempField;
	private JLabel label_8;
	private JTextField pinchRollTempField;
	private JLabel label_9;
	private JTextField tempoField;
	private JLabel label_10;
	private JTextField threePField;
	private JLabel label_11;
	private JTextField drumNipField;
	private JLabel label_12;
	private JTextField horizontalApplyField;
	private JLabel label_13;
	private JTextField inflateAirShaftField;
	private JLabel label_14;
	private JTextField winderNipSpeedField;
	private JLabel label_15;
	private JTextField collapsingShieldSpeedField;
	private JLabel label_16;
	private JTextField trimLeftMeasureField;
	private JLabel label_17;
	private JTextField trimRightMeasureField;
	private JLabel label_18;
	private JTextField curtainLinksField;
	private JLabel label_19;
	private JTextField fingerAdjustLeftField;
	private JLabel label_20;
	private JTextField fingerAdjustRightField;
	private JLabel label_21;
	private JTextField mandrelAirPressureField;
	private JLabel label_22;
	private JTextField zone0SetField;
	private JTextField zone0ActField;
	private JLabel label_23;
	private JTextField zone11SetField;
	private JTextField zone11ActField;
	private JTextField zone12SetField;
	private JTextField zone12ActField;
	private JTextField zone13SetField;
	private JTextField zone13ActField;
	private JTextField zoneB1SetField;
	private JTextField zoneB1ActField;
	private JTextField zoneB2SetField;
	private JTextField zoneB2ActField;
	private JTextField hotRoll1SetField;
	private JTextField hotRoll1ActField;
	private JTextField hotRoll2SetField;
	private JTextField hotRoll2ActField;
	private JTextField chillRollSetField;
	private JTextField chillRollActField;
	private JLabel label_24;
	private JLabel label_25;
	private JLabel label_26;
	private JLabel label_27;
	private JLabel label_28;
	private JLabel label_29;
	private JLabel label_30;
	private JLabel label_32;
	private JTextField jNumberField;
	private JComboBox<String> workStationComboBox;
	private JLabel lblPrimeNipSpeed;
	private JLabel label_31;
	private JTextField zone7SetField;
	private JTextField zone7ActField;
	private ArrayList<JTextField> list;
	private JLabel label_33;
	private JTextField collapsingShieldTempField;
	private JLabel label_34;
	private JLabel label_35;
	private JLabel label_37;
	private JTextField workOrder1Field;
	private JTextField workOrder2Field;
	private JTextField workOrder3Field;
	private JLabel label_36;
	private JTextField workOrder4Field;
	private JPanel panel_2;
	private JTabbedPane tabbedPane;
	private JPanel panel_3;
	private JPanel panel_4;
	private JPanel panel;
	private JLabel label_38;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					processConditions window = new processConditions("sRenick");
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
	public processConditions(String operator) {
		initialize(operator);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String operator) {
		setFrame(new JFrame("Standard Operating Conditions"));
		getFrame().setBounds(100, 1, 1014, 742);
		getFrame().setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getFrame()
				.getContentPane()
				.setLayout(
						new MigLayout("", "[grow][grow][grow][grow][grow][grow][grow][grow][grow][grow][][grow]", "[][25px:n][grow][][][][][25px:n][][][][][25px:n][][25px:n][]"));

		panel_2 = new JPanel();
		list = new ArrayList<JTextField>();
		getFrame().getContentPane().add(panel_2,
				"flowx,cell 0 0 12 1,alignx right");
		panel_2.setLayout(new MigLayout(
				"",
				"[grow][grow][grow][grow][grow][grow][grow][grow][grow][][][][][grow]",
				"[][]"));

		label = new JLabel("Shift Date");
		panel_2.add(label, "cell 0 0,alignx right");
		shiftDateField = new JTextField();
		panel_2.add(shiftDateField, "cell 1 0");
		shiftDateField.setColumns(10);
		list.add(shiftDateField);

		label_1 = new JLabel("Shift");
		panel_2.add(label_1, "cell 2 0,alignx right");

		shiftField = new JTextField();
		panel_2.add(shiftField, "flowx,cell 3 0");
		shiftField.setColumns(10);
		list.add(shiftField);

		JLabel lblWorkStation = new JLabel("Work Station");
		panel_2.add(lblWorkStation, "cell 4 0,alignx right");
		String[] lines = { "", "FEX340001", "FEX340002", "FEX340003",
				"FEX340004", "FEX340006", "FEX340007", "FEX340008" };
		workStationComboBox = new JComboBox(lines);
		panel_2.add(workStationComboBox, "cell 5 0");
		workStationComboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selected = (String) workStationComboBox
						.getSelectedItem();
				selectLine(selected);
			}

			// adjust UI textfields that are available based on Work Station
			// selected
			private void selectLine(String line) {
				setAllVisible();
				if (line.equals("FEX340001")) {
					primeNipSpeedField.setVisible(false);
					secondNipSpeedField.setVisible(false);
					primeWinderSpeedField.setVisible(false);
					secondWinderSpeedField.setVisible(false);
					drumTempField.setVisible(false);
					pinchRollTempField.setVisible(false);
					mixDropTempField.setVisible(false);
					plenumSpeedField.setVisible(false);
					trimLeftMeasureField.setVisible(false);
					trimRightMeasureField.setVisible(false);
					curtainLinksField.setVisible(false);
					fingerAdjustLeftField.setVisible(false);
					fingerAdjustRightField.setVisible(false);
					mandrelAirPressureField.setVisible(false);
					feedValvesField.setVisible(false);
					doorsField.setVisible(false);
					feedValvesOpenPercentField.setVisible(false);
					zone7ASetField.setVisible(false);
					zone7AActField.setVisible(false);
					zone7BSetField.setVisible(false);
					zone7BActField.setVisible(false);
					zone7CSetField.setVisible(false);
					zone7CActField.setVisible(false);
					zone10SetField.setVisible(false);
					zone10ActField.setVisible(false);
					coreOutDiameterPrimaryField.setVisible(false);
					coreOutDiameterSecondaryField.setVisible(false);
					rollLengthPrimaryField.setVisible(false);
					endRollWarningPrimaryField.setVisible(false);
					endRollTransferPrimaryField.setVisible(false);
					forceSetPointPrimaryField.setVisible(false);
					drumtoNipTrimPrimaryField.setVisible(false);
					rollLengthPrimarySecondaryField.setVisible(false);
					endRollWarningSecondaryField.setVisible(false);
					endRollTransferSecondaryField.setVisible(false);
					forceSetPointSecondaryField.setVisible(false);
					drumToNipTrimSecondaryField.setVisible(false);
					zone11SetField.setVisible(false);
					zone11ActField.setVisible(false);
					zone12SetField.setVisible(false);
					zone12ActField.setVisible(false);
					zone13SetField.setVisible(false);
					zone13ActField.setVisible(false);
					hotRoll1SetField.setVisible(false);
					hotRoll1ActField.setVisible(false);
					hotRoll2SetField.setVisible(false);
					hotRoll2ActField.setVisible(false);
					chillRollSetField.setVisible(false);
					chillRollActField.setVisible(false);
				} else if (line.equals("FEX340002")) {
					primeNipSpeedField.setVisible(false);
					secondNipSpeedField.setVisible(false);
					primeWinderSpeedField.setVisible(false);
					secondWinderSpeedField.setVisible(false);
					drumTempField.setVisible(false);
					pinchRollTempField.setVisible(false);
					tempoField.setVisible(false);
					threePField.setVisible(false);
					horizontalApplyField.setVisible(false);
					inflateAirShaftField.setVisible(false);
					mixDropTempField.setVisible(false);
					plenumSpeedField.setVisible(false);
					trimLeftMeasureField.setVisible(false);
					trimRightMeasureField.setVisible(false);
					curtainLinksField.setVisible(false);
					feedValvesField.setVisible(false);
					doorsField.setVisible(false);
					feedValvesOpenPercentField.setVisible(false);
					zone0SetField.setVisible(false);
					zone0ActField.setVisible(false);
					zone7ASetField.setVisible(false);
					zone7AActField.setVisible(false);
					zone7BSetField.setVisible(false);
					zone7BActField.setVisible(false);
					zone7CSetField.setVisible(false);
					zone7CActField.setVisible(false);
					zoneB1SetField.setVisible(false);
					zoneB1ActField.setVisible(false);
					zoneB2SetField.setVisible(false);
					zoneB2ActField.setVisible(false);
					hotRoll1SetField.setVisible(false);
					hotRoll1ActField.setVisible(false);
					hotRoll2SetField.setVisible(false);
					hotRoll2ActField.setVisible(false);
					chillRollSetField.setVisible(false);
					chillRollActField.setVisible(false);
					coreOutDiameterPrimaryField.setVisible(false);
					coreOutDiameterSecondaryField.setVisible(false);
					rollLengthPrimaryField.setVisible(false);
					endRollWarningPrimaryField.setVisible(false);
					endRollTransferPrimaryField.setVisible(false);
					forceSetPointPrimaryField.setVisible(false);
					drumtoNipTrimPrimaryField.setVisible(false);
					rollLengthPrimarySecondaryField.setVisible(false);
					endRollWarningSecondaryField.setVisible(false);
					endRollTransferSecondaryField.setVisible(false);
					forceSetPointSecondaryField.setVisible(false);
					drumToNipTrimSecondaryField.setVisible(false);

				} else if (line.equals("FEX340003")) {
					primeNipSpeedField.setVisible(false);
					secondNipSpeedField.setVisible(false);
					primeWinderSpeedField.setVisible(false);
					secondWinderSpeedField.setVisible(false);
					tempoField.setVisible(false);
					threePField.setVisible(false);
					horizontalApplyField.setVisible(false);
					inflateAirShaftField.setVisible(false);
					mixDropTempField.setVisible(false);
					plenumSpeedField.setVisible(false);
					curtainLinksField.setVisible(false);
					feedValvesOpenPercentField.setVisible(false);
					zone0SetField.setVisible(false);
					zone0ActField.setVisible(false);
					zone7ASetField.setVisible(false);
					zone7AActField.setVisible(false);
					zone7BSetField.setVisible(false);
					zone7BActField.setVisible(false);
					zone7CSetField.setVisible(false);
					zone7CActField.setVisible(false);
					zoneB1SetField.setVisible(false);
					zoneB1ActField.setVisible(false);
					zoneB2SetField.setVisible(false);
					zoneB2ActField.setVisible(false);
					hotRoll1SetField.setVisible(false);
					hotRoll1ActField.setVisible(false);
					hotRoll2SetField.setVisible(false);
					hotRoll2ActField.setVisible(false);
					chillRollSetField.setVisible(false);
					chillRollActField.setVisible(false);
					coreOutDiameterPrimaryField.setVisible(false);
					coreOutDiameterSecondaryField.setVisible(false);
					rollLengthPrimaryField.setVisible(false);
					endRollWarningPrimaryField.setVisible(false);
					endRollTransferPrimaryField.setVisible(false);
					forceSetPointPrimaryField.setVisible(false);
					drumtoNipTrimPrimaryField.setVisible(false);
					rollLengthPrimarySecondaryField.setVisible(false);
					endRollWarningSecondaryField.setVisible(false);
					endRollTransferSecondaryField.setVisible(false);
					forceSetPointSecondaryField.setVisible(false);
					drumToNipTrimSecondaryField.setVisible(false);
					extruderPSIField.setVisible(false);
					drumNipField.setVisible(false);
					winderNipRollField.setVisible(false);
					winderNipSpeedField.setVisible(false);
					collapsingShieldSpeedField.setVisible(false);
					plenumTempField.setVisible(false);
					fingerAdjustLeftField.setVisible(false);
					fingerAdjustRightField.setVisible(false);
					mandrelAirPressureField.setVisible(false);
					zone11SetField.setVisible(false);
					zone11ActField.setVisible(false);
					zone12SetField.setVisible(false);
					zone12ActField.setVisible(false);
					zone13SetField.setVisible(false);
					zone13ActField.setVisible(false);
					zone7SetField.setVisible(false);
					zone7ActField.setVisible(false);
					collapsingShieldTempField.setVisible(false);

				} else if (line.equals("FEX340004")) {
					primeNipSpeedField.setVisible(false);
					secondNipSpeedField.setVisible(false);
					primeWinderSpeedField.setVisible(false);
					secondWinderSpeedField.setVisible(false);
					tempoField.setVisible(false);
					threePField.setVisible(false);
					horizontalApplyField.setVisible(false);
					inflateAirShaftField.setVisible(false);
					mixDropTempField.setVisible(false);
					plenumSpeedField.setVisible(false);
					curtainLinksField.setVisible(false);
					feedValvesOpenPercentField.setVisible(false);
					zone0SetField.setVisible(false);
					zone0ActField.setVisible(false);
					zone7ASetField.setVisible(false);
					zone7AActField.setVisible(false);
					zone7BSetField.setVisible(false);
					zone7BActField.setVisible(false);
					zone7CSetField.setVisible(false);
					zone7CActField.setVisible(false);
					zoneB1SetField.setVisible(false);
					zoneB1ActField.setVisible(false);
					zoneB2SetField.setVisible(false);
					zoneB2ActField.setVisible(false);
					hotRoll1SetField.setVisible(false);
					hotRoll1ActField.setVisible(false);
					hotRoll2SetField.setVisible(false);
					hotRoll2ActField.setVisible(false);
					chillRollSetField.setVisible(false);
					chillRollActField.setVisible(false);
					coreOutDiameterPrimaryField.setVisible(false);
					coreOutDiameterSecondaryField.setVisible(false);
					rollLengthPrimaryField.setVisible(false);
					endRollWarningPrimaryField.setVisible(false);
					endRollTransferPrimaryField.setVisible(false);
					forceSetPointPrimaryField.setVisible(false);
					drumtoNipTrimPrimaryField.setVisible(false);
					rollLengthPrimarySecondaryField.setVisible(false);
					endRollWarningSecondaryField.setVisible(false);
					endRollTransferSecondaryField.setVisible(false);
					forceSetPointSecondaryField.setVisible(false);
					drumToNipTrimSecondaryField.setVisible(false);
					extruderPSIField.setVisible(false);
					drumNipField.setVisible(false);
					winderNipRollField.setVisible(false);
					winderNipSpeedField.setVisible(false);
					collapsingShieldSpeedField.setVisible(false);
					plenumTempField.setVisible(false);
					fingerAdjustLeftField.setVisible(false);
					fingerAdjustRightField.setVisible(false);
					mandrelAirPressureField.setVisible(false);
					zone11SetField.setVisible(false);
					zone11ActField.setVisible(false);
					zone12SetField.setVisible(false);
					zone12ActField.setVisible(false);
					zone13SetField.setVisible(false);
					zone13ActField.setVisible(false);
					zone7SetField.setVisible(false);
					zone7ActField.setVisible(false);
					collapsingShieldTempField.setVisible(false);

				} else if (line.equals("FEX340006")) {
					tableSpeedField.setVisible(false);
					dieNumberField.setVisible(false);
					stretchField.setVisible(false);
					drumTempField.setVisible(false);
					pinchRollTempField.setVisible(false);
					tempoField.setVisible(false);
					threePField.setVisible(false);
					drumNipField.setVisible(false);
					horizontalApplyField.setVisible(false);
					inflateAirShaftField.setVisible(false);
					winderNipSpeedField.setVisible(false);
					collapsingShieldSpeedField.setVisible(false);
					trimLeftMeasureField.setVisible(false);
					trimRightMeasureField.setVisible(false);
					curtainLinksField.setVisible(false);
					fingerAdjustLeftField.setVisible(false);
					fingerAdjustRightField.setVisible(false);
					mandrelAirPressureField.setVisible(false);
					zone0SetField.setVisible(false);
					zone0ActField.setVisible(false);
					zone7SetField.setVisible(false);
					zone7ActField.setVisible(false);
					zone11SetField.setVisible(false);
					zone11ActField.setVisible(false);
					zone12SetField.setVisible(false);
					zone12ActField.setVisible(false);
					zone13SetField.setVisible(false);
					zone13ActField.setVisible(false);
					zoneB1SetField.setVisible(false);
					zoneB1ActField.setVisible(false);
					zoneB2SetField.setVisible(false);
					zoneB2ActField.setVisible(false);
					hotRoll1SetField.setVisible(false);
					hotRoll1ActField.setVisible(false);
					hotRoll2SetField.setVisible(false);
					hotRoll2ActField.setVisible(false);
					chillRollSetField.setVisible(false);
					chillRollActField.setVisible(false);
					collapsingShieldTempField.setVisible(false);

				} else if (line.equals("FEX340007")) {
					primeNipSpeedField.setVisible(false);
					secondNipSpeedField.setVisible(false);
					primeWinderSpeedField.setVisible(false);
					secondWinderSpeedField.setVisible(false);
					extruderPSIField.setVisible(false);
					airRingTempField.setVisible(false);
					tempoField.setVisible(false);
					threePField.setVisible(false);
					drumNipField.setVisible(false);
					horizontalApplyField.setVisible(false);
					inflateAirShaftField.setVisible(false);
					winderNipRollField.setVisible(false);
					mixDropTempField.setVisible(false);
					winderNipSpeedField.setVisible(false);
					collapsingShieldSpeedField.setVisible(false);
					plenumTempField.setVisible(false);
					plenumSpeedField.setVisible(false);
					fingerAdjustLeftField.setVisible(false);
					fingerAdjustRightField.setVisible(false);
					mandrelAirPressureField.setVisible(false);
					doorsField.setVisible(false);
					feedValvesOpenPercentField.setVisible(false);
					zone0SetField.setVisible(false);
					zone0ActField.setVisible(false);
					zone7ASetField.setVisible(false);
					zone7AActField.setVisible(false);
					zone7BSetField.setVisible(false);
					zone7BActField.setVisible(false);
					zone7CSetField.setVisible(false);
					zone7CActField.setVisible(false);
					zone12SetField.setVisible(false);
					zone12ActField.setVisible(false);
					zone13SetField.setVisible(false);
					zone13ActField.setVisible(false);
					zoneB1SetField.setVisible(false);
					zoneB1ActField.setVisible(false);
					zoneB2SetField.setVisible(false);
					zoneB2ActField.setVisible(false);
					coreOutDiameterPrimaryField.setVisible(false);
					coreOutDiameterSecondaryField.setVisible(false);
					rollLengthPrimaryField.setVisible(false);
					endRollWarningPrimaryField.setVisible(false);
					endRollTransferPrimaryField.setVisible(false);
					forceSetPointPrimaryField.setVisible(false);
					drumtoNipTrimPrimaryField.setVisible(false);
					rollLengthPrimarySecondaryField.setVisible(false);
					endRollWarningSecondaryField.setVisible(false);
					endRollTransferSecondaryField.setVisible(false);
					forceSetPointSecondaryField.setVisible(false);
					drumToNipTrimSecondaryField.setVisible(false);
					collapsingShieldTempField.setVisible(false);

				} else if (line.equals("FEX340008")) {
					primeNipSpeedField.setVisible(false);
					secondNipSpeedField.setVisible(false);
					primeWinderSpeedField.setVisible(false);
					secondWinderSpeedField.setVisible(false);
					extruderPSIField.setVisible(false);
					airRingTempField.setVisible(false);
					tempoField.setVisible(false);
					threePField.setVisible(false);
					drumNipField.setVisible(false);
					horizontalApplyField.setVisible(false);
					inflateAirShaftField.setVisible(false);
					winderNipRollField.setVisible(false);
					mixDropTempField.setVisible(false);
					winderNipSpeedField.setVisible(false);
					collapsingShieldSpeedField.setVisible(false);
					plenumTempField.setVisible(false);
					plenumSpeedField.setVisible(false);
					fingerAdjustLeftField.setVisible(false);
					fingerAdjustRightField.setVisible(false);
					mandrelAirPressureField.setVisible(false);
					doorsField.setVisible(false);
					feedValvesOpenPercentField.setVisible(false);
					zone0SetField.setVisible(false);
					zone0ActField.setVisible(false);
					zone7ASetField.setVisible(false);
					zone7AActField.setVisible(false);
					zone7BSetField.setVisible(false);
					zone7BActField.setVisible(false);
					zone7CSetField.setVisible(false);
					zone7CActField.setVisible(false);
					zone12SetField.setVisible(false);
					zone12ActField.setVisible(false);
					zone13SetField.setVisible(false);
					zone13ActField.setVisible(false);
					zoneB1SetField.setVisible(false);
					zoneB1ActField.setVisible(false);
					zoneB2SetField.setVisible(false);
					zoneB2ActField.setVisible(false);
					coreOutDiameterPrimaryField.setVisible(false);
					coreOutDiameterSecondaryField.setVisible(false);
					rollLengthPrimaryField.setVisible(false);
					endRollWarningPrimaryField.setVisible(false);
					endRollTransferPrimaryField.setVisible(false);
					forceSetPointPrimaryField.setVisible(false);
					drumtoNipTrimPrimaryField.setVisible(false);
					rollLengthPrimarySecondaryField.setVisible(false);
					endRollWarningSecondaryField.setVisible(false);
					endRollTransferSecondaryField.setVisible(false);
					forceSetPointSecondaryField.setVisible(false);
					drumToNipTrimSecondaryField.setVisible(false);
					trimPullerSpeedField.setVisible(false);
					collapsingShieldTempField.setVisible(false);

				} else if (line.equals(""))
					setAllVisible();

			}

			private void setAllVisible() {
				// all text fields have been added to the Collection during UI
				// generation
				// this method iterates through all textFields and makes them
				// visible when a line is selected.
				for (JTextField f : list) {
					f.setVisible(true);
				}
			}
		});
		// builds base UI that is modified based on the line selected
		label_2 = new JLabel("Operator");
		panel_2.add(label_2, "cell 6 0,alignx right");

		operatorField = new JTextField();
		panel_2.add(operatorField, "cell 7 0");
		operatorField.setColumns(10);
		operatorField.setText(operator);
		operatorField.setEditable(false);
		list.add(operatorField);
		JLabel lblGauge = new JLabel("Gauge");
		panel_2.add(lblGauge, "cell 8 0,alignx right");

		gaugeField = new JTextField();
		panel_2.add(gaugeField, "cell 9 0");
		gaugeField.setColumns(10);
		list.add(gaugeField);

		JLabel lblPiw = new JLabel("PIW");
		panel_2.add(lblPiw, "cell 10 0,alignx right");

		piwField = new JTextField();
		panel_2.add(piwField, "cell 11 0");
		piwField.setColumns(10);
		list.add(piwField);

		JLabel lblFormula = new JLabel("Formula");
		panel_2.add(lblFormula, "cell 12 0,alignx right");

		formulaField = new JTextField();
		panel_2.add(formulaField, "cell 13 0");
		formulaField.setColumns(10);
		list.add(formulaField);

		label_3 = new JLabel("Feet Per Roll");
		panel_2.add(label_3, "cell 0 1,alignx right");

		feetPerRollField = new JTextField();
		panel_2.add(feetPerRollField, "cell 1 1");
		feetPerRollField.setColumns(10);
		list.add(feetPerRollField);

		label_34 = new JLabel("Work Order 1");
		panel_2.add(label_34, "cell 2 1,alignx right");

		workOrder1Field = new JTextField();
		panel_2.add(workOrder1Field, "cell 3 1");
		list.add(workOrder1Field);
		workOrder1Field.setColumns(10);

		label_35 = new JLabel("Work Order 2");
		panel_2.add(label_35, "cell 4 1,alignx right");

		workOrder2Field = new JTextField();
		panel_2.add(workOrder2Field, "cell 5 1");
		list.add(workOrder2Field);
		workOrder2Field.setColumns(10);

		label_37 = new JLabel("Work Order 3");
		panel_2.add(label_37, "cell 6 1,alignx right");

		workOrder3Field = new JTextField();
		panel_2.add(workOrder3Field, "cell 7 1");
		list.add(workOrder3Field);
		workOrder3Field.setColumns(10);

		label_36 = new JLabel("Work Order 4");
		panel_2.add(label_36, "cell 8 1,alignx right");

		workOrder4Field = new JTextField();
		panel_2.add(workOrder4Field, "cell 9 1");
		list.add(workOrder4Field);
		workOrder4Field.setColumns(10);

		label_32 = new JLabel("J Number");
		panel_2.add(label_32, "cell 10 1,alignx right");

		jNumberField = new JTextField();
		panel_2.add(jNumberField, "cell 11 1");
		jNumberField.setColumns(10);
		list.add(jNumberField);

		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(tabbedPane, "cell 0 1 12 14,grow");

		panel_3 = new JPanel();
		tabbedPane.addTab("Page 1", null, panel_3, null);
		panel_3.setLayout(new MigLayout("", "[][grow][][grow][][grow][grow]", "[][][][][][][][][][][][][][][][][][][][][][][]"));
		label_4 = new JLabel("Table Speed");
		panel_3.add(label_4, "cell 0 0");

		tableSpeedField = new JTextField();
		panel_3.add(tableSpeedField, "cell 1 0");
		tableSpeedField.setColumns(10);
		list.add(tableSpeedField);

		lblMixDropTemp = new JLabel("Mix Drop Temp");
		panel_3.add(lblMixDropTemp, "cell 2 0");

		mixDropTempField = new JTextField();
		panel_3.add(mixDropTempField, "cell 3 0");
		mixDropTempField.setColumns(10);
		list.add(mixDropTempField);
		
				lblSetting = new JLabel("Setting");
				panel_3.add(lblSetting, "cell 5 0,alignx center");
		
				lblActual = new JLabel("Actual");
				panel_3.add(lblActual, "cell 6 0,alignx center");

		lblPrimeNipSpeed = new JLabel("Prime Nip Speed");
		panel_3.add(lblPrimeNipSpeed, "cell 0 1");

		primeNipSpeedField = new JTextField();
		panel_3.add(primeNipSpeedField, "cell 1 1");
		primeNipSpeedField.setColumns(10);
		list.add(primeNipSpeedField);

		label_14 = new JLabel("Winder NIP Speed");
		panel_3.add(label_14, "cell 2 1");

		winderNipSpeedField = new JTextField();
		panel_3.add(winderNipSpeedField, "cell 3 1");
		winderNipSpeedField.setColumns(10);
		list.add(winderNipSpeedField);
		
				label_22 = new JLabel("Zone 0");
				panel_3.add(label_22, "cell 4 1");
		
				zone0SetField = new JTextField();
				panel_3.add(zone0SetField, "cell 5 1,alignx center");
				zone0SetField.setColumns(10);
				list.add(zone0SetField);
		
				zone0ActField = new JTextField();
				panel_3.add(zone0ActField, "cell 6 1,alignx center");
				zone0ActField.setColumns(10);
				list.add(zone0ActField);

		lblndNipSpeed = new JLabel("2nd Nip Speed");
		panel_3.add(lblndNipSpeed, "cell 0 2");

		secondNipSpeedField = new JTextField();
		panel_3.add(secondNipSpeedField, "cell 1 2");
		secondNipSpeedField.setColumns(10);
		list.add(secondNipSpeedField);

		label_15 = new JLabel("Collapsing Shield Speed");
		panel_3.add(label_15, "cell 2 2");

		collapsingShieldSpeedField = new JTextField();
		panel_3.add(collapsingShieldSpeedField, "cell 3 2");
		collapsingShieldSpeedField.setColumns(10);
		list.add(collapsingShieldSpeedField);
		
				lblZone = new JLabel("Zone 1");
				panel_3.add(lblZone, "cell 4 2");
		
				zone1SetField = new JTextField();
				panel_3.add(zone1SetField, "cell 5 2,alignx center");
				zone1SetField.setColumns(10);
				list.add(zone1SetField);
		
				zone1ActField = new JTextField();
				panel_3.add(zone1ActField, "cell 6 2,alignx center");
				zone1ActField.setColumns(10);
				list.add(zone1ActField);

		lblPrimeWinderSpeed = new JLabel("Prime Winder Speed");
		panel_3.add(lblPrimeWinderSpeed, "cell 0 3");

		primeWinderSpeedField = new JTextField();
		panel_3.add(primeWinderSpeedField, "cell 1 3");
		primeWinderSpeedField.setColumns(10);
		list.add(primeWinderSpeedField);

		label_33 = new JLabel("Collapsing Shield Temperature");
		panel_3.add(label_33, "cell 2 3");

		collapsingShieldTempField = new JTextField();
		panel_3.add(collapsingShieldTempField, "cell 3 3");
		list.add(collapsingShieldTempField);
		collapsingShieldTempField.setColumns(10);
		
				lblZone_1 = new JLabel("Zone 2");
				panel_3.add(lblZone_1, "cell 4 3");
		
				zone2SetField = new JTextField();
				panel_3.add(zone2SetField, "cell 5 3,alignx center");
				zone2SetField.setColumns(10);
				list.add(zone2SetField);
		
				zone2ActField = new JTextField();
				panel_3.add(zone2ActField, "cell 6 3,alignx center");
				zone2ActField.setColumns(10);
				list.add(zone2ActField);

		lblndWinderSpeed = new JLabel("2nd Winder Speed");
		panel_3.add(lblndWinderSpeed, "cell 0 4");

		secondWinderSpeedField = new JTextField();
		panel_3.add(secondWinderSpeedField, "cell 1 4");
		secondWinderSpeedField.setColumns(10);
		list.add(secondWinderSpeedField);

		lblPlenumTemp = new JLabel("Plenum Temp");
		panel_3.add(lblPlenumTemp, "cell 2 4");

		plenumTempField = new JTextField();
		panel_3.add(plenumTempField, "cell 3 4");
		plenumTempField.setColumns(10);
		list.add(plenumTempField);
		
				lblZone_2 = new JLabel("Zone 3");
				panel_3.add(lblZone_2, "cell 4 4");
		
				zone3SetField = new JTextField();
				panel_3.add(zone3SetField, "cell 5 4,alignx center");
				zone3SetField.setColumns(10);
				list.add(zone3SetField);
		
				zone3ActField = new JTextField();
				panel_3.add(zone3ActField, "cell 6 4,alignx center");
				zone3ActField.setColumns(10);
				list.add(zone3ActField);

		lblScrewSpeed = new JLabel("Screw Speed");
		panel_3.add(lblScrewSpeed, "cell 0 5");

		screwSpeedField = new JTextField();
		panel_3.add(screwSpeedField, "cell 1 5");
		screwSpeedField.setColumns(10);
		list.add(screwSpeedField);

		lblPlenumSpeed = new JLabel("Plenum Speed");
		panel_3.add(lblPlenumSpeed, "cell 2 5");

		plenumSpeedField = new JTextField();
		panel_3.add(plenumSpeedField, "cell 3 5");
		plenumSpeedField.setColumns(10);
		list.add(plenumSpeedField);
		
				lblZone_3 = new JLabel("Zone 4");
				panel_3.add(lblZone_3, "cell 4 5");
		
				zone4SetField = new JTextField();
				panel_3.add(zone4SetField, "cell 5 5,alignx center");
				list.add(zone4SetField);
				zone4SetField.setColumns(10);
		
				zone4ActField = new JTextField();
				panel_3.add(zone4ActField, "cell 6 5,alignx center");
				list.add(zone4ActField);
				zone4ActField.setColumns(10);

		label_5 = new JLabel("Die Number");
		panel_3.add(label_5, "cell 0 6");

		dieNumberField = new JTextField();
		panel_3.add(dieNumberField, "cell 1 6");
		list.add(dieNumberField);
		dieNumberField.setColumns(10);

		label_16 = new JLabel("Trim Left Measure");
		panel_3.add(label_16, "cell 2 6");

		trimLeftMeasureField = new JTextField();
		panel_3.add(trimLeftMeasureField, "cell 3 6");
		trimLeftMeasureField.setColumns(10);
		list.add(trimLeftMeasureField);
		
				lblZone_4 = new JLabel("Zone 5");
				panel_3.add(lblZone_4, "cell 4 6");
		
				zone5SetField = new JTextField();
				panel_3.add(zone5SetField, "cell 5 6,alignx center");
				list.add(zone5SetField);
				zone5SetField.setColumns(10);
		
				zone5ActField = new JTextField();
				panel_3.add(zone5ActField, "cell 6 6,alignx center");
				list.add(zone5ActField);
				zone5ActField.setColumns(10);

		lblRbTemp = new JLabel("RB Temp");
		panel_3.add(lblRbTemp, "cell 0 7");

		rbTempField = new JTextField();
		panel_3.add(rbTempField, "cell 1 7");
		list.add(rbTempField);
		rbTempField.setColumns(10);

		label_17 = new JLabel("Trim Right Measure");
		panel_3.add(label_17, "cell 2 7");

		trimRightMeasureField = new JTextField();
		panel_3.add(trimRightMeasureField, "cell 3 7");
		list.add(trimRightMeasureField);
		trimRightMeasureField.setColumns(10);
		
				lblZone_5 = new JLabel("Zone 6");
				panel_3.add(lblZone_5, "cell 4 7");
		
				zone6SetField = new JTextField();
				panel_3.add(zone6SetField, "cell 5 7,alignx center");
				list.add(zone6SetField);
				zone6SetField.setColumns(10);
		
				zone6ActField = new JTextField();
				panel_3.add(zone6ActField, "cell 6 7,alignx center");
				list.add(zone6ActField);
				zone6ActField.setColumns(10);

		lblScreenPack = new JLabel("Screen Pack");
		panel_3.add(lblScreenPack, "cell 0 8");

		screenPackField = new JTextField();
		panel_3.add(screenPackField, "cell 1 8");
		list.add(screenPackField);
		screenPackField.setColumns(10);

		lblAirRingGap = new JLabel("Air Ring Gap");
		panel_3.add(lblAirRingGap, "cell 2 8");

		airRingGapField = new JTextField();
		panel_3.add(airRingGapField, "cell 3 8");
		list.add(airRingGapField);
		airRingGapField.setColumns(10);
		
				label_31 = new JLabel("Zone 7");
				panel_3.add(label_31, "cell 4 8");
		
				zone7SetField = new JTextField();
				panel_3.add(zone7SetField, "cell 5 8,alignx center");
				list.add(zone7SetField);
				zone7SetField.setColumns(10);
		
				zone7ActField = new JTextField();
				panel_3.add(zone7ActField, "cell 6 8,alignx center");
				list.add(zone7ActField);
				zone7ActField.setColumns(10);

		lblExtruderAmps = new JLabel("Extruder Amps");
		panel_3.add(lblExtruderAmps, "cell 0 9");

		extruderAmpsField = new JTextField();
		panel_3.add(extruderAmpsField, "cell 1 9");
		list.add(extruderAmpsField);
		extruderAmpsField.setColumns(10);

		label_18 = new JLabel("Curtain Links");
		panel_3.add(label_18, "cell 2 9");

		curtainLinksField = new JTextField();
		panel_3.add(curtainLinksField, "cell 3 9");
		list.add(curtainLinksField);
		curtainLinksField.setColumns(10);
		
				lblZonea = new JLabel("Zone 7-A");
				panel_3.add(lblZonea, "cell 4 9");
		
				zone7ASetField = new JTextField();
				panel_3.add(zone7ASetField, "cell 5 9,alignx center");
				list.add(zone7ASetField);
				zone7ASetField.setColumns(10);
		
				zone7AActField = new JTextField();
				panel_3.add(zone7AActField, "cell 6 9,alignx center");
				list.add(zone7AActField);
				zone7AActField.setColumns(10);

		lblExtruderPsi = new JLabel("Extruder PSI");
		panel_3.add(lblExtruderPsi, "cell 0 10");

		extruderPSIField = new JTextField();
		panel_3.add(extruderPSIField, "cell 1 10");
		list.add(extruderPSIField);
		extruderPSIField.setColumns(10);

		label_19 = new JLabel("Finger Adjust Left");
		panel_3.add(label_19, "cell 2 10");

		fingerAdjustLeftField = new JTextField();
		panel_3.add(fingerAdjustLeftField, "cell 3 10");
		list.add(fingerAdjustLeftField);
		fingerAdjustLeftField.setColumns(10);
		
				lblZoneb = new JLabel("Zone 7-B");
				panel_3.add(lblZoneb, "cell 4 10");
		
				zone7BSetField = new JTextField();
				panel_3.add(zone7BSetField, "cell 5 10,alignx center");
				list.add(zone7BSetField);
				zone7BSetField.setColumns(10);
		
				zone7BActField = new JTextField();
				panel_3.add(zone7BActField, "cell 6 10,alignx center");
				list.add(zone7BActField);
				zone7BActField.setColumns(10);

		label_6 = new JLabel("Stretch");
		panel_3.add(label_6, "cell 0 11");

		stretchField = new JTextField();
		panel_3.add(stretchField, "cell 1 11");
		list.add(stretchField);
		stretchField.setColumns(10);

		label_20 = new JLabel("Finger Adjust Right");
		panel_3.add(label_20, "cell 2 11");

		fingerAdjustRightField = new JTextField();
		panel_3.add(fingerAdjustRightField, "cell 3 11");
		list.add(fingerAdjustRightField);
		fingerAdjustRightField.setColumns(10);
		
				lblZonec = new JLabel("Zone 7-C");
				panel_3.add(lblZonec, "cell 4 11");
		
				zone7CSetField = new JTextField();
				panel_3.add(zone7CSetField, "cell 5 11,alignx center");
				list.add(zone7CSetField);
				zone7CSetField.setColumns(10);
		
				zone7CActField = new JTextField();
				panel_3.add(zone7CActField, "cell 6 11,alignx center");
				list.add(zone7CActField);
				zone7CActField.setColumns(10);

		lblScrap = new JLabel("Scrap");
		panel_3.add(lblScrap, "cell 0 12");

		scrapField = new JTextField();
		panel_3.add(scrapField, "cell 1 12");
		list.add(scrapField);
		scrapField.setColumns(10);

		lblTrimPullerSpeed = new JLabel("Trim Puller Speed");
		panel_3.add(lblTrimPullerSpeed, "cell 2 12");

		trimPullerSpeedField = new JTextField();
		panel_3.add(trimPullerSpeedField, "cell 3 12");
		list.add(trimPullerSpeedField);
		trimPullerSpeedField.setColumns(10);
		
				lblZone_6 = new JLabel("Zone 8");
				panel_3.add(lblZone_6, "cell 4 12");
		
				zone8SetField = new JTextField();
				panel_3.add(zone8SetField, "cell 5 12,alignx center");
				list.add(zone8SetField);
				zone8SetField.setColumns(10);
		
				zone8ActField = new JTextField();
				panel_3.add(zone8ActField, "cell 6 12,alignx center");
				list.add(zone8ActField);
				zone8ActField.setColumns(10);

		label_7 = new JLabel("Drum Temp");
		panel_3.add(label_7, "cell 0 13");

		drumTempField = new JTextField();
		panel_3.add(drumTempField, "cell 1 13");
		drumTempField.setColumns(10);
		list.add(drumTempField);

		label_21 = new JLabel("Mandrel Air Pressure");
		panel_3.add(label_21, "cell 2 13");

		mandrelAirPressureField = new JTextField();
		panel_3.add(mandrelAirPressureField, "cell 3 13");
		list.add(mandrelAirPressureField);
		mandrelAirPressureField.setColumns(10);
		
				lblZone_7 = new JLabel("Zone 9");
				panel_3.add(lblZone_7, "cell 4 13");
		
				zone9SetField = new JTextField();
				panel_3.add(zone9SetField, "cell 5 13,alignx center");
				list.add(zone9SetField);
				zone9SetField.setColumns(10);
		
				zone9ActField = new JTextField();
				panel_3.add(zone9ActField, "cell 6 13,alignx center");
				list.add(zone9ActField);
				zone9ActField.setColumns(10);

		label_8 = new JLabel("Pinch Roll Temp");
		panel_3.add(label_8, "cell 0 14");

		pinchRollTempField = new JTextField();
		panel_3.add(pinchRollTempField, "cell 1 14");
		pinchRollTempField.setColumns(10);
		list.add(pinchRollTempField);

		lblFeedValves = new JLabel("Feed Valves");
		panel_3.add(lblFeedValves, "cell 2 14");

		feedValvesField = new JTextField();
		panel_3.add(feedValvesField, "cell 3 14");
		list.add(feedValvesField);
		feedValvesField.setColumns(10);
		
				label_30 = new JLabel("Zone 10");
				panel_3.add(label_30, "cell 4 14");
		
				zone10SetField = new JTextField();
				panel_3.add(zone10SetField, "cell 5 14,alignx center");
				list.add(zone10SetField);
				zone10SetField.setColumns(10);
		
				zone10ActField = new JTextField();
				panel_3.add(zone10ActField, "cell 6 14,alignx center");
				list.add(zone10ActField);
				zone10ActField.setColumns(10);

		lblAirRingSpeed = new JLabel("Air Ring Speed");
		panel_3.add(lblAirRingSpeed, "cell 0 15");

		airRingSpeedField = new JTextField();
		panel_3.add(airRingSpeedField, "cell 1 15");
		list.add(airRingSpeedField);
		airRingSpeedField.setColumns(10);

		lblDoors = new JLabel("Doors");
		panel_3.add(lblDoors, "cell 2 15");

		doorsField = new JTextField();
		panel_3.add(doorsField, "cell 3 15");
		list.add(doorsField);
		doorsField.setColumns(10);
		
				lblZone_8 = new JLabel("Zone 11");
				panel_3.add(lblZone_8, "cell 4 15");
		
				zone11SetField = new JTextField();
				panel_3.add(zone11SetField, "cell 5 15,alignx center");
				list.add(zone11SetField);
				zone11SetField.setColumns(10);
		
				zone11ActField = new JTextField();
				panel_3.add(zone11ActField, "cell 6 15,alignx center");
				list.add(zone11ActField);
				zone11ActField.setColumns(10);

		lblAirRingTemp = new JLabel("Air Ring Temp");
		panel_3.add(lblAirRingTemp, "cell 0 16");

		airRingTempField = new JTextField();
		panel_3.add(airRingTempField, "cell 1 16");
		list.add(airRingTempField);
		airRingTempField.setColumns(10);

		lblFeedValvesOpen = new JLabel("Feed Valves Open %");
		panel_3.add(lblFeedValvesOpen, "cell 2 16");

		feedValvesOpenPercentField = new JTextField();
		panel_3.add(feedValvesOpenPercentField, "cell 3 16");
		list.add(feedValvesOpenPercentField);
		feedValvesOpenPercentField.setColumns(10);
		
				label_23 = new JLabel("Zone 12");
				panel_3.add(label_23, "cell 4 16");
		
				zone12SetField = new JTextField();
				panel_3.add(zone12SetField, "cell 5 16,alignx center");
				list.add(zone12SetField);
				zone12SetField.setColumns(10);
		
				zone12ActField = new JTextField();
				panel_3.add(zone12ActField, "cell 6 16,alignx center");
				list.add(zone12ActField);
				zone12ActField.setColumns(10);

		label_9 = new JLabel("Tempo");
		panel_3.add(label_9, "cell 0 17");

		tempoField = new JTextField();
		panel_3.add(tempoField, "cell 1 17");
		list.add(tempoField);
		tempoField.setColumns(10);
		
				label_24 = new JLabel("Zone 13");
				panel_3.add(label_24, "cell 4 17");
		
				zone13SetField = new JTextField();
				panel_3.add(zone13SetField, "cell 5 17,alignx center");
				list.add(zone13SetField);
				zone13SetField.setColumns(10);
		
				zone13ActField = new JTextField();
				panel_3.add(zone13ActField, "cell 6 17,alignx center");
				list.add(zone13ActField);
				zone13ActField.setColumns(10);

		label_10 = new JLabel("Three P");
		panel_3.add(label_10, "cell 0 18");

		threePField = new JTextField();
		panel_3.add(threePField, "cell 1 18");
		list.add(threePField);
		threePField.setColumns(10);
		
				label_25 = new JLabel("Zone B1");
				panel_3.add(label_25, "cell 4 18");
		
				zoneB1SetField = new JTextField();
				panel_3.add(zoneB1SetField, "cell 5 18,alignx center");
				zoneB1SetField.setColumns(10);
				list.add(zoneB1SetField);
		
				zoneB1ActField = new JTextField();
				panel_3.add(zoneB1ActField, "cell 6 18,alignx center");
				list.add(zoneB1ActField);
				zoneB1ActField.setColumns(10);

		label_11 = new JLabel("Drum NIP");
		panel_3.add(label_11, "cell 0 19");

		drumNipField = new JTextField();
		panel_3.add(drumNipField, "cell 1 19");
		list.add(drumNipField);
		drumNipField.setColumns(10);
		
				label_26 = new JLabel("Zone B2");
				panel_3.add(label_26, "cell 4 19");
		
				zoneB2SetField = new JTextField();
				panel_3.add(zoneB2SetField, "cell 5 19,alignx center");
				list.add(zoneB2SetField);
				zoneB2SetField.setColumns(10);
		
				zoneB2ActField = new JTextField();
				panel_3.add(zoneB2ActField, "cell 6 19,alignx center");
				list.add(zoneB2ActField);
				zoneB2ActField.setColumns(10);

		label_12 = new JLabel("Horizontal Apply");
		panel_3.add(label_12, "cell 0 20");

		horizontalApplyField = new JTextField();
		panel_3.add(horizontalApplyField, "cell 1 20");
		list.add(horizontalApplyField);
		horizontalApplyField.setColumns(10);
		
				label_27 = new JLabel("Hot Roll 1");
				panel_3.add(label_27, "cell 4 20");
		
				hotRoll1SetField = new JTextField();
				panel_3.add(hotRoll1SetField, "cell 5 20,alignx center");
				list.add(hotRoll1SetField);
				hotRoll1SetField.setColumns(10);
		
				hotRoll1ActField = new JTextField();
				panel_3.add(hotRoll1ActField, "cell 6 20,alignx center");
				list.add(hotRoll1ActField);
				hotRoll1ActField.setColumns(10);

		label_13 = new JLabel("Inflate Air Shaft");
		panel_3.add(label_13, "cell 0 21");

		inflateAirShaftField = new JTextField();
		panel_3.add(inflateAirShaftField, "cell 1 21");
		list.add(inflateAirShaftField);
		inflateAirShaftField.setColumns(10);
		
				label_28 = new JLabel("Hot Roll 2");
				panel_3.add(label_28, "cell 4 21");
		
				hotRoll2SetField = new JTextField();
				panel_3.add(hotRoll2SetField, "cell 5 21,alignx center");
				list.add(hotRoll2SetField);
				hotRoll2SetField.setColumns(10);
		
				hotRoll2ActField = new JTextField();
				panel_3.add(hotRoll2ActField, "cell 6 21,alignx center");
				list.add(hotRoll2ActField);
				hotRoll2ActField.setColumns(10);

		lblWinderNipRoll = new JLabel("Winder Nip Roll");
		panel_3.add(lblWinderNipRoll, "cell 0 22");

		winderNipRollField = new JTextField();
		panel_3.add(winderNipRollField, "cell 1 22");
		list.add(winderNipRollField);
		winderNipRollField.setColumns(10);
		
				label_29 = new JLabel("Chill Roll");
				panel_3.add(label_29, "cell 4 22");
				
						chillRollSetField = new JTextField();
						panel_3.add(chillRollSetField, "cell 5 22,alignx center");
						list.add(chillRollSetField);
						chillRollSetField.setColumns(10);
						
								chillRollActField = new JTextField();
								panel_3.add(chillRollActField, "cell 6 22,alignx center");
								list.add(chillRollActField);
								chillRollActField.setColumns(10);

		panel_1 = new JPanel();
		tabbedPane.addTab("Page 2", null, panel_1, null);
		panel_1.setLayout(new MigLayout("", "[][][grow][][][grow][grow][]",
				"[][][][][][]"));

		lblCoreOutDiameter = new JLabel("Core Out Diameter Primary");
		panel_1.add(lblCoreOutDiameter, "cell 0 0,alignx center");

		coreOutDiameterPrimaryField = new JTextField();
		list.add(coreOutDiameterPrimaryField);
		panel_1.add(coreOutDiameterPrimaryField, "cell 2 0");
		coreOutDiameterPrimaryField.setColumns(10);

		lblCoreOutDiameter_1 = new JLabel("Core Out Diameter Secondary");
		panel_1.add(lblCoreOutDiameter_1, "cell 4 0,alignx center");

		coreOutDiameterSecondaryField = new JTextField();
		list.add(coreOutDiameterSecondaryField);
		panel_1.add(coreOutDiameterSecondaryField, "cell 6 0");
		coreOutDiameterSecondaryField.setColumns(10);

		lblRollLengthPrimary = new JLabel("Roll Length Primary");
		panel_1.add(lblRollLengthPrimary, "cell 0 1,alignx center");

		rollLengthPrimaryField = new JTextField();
		list.add(rollLengthPrimaryField);
		panel_1.add(rollLengthPrimaryField, "cell 2 1");
		rollLengthPrimaryField.setColumns(10);

		lblRollLengthPrimary_1 = new JLabel("Roll Length Primary Secondary");
		panel_1.add(lblRollLengthPrimary_1, "cell 4 1,alignx center");

		rollLengthPrimarySecondaryField = new JTextField();
		list.add(rollLengthPrimarySecondaryField);
		panel_1.add(rollLengthPrimarySecondaryField, "cell 6 1");
		rollLengthPrimarySecondaryField.setColumns(10);

		lblEndRollWarning = new JLabel("End Roll Warning Primary");
		panel_1.add(lblEndRollWarning, "cell 0 2,alignx center");

		endRollWarningPrimaryField = new JTextField();
		list.add(endRollWarningPrimaryField);
		panel_1.add(endRollWarningPrimaryField, "cell 2 2");
		endRollWarningPrimaryField.setColumns(10);

		lblEndRollWarning_1 = new JLabel("End Roll Warning Secondary");
		panel_1.add(lblEndRollWarning_1, "cell 4 2,alignx center");

		endRollWarningSecondaryField = new JTextField();
		list.add(endRollWarningSecondaryField);
		panel_1.add(endRollWarningSecondaryField, "cell 6 2");
		endRollWarningSecondaryField.setColumns(10);

		lblEndRollTransfer = new JLabel("End Roll Transfer Primary");
		panel_1.add(lblEndRollTransfer, "cell 0 3,alignx center");

		endRollTransferPrimaryField = new JTextField();
		list.add(endRollTransferPrimaryField);
		panel_1.add(endRollTransferPrimaryField, "cell 2 3");
		endRollTransferPrimaryField.setColumns(10);

		lblEndRollTransfer_1 = new JLabel("End Roll Transfer Secondary");
		panel_1.add(lblEndRollTransfer_1, "cell 4 3,alignx center");

		endRollTransferSecondaryField = new JTextField();
		list.add(endRollTransferSecondaryField);
		panel_1.add(endRollTransferSecondaryField, "cell 6 3");
		endRollTransferSecondaryField.setColumns(10);

		lblForceSetPoint = new JLabel("Force Set Point Primary");
		panel_1.add(lblForceSetPoint, "cell 0 4,alignx center");

		forceSetPointPrimaryField = new JTextField();
		list.add(forceSetPointPrimaryField);
		panel_1.add(forceSetPointPrimaryField, "cell 2 4");
		forceSetPointPrimaryField.setColumns(10);

		lblForceSetPoint_1 = new JLabel("Force Set Point Secondary");
		panel_1.add(lblForceSetPoint_1, "cell 4 4,alignx center");

		forceSetPointSecondaryField = new JTextField();
		list.add(forceSetPointSecondaryField);
		panel_1.add(forceSetPointSecondaryField, "cell 6 4");
		forceSetPointSecondaryField.setColumns(10);

		lblDrumToNip = new JLabel("Drum to Nip Trim Primary");
		panel_1.add(lblDrumToNip, "cell 0 5,alignx center");

		drumtoNipTrimPrimaryField = new JTextField();
		list.add(drumtoNipTrimPrimaryField);
		panel_1.add(drumtoNipTrimPrimaryField, "cell 2 5");
		drumtoNipTrimPrimaryField.setColumns(10);

		lblDrumToNip_1 = new JLabel("Drum to Nip Trim Secondary");
		panel_1.add(lblDrumToNip_1, "cell 4 5,alignx center");

		drumToNipTrimSecondaryField = new JTextField();
		list.add(drumToNipTrimSecondaryField);
		panel_1.add(drumToNipTrimSecondaryField, "cell 6 5");
		drumToNipTrimSecondaryField.setColumns(10);
		
		panel = new JPanel();
		frame.getContentPane().add(panel, "cell 7 15,growx");
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0};
		gbl_panel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		label_38 = new JLabel("Comments");
		GridBagConstraints gbc_label_38 = new GridBagConstraints();
		gbc_label_38.insets = new Insets(0, 0, 5, 0);
		gbc_label_38.gridx = 0;
		gbc_label_38.gridy = 0;
		panel.add(label_38, gbc_label_38);
		
		textArea = new JTextArea();
		GridBagConstraints gbc_textArea = new GridBagConstraints();
		gbc_textArea.fill = GridBagConstraints.BOTH;
		gbc_textArea.gridx = 0;
		gbc_textArea.gridy = 1;
		panel.add(textArea, gbc_textArea);
		
				btnSubmit = new JButton("Submit");
				btnSubmit.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						try {
							if (allFieldsFilled()) {
								if (workStationComboBox.getSelectedItem().equals(
										"FEX340001")) {
									submitProcessLine1();
									JOptionPane.showMessageDialog(null,
											"SOC submitted for Line 1");
								} else if (workStationComboBox.getSelectedItem()
										.equals("FEX340002")) {
									submitProcessLine2();
									JOptionPane.showMessageDialog(null,
											"SOC submitted for Line 2");
								}

								else if (workStationComboBox.getSelectedItem().equals(
										"FEX340003")) {
									submitProcessLine3();
									JOptionPane.showMessageDialog(null,
											"SOC submitted for Line 3");
								} else if (workStationComboBox.getSelectedItem()
										.equals("FEX340004")) {
									submitProcessLine4();
									JOptionPane.showMessageDialog(null,
											"SOC submitted for Line 4");
								}

								else if (workStationComboBox.getSelectedItem().equals(
										"FEX340006")) {
									submitProcessLine6();
									JOptionPane.showMessageDialog(null,
											"SOC submitted for Line 6");
								}

								else if (workStationComboBox.getSelectedItem().equals(
										"FEX340007")) {
									submitProcessLine7();
									JOptionPane.showMessageDialog(null,
											"SOC submitted for Line 7");
								}

								else if (workStationComboBox.getSelectedItem().equals(
										"FEX340008")) {
									submitProcessLine8();
									JOptionPane.showMessageDialog(null,
											"SOC submitted for Line 8");
								}
								clearFields();
							} else {
								JOptionPane
										.showMessageDialog(null,
												"All fields must be filled before SOC can be submitted");
							}
						} catch (ClassNotFoundException e) {
							e.printStackTrace();
						} catch (SQLException e) {
							e.printStackTrace();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				});
				getFrame().getContentPane().add(btnSubmit,
						"cell 11 15,alignx center");
	}

	public void submitProcessLine1() throws ClassNotFoundException,
			SQLException, IOException {
		arrWeights.sqlConnection();
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		String dateTime = dateFormat.format(cal.getTime());
		String shift = shiftField.getText();
		String workStation = (String) workStationComboBox.getSelectedItem();
		String operator = operatorField.getText();
		String gauge = gaugeField.getText();
		double gaugeDouble = convertToDouble(gauge);
		String piw = piwField.getText();
		double piwDouble = convertToDouble(piw);
		String formula = formulaField.getText();
		int formulaInt = convertToInt(formula);
		String feetPerRoll = feetPerRollField.getText();
		int feetPerRollDec = convertToInt(feetPerRoll);
		String workOrder1 = workOrder1Field.getText();
		double workOrder1Double = convertToDouble(workOrder1);
		String workOrder2 = workOrder2Field.getText();
		double workOrder2Double = convertToDouble(workOrder2);
		String workOrder3 = workOrder3Field.getText();
		double workOrder3Double = convertToDouble(workOrder3);
		String workOrder4 = workOrder4Field.getText();
		double workOrder4Double = convertToDouble(workOrder4);
		String jNumber = jNumberField.getText();
		double jNumberDouble = convertToDouble(jNumber);
		String tableSpeed = tableSpeedField.getText();
		double tableSpeedDec = convertToDouble(tableSpeed);
		String screwSpeed = screwSpeedField.getText();
		double screwDouble = convertToDouble(screwSpeed);
		String dieNumber = dieNumberField.getText();
		double dieNumberDec = convertToDouble(dieNumber);
		String rbTemp = rbTempField.getText();
		double rbTempDouble = convertToDouble(rbTemp);
		String screenpack = screenPackField.getText();
		double screenpackDouble = convertToDouble(screenpack);
		String extruderAmps = extruderAmpsField.getText();
		double extruderAmpsDouble = convertToDouble(extruderAmps);
		String extruderPSI = extruderPSIField.getText();
		double extruderPSIdouble = convertToDouble(extruderPSI);
		String stretch = stretchField.getText();
		double stretchDouble = convertToDouble(stretch);
		String scrap = scrapField.getText();
		double scrapDouble = convertToDouble(scrap);
		String airRingSpeed = airRingSpeedField.getText();
		double airRingSpeedDouble = convertToDouble(airRingSpeed);
		String airRingTemp = airRingTempField.getText();
		double airRingTempDouble = convertToDouble(airRingTemp);
		String tempo = tempoField.getText();
		double tempoDouble = convertToDouble(tempo);
		String threeP = threePField.getText();
		double threePDouble = convertToDouble(threeP);
		String drumNip = drumNipField.getText();
		double drumNipDouble = convertToDouble(drumNip);
		String horizontalApply = horizontalApplyField.getText();
		double horizontalApplyDouble = convertToDouble(horizontalApply);
		String inflateAirShaft = inflateAirShaftField.getText();
		double inflateAirShaftDouble = convertToDouble(inflateAirShaft);
		String winderNipRoll = winderNipRollField.getText();
		double winderNipRollDouble = convertToDouble(winderNipRoll);
		String winderNipSpeed = winderNipSpeedField.getText();
		double winderNipSpeedDouble = convertToDouble(winderNipSpeed);
		String collapsingShieldSpeed = collapsingShieldSpeedField.getText();
		double collapsingShieldSpeedDouble = convertToDouble(collapsingShieldSpeed);
		String collapsingShieldTemp = collapsingShieldTempField.getText();
		double collapsingShieldTempField = convertToDouble(collapsingShieldTemp);
		String plenumTemp = plenumTempField.getText();
		double plenumTempDouble = convertToDouble(plenumTemp);
		String airRingGap = airRingGapField.getText();
		double airRingGapDouble = convertToDouble(airRingGap);
		String trimPullerSpeed = trimPullerSpeedField.getText();
		double trimPullerSpeedDouble = convertToDouble(trimPullerSpeed);
		String zone0Set = zone0SetField.getText();
		double zone0SetDouble = convertToDouble(zone0Set);
		String zone0Act = zone0ActField.getText();
		double zone0ActDouble = convertToDouble(zone0Act);
		String zone1Set = zone1SetField.getText();
		double zone1SetDouble = convertToDouble(zone1Set);
		String zone1Act = zone1ActField.getText();
		double zone1ActDouble = convertToDouble(zone1Act);
		String zone2Set = zone2SetField.getText();
		double zone2SetDouble = convertToDouble(zone2Set);
		String zone2Act = zone2ActField.getText();
		double zone2ActDouble = convertToDouble(zone2Act);
		String zone3Set = zone3SetField.getText();
		double zone3SetDouble = convertToDouble(zone3Set);
		String zone3Act = zone3ActField.getText();
		double zone3ActDouble = convertToDouble(zone3Act);
		String zone4Set = zone4SetField.getText();
		double zone4SetDouble = convertToDouble(zone4Set);
		String zone4Act = zone4ActField.getText();
		double zone4ActDouble = convertToDouble(zone4Act);
		String zone5Set = zone5SetField.getText();
		double zone5SetDouble = convertToDouble(zone5Set);
		String zone5Act = zone5ActField.getText();
		double zone5ActDouble = convertToDouble(zone5Act);
		String zone6Set = zone6SetField.getText();
		double zone6SetDouble = convertToDouble(zone6Set);
		String zone6Act = zone6ActField.getText();
		double zone6ActDouble = convertToDouble(zone6Act);
		String zone7Set = zone7SetField.getText();
		double zone7SetDouble = convertToDouble(zone7Set);
		String zone7Act = zone7ActField.getText();
		double zone7ActDouble = convertToDouble(zone7Act);
		String zone8Set = zone8SetField.getText();
		double zone8SetDouble = convertToDouble(zone8Set);
		String zone8Act = zone8ActField.getText();
		double zone8ActDouble = convertToDouble(zone8Act);
		String zone9Set = zone9SetField.getText();
		double zone9SetDouble = convertToDouble(zone9Set);
		String zone9Act = zone9ActField.getText();
		double zone9ActDouble = convertToDouble(zone9Act);
		String zoneB1Set = zoneB1SetField.getText();
		double zoneB1SetDouble = convertToDouble(zoneB1Set);
		String zoneB1Act = zoneB1ActField.getText();
		double zoneB1ActDouble = convertToDouble(zoneB1Act);
		String zoneB2Set = zoneB2SetField.getText();
		double zoneB2SetDouble = convertToDouble(zoneB2Set);
		String zoneB2Act = zoneB2ActField.getText();
		double zoneB2ActDouble = convertToDouble(zoneB2Act);

		try {
			CallableStatement cs = null;
			cs = arrWeights.conn
					.prepareCall("{call InsertArrProcessLine1(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
			cs.setString(1, dateTime);
			cs.setString(2, shift);
			cs.setString(3, workStation);
			cs.setString(4, operator);
			cs.setDouble(5, gaugeDouble);
			cs.setDouble(6, piwDouble);
			cs.setInt(7, formulaInt);
			cs.setDouble(8, feetPerRollDec);
			cs.setDouble(9, workOrder1Double);
			cs.setDouble(10, workOrder2Double);
			cs.setDouble(11, workOrder3Double);
			cs.setDouble(12, workOrder4Double);
			cs.setDouble(13, jNumberDouble);
			cs.setDouble(14, tableSpeedDec);
			cs.setDouble(15, screwDouble);
			cs.setDouble(16, dieNumberDec);
			cs.setDouble(17, rbTempDouble);
			cs.setDouble(18, screenpackDouble);
			cs.setDouble(19, extruderAmpsDouble);
			cs.setDouble(20, extruderPSIdouble);
			cs.setDouble(21, stretchDouble);
			cs.setDouble(22, scrapDouble);
			cs.setDouble(23, airRingSpeedDouble);
			cs.setDouble(24, airRingTempDouble);
			cs.setDouble(25, tempoDouble);
			cs.setDouble(26, threePDouble);
			cs.setDouble(27, drumNipDouble);
			cs.setDouble(28, horizontalApplyDouble);
			cs.setDouble(29, inflateAirShaftDouble);
			cs.setDouble(30, winderNipRollDouble);
			cs.setDouble(31, winderNipSpeedDouble);
			cs.setDouble(32, collapsingShieldSpeedDouble);
			cs.setDouble(33, collapsingShieldTempField);
			cs.setDouble(34, plenumTempDouble);
			cs.setDouble(35, airRingGapDouble);
			cs.setDouble(36, trimPullerSpeedDouble);
			cs.setDouble(37, zone0SetDouble);
			cs.setDouble(38, zone0ActDouble);
			cs.setDouble(39, zone1SetDouble);
			cs.setDouble(40, zone1ActDouble);
			cs.setDouble(41, zone2SetDouble);
			cs.setDouble(42, zone2ActDouble);
			cs.setDouble(43, zone3SetDouble);
			cs.setDouble(44, zone3ActDouble);
			cs.setDouble(45, zone4SetDouble);
			cs.setDouble(46, zone4ActDouble);
			cs.setDouble(47, zone5SetDouble);
			cs.setDouble(48, zone5ActDouble);
			cs.setDouble(49, zone6SetDouble);
			cs.setDouble(50, zone6ActDouble);
			cs.setDouble(51, zone7SetDouble);
			cs.setDouble(52, zone7ActDouble);
			cs.setDouble(53, zone8SetDouble);
			cs.setDouble(54, zone8ActDouble);
			cs.setDouble(55, zone9SetDouble);
			cs.setDouble(56, zone9ActDouble);
			cs.setDouble(57, zoneB1SetDouble);
			cs.setDouble(58, zoneB1ActDouble);
			cs.setDouble(59, zoneB2SetDouble);
			cs.setDouble(60, zoneB2ActDouble);
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

	public void submitProcessLine2() throws ClassNotFoundException,
			SQLException, IOException {
		arrWeights.sqlConnection();
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		String dateTime = dateFormat.format(cal.getTime());
		String shift = shiftField.getText();
		String workStation = (String) workStationComboBox.getSelectedItem();
		String operator = operatorField.getText();
		String gauge = gaugeField.getText();
		double gaugeDouble = convertToDouble(gauge);
		String piw = piwField.getText();
		double piwDouble = convertToDouble(piw);
		String formula = formulaField.getText();
		int formulaInt = convertToInt(formula);
		String feetPerRoll = feetPerRollField.getText();
		int feetPerRollDec = convertToInt(feetPerRoll);
		String workOrder1 = workOrder1Field.getText();
		double workOrder1Double = convertToDouble(workOrder1);
		String workOrder2 = workOrder2Field.getText();
		double workOrder2Double = convertToDouble(workOrder2);
		String workOrder3 = workOrder3Field.getText();
		double workOrder3Double = convertToDouble(workOrder3);
		String workOrder4 = workOrder4Field.getText();
		double workOrder4Double = convertToDouble(workOrder4);
		String jNumber = jNumberField.getText();
		double jNumberDouble = convertToDouble(jNumber);
		String tableSpeed = tableSpeedField.getText();
		double tableSpeedDec = convertToDouble(tableSpeed);
		String screwSpeed = screwSpeedField.getText();
		double screwDouble = convertToDouble(screwSpeed);
		String dieNumber = dieNumberField.getText();
		double dieNumberDec = convertToDouble(dieNumber);
		String rbTemp = rbTempField.getText();
		double rbTempDouble = convertToDouble(rbTemp);
		String screenpack = screenPackField.getText();
		double screenpackDouble = convertToDouble(screenpack);
		String extruderAmps = extruderAmpsField.getText();
		double extruderAmpsDouble = convertToDouble(extruderAmps);
		String extruderPSI = extruderPSIField.getText();
		double extruderPSIdouble = convertToDouble(extruderPSI);
		String stretch = stretchField.getText();
		double stretchDouble = convertToDouble(stretch);
		String scrap = scrapField.getText();
		double scrapDouble = convertToDouble(scrap);
		String airRingSpeed = airRingSpeedField.getText();
		double airRingSpeedDouble = convertToDouble(airRingSpeed);
		String airRingTemp = airRingTempField.getText();
		double airRingTempDouble = convertToDouble(airRingTemp);
		String drumNip = drumNipField.getText();
		double drumNipDouble = convertToDouble(drumNip);
		String winderNipRoll = winderNipRollField.getText();
		double winderNipRollDouble = convertToDouble(winderNipRoll);
		String winderNipSpeed = winderNipSpeedField.getText();
		double winderNipSpeedDouble = convertToDouble(winderNipSpeed);
		String collapsingShieldSpeed = collapsingShieldSpeedField.getText();
		double collapsingShieldSpeedDouble = convertToDouble(collapsingShieldSpeed);
		String collapsingShieldTemp = collapsingShieldTempField.getText();
		double collapsingShieldTempField = convertToDouble(collapsingShieldTemp);
		String plenumTemp = plenumTempField.getText();
		double plenumTempDouble = convertToDouble(plenumTemp);
		String airRingGap = airRingGapField.getText();
		double airRingGapDouble = convertToDouble(airRingGap);
		String fingerAdjustLeft = fingerAdjustLeftField.getText();
		double fingerAdjustLeftDouble = convertToDouble(fingerAdjustLeft);
		String fingerAdjustRight = fingerAdjustRightField.getText();
		double fingerAdjustRightDouble = convertToDouble(fingerAdjustRight);
		String trimPullerSpeed = trimPullerSpeedField.getText();
		double trimPullerSpeedDouble = convertToDouble(trimPullerSpeed);
		String mandrelAirPressure = mandrelAirPressureField.getText();
		double mandrelAirPressureDouble = convertToDouble(mandrelAirPressure);
		String zone1Set = zone1SetField.getText();
		double zone1SetDouble = convertToDouble(zone1Set);
		String zone1Act = zone1ActField.getText();
		double zone1ActDouble = convertToDouble(zone1Act);
		String zone2Set = zone2SetField.getText();
		double zone2SetDouble = convertToDouble(zone2Set);
		String zone2Act = zone2ActField.getText();
		double zone2ActDouble = convertToDouble(zone2Act);
		String zone3Set = zone3SetField.getText();
		double zone3SetDouble = convertToDouble(zone3Set);
		String zone3Act = zone3ActField.getText();
		double zone3ActDouble = convertToDouble(zone3Act);
		String zone4Set = zone4SetField.getText();
		double zone4SetDouble = convertToDouble(zone4Set);
		String zone4Act = zone4ActField.getText();
		double zone4ActDouble = convertToDouble(zone4Act);
		String zone5Set = zone5SetField.getText();
		double zone5SetDouble = convertToDouble(zone5Set);
		String zone5Act = zone5ActField.getText();
		double zone5ActDouble = convertToDouble(zone5Act);
		String zone6Set = zone6SetField.getText();
		double zone6SetDouble = convertToDouble(zone6Set);
		String zone6Act = zone6ActField.getText();
		double zone6ActDouble = convertToDouble(zone6Act);
		String zone7Set = zone7SetField.getText();
		double zone7SetDouble = convertToDouble(zone7Set);
		String zone7Act = zone7ActField.getText();
		double zone7ActDouble = convertToDouble(zone7Act);
		String zone8Set = zone8SetField.getText();
		double zone8SetDouble = convertToDouble(zone8Set);
		String zone8Act = zone8ActField.getText();
		double zone8ActDouble = convertToDouble(zone8Act);
		String zone9Set = zone9SetField.getText();
		double zone9SetDouble = convertToDouble(zone9Set);
		String zone9Act = zone9ActField.getText();
		double zone9ActDouble = convertToDouble(zone9Act);
		String zone10Set = zone10SetField.getText();
		double zone10SetDouble = convertToDouble(zone10Set);
		String zone10Act = zone10ActField.getText();
		double zone10ActDouble = convertToDouble(zone10Act);
		String zone11Set = zone11SetField.getText();
		double zone11SetDouble = convertToDouble(zone11Set);
		String zone11Act = zone11ActField.getText();
		double zone11ActDouble = convertToDouble(zone11Act);
		String zone12Set = zone12SetField.getText();
		double zone12SetDouble = convertToDouble(zone12Set);
		String zone12Act = zone12ActField.getText();
		double zone12ActDouble = convertToDouble(zone12Act);
		String zone13Set = zone13SetField.getText();
		double zone13SetDouble = convertToDouble(zone13Set);
		String zone13Act = zone13ActField.getText();
		double zone13ActDouble = convertToDouble(zone13Act);
		try {
			CallableStatement cs = null;
			cs = arrWeights.conn
					.prepareCall("{call InsertArrProcessLine2(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
			cs.setString(1, dateTime);
			cs.setString(2, shift);
			cs.setString(3, workStation);
			cs.setString(4, operator);
			cs.setDouble(5, gaugeDouble);
			cs.setDouble(6, piwDouble);
			cs.setInt(7, formulaInt);
			cs.setDouble(8, feetPerRollDec);
			cs.setDouble(9, workOrder1Double);
			cs.setDouble(10, workOrder2Double);
			cs.setDouble(11, workOrder3Double);
			cs.setDouble(12, workOrder4Double);
			cs.setDouble(13, jNumberDouble);
			cs.setDouble(14, tableSpeedDec);
			cs.setDouble(15, screwDouble);
			cs.setDouble(16, dieNumberDec);
			cs.setDouble(17, rbTempDouble);
			cs.setDouble(18, screenpackDouble);
			cs.setDouble(19, extruderAmpsDouble);
			cs.setDouble(20, extruderPSIdouble);
			cs.setDouble(21, stretchDouble);
			cs.setDouble(22, scrapDouble);
			cs.setDouble(23, airRingSpeedDouble);
			cs.setDouble(24, airRingTempDouble);
			cs.setDouble(25, drumNipDouble);
			cs.setDouble(26, winderNipRollDouble);
			cs.setDouble(27, winderNipSpeedDouble);
			cs.setDouble(28, collapsingShieldSpeedDouble);
			cs.setDouble(29, collapsingShieldTempField);
			cs.setDouble(30, plenumTempDouble);
			cs.setDouble(31, airRingGapDouble);
			cs.setDouble(32, fingerAdjustLeftDouble);
			cs.setDouble(33, fingerAdjustRightDouble);
			cs.setDouble(34, trimPullerSpeedDouble);
			cs.setDouble(35, mandrelAirPressureDouble);
			cs.setDouble(36, zone1SetDouble);
			cs.setDouble(37, zone1ActDouble);
			cs.setDouble(38, zone2SetDouble);
			cs.setDouble(39, zone2ActDouble);
			cs.setDouble(40, zone3SetDouble);
			cs.setDouble(41, zone3ActDouble);
			cs.setDouble(42, zone4SetDouble);
			cs.setDouble(43, zone4ActDouble);
			cs.setDouble(44, zone5SetDouble);
			cs.setDouble(45, zone5ActDouble);
			cs.setDouble(46, zone6SetDouble);
			cs.setDouble(47, zone6ActDouble);
			cs.setDouble(48, zone7SetDouble);
			cs.setDouble(49, zone7ActDouble);
			cs.setDouble(50, zone8SetDouble);
			cs.setDouble(51, zone8ActDouble);
			cs.setDouble(52, zone9SetDouble);
			cs.setDouble(53, zone9ActDouble);
			cs.setDouble(54, zone10SetDouble);
			cs.setDouble(55, zone10ActDouble);
			cs.setDouble(56, zone11SetDouble);
			cs.setDouble(57, zone11ActDouble);
			cs.setDouble(58, zone12SetDouble);
			cs.setDouble(59, zone12ActDouble);
			cs.setDouble(60, zone13SetDouble);
			cs.setDouble(61, zone13ActDouble);
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

	public void submitProcessLine3() throws ClassNotFoundException,
			SQLException, IOException {
		arrWeights.sqlConnection();
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		String dateTime = dateFormat.format(cal.getTime());
		String shift = shiftField.getText();
		String workStation = (String) workStationComboBox.getSelectedItem();
		String operator = operatorField.getText();
		String gauge = gaugeField.getText();
		double gaugeDouble = convertToDouble(gauge);
		String piw = piwField.getText();
		double piwDouble = convertToDouble(piw);
		String formula = formulaField.getText();
		int formulaInt = convertToInt(formula);
		String feetPerRoll = feetPerRollField.getText();
		int feetPerRollDec = convertToInt(feetPerRoll);
		String workOrder1 = workOrder1Field.getText();
		double workOrder1Double = convertToDouble(workOrder1);
		String workOrder2 = workOrder2Field.getText();
		double workOrder2Double = convertToDouble(workOrder2);
		String workOrder3 = workOrder3Field.getText();
		double workOrder3Double = convertToDouble(workOrder3);
		String workOrder4 = workOrder4Field.getText();
		double workOrder4Double = convertToDouble(workOrder4);
		String jNumber = jNumberField.getText();
		double jNumberDouble = convertToDouble(jNumber);
		String tableSpeed = tableSpeedField.getText();
		double tableSpeedDec = convertToDouble(tableSpeed);
		String screwSpeed = screwSpeedField.getText();
		double screwDouble = convertToDouble(screwSpeed);
		String dieNumber = dieNumberField.getText();
		double dieNumberDec = convertToDouble(dieNumber);
		String rbTemp = rbTempField.getText();
		double rbTempDouble = convertToDouble(rbTemp);
		String screenpack = screenPackField.getText();
		double screenpackDouble = convertToDouble(screenpack);
		String extruderAmps = extruderAmpsField.getText();
		double extruderAmpsDouble = convertToDouble(extruderAmps);
		String stretch = stretchField.getText();
		double stretchDouble = convertToDouble(stretch);
		String scrap = scrapField.getText();
		double scrapDouble = convertToDouble(scrap);
		String drumTemp = drumTempField.getText();
		double drumTempDouble = convertToDouble(drumTemp);
		String pinchRollTemp = pinchRollTempField.getText();
		double pinchRollTempDouble = convertToDouble(pinchRollTemp);
		String airRingSpeed = airRingSpeedField.getText();
		double airRingSpeedDouble = convertToDouble(airRingSpeed);
		String airRingTemp = airRingTempField.getText();
		double airRingTempDouble = convertToDouble(airRingTemp);
		String trimLeftMeasure = trimLeftMeasureField.getText();
		double trimLeftMeasureDouble = convertToDouble(trimLeftMeasure);
		String trimRightMeasure = trimRightMeasureField.getText();
		double trimRightMeasureDouble = convertToDouble(trimRightMeasure);
		String airRingGap = airRingGapField.getText();
		double airRingGapDouble = convertToDouble(airRingGap);
		String trimPullerSpeed = trimPullerSpeedField.getText();
		double trimPullerSpeedDouble = convertToDouble(trimPullerSpeed);
		String feedValves = feedValvesField.getText();
		double feedValvesDouble = convertToDouble(feedValves);
		String doors = doorsField.getText();
		double doorsDouble = convertToDouble(doors);
		String zone1Set = zone1SetField.getText();
		double zone1SetDouble = convertToDouble(zone1Set);
		String zone1Act = zone1ActField.getText();
		double zone1ActDouble = convertToDouble(zone1Act);
		String zone2Set = zone2SetField.getText();
		double zone2SetDouble = convertToDouble(zone2Set);
		String zone2Act = zone2ActField.getText();
		double zone2ActDouble = convertToDouble(zone2Act);
		String zone3Set = zone3SetField.getText();
		double zone3SetDouble = convertToDouble(zone3Set);
		String zone3Act = zone3ActField.getText();
		double zone3ActDouble = convertToDouble(zone3Act);
		String zone4Set = zone4SetField.getText();
		double zone4SetDouble = convertToDouble(zone4Set);
		String zone4Act = zone4ActField.getText();
		double zone4ActDouble = convertToDouble(zone4Act);
		String zone5Set = zone5SetField.getText();
		double zone5SetDouble = convertToDouble(zone5Set);
		String zone5Act = zone5ActField.getText();
		double zone5ActDouble = convertToDouble(zone5Act);
		String zone6Set = zone6SetField.getText();
		double zone6SetDouble = convertToDouble(zone6Set);
		String zone6Act = zone6ActField.getText();
		double zone6ActDouble = convertToDouble(zone6Act);
		String zone8Set = zone8SetField.getText();
		double zone8SetDouble = convertToDouble(zone8Set);
		String zone8Act = zone8ActField.getText();
		double zone8ActDouble = convertToDouble(zone8Act);
		String zone9Set = zone9SetField.getText();
		double zone9SetDouble = convertToDouble(zone9Set);
		String zone9Act = zone9ActField.getText();
		double zone9ActDouble = convertToDouble(zone9Act);
		String zone10Set = zone10SetField.getText();
		double zone10SetDouble = convertToDouble(zone10Set);
		String zone10Act = zone10ActField.getText();
		double zone10ActDouble = convertToDouble(zone10Act);
		try {
			CallableStatement cs = null;
			cs = arrWeights.conn
					.prepareCall("{call InsertArrProcessLine3(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
			cs.setString(1, dateTime);
			cs.setString(2, shift);
			cs.setString(3, workStation);
			cs.setString(4, operator);
			cs.setDouble(5, gaugeDouble);
			cs.setDouble(6, piwDouble);
			cs.setInt(7, formulaInt);
			cs.setDouble(8, feetPerRollDec);
			cs.setDouble(9, workOrder1Double);
			cs.setDouble(10, workOrder2Double);
			cs.setDouble(11, workOrder3Double);
			cs.setDouble(12, workOrder4Double);
			cs.setDouble(13, jNumberDouble);
			cs.setDouble(14, tableSpeedDec);
			cs.setDouble(15, screwDouble);
			cs.setDouble(16, dieNumberDec);
			cs.setDouble(17, rbTempDouble);
			cs.setDouble(18, screenpackDouble);
			cs.setDouble(19, extruderAmpsDouble);
			cs.setDouble(20, stretchDouble);
			cs.setDouble(21, scrapDouble);
			cs.setDouble(22, drumTempDouble);
			cs.setDouble(23, pinchRollTempDouble);
			cs.setDouble(24, airRingSpeedDouble);
			cs.setDouble(25, airRingTempDouble);
			cs.setDouble(26, trimLeftMeasureDouble);
			cs.setDouble(27, trimRightMeasureDouble);
			cs.setDouble(28, airRingGapDouble);
			cs.setDouble(29, trimPullerSpeedDouble);
			cs.setDouble(30, feedValvesDouble);
			cs.setDouble(31, doorsDouble);
			cs.setDouble(32, zone1SetDouble);
			cs.setDouble(33, zone1ActDouble);
			cs.setDouble(34, zone2SetDouble);
			cs.setDouble(35, zone2ActDouble);
			cs.setDouble(36, zone3SetDouble);
			cs.setDouble(37, zone3ActDouble);
			cs.setDouble(38, zone4SetDouble);
			cs.setDouble(39, zone4ActDouble);
			cs.setDouble(40, zone5SetDouble);
			cs.setDouble(41, zone5ActDouble);
			cs.setDouble(42, zone6SetDouble);
			cs.setDouble(43, zone6ActDouble);
			cs.setDouble(44, zone8SetDouble);
			cs.setDouble(45, zone8ActDouble);
			cs.setDouble(46, zone9SetDouble);
			cs.setDouble(47, zone9ActDouble);
			cs.setDouble(48, zone10SetDouble);
			cs.setDouble(49, zone10ActDouble);
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

	public void submitProcessLine4() throws ClassNotFoundException,
			SQLException, IOException {
		arrWeights.sqlConnection();
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		String dateTime = dateFormat.format(cal.getTime());
		String shift = shiftField.getText();
		String workStation = (String) workStationComboBox.getSelectedItem();
		String operator = operatorField.getText();
		String gauge = gaugeField.getText();
		double gaugeDouble = convertToDouble(gauge);
		String piw = piwField.getText();
		double piwDouble = convertToDouble(piw);
		String formula = formulaField.getText();
		int formulaInt = convertToInt(formula);
		String feetPerRoll = feetPerRollField.getText();
		int feetPerRollDec = convertToInt(feetPerRoll);
		String workOrder1 = workOrder1Field.getText();
		double workOrder1Double = convertToDouble(workOrder1);
		String workOrder2 = workOrder2Field.getText();
		double workOrder2Double = convertToDouble(workOrder2);
		String workOrder3 = workOrder3Field.getText();
		double workOrder3Double = convertToDouble(workOrder3);
		String workOrder4 = workOrder4Field.getText();
		double workOrder4Double = convertToDouble(workOrder4);
		String jNumber = jNumberField.getText();
		double jNumberDouble = convertToDouble(jNumber);
		String tableSpeed = tableSpeedField.getText();
		double tableSpeedDec = convertToDouble(tableSpeed);
		String screwSpeed = screwSpeedField.getText();
		double screwDouble = convertToDouble(screwSpeed);
		String dieNumber = dieNumberField.getText();
		double dieNumberDec = convertToDouble(dieNumber);
		String rbTemp = rbTempField.getText();
		double rbTempDouble = convertToDouble(rbTemp);
		String screenpack = screenPackField.getText();
		double screenpackDouble = convertToDouble(screenpack);
		String extruderAmps = extruderAmpsField.getText();
		double extruderAmpsDouble = convertToDouble(extruderAmps);
		String stretch = stretchField.getText();
		double stretchDouble = convertToDouble(stretch);
		String scrap = scrapField.getText();
		double scrapDouble = convertToDouble(scrap);
		String drumTemp = drumTempField.getText();
		double drumTempDouble = convertToDouble(drumTemp);
		String pinchRollTemp = pinchRollTempField.getText();
		double pinchRollTempDouble = convertToDouble(pinchRollTemp);
		String airRingSpeed = airRingSpeedField.getText();
		double airRingSpeedDouble = convertToDouble(airRingSpeed);
		String airRingTemp = airRingTempField.getText();
		double airRingTempDouble = convertToDouble(airRingTemp);
		String trimLeftMeasure = trimLeftMeasureField.getText();
		double trimLeftMeasureDouble = convertToDouble(trimLeftMeasure);
		String trimRightMeasure = trimRightMeasureField.getText();
		double trimRightMeasureDouble = convertToDouble(trimRightMeasure);
		String airRingGap = airRingGapField.getText();
		double airRingGapDouble = convertToDouble(airRingGap);
		String trimPullerSpeed = trimPullerSpeedField.getText();
		double trimPullerSpeedDouble = convertToDouble(trimPullerSpeed);
		String feedValves = feedValvesField.getText();
		double feedValvesDouble = convertToDouble(feedValves);
		String doors = doorsField.getText();
		double doorsDouble = convertToDouble(doors);
		String zone1Set = zone1SetField.getText();
		double zone1SetDouble = convertToDouble(zone1Set);
		String zone1Act = zone1ActField.getText();
		double zone1ActDouble = convertToDouble(zone1Act);
		String zone2Set = zone2SetField.getText();
		double zone2SetDouble = convertToDouble(zone2Set);
		String zone2Act = zone2ActField.getText();
		double zone2ActDouble = convertToDouble(zone2Act);
		String zone3Set = zone3SetField.getText();
		double zone3SetDouble = convertToDouble(zone3Set);
		String zone3Act = zone3ActField.getText();
		double zone3ActDouble = convertToDouble(zone3Act);
		String zone4Set = zone4SetField.getText();
		double zone4SetDouble = convertToDouble(zone4Set);
		String zone4Act = zone4ActField.getText();
		double zone4ActDouble = convertToDouble(zone4Act);
		String zone5Set = zone5SetField.getText();
		double zone5SetDouble = convertToDouble(zone5Set);
		String zone5Act = zone5ActField.getText();
		double zone5ActDouble = convertToDouble(zone5Act);
		String zone6Set = zone6SetField.getText();
		double zone6SetDouble = convertToDouble(zone6Set);
		String zone6Act = zone6ActField.getText();
		double zone6ActDouble = convertToDouble(zone6Act);
		String zone8Set = zone8SetField.getText();
		double zone8SetDouble = convertToDouble(zone8Set);
		String zone8Act = zone8ActField.getText();
		double zone8ActDouble = convertToDouble(zone8Act);
		String zone9Set = zone9SetField.getText();
		double zone9SetDouble = convertToDouble(zone9Set);
		String zone9Act = zone9ActField.getText();
		double zone9ActDouble = convertToDouble(zone9Act);
		String zone10Set = zone10SetField.getText();
		double zone10SetDouble = convertToDouble(zone10Set);
		String zone10Act = zone10ActField.getText();
		double zone10ActDouble = convertToDouble(zone10Act);
		try {
			CallableStatement cs = null;
			cs = arrWeights.conn
					.prepareCall("{call InsertArrProcessLine4(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
			cs.setString(1, dateTime);
			cs.setString(2, shift);
			cs.setString(3, workStation);
			cs.setString(4, operator);
			cs.setDouble(5, gaugeDouble);
			cs.setDouble(6, piwDouble);
			cs.setInt(7, formulaInt);
			cs.setDouble(8, feetPerRollDec);
			cs.setDouble(9, workOrder1Double);
			cs.setDouble(10, workOrder2Double);
			cs.setDouble(11, workOrder3Double);
			cs.setDouble(12, workOrder4Double);
			cs.setDouble(13, jNumberDouble);
			cs.setDouble(14, tableSpeedDec);
			cs.setDouble(15, screwDouble);
			cs.setDouble(16, dieNumberDec);
			cs.setDouble(17, rbTempDouble);
			cs.setDouble(18, screenpackDouble);
			cs.setDouble(19, extruderAmpsDouble);
			cs.setDouble(20, stretchDouble);
			cs.setDouble(21, scrapDouble);
			cs.setDouble(22, drumTempDouble);
			cs.setDouble(23, pinchRollTempDouble);
			cs.setDouble(24, airRingSpeedDouble);
			cs.setDouble(25, airRingTempDouble);
			cs.setDouble(26, trimLeftMeasureDouble);
			cs.setDouble(27, trimRightMeasureDouble);
			cs.setDouble(28, airRingGapDouble);
			cs.setDouble(29, trimPullerSpeedDouble);
			cs.setDouble(30, feedValvesDouble);
			cs.setDouble(31, doorsDouble);
			cs.setDouble(32, zone1SetDouble);
			cs.setDouble(33, zone1ActDouble);
			cs.setDouble(34, zone2SetDouble);
			cs.setDouble(35, zone2ActDouble);
			cs.setDouble(36, zone3SetDouble);
			cs.setDouble(37, zone3ActDouble);
			cs.setDouble(38, zone4SetDouble);
			cs.setDouble(39, zone4ActDouble);
			cs.setDouble(40, zone5SetDouble);
			cs.setDouble(41, zone5ActDouble);
			cs.setDouble(42, zone6SetDouble);
			cs.setDouble(43, zone6ActDouble);
			cs.setDouble(44, zone8SetDouble);
			cs.setDouble(45, zone8ActDouble);
			cs.setDouble(46, zone9SetDouble);
			cs.setDouble(47, zone9ActDouble);
			cs.setDouble(48, zone10SetDouble);
			cs.setDouble(49, zone10ActDouble);
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

	public void submitProcessLine6() throws ClassNotFoundException,
			SQLException, IOException {
		arrWeights.sqlConnection();
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		String dateTime = dateFormat.format(cal.getTime());
		String shift = shiftField.getText();
		String workStation = (String) workStationComboBox.getSelectedItem();
		String operator = operatorField.getText();
		String gauge = gaugeField.getText();
		double gaugeDouble = convertToDouble(gauge);
		String piw = piwField.getText();
		double piwDouble = convertToDouble(piw);
		String formula = formulaField.getText();
		int formulaInt = convertToInt(formula);
		String feetPerRoll = feetPerRollField.getText();
		int feetPerRollDec = convertToInt(feetPerRoll);
		String workOrder1 = workOrder1Field.getText();
		double workOrder1Double = convertToDouble(workOrder1);
		String workOrder2 = workOrder2Field.getText();
		double workOrder2Double = convertToDouble(workOrder2);
		String workOrder3 = workOrder3Field.getText();
		double workOrder3Double = convertToDouble(workOrder3);
		String workOrder4 = workOrder4Field.getText();
		double workOrder4Double = convertToDouble(workOrder4);
		String jNumber = jNumberField.getText();
		double jNumberDouble = convertToDouble(jNumber);
		String primeNipSpeed = primeNipSpeedField.getText();
		double primeNipSpeedDouble = convertToDouble(primeNipSpeed);
		String primeWinderSpeed = primeWinderSpeedField.getText();
		double primeWinderSpeedDouble = convertToDouble(primeWinderSpeed);
		String secondWinderSpeed = secondWinderSpeedField.getText();
		double secondWinderSpeedDouble = convertToDouble(secondWinderSpeed);
		String secondNipSpeed = secondNipSpeedField.getText();
		double secondNipSpeedDouble = convertToDouble(secondNipSpeed);
		String screwSpeed = screwSpeedField.getText();
		double screwDouble = convertToDouble(screwSpeed);
		String rbTemp = rbTempField.getText();
		double rbTempDouble = convertToDouble(rbTemp);
		String screenpack = screenPackField.getText();
		double screenpackDouble = convertToDouble(screenpack);
		String extruderAmps = extruderAmpsField.getText();
		double extruderAmpsDouble = convertToDouble(extruderAmps);
		String extruderPSI = extruderPSIField.getText();
		double extruderPSIdouble = convertToDouble(extruderPSI);
		String scrap = scrapField.getText();
		double scrapDouble = convertToDouble(scrap);
		String airRingSpeed = airRingSpeedField.getText();
		double airRingSpeedDouble = convertToDouble(airRingSpeed);
		String airRingTemp = airRingTempField.getText();
		double airRingTempDouble = convertToDouble(airRingTemp);
		String winderNipRoll = winderNipRollField.getText();
		double winderNipRollDouble = convertToDouble(winderNipRoll);
		String mixDropTemp = mixDropTempField.getText();
		double mixDropTempDouble = convertToDouble(mixDropTemp);
		String plenumTemp = plenumTempField.getText();
		double plenumTempDouble = convertToDouble(plenumTemp);
		String plenumSpeed = plenumSpeedField.getText();
		double plenumSpeedDouble = convertToDouble(plenumSpeed);
		String airRingGap = airRingGapField.getText();
		double airRingGapDouble = convertToDouble(airRingGap);
		String trimPullerSpeed = trimPullerSpeedField.getText();
		double trimPullerSpeedDouble = convertToDouble(trimPullerSpeed);
		String feedValves = feedValvesField.getText();
		double feedValvesDouble = convertToDouble(feedValves);
		String doors = doorsField.getText();
		double doorsDouble = convertToDouble(doors);
		String feedValvesOpenPercent = feedValvesOpenPercentField.getText();
		double feedValvesOpenPercentDouble = convertToDouble(feedValvesOpenPercent);
		String zone1Set = zone1SetField.getText();
		double zone1SetDouble = convertToDouble(zone1Set);
		String zone1Act = zone1ActField.getText();
		double zone1ActDouble = convertToDouble(zone1Act);
		String zone2Set = zone2SetField.getText();
		double zone2SetDouble = convertToDouble(zone2Set);
		String zone2Act = zone2ActField.getText();
		double zone2ActDouble = convertToDouble(zone2Act);
		String zone3Set = zone3SetField.getText();
		double zone3SetDouble = convertToDouble(zone3Set);
		String zone3Act = zone3ActField.getText();
		double zone3ActDouble = convertToDouble(zone3Act);
		String zone4Set = zone4SetField.getText();
		double zone4SetDouble = convertToDouble(zone4Set);
		String zone4Act = zone4ActField.getText();
		double zone4ActDouble = convertToDouble(zone4Act);
		String zone5Set = zone5SetField.getText();
		double zone5SetDouble = convertToDouble(zone5Set);
		String zone5Act = zone5ActField.getText();
		double zone5ActDouble = convertToDouble(zone5Act);
		String zone6Set = zone6SetField.getText();
		double zone6SetDouble = convertToDouble(zone6Set);
		String zone6Act = zone6ActField.getText();
		double zone6ActDouble = convertToDouble(zone6Act);
		String zone7ASet = zone7ASetField.getText();
		double zone7ASetDouble = convertToDouble(zone7ASet);
		String zone7AAct = zone7AActField.getText();
		double zone7AActDouble = convertToDouble(zone7AAct);
		String zone7BSet = zone7BSetField.getText();
		double zone7BSetDouble = convertToDouble(zone7BSet);
		String zone7BAct = zone7BActField.getText();
		double zone7BActDouble = convertToDouble(zone7BAct);
		String zone7CSet = zone7CSetField.getText();
		double zone7CSetDouble = convertToDouble(zone7CSet);
		String zone7CAct = zone7CActField.getText();
		double zone7CActDouble = convertToDouble(zone7CAct);
		String zone8Set = zone8SetField.getText();
		double zone8SetDouble = convertToDouble(zone8Set);
		String zone8Act = zone8ActField.getText();
		double zone8ActDouble = convertToDouble(zone8Act);
		String zone9Set = zone9SetField.getText();
		double zone9SetDouble = convertToDouble(zone9Set);
		String zone9Act = zone9ActField.getText();
		double zone9ActDouble = convertToDouble(zone9Act);
		String zone10Set = zone10SetField.getText();
		double zone10SetDouble = convertToDouble(zone10Set);
		String zone10Act = zone10ActField.getText();
		double zone10ActDouble = convertToDouble(zone10Act);
		String coreOutDiameterPrimary = coreOutDiameterPrimaryField.getText();
		double coreOutDiameterPrimaryDouble = convertToDouble(coreOutDiameterPrimary);
		String rollLengthPrimary = rollLengthPrimaryField.getText();
		double rollLengthPrimaryDouble = convertToDouble(rollLengthPrimary);
		String endRollWarningPrimary = endRollWarningPrimaryField.getText();
		double endRollWarningPrimaryDouble = convertToDouble(endRollWarningPrimary);
		String endRollTransferPrimary = endRollTransferPrimaryField.getText();
		double endRollTransferPrimaryDouble = convertToDouble(endRollTransferPrimary);
		String forceSetPointPrimary = forceSetPointPrimaryField.getText();
		double forceSetPointPrimaryDouble = convertToDouble(forceSetPointPrimary);
		String drumToNipTrimPrimary = drumtoNipTrimPrimaryField.getText();
		double drumToNipTrimPrimaryDouble = convertToDouble(drumToNipTrimPrimary);
		String coreOutDiameterSecondary = coreOutDiameterSecondaryField
				.getText();
		double coreOutDiameterSecondaryDouble = convertToDouble(coreOutDiameterSecondary);
		String rollLengthPrimarySecondary = rollLengthPrimarySecondaryField
				.getText();
		double rollLengthPrimarySecondaryDouble = convertToDouble(rollLengthPrimarySecondary);
		String endRollWarningSecondary = endRollWarningSecondaryField.getText();
		double endRollWarningSecondaryDouble = convertToDouble(endRollWarningSecondary);
		String endRollTransferSecondary = endRollTransferSecondaryField
				.getText();
		double endRollTransferSecondaryDouble = convertToDouble(endRollTransferSecondary);
		String forceSetPointSecondary = forceSetPointSecondaryField.getText();
		double forceSetPointSecondaryDouble = convertToDouble(forceSetPointSecondary);
		String drumToNipTrimSecondary = drumToNipTrimSecondaryField.getText();
		double drumToNipTrimSecondaryDouble = convertToDouble(drumToNipTrimSecondary);
		try {
			CallableStatement cs = null;
			cs = arrWeights.conn
					.prepareCall("{call InsertArrProcessLine6(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
			cs.setString(1, dateTime);
			cs.setString(2, shift);
			cs.setString(3, workStation);
			cs.setString(4, operator);
			cs.setDouble(5, gaugeDouble);
			cs.setDouble(6, piwDouble);
			cs.setInt(7, formulaInt);
			cs.setDouble(8, feetPerRollDec);
			cs.setDouble(9, workOrder1Double);
			cs.setDouble(10, workOrder2Double);
			cs.setDouble(11, workOrder3Double);
			cs.setDouble(12, workOrder4Double);
			cs.setDouble(13, jNumberDouble);
			cs.setDouble(14, primeNipSpeedDouble);
			cs.setDouble(15, secondNipSpeedDouble);
			cs.setDouble(16, primeWinderSpeedDouble);
			cs.setDouble(17, secondWinderSpeedDouble);
			cs.setDouble(18, screwDouble);
			cs.setDouble(19, rbTempDouble);
			cs.setDouble(20, screenpackDouble);
			cs.setDouble(21, extruderAmpsDouble);
			cs.setDouble(22, extruderPSIdouble);
			cs.setDouble(23, scrapDouble);
			cs.setDouble(24, airRingSpeedDouble);
			cs.setDouble(25, airRingTempDouble);
			cs.setDouble(26, winderNipRollDouble);
			cs.setDouble(27, mixDropTempDouble);
			cs.setDouble(28, plenumTempDouble);
			cs.setDouble(29, plenumSpeedDouble);
			cs.setDouble(30, airRingGapDouble);
			cs.setDouble(31, trimPullerSpeedDouble);
			cs.setDouble(32, feedValvesDouble);
			cs.setDouble(33, doorsDouble);
			cs.setDouble(34, feedValvesOpenPercentDouble);
			cs.setDouble(35, zone1SetDouble);
			cs.setDouble(36, zone1ActDouble);
			cs.setDouble(37, zone2SetDouble);
			cs.setDouble(38, zone2ActDouble);
			cs.setDouble(39, zone3SetDouble);
			cs.setDouble(40, zone3ActDouble);
			cs.setDouble(41, zone4SetDouble);
			cs.setDouble(42, zone4ActDouble);
			cs.setDouble(43, zone5SetDouble);
			cs.setDouble(44, zone5ActDouble);
			cs.setDouble(45, zone6SetDouble);
			cs.setDouble(46, zone6ActDouble);
			cs.setDouble(47, zone7ASetDouble);
			cs.setDouble(48, zone7AActDouble);
			cs.setDouble(49, zone7BSetDouble);
			cs.setDouble(50, zone7BActDouble);
			cs.setDouble(51, zone7CSetDouble);
			cs.setDouble(52, zone7CActDouble);
			cs.setDouble(53, zone8SetDouble);
			cs.setDouble(54, zone8ActDouble);
			cs.setDouble(55, zone9SetDouble);
			cs.setDouble(56, zone9ActDouble);
			cs.setDouble(57, zone10SetDouble);
			cs.setDouble(58, zone10ActDouble);
			cs.setDouble(59, coreOutDiameterPrimaryDouble);
			cs.setDouble(60, rollLengthPrimaryDouble);
			cs.setDouble(61, endRollWarningPrimaryDouble);
			cs.setDouble(62, endRollTransferPrimaryDouble);
			cs.setDouble(63, forceSetPointPrimaryDouble);
			cs.setDouble(64, drumToNipTrimPrimaryDouble);
			cs.setDouble(65, coreOutDiameterSecondaryDouble);
			cs.setDouble(66, rollLengthPrimarySecondaryDouble);
			cs.setDouble(67, endRollWarningSecondaryDouble);
			cs.setDouble(68, endRollTransferSecondaryDouble);
			cs.setDouble(69, forceSetPointSecondaryDouble);
			cs.setDouble(70, drumToNipTrimSecondaryDouble);
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

	public void submitProcessLine7() throws ClassNotFoundException,
			SQLException, IOException {
		arrWeights.sqlConnection();
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		String dateTime = dateFormat.format(cal.getTime());
		String shift = shiftField.getText();
		String workStation = (String) workStationComboBox.getSelectedItem();
		String operator = operatorField.getText();
		String gauge = gaugeField.getText();
		double gaugeDouble = convertToDouble(gauge);
		String piw = piwField.getText();
		double piwDouble = convertToDouble(piw);
		String formula = formulaField.getText();
		int formulaInt = convertToInt(formula);
		String feetPerRoll = feetPerRollField.getText();
		int feetPerRollDec = convertToInt(feetPerRoll);
		String workOrder1 = workOrder1Field.getText();
		double workOrder1Double = convertToDouble(workOrder1);
		String workOrder2 = workOrder2Field.getText();
		double workOrder2Double = convertToDouble(workOrder2);
		String workOrder3 = workOrder3Field.getText();
		double workOrder3Double = convertToDouble(workOrder3);
		String workOrder4 = workOrder4Field.getText();
		double workOrder4Double = convertToDouble(workOrder4);
		String jNumber = jNumberField.getText();
		double jNumberDouble = convertToDouble(jNumber);
		String tableSpeed = tableSpeedField.getText();
		double tableSpeedDec = convertToDouble(tableSpeed);
		String screwSpeed = screwSpeedField.getText();
		double screwDouble = convertToDouble(screwSpeed);
		String dieNumber = dieNumberField.getText();
		double dieNumberDec = convertToDouble(dieNumber);
		String rbTemp = rbTempField.getText();
		double rbTempDouble = convertToDouble(rbTemp);
		String screenpack = screenPackField.getText();
		double screenpackDouble = convertToDouble(screenpack);
		String extruderAmps = extruderAmpsField.getText();
		double extruderAmpsDouble = convertToDouble(extruderAmps);
		String stretch = stretchField.getText();
		double stretchDouble = convertToDouble(stretch);
		String scrap = scrapField.getText();
		double scrapDouble = convertToDouble(scrap);
		String drumTemp = drumTempField.getText();
		double drumTempDouble = convertToDouble(drumTemp);
		String pinchRollTemp = pinchRollTempField.getText();
		double pinchRollTempDouble = convertToDouble(pinchRollTemp);
		String airRingSpeed = airRingSpeedField.getText();
		double airRingSpeedDouble = convertToDouble(airRingSpeed);
		String trimLeftMeasure = trimLeftMeasureField.getText();
		double trimLeftMeasureDouble = convertToDouble(trimLeftMeasure);
		String trimRightMeasure = trimRightMeasureField.getText();
		double trimRightMeasureDouble = convertToDouble(trimRightMeasure);
		String airRingGap = airRingGapField.getText();
		double airRingGapDouble = convertToDouble(airRingGap);
		String curtainLinks = curtainLinksField.getText();
		double curtainLinksDouble = convertToDouble(curtainLinks);
		String trimPullerSpeed = trimPullerSpeedField.getText();
		double trimPullerSpeedDouble = convertToDouble(trimPullerSpeed);
		String feedValves = feedValvesField.getText();
		double feedValvesDouble = convertToDouble(feedValves);
		String zone1Set = zone1SetField.getText();
		double zone1SetDouble = convertToDouble(zone1Set);
		String zone1Act = zone1ActField.getText();
		double zone1ActDouble = convertToDouble(zone1Act);
		String zone2Set = zone2SetField.getText();
		double zone2SetDouble = convertToDouble(zone2Set);
		String zone2Act = zone2ActField.getText();
		double zone2ActDouble = convertToDouble(zone2Act);
		String zone3Set = zone3SetField.getText();
		double zone3SetDouble = convertToDouble(zone3Set);
		String zone3Act = zone3ActField.getText();
		double zone3ActDouble = convertToDouble(zone3Act);
		String zone4Set = zone4SetField.getText();
		double zone4SetDouble = convertToDouble(zone4Set);
		String zone4Act = zone4ActField.getText();
		double zone4ActDouble = convertToDouble(zone4Act);
		String zone5Set = zone5SetField.getText();
		double zone5SetDouble = convertToDouble(zone5Set);
		String zone5Act = zone5ActField.getText();
		double zone5ActDouble = convertToDouble(zone5Act);
		String zone6Set = zone6SetField.getText();
		double zone6SetDouble = convertToDouble(zone6Set);
		String zone6Act = zone6ActField.getText();
		double zone6ActDouble = convertToDouble(zone6Act);
		String zone7Set = zone7SetField.getText();
		double zone7SetDouble = convertToDouble(zone7Set);
		String zone7Act = zone7ActField.getText();
		double zone7ActDouble = convertToDouble(zone7Act);
		String zone8Set = zone8SetField.getText();
		double zone8SetDouble = convertToDouble(zone8Set);
		String zone8Act = zone8ActField.getText();
		double zone8ActDouble = convertToDouble(zone8Act);
		String zone9Set = zone9SetField.getText();
		double zone9SetDouble = convertToDouble(zone9Set);
		String zone9Act = zone9ActField.getText();
		double zone9ActDouble = convertToDouble(zone9Act);
		String zone10Set = zone10SetField.getText();
		double zone10SetDouble = convertToDouble(zone10Set);
		String zone10Act = zone10ActField.getText();
		double zone10ActDouble = convertToDouble(zone10Act);
		String zone11Set = zone11SetField.getText();
		double zone11SetDouble = convertToDouble(zone11Set);
		String zone11Act = zone11ActField.getText();
		double zone11ActDouble = convertToDouble(zone11Act);
		String hotRoll1Set = hotRoll1SetField.getText();
		double hotRoll1SetDouble = convertToDouble(hotRoll1Set);
		String hotRoll1Act = hotRoll1ActField.getText();
		double hotRoll1ActDouble = convertToDouble(hotRoll1Act);
		String hotRoll2Set = hotRoll2SetField.getText();
		double hotRoll2SetDouble = convertToDouble(hotRoll2Set);
		String hotRoll2Act = hotRoll2ActField.getText();
		double hotRoll2ActDouble = convertToDouble(hotRoll2Act);
		String chillRollSet = chillRollSetField.getText();
		double chillRollSetDouble = convertToDouble(chillRollSet);
		String chillRollAct = chillRollActField.getText();
		double chillRollActDouble = convertToDouble(chillRollAct);

		try {
			CallableStatement cs = null;
			cs = arrWeights.conn
					.prepareCall("{call InsertArrProcessLine7(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
			cs.setString(1, dateTime);
			cs.setString(2, shift);
			cs.setString(3, workStation);
			cs.setString(4, operator);
			cs.setDouble(5, gaugeDouble);
			cs.setDouble(6, piwDouble);
			cs.setInt(7, formulaInt);
			cs.setDouble(8, feetPerRollDec);
			cs.setDouble(9, workOrder1Double);
			cs.setDouble(10, workOrder2Double);
			cs.setDouble(11, workOrder3Double);
			cs.setDouble(12, workOrder4Double);
			cs.setDouble(13, jNumberDouble);
			cs.setDouble(14, tableSpeedDec);
			cs.setDouble(15, screwDouble);
			cs.setDouble(16, dieNumberDec);
			cs.setDouble(17, rbTempDouble);
			cs.setDouble(18, screenpackDouble);
			cs.setDouble(19, extruderAmpsDouble);
			cs.setDouble(20, stretchDouble);
			cs.setDouble(21, scrapDouble);
			cs.setDouble(22, drumTempDouble);
			cs.setDouble(23, pinchRollTempDouble);
			cs.setDouble(24, airRingSpeedDouble);
			cs.setDouble(25, trimLeftMeasureDouble);
			cs.setDouble(26, trimRightMeasureDouble);
			cs.setDouble(27, airRingGapDouble);
			cs.setDouble(28, curtainLinksDouble);
			cs.setDouble(29, trimPullerSpeedDouble);
			cs.setDouble(30, feedValvesDouble);
			cs.setDouble(31, zone1SetDouble);
			cs.setDouble(32, zone1ActDouble);
			cs.setDouble(33, zone2SetDouble);
			cs.setDouble(34, zone2ActDouble);
			cs.setDouble(35, zone3SetDouble);
			cs.setDouble(36, zone3ActDouble);
			cs.setDouble(37, zone4SetDouble);
			cs.setDouble(38, zone4ActDouble);
			cs.setDouble(39, zone5SetDouble);
			cs.setDouble(40, zone5ActDouble);
			cs.setDouble(41, zone6SetDouble);
			cs.setDouble(42, zone6ActDouble);
			cs.setDouble(43, zone7SetDouble);
			cs.setDouble(44, zone7ActDouble);
			cs.setDouble(45, zone8SetDouble);
			cs.setDouble(46, zone8ActDouble);
			cs.setDouble(47, zone9SetDouble);
			cs.setDouble(48, zone9ActDouble);
			cs.setDouble(49, zone10SetDouble);
			cs.setDouble(50, zone10ActDouble);
			cs.setDouble(51, zone11SetDouble);
			cs.setDouble(52, zone11ActDouble);
			cs.setDouble(53, hotRoll1SetDouble);
			cs.setDouble(54, hotRoll1ActDouble);
			cs.setDouble(55, hotRoll2SetDouble);
			cs.setDouble(56, hotRoll2ActDouble);
			cs.setDouble(57, chillRollSetDouble);
			cs.setDouble(58, chillRollActDouble);
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

	public void submitProcessLine8() throws ClassNotFoundException,
			SQLException, IOException {
		arrWeights.sqlConnection();
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		String dateTime = dateFormat.format(cal.getTime());
		String shift = shiftField.getText();
		String workStation = (String) workStationComboBox.getSelectedItem();
		String operator = operatorField.getText();
		String gauge = gaugeField.getText();
		double gaugeDouble = convertToDouble(gauge);
		String piw = piwField.getText();
		double piwDouble = convertToDouble(piw);
		String formula = formulaField.getText();
		int formulaInt = convertToInt(formula);
		String feetPerRoll = feetPerRollField.getText();
		int feetPerRollDec = convertToInt(feetPerRoll);
		String workOrder1 = workOrder1Field.getText();
		double workOrder1Double = convertToDouble(workOrder1);
		String workOrder2 = workOrder2Field.getText();
		double workOrder2Double = convertToDouble(workOrder2);
		String workOrder3 = workOrder3Field.getText();
		double workOrder3Double = convertToDouble(workOrder3);
		String workOrder4 = workOrder4Field.getText();
		double workOrder4Double = convertToDouble(workOrder4);
		String jNumber = jNumberField.getText();
		double jNumberDouble = convertToDouble(jNumber);
		String tableSpeed = tableSpeedField.getText();
		double tableSpeedDec = convertToDouble(tableSpeed);
		String screwSpeed = screwSpeedField.getText();
		double screwDouble = convertToDouble(screwSpeed);
		String dieNumber = dieNumberField.getText();
		double dieNumberDec = convertToDouble(dieNumber);
		String rbTemp = rbTempField.getText();
		double rbTempDouble = convertToDouble(rbTemp);
		String screenpack = screenPackField.getText();
		double screenpackDouble = convertToDouble(screenpack);
		String extruderAmps = extruderAmpsField.getText();
		double extruderAmpsDouble = convertToDouble(extruderAmps);
		String stretch = stretchField.getText();
		double stretchDouble = convertToDouble(stretch);
		String scrap = scrapField.getText();
		double scrapDouble = convertToDouble(scrap);
		String drumTemp = drumTempField.getText();
		double drumTempDouble = convertToDouble(drumTemp);
		String pinchRollTemp = pinchRollTempField.getText();
		double pinchRollTempDouble = convertToDouble(pinchRollTemp);
		String airRingSpeed = airRingSpeedField.getText();
		double airRingSpeedDouble = convertToDouble(airRingSpeed);
		String trimLeftMeasure = trimLeftMeasureField.getText();
		double trimLeftMeasureDouble = convertToDouble(trimLeftMeasure);
		String trimRightMeasure = trimRightMeasureField.getText();
		double trimRightMeasureDouble = convertToDouble(trimRightMeasure);
		String airRingGap = airRingGapField.getText();
		double airRingGapDouble = convertToDouble(airRingGap);
		String curtainLinks = curtainLinksField.getText();
		double curtainLinksDouble = convertToDouble(curtainLinks);
		String feedValves = feedValvesField.getText();
		double feedValvesDouble = convertToDouble(feedValves);
		String zone1Set = zone1SetField.getText();
		double zone1SetDouble = convertToDouble(zone1Set);
		String zone1Act = zone1ActField.getText();
		double zone1ActDouble = convertToDouble(zone1Act);
		String zone2Set = zone2SetField.getText();
		double zone2SetDouble = convertToDouble(zone2Set);
		String zone2Act = zone2ActField.getText();
		double zone2ActDouble = convertToDouble(zone2Act);
		String zone3Set = zone3SetField.getText();
		double zone3SetDouble = convertToDouble(zone3Set);
		String zone3Act = zone3ActField.getText();
		double zone3ActDouble = convertToDouble(zone3Act);
		String zone4Set = zone4SetField.getText();
		double zone4SetDouble = convertToDouble(zone4Set);
		String zone4Act = zone4ActField.getText();
		double zone4ActDouble = convertToDouble(zone4Act);
		String zone5Set = zone5SetField.getText();
		double zone5SetDouble = convertToDouble(zone5Set);
		String zone5Act = zone5ActField.getText();
		double zone5ActDouble = convertToDouble(zone5Act);
		String zone6Set = zone6SetField.getText();
		double zone6SetDouble = convertToDouble(zone6Set);
		String zone6Act = zone6ActField.getText();
		double zone6ActDouble = convertToDouble(zone6Act);
		String zone7Set = zone7SetField.getText();
		double zone7SetDouble = convertToDouble(zone7Set);
		String zone7Act = zone7ActField.getText();
		double zone7ActDouble = convertToDouble(zone7Act);
		String zone8Set = zone8SetField.getText();
		double zone8SetDouble = convertToDouble(zone8Set);
		String zone8Act = zone8ActField.getText();
		double zone8ActDouble = convertToDouble(zone8Act);
		String zone9Set = zone9SetField.getText();
		double zone9SetDouble = convertToDouble(zone9Set);
		String zone9Act = zone9ActField.getText();
		double zone9ActDouble = convertToDouble(zone9Act);
		String zone10Set = zone10SetField.getText();
		double zone10SetDouble = convertToDouble(zone10Set);
		String zone10Act = zone10ActField.getText();
		double zone10ActDouble = convertToDouble(zone10Act);
		String zone11Set = zone11SetField.getText();
		double zone11SetDouble = convertToDouble(zone11Set);
		String zone11Act = zone11ActField.getText();
		double zone11ActDouble = convertToDouble(zone11Act);
		String hotRoll1Set = hotRoll1SetField.getText();
		double hotRoll1SetDouble = convertToDouble(hotRoll1Set);
		String hotRoll1Act = hotRoll1ActField.getText();
		double hotRoll1ActDouble = convertToDouble(hotRoll1Act);
		String hotRoll2Set = hotRoll2SetField.getText();
		double hotRoll2SetDouble = convertToDouble(hotRoll2Set);
		String hotRoll2Act = hotRoll2ActField.getText();
		double hotRoll2ActDouble = convertToDouble(hotRoll2Act);
		String chillRollSet = chillRollSetField.getText();
		double chillRollSetDouble = convertToDouble(chillRollSet);
		String chillRollAct = chillRollActField.getText();
		double chillRollActDouble = convertToDouble(chillRollAct);

		try {
			CallableStatement cs = null;
			cs = arrWeights.conn
					.prepareCall("{call InsertArrProcessLine8(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
			cs.setString(1, dateTime);
			cs.setString(2, shift);
			cs.setString(3, workStation);
			cs.setString(4, operator);
			cs.setDouble(5, gaugeDouble);
			cs.setDouble(6, piwDouble);
			cs.setInt(7, formulaInt);
			cs.setDouble(8, feetPerRollDec);
			cs.setDouble(9, workOrder1Double);
			cs.setDouble(10, workOrder2Double);
			cs.setDouble(11, workOrder3Double);
			cs.setDouble(12, workOrder4Double);
			cs.setDouble(13, jNumberDouble);
			cs.setDouble(14, tableSpeedDec);
			cs.setDouble(15, screwDouble);
			cs.setDouble(16, dieNumberDec);
			cs.setDouble(17, rbTempDouble);
			cs.setDouble(18, screenpackDouble);
			cs.setDouble(19, extruderAmpsDouble);
			cs.setDouble(20, stretchDouble);
			cs.setDouble(21, scrapDouble);
			cs.setDouble(22, drumTempDouble);
			cs.setDouble(23, pinchRollTempDouble);
			cs.setDouble(24, airRingSpeedDouble);
			cs.setDouble(25, trimLeftMeasureDouble);
			cs.setDouble(26, trimRightMeasureDouble);
			cs.setDouble(27, airRingGapDouble);
			cs.setDouble(28, curtainLinksDouble);
			cs.setDouble(29, feedValvesDouble);
			cs.setDouble(30, zone1SetDouble);
			cs.setDouble(31, zone1ActDouble);
			cs.setDouble(32, zone2SetDouble);
			cs.setDouble(33, zone2ActDouble);
			cs.setDouble(34, zone3SetDouble);
			cs.setDouble(35, zone3ActDouble);
			cs.setDouble(36, zone4SetDouble);
			cs.setDouble(37, zone4ActDouble);
			cs.setDouble(38, zone5SetDouble);
			cs.setDouble(39, zone5ActDouble);
			cs.setDouble(40, zone6SetDouble);
			cs.setDouble(41, zone6ActDouble);
			cs.setDouble(42, zone7SetDouble);
			cs.setDouble(43, zone7ActDouble);
			cs.setDouble(44, zone8SetDouble);
			cs.setDouble(45, zone8ActDouble);
			cs.setDouble(46, zone9SetDouble);
			cs.setDouble(47, zone9ActDouble);
			cs.setDouble(48, zone10SetDouble);
			cs.setDouble(49, zone10ActDouble);
			cs.setDouble(50, zone11SetDouble);
			cs.setDouble(51, zone11ActDouble);
			cs.setDouble(52, hotRoll1SetDouble);
			cs.setDouble(53, hotRoll1ActDouble);
			cs.setDouble(54, hotRoll2SetDouble);
			cs.setDouble(55, hotRoll2ActDouble);
			cs.setDouble(56, chillRollSetDouble);
			cs.setDouble(57, chillRollActDouble);
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

	public int convertToInt(String val) {
		int newVal;
		if (!val.equals("")) {
			newVal = Integer.valueOf(val);
			return newVal;
		} else
			return 0;
	}

	public double convertToDouble(String val) {
		double newVal;
		if (!val.equals("")) {
			newVal = Double.valueOf(val);
			return newVal;
		} else
			return 0;
	}

	public void clearFields() {
		for (JTextField j : list)
			j.setText("");
	}

	public Boolean allFieldsFilled() {
		for (JTextField j : list) {
			if (j.isVisible()) {
				if (j.getText().equals("")) {
					return false;
				}
			}
		}
		return true;
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
}
