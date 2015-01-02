import java.awt.EventQueue;

import javax.swing.JFrame;

import net.miginfocom.swing.MigLayout;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

import javax.swing.JTextArea;

import java.awt.Insets;
import java.sql.SQLException;
import java.sql.Statement;
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

public class processConditions {

	private JFrame frame;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_6;
	private JLabel lblndNipSpeed;
	private JTextField textField_7;
	private JLabel lblPrimeWinderSpeed;
	private JLabel lblndWinderSpeed;
	private JLabel lblScrewSpeed;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JLabel lblRbTemp;
	private JTextField textField_11;
	private JLabel lblScreenPack;
	private JTextField textField_12;
	private JLabel lblExtruderAmps;
	private JTextField textField_13;
	private JLabel lblExtruderPsi;
	private JTextField textField_14;
	private JLabel lblScrap;
	private JTextField textField_15;
	private JLabel lblAirRingSpeed;
	private JTextField textField_16;
	private JLabel lblAirRingTemp;
	private JTextField textField_17;
	private JLabel lblWinderNipRoll;
	private JTextField textField_18;
	private JLabel lblMixDropTemp;
	private JTextField textField_19;
	private JLabel lblPlenumTemp;
	private JTextField textField_20;
	private JLabel lblPlenumSpeed;
	private JTextField textField_21;
	private JLabel lblAirRingGap;
	private JTextField textField_22;
	private JLabel lblTrimPullerSpeed;
	private JTextField textField_23;
	private JLabel lblFeedValves;
	private JTextField textField_24;
	private JLabel lblDoors;
	private JTextField textField_25;
	private JLabel lblFeedValvesOpen;
	private JTextField textField_26;
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
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTextField textField_39;
	private JTextField textField_40;
	private JTextField textField_41;
	private JTextField textField_42;
	private JTextField textField_43;
	private JTextField textField_44;
	private JTextField textField_45;
	private JTextField textField_46;
	private JTextField textField_47;
	private JTextField textField_48;
	private JTextField textField_49;
	private JTextField textField_50;
	private JPanel panel;
	private JLabel lblComments;
	private JTextArea textArea;
	private JPanel panel_1;
	private JLabel lblCoreOutDiameter;
	private JLabel lblCoreOutDiameter_1;
	private JTextField textField_51;
	private JTextField textField_52;
	private JSeparator separator;
	private JLabel lblRollLengthPrimary;
	private JLabel lblEndRollWarning;
	private JLabel lblEndRollTransfer;
	private JLabel lblForceSetPoint;
	private JLabel lblDrumToNip;
	private JTextField textField_53;
	private JTextField textField_54;
	private JTextField textField_55;
	private JTextField textField_56;
	private JTextField textField_57;
	private JLabel lblRollLengthPrimary_1;
	private JTextField textField_58;
	private JLabel lblEndRollWarning_1;
	private JTextField textField_59;
	private JLabel lblEndRollTransfer_1;
	private JTextField textField_60;
	private JLabel lblForceSetPoint_1;
	private JTextField textField_61;
	private JLabel lblDrumToNip_1;
	private JTextField textField_62;
	private JButton btnSubmit;
	private JLabel label;
	private JTextField textField_63;
	private JLabel label_1;
	private JTextField textField_64;
	private JLabel label_2;
	private JTextField textField_65;
	private JLabel label_3;
	private JTextField textField_66;
	private JLabel label_4;
	private JTextField textField_5;
	private JLabel label_5;
	private JTextField textField_4;
	private JLabel label_6;
	private JTextField textField_67;
	private JLabel label_7;
	private JTextField textField_68;
	private JLabel label_8;
	private JTextField textField_69;
	private JLabel label_9;
	private JTextField textField_70;
	private JLabel label_10;
	private JTextField textField_71;
	private JLabel label_11;
	private JTextField textField_72;
	private JLabel label_12;
	private JTextField textField_73;
	private JLabel label_13;
	private JTextField textField_74;
	private JLabel label_14;
	private JTextField textField_75;
	private JLabel label_15;
	private JTextField textField_76;
	private JLabel label_16;
	private JTextField textField_77;
	private JLabel label_17;
	private JTextField textField_78;
	private JLabel label_18;
	private JTextField textField_79;
	private JLabel label_19;
	private JTextField textField_80;
	private JLabel label_20;
	private JTextField textField_81;
	private JLabel label_21;
	private JTextField textField_82;
	private JLabel label_22;
	private JTextField textField_83;
	private JTextField textField_84;
	private JLabel label_23;
	private JTextField textField_85;
	private JTextField textField_86;
	private JTextField textField_87;
	private JTextField textField_88;
	private JTextField textField_89;
	private JTextField textField_90;
	private JTextField textField_91;
	private JTextField textField_92;
	private JTextField textField_93;
	private JTextField textField_94;
	private JTextField textField_95;
	private JTextField textField_96;
	private JTextField textField_97;
	private JTextField textField_98;
	private JTextField textField_99;
	private JTextField textField_100;
	private JLabel label_24;
	private JLabel label_25;
	private JLabel label_26;
	private JLabel label_27;
	private JLabel label_28;
	private JLabel label_29;
	private JLabel label_30;
	private JLabel label_32;
	private JTextField textField_103;
	private JComboBox comboBox;
	private JLabel lblPrimeNipSpeed;
	private JLabel label_31;
	private JTextField textField;
	private JTextField textField_101;
	private ArrayList<JTextField> list;
	private JLabel label_33;
	private JTextField textField_102;
	private JLabel label_34;
	private JLabel label_35;
	private JLabel label_37;
	private JTextField textField_104;
	private JTextField textField_105;
	private JTextField textField_106;
	private JLabel label_36;
	private JTextField textField_107;
	private JSeparator separator_1;
	private JPanel panel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					processConditions window = new processConditions();
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
	public processConditions() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Standard Operating Conditions");
		frame.setBounds(100, 1, 1055, 855);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane()
				.setLayout(
						new MigLayout("", "[grow][grow][grow][grow][grow][grow][grow][grow][grow][grow][][grow]", "[][25px:n][][][][][][25px:n][][][][][25px:n][][25px:n][][][25px:n][][][][][][][][25px:n][grow]"));

		panel_2 = new JPanel();
		list = new ArrayList<JTextField>();
		frame.getContentPane().add(panel_2, "flowx,cell 0 0 12 1,alignx right");
		panel_2.setLayout(new MigLayout("", "[grow][grow][grow][grow][grow][grow][grow][grow][grow][][][][][grow]", "[][]"));

		label = new JLabel("Shift Date");
		panel_2.add(label, "cell 0 0,alignx right");
		textField_63 = new JTextField();
		panel_2.add(textField_63, "cell 1 0");
		textField_63.setColumns(10);
		list.add(textField_63);

		label_1 = new JLabel("Shift");
		panel_2.add(label_1, "cell 2 0,alignx right");

		textField_64 = new JTextField();
		panel_2.add(textField_64, "flowx,cell 3 0");
		textField_64.setColumns(10);
		list.add(textField_64);

		JLabel lblWorkStation = new JLabel("Work Station");
		panel_2.add(lblWorkStation, "cell 4 0,alignx right");
		String[] lines = { "", "FEX340001", "FEX340002", "FEX340003",
				"FEX340004", "FEX340006", "FEX340007", "FEX340008" };
		comboBox = new JComboBox(lines);
		panel_2.add(comboBox, "cell 5 0");
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selected = (String) comboBox.getSelectedItem();
				selectLine(selected);
			}

			// adjust UI based on line selected
			private void selectLine(String line) {
				setAllVisible();
				if (line.equals("FEX340001")) {
					textField_6.setVisible(false);
					textField_7.setVisible(false);
					textField_8.setVisible(false);
					textField_9.setVisible(false);
					textField_68.setVisible(false);
					textField_69.setVisible(false);
					textField_19.setVisible(false);
					textField_21.setVisible(false);
					textField_77.setVisible(false);
					textField_78.setVisible(false);
					textField_79.setVisible(false);
					textField_80.setVisible(false);
					textField_81.setVisible(false);
					textField_82.setVisible(false);
					textField_24.setVisible(false);
					textField_25.setVisible(false);
					textField_26.setVisible(false);
					textField_39.setVisible(false);
					textField_40.setVisible(false);
					textField_41.setVisible(false);
					textField_42.setVisible(false);
					textField_43.setVisible(false);
					textField_44.setVisible(false);
					textField_49.setVisible(false);
					textField_50.setVisible(false);
					textField_51.setVisible(false);
					textField_52.setVisible(false);
					textField_53.setVisible(false);
					textField_54.setVisible(false);
					textField_55.setVisible(false);
					textField_56.setVisible(false);
					textField_57.setVisible(false);
					textField_58.setVisible(false);
					textField_59.setVisible(false);
					textField_60.setVisible(false);
					textField_61.setVisible(false);
					textField_62.setVisible(false);
					textField_85.setVisible(false);
					textField_86.setVisible(false);
					textField_87.setVisible(false);
					textField_88.setVisible(false);
					textField_89.setVisible(false);
					textField_90.setVisible(false);
					textField_95.setVisible(false);
					textField_96.setVisible(false);
					textField_97.setVisible(false);
					textField_98.setVisible(false);
					textField_99.setVisible(false);
					textField_100.setVisible(false);
				} else if (line.equals("FEX340002")) {
					textField_6.setVisible(false);
					textField_7.setVisible(false);
					textField_8.setVisible(false);
					textField_9.setVisible(false);
					textField_68.setVisible(false);
					textField_69.setVisible(false);
					textField_70.setVisible(false);
					textField_71.setVisible(false);
					textField_73.setVisible(false);
					textField_74.setVisible(false);
					textField_19.setVisible(false);
					textField_21.setVisible(false);
					textField_77.setVisible(false);
					textField_78.setVisible(false);
					textField_79.setVisible(false);
					textField_24.setVisible(false);
					textField_25.setVisible(false);
					textField_26.setVisible(false);
					textField_83.setVisible(false);
					textField_84.setVisible(false);
					textField_39.setVisible(false);
					textField_40.setVisible(false);
					textField_41.setVisible(false);
					textField_42.setVisible(false);
					textField_43.setVisible(false);
					textField_44.setVisible(false);
					textField_91.setVisible(false);
					textField_92.setVisible(false);
					textField_93.setVisible(false);
					textField_94.setVisible(false);
					textField_95.setVisible(false);
					textField_96.setVisible(false);
					textField_97.setVisible(false);
					textField_98.setVisible(false);
					textField_99.setVisible(false);
					textField_100.setVisible(false);
					textField_51.setVisible(false);
					textField_52.setVisible(false);
					textField_53.setVisible(false);
					textField_54.setVisible(false);
					textField_55.setVisible(false);
					textField_56.setVisible(false);
					textField_57.setVisible(false);
					textField_58.setVisible(false);
					textField_59.setVisible(false);
					textField_60.setVisible(false);
					textField_61.setVisible(false);
					textField_62.setVisible(false);

				} else if (line.equals("FEX340003")) {
					textField_6.setVisible(false);
					textField_7.setVisible(false);
					textField_8.setVisible(false);
					textField_9.setVisible(false);
					textField_70.setVisible(false);
					textField_71.setVisible(false);
					textField_73.setVisible(false);
					textField_74.setVisible(false);
					textField_19.setVisible(false);
					textField_21.setVisible(false);
					textField_79.setVisible(false);
					textField_26.setVisible(false);
					textField_83.setVisible(false);
					textField_84.setVisible(false);
					textField_39.setVisible(false);
					textField_40.setVisible(false);
					textField_41.setVisible(false);
					textField_42.setVisible(false);
					textField_43.setVisible(false);
					textField_44.setVisible(false);
					textField_91.setVisible(false);
					textField_92.setVisible(false);
					textField_93.setVisible(false);
					textField_94.setVisible(false);
					textField_95.setVisible(false);
					textField_96.setVisible(false);
					textField_97.setVisible(false);
					textField_98.setVisible(false);
					textField_99.setVisible(false);
					textField_100.setVisible(false);
					textField_51.setVisible(false);
					textField_52.setVisible(false);
					textField_53.setVisible(false);
					textField_54.setVisible(false);
					textField_55.setVisible(false);
					textField_56.setVisible(false);
					textField_57.setVisible(false);
					textField_58.setVisible(false);
					textField_59.setVisible(false);
					textField_60.setVisible(false);
					textField_61.setVisible(false);
					textField_62.setVisible(false);
					textField_14.setVisible(false);
					textField_72.setVisible(false);
					textField_18.setVisible(false);
					textField_75.setVisible(false);
					textField_76.setVisible(false);
					textField_20.setVisible(false);
					textField_80.setVisible(false);
					textField_81.setVisible(false);
					textField_82.setVisible(false);
					textField_85.setVisible(false);
					textField_86.setVisible(false);
					textField_87.setVisible(false);
					textField_88.setVisible(false);
					textField_89.setVisible(false);
					textField_90.setVisible(false);
					textField.setVisible(false);
					textField_101.setVisible(false);
					textField_102.setVisible(false);

				} else if (line.equals("FEX340004")) {
					textField_6.setVisible(false);
					textField_7.setVisible(false);
					textField_8.setVisible(false);
					textField_9.setVisible(false);
					textField_70.setVisible(false);
					textField_71.setVisible(false);
					textField_73.setVisible(false);
					textField_74.setVisible(false);
					textField_19.setVisible(false);
					textField_21.setVisible(false);
					textField_79.setVisible(false);
					textField_26.setVisible(false);
					textField_83.setVisible(false);
					textField_84.setVisible(false);
					textField_39.setVisible(false);
					textField_40.setVisible(false);
					textField_41.setVisible(false);
					textField_42.setVisible(false);
					textField_43.setVisible(false);
					textField_44.setVisible(false);
					textField_91.setVisible(false);
					textField_92.setVisible(false);
					textField_93.setVisible(false);
					textField_94.setVisible(false);
					textField_95.setVisible(false);
					textField_96.setVisible(false);
					textField_97.setVisible(false);
					textField_98.setVisible(false);
					textField_99.setVisible(false);
					textField_100.setVisible(false);
					textField_51.setVisible(false);
					textField_52.setVisible(false);
					textField_53.setVisible(false);
					textField_54.setVisible(false);
					textField_55.setVisible(false);
					textField_56.setVisible(false);
					textField_57.setVisible(false);
					textField_58.setVisible(false);
					textField_59.setVisible(false);
					textField_60.setVisible(false);
					textField_61.setVisible(false);
					textField_62.setVisible(false);
					textField_14.setVisible(false);
					textField_72.setVisible(false);
					textField_18.setVisible(false);
					textField_75.setVisible(false);
					textField_76.setVisible(false);
					textField_20.setVisible(false);
					textField_80.setVisible(false);
					textField_81.setVisible(false);
					textField_82.setVisible(false);
					textField_85.setVisible(false);
					textField_86.setVisible(false);
					textField_87.setVisible(false);
					textField_88.setVisible(false);
					textField_89.setVisible(false);
					textField_90.setVisible(false);
					textField.setVisible(false);
					textField_101.setVisible(false);
					textField_102.setVisible(false);

				} else if (line.equals("FEX340006")) {
					textField_5.setVisible(false);
					textField_4.setVisible(false);
					textField_67.setVisible(false);
					textField_68.setVisible(false);
					textField_69.setVisible(false);
					textField_70.setVisible(false);
					textField_71.setVisible(false);
					textField_72.setVisible(false);
					textField_73.setVisible(false);
					textField_74.setVisible(false);
					textField_75.setVisible(false);
					textField_76.setVisible(false);
					textField_77.setVisible(false);
					textField_78.setVisible(false);
					textField_79.setVisible(false);
					textField_80.setVisible(false);
					textField_81.setVisible(false);
					textField_82.setVisible(false);
					textField_83.setVisible(false);
					textField_84.setVisible(false);
					textField.setVisible(false);
					textField_101.setVisible(false);
					textField_85.setVisible(false);
					textField_86.setVisible(false);
					textField_87.setVisible(false);
					textField_88.setVisible(false);
					textField_89.setVisible(false);
					textField_90.setVisible(false);
					textField_91.setVisible(false);
					textField_92.setVisible(false);
					textField_93.setVisible(false);
					textField_94.setVisible(false);
					textField_95.setVisible(false);
					textField_96.setVisible(false);
					textField_97.setVisible(false);
					textField_98.setVisible(false);
					textField_99.setVisible(false);
					textField_100.setVisible(false);
					textField_102.setVisible(false);

				} else if (line.equals("FEX340007")) {
					textField_6.setVisible(false);
					textField_7.setVisible(false);
					textField_8.setVisible(false);
					textField_9.setVisible(false);
					textField_14.setVisible(false);
					textField_17.setVisible(false);
					textField_70.setVisible(false);
					textField_71.setVisible(false);
					textField_72.setVisible(false);
					textField_73.setVisible(false);
					textField_74.setVisible(false);
					textField_18.setVisible(false);
					textField_19.setVisible(false);
					textField_75.setVisible(false);
					textField_76.setVisible(false);
					textField_20.setVisible(false);
					textField_21.setVisible(false);
					textField_80.setVisible(false);
					textField_81.setVisible(false);
					textField_82.setVisible(false);
					textField_25.setVisible(false);
					textField_26.setVisible(false);
					textField_83.setVisible(false);
					textField_84.setVisible(false);
					textField_39.setVisible(false);
					textField_40.setVisible(false);
					textField_41.setVisible(false);
					textField_42.setVisible(false);
					textField_43.setVisible(false);
					textField_44.setVisible(false);
					textField_87.setVisible(false);
					textField_88.setVisible(false);
					textField_89.setVisible(false);
					textField_90.setVisible(false);
					textField_91.setVisible(false);
					textField_92.setVisible(false);
					textField_93.setVisible(false);
					textField_94.setVisible(false);
					textField_51.setVisible(false);
					textField_52.setVisible(false);
					textField_53.setVisible(false);
					textField_54.setVisible(false);
					textField_55.setVisible(false);
					textField_56.setVisible(false);
					textField_57.setVisible(false);
					textField_58.setVisible(false);
					textField_59.setVisible(false);
					textField_60.setVisible(false);
					textField_61.setVisible(false);
					textField_62.setVisible(false);
					textField_102.setVisible(false);

				} else if (line.equals("FEX340008")) {
					textField_6.setVisible(false);
					textField_7.setVisible(false);
					textField_8.setVisible(false);
					textField_9.setVisible(false);
					textField_14.setVisible(false);
					textField_17.setVisible(false);
					textField_70.setVisible(false);
					textField_71.setVisible(false);
					textField_72.setVisible(false);
					textField_73.setVisible(false);
					textField_74.setVisible(false);
					textField_18.setVisible(false);
					textField_19.setVisible(false);
					textField_75.setVisible(false);
					textField_76.setVisible(false);
					textField_20.setVisible(false);
					textField_21.setVisible(false);
					textField_80.setVisible(false);
					textField_81.setVisible(false);
					textField_82.setVisible(false);
					textField_25.setVisible(false);
					textField_26.setVisible(false);
					textField_83.setVisible(false);
					textField_84.setVisible(false);
					textField_39.setVisible(false);
					textField_40.setVisible(false);
					textField_41.setVisible(false);
					textField_42.setVisible(false);
					textField_43.setVisible(false);
					textField_44.setVisible(false);
					textField_87.setVisible(false);
					textField_88.setVisible(false);
					textField_89.setVisible(false);
					textField_90.setVisible(false);
					textField_91.setVisible(false);
					textField_92.setVisible(false);
					textField_93.setVisible(false);
					textField_94.setVisible(false);
					textField_51.setVisible(false);
					textField_52.setVisible(false);
					textField_53.setVisible(false);
					textField_54.setVisible(false);
					textField_55.setVisible(false);
					textField_56.setVisible(false);
					textField_57.setVisible(false);
					textField_58.setVisible(false);
					textField_59.setVisible(false);
					textField_60.setVisible(false);
					textField_61.setVisible(false);
					textField_62.setVisible(false);
					textField_23.setVisible(false);
					textField_102.setVisible(false);

				} else if (line.equals(""))
					setAllVisible();

			}

			private void setAllVisible() {
				for (JTextField f : list) {
					f.setVisible(true);
				}
			}
		});

		label_2 = new JLabel("Operator");
		panel_2.add(label_2, "cell 6 0,alignx right");

		textField_65 = new JTextField();
		panel_2.add(textField_65, "cell 7 0");
		textField_65.setColumns(10);
		list.add(textField_65);
		JLabel lblGauge = new JLabel("Gauge");
		panel_2.add(lblGauge, "cell 8 0,alignx right");
		
				textField_1 = new JTextField();
				panel_2.add(textField_1, "cell 9 0");
				textField_1.setColumns(10);
				list.add(textField_1);
		
				JLabel lblPiw = new JLabel("PIW");
				panel_2.add(lblPiw, "cell 10 0,alignx right");
		
				textField_3 = new JTextField();
				panel_2.add(textField_3, "cell 11 0");
				textField_3.setColumns(10);
				list.add(textField_3);
		
				JLabel lblFormula = new JLabel("Formula");
				panel_2.add(lblFormula, "cell 12 0,alignx right");
		
				textField_2 = new JTextField();
				panel_2.add(textField_2, "cell 13 0");
				textField_2.setColumns(10);
				list.add(textField_2);
		
				label_3 = new JLabel("Feet Per Roll");
				panel_2.add(label_3, "cell 0 1,alignx right");
		
				textField_66 = new JTextField();
				panel_2.add(textField_66, "cell 1 1");
				textField_66.setColumns(10);
				list.add(textField_66);
				
						label_34 = new JLabel("Work Order 1");
						panel_2.add(label_34, "cell 2 1,alignx right");
		
				textField_104 = new JTextField();
				panel_2.add(textField_104, "cell 3 1");
				list.add(textField_104);
				textField_104.setColumns(10);
		
				label_35 = new JLabel("Work Order 2");
				panel_2.add(label_35, "cell 4 1,alignx right");
		
				textField_105 = new JTextField();
				panel_2.add(textField_105, "cell 5 1");
				list.add(textField_105);
				textField_105.setColumns(10);
		
				label_37 = new JLabel("Work Order 3");
				panel_2.add(label_37, "cell 6 1,alignx right");
		
				textField_106 = new JTextField();
				panel_2.add(textField_106, "cell 7 1");
				list.add(textField_106);
				textField_106.setColumns(10);
		
				label_36 = new JLabel("Work Order 4");
				panel_2.add(label_36, "cell 8 1,alignx right");
				
						textField_107 = new JTextField();
						panel_2.add(textField_107, "cell 9 1");
						list.add(textField_107);
						textField_107.setColumns(10);
						
								label_32 = new JLabel("J Number");
								panel_2.add(label_32, "cell 10 1,alignx right");
						
								textField_103 = new JTextField();
								panel_2.add(textField_103, "cell 11 1");
								textField_103.setColumns(10);
								list.add(textField_103);
		label_4 = new JLabel("Table Speed");
		frame.getContentPane().add(label_4, "cell 0 1,alignx center,growy");

		textField_5 = new JTextField();
		textField_5.setColumns(10);
		frame.getContentPane().add(textField_5, "cell 1 1");
		list.add(textField_5);

		lblMixDropTemp = new JLabel("Mix Drop Temp");
		frame.getContentPane().add(lblMixDropTemp, "cell 3 1,alignx center");

		textField_19 = new JTextField();
		frame.getContentPane().add(textField_19, "cell 4 1");
		textField_19.setColumns(10);
		list.add(textField_19);

		lblSetting = new JLabel("Setting");
		frame.getContentPane().add(lblSetting, "cell 9 1,alignx center");

		lblActual = new JLabel("Actual");
		frame.getContentPane().add(lblActual, "cell 11 1,alignx center");

		lblPrimeNipSpeed = new JLabel("Prime Nip Speed");
		frame.getContentPane().add(lblPrimeNipSpeed, "cell 0 2,alignx center");

		textField_6 = new JTextField();
		frame.getContentPane().add(textField_6, "cell 1 2");
		textField_6.setColumns(10);
		list.add(textField_6);

		label_14 = new JLabel("Winder NIP Speed");
		frame.getContentPane().add(label_14, "cell 3 2,alignx center");

		textField_75 = new JTextField();
		textField_75.setColumns(10);
		frame.getContentPane().add(textField_75, "cell 4 2");
		list.add(textField_75);

		label_22 = new JLabel("Zone 0");
		frame.getContentPane().add(label_22, "cell 8 2,alignx trailing");

		textField_83 = new JTextField();
		textField_83.setColumns(10);
		frame.getContentPane().add(textField_83, "cell 9 2");
		list.add(textField_83);

		textField_84 = new JTextField();
		textField_84.setColumns(10);
		frame.getContentPane().add(textField_84, "cell 11 2");
		list.add(textField_84);

		lblndNipSpeed = new JLabel("2nd Nip Speed");
		frame.getContentPane().add(lblndNipSpeed, "cell 0 3,alignx center");

		textField_7 = new JTextField();
		frame.getContentPane().add(textField_7, "cell 1 3");
		textField_7.setColumns(10);
		list.add(textField_7);

		label_15 = new JLabel("Collapsing Shield Speed");
		frame.getContentPane().add(label_15, "cell 3 3,alignx center");

		textField_76 = new JTextField();
		textField_76.setColumns(10);
		frame.getContentPane().add(textField_76, "cell 4 3");
		list.add(textField_76);

		lblZone = new JLabel("Zone 1");
		frame.getContentPane().add(lblZone, "cell 8 3,alignx trailing");

		textField_27 = new JTextField();
		frame.getContentPane().add(textField_27, "cell 9 3");
		textField_27.setColumns(10);
		list.add(textField_27);

		textField_28 = new JTextField();
		frame.getContentPane().add(textField_28, "cell 11 3");
		textField_28.setColumns(10);
		list.add(textField_28);

		lblPrimeWinderSpeed = new JLabel("Prime Winder Speed");
		frame.getContentPane().add(lblPrimeWinderSpeed,
				"cell 0 4,alignx center");

		textField_8 = new JTextField();
		frame.getContentPane().add(textField_8, "cell 1 4");
		textField_8.setColumns(10);
		list.add(textField_8);

		label_33 = new JLabel("Collapsing Shield Temperature");
		frame.getContentPane().add(label_33, "cell 3 4,alignx center");

		textField_102 = new JTextField();
		list.add(textField_102);
		textField_102.setColumns(10);
		frame.getContentPane().add(textField_102, "cell 4 4");

		lblZone_1 = new JLabel("Zone 2");
		frame.getContentPane().add(lblZone_1, "cell 8 4,alignx trailing");

		textField_29 = new JTextField();
		frame.getContentPane().add(textField_29, "cell 9 4");
		textField_29.setColumns(10);
		list.add(textField_29);

		textField_30 = new JTextField();
		frame.getContentPane().add(textField_30, "cell 11 4");
		textField_30.setColumns(10);
		list.add(textField_30);

		lblndWinderSpeed = new JLabel("2nd Winder Speed");
		frame.getContentPane().add(lblndWinderSpeed, "cell 0 5,alignx center");

		textField_9 = new JTextField();
		frame.getContentPane().add(textField_9, "cell 1 5");
		textField_9.setColumns(10);
		list.add(textField_9);

		lblPlenumTemp = new JLabel("Plenum Temp");
		frame.getContentPane().add(lblPlenumTemp, "cell 3 5,alignx center");

		textField_20 = new JTextField();
		frame.getContentPane().add(textField_20, "cell 4 5");
		textField_20.setColumns(10);
		list.add(textField_20);

		lblZone_2 = new JLabel("Zone 3");
		frame.getContentPane().add(lblZone_2, "cell 8 5,alignx trailing");

		textField_31 = new JTextField();
		frame.getContentPane().add(textField_31, "cell 9 5");
		textField_31.setColumns(10);
		list.add(textField_31);

		textField_32 = new JTextField();
		frame.getContentPane().add(textField_32, "cell 11 5");
		textField_32.setColumns(10);
		list.add(textField_32);

		lblScrewSpeed = new JLabel("Screw Speed");
		frame.getContentPane().add(lblScrewSpeed, "cell 0 6,alignx center");

		textField_10 = new JTextField();
		frame.getContentPane().add(textField_10, "cell 1 6");
		textField_10.setColumns(10);
		list.add(textField_10);

		lblPlenumSpeed = new JLabel("Plenum Speed");
		frame.getContentPane().add(lblPlenumSpeed, "cell 3 6,alignx center");

		textField_21 = new JTextField();
		frame.getContentPane().add(textField_21, "cell 4 6");
		textField_21.setColumns(10);
		list.add(textField_21);

		lblZone_3 = new JLabel("Zone 4");
		frame.getContentPane().add(lblZone_3, "cell 8 6,alignx trailing");

		textField_33 = new JTextField();
		list.add(textField_33);
		frame.getContentPane().add(textField_33, "cell 9 6");
		textField_33.setColumns(10);

		textField_34 = new JTextField();
		list.add(textField_34);
		frame.getContentPane().add(textField_34, "cell 11 6");
		textField_34.setColumns(10);

		label_5 = new JLabel("Die Number");
		frame.getContentPane().add(label_5, "cell 0 7,alignx center");

		textField_4 = new JTextField();
		list.add(textField_4);
		textField_4.setColumns(10);
		frame.getContentPane().add(textField_4, "cell 1 7");

		label_16 = new JLabel("Trim Left Measure");
		frame.getContentPane().add(label_16, "cell 3 7,alignx center");

		textField_77 = new JTextField();
		textField_77.setColumns(10);
		frame.getContentPane().add(textField_77, "cell 4 7");
		list.add(textField_77);

		lblZone_4 = new JLabel("Zone 5");
		frame.getContentPane().add(lblZone_4, "cell 8 7,alignx trailing");

		textField_35 = new JTextField();
		list.add(textField_35);
		frame.getContentPane().add(textField_35, "cell 9 7");
		textField_35.setColumns(10);

		textField_36 = new JTextField();
		list.add(textField_36);
		frame.getContentPane().add(textField_36, "cell 11 7");
		textField_36.setColumns(10);

		lblRbTemp = new JLabel("RB Temp");
		frame.getContentPane().add(lblRbTemp, "cell 0 8,alignx center");

		textField_11 = new JTextField();
		list.add(textField_11);
		frame.getContentPane().add(textField_11, "cell 1 8");
		textField_11.setColumns(10);

		label_17 = new JLabel("Trim Right Measure");
		frame.getContentPane().add(label_17, "cell 3 8,alignx center");

		textField_78 = new JTextField();
		list.add(textField_78);
		textField_78.setColumns(10);
		frame.getContentPane().add(textField_78, "cell 4 8");

		lblZone_5 = new JLabel("Zone 6");
		frame.getContentPane().add(lblZone_5, "cell 8 8,alignx trailing");

		textField_37 = new JTextField();
		list.add(textField_37);
		frame.getContentPane().add(textField_37, "cell 9 8");
		textField_37.setColumns(10);

		textField_38 = new JTextField();
		list.add(textField_38);
		frame.getContentPane().add(textField_38, "cell 11 8");
		textField_38.setColumns(10);

		lblScreenPack = new JLabel("Screen Pack");
		frame.getContentPane().add(lblScreenPack, "cell 0 9,alignx center");

		textField_12 = new JTextField();
		list.add(textField_12);
		frame.getContentPane().add(textField_12, "cell 1 9");
		textField_12.setColumns(10);

		lblAirRingGap = new JLabel("Air Ring Gap");
		frame.getContentPane().add(lblAirRingGap, "cell 3 9,alignx center");

		textField_22 = new JTextField();
		list.add(textField_22);
		frame.getContentPane().add(textField_22, "cell 4 9");
		textField_22.setColumns(10);

		label_31 = new JLabel("Zone 7");
		frame.getContentPane().add(label_31, "cell 8 9,alignx trailing");

		textField = new JTextField();
		list.add(textField);
		textField.setColumns(10);
		frame.getContentPane().add(textField, "cell 9 9");

		textField_101 = new JTextField();
		list.add(textField_101);
		textField_101.setColumns(10);
		frame.getContentPane().add(textField_101, "cell 11 9");

		lblExtruderAmps = new JLabel("Extruder Amps");
		frame.getContentPane().add(lblExtruderAmps, "cell 0 10,alignx center");

		textField_13 = new JTextField();
		list.add(textField_13);
		frame.getContentPane().add(textField_13, "cell 1 10");
		textField_13.setColumns(10);

		label_18 = new JLabel("Curtain Links");
		frame.getContentPane().add(label_18,
				"cell 3 10,alignx center,aligny center");

		textField_79 = new JTextField();
		list.add(textField_79);
		textField_79.setColumns(10);
		frame.getContentPane().add(textField_79, "cell 4 10");

		lblZonea = new JLabel("Zone 7-A");
		frame.getContentPane().add(lblZonea, "cell 8 10,alignx trailing");

		textField_39 = new JTextField();
		list.add(textField_39);
		frame.getContentPane().add(textField_39, "cell 9 10");
		textField_39.setColumns(10);

		textField_40 = new JTextField();
		list.add(textField_40);
		frame.getContentPane().add(textField_40, "cell 11 10");
		textField_40.setColumns(10);

		lblExtruderPsi = new JLabel("Extruder PSI");
		frame.getContentPane().add(lblExtruderPsi, "cell 0 11,alignx center");

		textField_14 = new JTextField();
		list.add(textField_14);
		frame.getContentPane().add(textField_14, "cell 1 11");
		textField_14.setColumns(10);

		label_19 = new JLabel("Finger Adjust Left");
		frame.getContentPane().add(label_19, "cell 3 11,alignx center");

		textField_80 = new JTextField();
		list.add(textField_80);
		textField_80.setColumns(10);
		frame.getContentPane().add(textField_80, "cell 4 11");

		lblZoneb = new JLabel("Zone 7-B");
		frame.getContentPane().add(lblZoneb, "cell 8 11,alignx trailing");

		textField_41 = new JTextField();
		list.add(textField_41);
		frame.getContentPane().add(textField_41, "cell 9 11");
		textField_41.setColumns(10);

		textField_42 = new JTextField();
		list.add(textField_42);
		frame.getContentPane().add(textField_42, "cell 11 11");
		textField_42.setColumns(10);

		label_6 = new JLabel("Stretch");
		frame.getContentPane().add(label_6, "cell 0 12,alignx center");

		textField_67 = new JTextField();
		list.add(textField_67);
		textField_67.setColumns(10);
		frame.getContentPane().add(textField_67, "cell 1 12");

		label_20 = new JLabel("Finger Adjust Right");
		frame.getContentPane().add(label_20, "cell 3 12,alignx center");

		textField_81 = new JTextField();
		list.add(textField_81);
		textField_81.setColumns(10);
		frame.getContentPane().add(textField_81, "cell 4 12");

		lblZonec = new JLabel("Zone 7-C");
		frame.getContentPane().add(lblZonec, "cell 8 12,alignx trailing");

		textField_43 = new JTextField();
		list.add(textField_43);
		frame.getContentPane().add(textField_43, "cell 9 12");
		textField_43.setColumns(10);

		textField_44 = new JTextField();
		list.add(textField_44);
		frame.getContentPane().add(textField_44, "cell 11 12");
		textField_44.setColumns(10);

		lblScrap = new JLabel("Scrap");
		frame.getContentPane().add(lblScrap, "cell 0 13,alignx center");

		textField_15 = new JTextField();
		list.add(textField_15);
		frame.getContentPane().add(textField_15, "cell 1 13");
		textField_15.setColumns(10);

		lblTrimPullerSpeed = new JLabel("Trim Puller Speed");
		frame.getContentPane().add(lblTrimPullerSpeed,
				"cell 3 13,alignx center");

		textField_23 = new JTextField();
		list.add(textField_23);
		frame.getContentPane().add(textField_23, "cell 4 13");
		textField_23.setColumns(10);

		lblZone_6 = new JLabel("Zone 8");
		frame.getContentPane().add(lblZone_6, "cell 8 13,alignx trailing");

		textField_45 = new JTextField();
		list.add(textField_45);
		frame.getContentPane().add(textField_45, "cell 9 13");
		textField_45.setColumns(10);

		textField_46 = new JTextField();
		list.add(textField_46);
		frame.getContentPane().add(textField_46, "cell 11 13");
		textField_46.setColumns(10);

		label_7 = new JLabel("Drum Temp");
		frame.getContentPane().add(label_7, "cell 0 14,alignx center");

		textField_68 = new JTextField();
		textField_68.setColumns(10);
		list.add(textField_68);
		frame.getContentPane().add(textField_68, "cell 1 14");

		label_21 = new JLabel("Mandrel Air Pressure");
		frame.getContentPane().add(label_21, "cell 3 14,alignx center");

		textField_82 = new JTextField();
		list.add(textField_82);
		textField_82.setColumns(10);
		frame.getContentPane().add(textField_82, "cell 4 14");

		lblZone_7 = new JLabel("Zone 9");
		frame.getContentPane().add(lblZone_7, "cell 8 14,alignx trailing");

		textField_47 = new JTextField();
		list.add(textField_47);
		frame.getContentPane().add(textField_47, "cell 9 14");
		textField_47.setColumns(10);

		textField_48 = new JTextField();
		list.add(textField_48);
		frame.getContentPane().add(textField_48, "cell 11 14");
		textField_48.setColumns(10);

		label_8 = new JLabel("Pinch Roll Temp");
		frame.getContentPane().add(label_8, "cell 0 15,alignx center");

		textField_69 = new JTextField();
		textField_69.setColumns(10);
		list.add(textField_69);
		frame.getContentPane().add(textField_69, "cell 1 15");

		lblFeedValves = new JLabel("Feed Valves");
		frame.getContentPane().add(lblFeedValves, "cell 3 15,alignx center");

		textField_24 = new JTextField();
		list.add(textField_24);
		frame.getContentPane().add(textField_24, "cell 4 15");
		textField_24.setColumns(10);

		label_30 = new JLabel("Zone 10");
		frame.getContentPane().add(label_30, "cell 8 15,alignx trailing");

		textField_49 = new JTextField();
		list.add(textField_49);
		frame.getContentPane().add(textField_49, "cell 9 15");
		textField_49.setColumns(10);

		textField_50 = new JTextField();
		list.add(textField_50);
		frame.getContentPane().add(textField_50, "cell 11 15");
		textField_50.setColumns(10);

		lblAirRingSpeed = new JLabel("Air Ring Speed");
		frame.getContentPane().add(lblAirRingSpeed, "cell 0 16,alignx center");

		textField_16 = new JTextField();
		list.add(textField_16);
		frame.getContentPane().add(textField_16, "cell 1 16");
		textField_16.setColumns(10);

		lblDoors = new JLabel("Doors");
		frame.getContentPane().add(lblDoors, "cell 3 16,alignx center");

		textField_25 = new JTextField();
		list.add(textField_25);
		frame.getContentPane().add(textField_25, "cell 4 16");
		textField_25.setColumns(10);

		lblZone_8 = new JLabel("Zone 11");
		frame.getContentPane().add(lblZone_8, "cell 8 16,alignx trailing");

		textField_85 = new JTextField();
		list.add(textField_85);
		textField_85.setColumns(10);
		frame.getContentPane().add(textField_85, "cell 9 16");

		textField_86 = new JTextField();
		list.add(textField_86);
		textField_86.setColumns(10);
		frame.getContentPane().add(textField_86, "cell 11 16");

		lblAirRingTemp = new JLabel("Air Ring Temp");
		frame.getContentPane().add(lblAirRingTemp, "cell 0 17,alignx center");

		textField_17 = new JTextField();
		list.add(textField_17);
		frame.getContentPane().add(textField_17, "cell 1 17");
		textField_17.setColumns(10);

		lblFeedValvesOpen = new JLabel("Feed Valves Open %");
		frame.getContentPane()
				.add(lblFeedValvesOpen, "cell 3 17,alignx center");

		textField_26 = new JTextField();
		list.add(textField_26);
		frame.getContentPane().add(textField_26, "cell 4 17");
		textField_26.setColumns(10);

		label_23 = new JLabel("Zone 12");
		frame.getContentPane().add(label_23, "cell 8 17,alignx trailing");

		textField_87 = new JTextField();
		list.add(textField_87);
		textField_87.setColumns(10);
		frame.getContentPane().add(textField_87, "cell 9 17");

		textField_88 = new JTextField();
		list.add(textField_88);
		textField_88.setColumns(10);
		frame.getContentPane().add(textField_88, "cell 11 17");

		label_9 = new JLabel("Tempo");
		frame.getContentPane().add(label_9, "cell 0 18,alignx center");

		textField_70 = new JTextField();
		list.add(textField_70);
		textField_70.setColumns(10);
		frame.getContentPane().add(textField_70, "cell 1 18");

		label_24 = new JLabel("Zone 13");
		frame.getContentPane().add(label_24, "cell 8 18,alignx trailing");

		textField_89 = new JTextField();
		list.add(textField_89);
		textField_89.setColumns(10);
		frame.getContentPane().add(textField_89, "cell 9 18");

		textField_90 = new JTextField();
		list.add(textField_90);
		textField_90.setColumns(10);
		frame.getContentPane().add(textField_90, "cell 11 18");

		label_10 = new JLabel("Three P");
		frame.getContentPane().add(label_10, "cell 0 19,alignx center");

		textField_71 = new JTextField();
		list.add(textField_71);
		textField_71.setColumns(10);
		frame.getContentPane().add(textField_71, "cell 1 19");

		label_25 = new JLabel("Zone B1");
		frame.getContentPane().add(label_25, "cell 8 19,alignx trailing");

		textField_91 = new JTextField();
		textField_91.setColumns(10);
		list.add(textField_91);
		frame.getContentPane().add(textField_91, "cell 9 19");

		textField_92 = new JTextField();
		list.add(textField_92);
		textField_92.setColumns(10);
		frame.getContentPane().add(textField_92, "cell 11 19");

		label_11 = new JLabel("Drum NIP");
		frame.getContentPane().add(label_11, "cell 0 20,alignx center");

		textField_72 = new JTextField();
		list.add(textField_72);
		textField_72.setColumns(10);
		frame.getContentPane().add(textField_72, "cell 1 20");

		label_26 = new JLabel("Zone B2");
		frame.getContentPane().add(label_26, "cell 8 20,alignx trailing");

		textField_93 = new JTextField();
		list.add(textField_93);
		textField_93.setColumns(10);
		frame.getContentPane().add(textField_93, "cell 9 20");

		textField_94 = new JTextField();
		list.add(textField_94);
		textField_94.setColumns(10);
		frame.getContentPane().add(textField_94, "cell 11 20");

		label_12 = new JLabel("Horizontal Apply");
		frame.getContentPane().add(label_12, "cell 0 21,alignx center");

		textField_73 = new JTextField();
		list.add(textField_73);
		textField_73.setColumns(10);
		frame.getContentPane().add(textField_73, "cell 1 21");

		label_27 = new JLabel("Hot Roll 1");
		frame.getContentPane().add(label_27, "cell 8 21,alignx trailing");

		textField_95 = new JTextField();
		list.add(textField_95);
		textField_95.setColumns(10);
		frame.getContentPane().add(textField_95, "cell 9 21");

		textField_96 = new JTextField();
		list.add(textField_96);
		textField_96.setColumns(10);
		frame.getContentPane().add(textField_96, "cell 11 21");

		label_13 = new JLabel("Inflate Air Shaft");
		frame.getContentPane().add(label_13, "cell 0 22,alignx center");

		textField_74 = new JTextField();
		list.add(textField_74);
		textField_74.setColumns(10);
		frame.getContentPane().add(textField_74, "cell 1 22");

		label_28 = new JLabel("Hot Roll 2");
		frame.getContentPane().add(label_28, "cell 8 22,alignx trailing");

		textField_97 = new JTextField();
		list.add(textField_97);
		textField_97.setColumns(10);
		frame.getContentPane().add(textField_97, "cell 9 22");

		textField_98 = new JTextField();
		list.add(textField_98);
		textField_98.setColumns(10);
		frame.getContentPane().add(textField_98, "cell 11 22");

		lblWinderNipRoll = new JLabel("Winder Nip Roll");
		frame.getContentPane().add(lblWinderNipRoll, "cell 0 23,alignx center");

		textField_18 = new JTextField();
		list.add(textField_18);
		frame.getContentPane().add(textField_18, "cell 1 23");
		textField_18.setColumns(10);

		label_29 = new JLabel("Chill Roll");
		frame.getContentPane().add(label_29, "cell 8 23,alignx trailing");

		textField_99 = new JTextField();
		list.add(textField_99);
		textField_99.setColumns(10);
		frame.getContentPane().add(textField_99, "cell 9 23");

		textField_100 = new JTextField();
		list.add(textField_100);
		textField_100.setColumns(10);
		frame.getContentPane().add(textField_100, "cell 11 23");

		btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					submitProcessSQL();
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		panel_1 = new JPanel();
		frame.getContentPane()
				.add(panel_1, "cell 0 24 7 1,alignx center,growy");
		panel_1.setLayout(new MigLayout("", "[][][grow][][][grow][grow][]",
				"[][][][][][]"));

		lblCoreOutDiameter = new JLabel("Core Out Diameter Primary");
		panel_1.add(lblCoreOutDiameter, "cell 0 0,alignx center");

		textField_51 = new JTextField();
		list.add(textField_51);
		panel_1.add(textField_51, "cell 2 0");
		textField_51.setColumns(10);

		lblCoreOutDiameter_1 = new JLabel("Core Out Diameter Secondary");
		panel_1.add(lblCoreOutDiameter_1, "cell 4 0,alignx center");

		textField_52 = new JTextField();
		list.add(textField_52);
		panel_1.add(textField_52, "cell 6 0");
		textField_52.setColumns(10);

		lblRollLengthPrimary = new JLabel("Roll Length Primary");
		panel_1.add(lblRollLengthPrimary, "cell 0 1,alignx center");

		textField_53 = new JTextField();
		list.add(textField_53);
		panel_1.add(textField_53, "cell 2 1");
		textField_53.setColumns(10);

		lblRollLengthPrimary_1 = new JLabel("Roll Length Primary Secondary");
		panel_1.add(lblRollLengthPrimary_1, "cell 4 1,alignx center");

		textField_58 = new JTextField();
		list.add(textField_58);
		panel_1.add(textField_58, "cell 6 1");
		textField_58.setColumns(10);

		lblEndRollWarning = new JLabel("End Roll Warning Primary");
		panel_1.add(lblEndRollWarning, "cell 0 2,alignx center");

		textField_54 = new JTextField();
		list.add(textField_54);
		panel_1.add(textField_54, "cell 2 2");
		textField_54.setColumns(10);

		lblEndRollWarning_1 = new JLabel("End Roll Warning Secondary");
		panel_1.add(lblEndRollWarning_1, "cell 4 2,alignx center");

		textField_59 = new JTextField();
		list.add(textField_59);
		panel_1.add(textField_59, "cell 6 2");
		textField_59.setColumns(10);

		lblEndRollTransfer = new JLabel("End Roll Transfer Primary");
		panel_1.add(lblEndRollTransfer, "cell 0 3,alignx center");

		textField_55 = new JTextField();
		list.add(textField_55);
		panel_1.add(textField_55, "cell 2 3");
		textField_55.setColumns(10);

		lblEndRollTransfer_1 = new JLabel("End Roll Transfer Secondary");
		panel_1.add(lblEndRollTransfer_1, "cell 4 3,alignx center");

		textField_60 = new JTextField();
		list.add(textField_60);
		panel_1.add(textField_60, "cell 6 3");
		textField_60.setColumns(10);

		lblForceSetPoint = new JLabel("Force Set Point Primary");
		panel_1.add(lblForceSetPoint, "cell 0 4,alignx center");

		textField_56 = new JTextField();
		list.add(textField_56);
		panel_1.add(textField_56, "cell 2 4");
		textField_56.setColumns(10);

		lblForceSetPoint_1 = new JLabel("Force Set Point Secondary");
		panel_1.add(lblForceSetPoint_1, "cell 4 4,alignx center");

		textField_61 = new JTextField();
		list.add(textField_61);
		panel_1.add(textField_61, "cell 6 4");
		textField_61.setColumns(10);

		lblDrumToNip = new JLabel("Drum to Nip Trim Primary");
		panel_1.add(lblDrumToNip, "cell 0 5,alignx center");

		textField_57 = new JTextField();
		list.add(textField_57);
		panel_1.add(textField_57, "cell 2 5");
		textField_57.setColumns(10);

		lblDrumToNip_1 = new JLabel("Drum to Nip Trim Secondary");
		panel_1.add(lblDrumToNip_1, "cell 4 5,alignx center");

		textField_62 = new JTextField();
		list.add(textField_62);
		panel_1.add(textField_62, "cell 6 5");
		textField_62.setColumns(10);
		frame.getContentPane().add(btnSubmit, "cell 9 24 3 1,alignx center");

		separator = new JSeparator();
		frame.getContentPane().add(separator, "cell 0 25");

		panel = new JPanel();
		frame.getContentPane().add(panel, "cell 8 26 4 1,grow");
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 0, 0 };
		gbl_panel.rowHeights = new int[] { 0, 0, 0 };
		gbl_panel.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gbl_panel.rowWeights = new double[] { 0.0, 1.0, Double.MIN_VALUE };
		panel.setLayout(gbl_panel);

		lblComments = new JLabel("Comments");
		GridBagConstraints gbc_lblComments = new GridBagConstraints();
		gbc_lblComments.insets = new Insets(0, 0, 5, 0);
		gbc_lblComments.gridx = 0;
		gbc_lblComments.gridy = 0;
		panel.add(lblComments, gbc_lblComments);

		textArea = new JTextArea();
		GridBagConstraints gbc_textArea = new GridBagConstraints();
		gbc_textArea.fill = GridBagConstraints.BOTH;
		gbc_textArea.gridx = 0;
		gbc_textArea.gridy = 1;
		panel.add(textArea, gbc_textArea);
	}

	public void submitProcessSQL() throws ClassNotFoundException, SQLException,
			IOException {
		weights.sqlConnection();
		// get date
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		String dateTime = dateFormat.format(cal.getTime());
		// String workStation = textField.getText();
		String gauge = textField_1.getText();
		double gaugeDec = convertToDouble(gauge);
		String formula = textField_2.getText();
		int formulaInt = convertToInt(formula);
		String piw = textField_3.getText();
		double piwDouble = convertToDouble(piw);
		String rollLength = textField_4.getText();
		int rollLengthInt = convertToInt(rollLength);
		String shift = textField_64.getText();
		String primeNipSpeed = textField_6.getText();
		double primeNipSpeedDouble = convertToDouble(primeNipSpeed);
		String secondaryNipSpeed = textField_7.getText();
		double secondaryNipDouble = convertToDouble(secondaryNipSpeed);
		String primeWinderSpeed = textField_8.getText();
		double primeWinderDouble = convertToDouble(primeWinderSpeed);
		String secondaryWinderSpeed = textField_9.getText();
		double secondaryWinderDouble = convertToDouble(secondaryWinderSpeed);
		String screwSpeed = textField_10.getText();
		double screwDouble = convertToDouble(screwSpeed);
		String rbTemp = textField_11.getText();
		double rbDouble = convertToDouble(rbTemp);
		String screenpack = textField_12.getText();
		double screenDouble = convertToDouble(screenpack);
		String extruderAmps = textField_13.getText();
		double extruderDouble = convertToDouble(extruderAmps);
		String extruderPSI = textField_14.getText();
		double PSIdouble = convertToDouble(extruderPSI);
		String scrap = textField_15.getText();
		double scrapDouble = convertToDouble(scrap);
		String airRingSpeed = textField_16.getText();
		double airRingDouble = convertToDouble(airRingSpeed);
		String airRingTemp = textField_17.getText();
		double ringTempDouble = convertToDouble(airRingTemp);
		String winderNipRoll = textField_18.getText();
		double winderNipDouble = convertToDouble(winderNipRoll);
		String mixDropTemp = textField_19.getText();
		double mixDropDouble = convertToDouble(mixDropTemp);
		String plenumTemp = textField_20.getText();
		double plenumDouble = convertToDouble(plenumTemp);
		String plenumSpeed = textField_21.getText();
		double plenumSpeedDouble = convertToDouble(plenumSpeed);
		String airRingGap = textField_22.getText();
		double airRingGapDouble = convertToDouble(airRingGap);
		String trimPullerSpeed = textField_23.getText();
		double trimPullerDouble = convertToDouble(trimPullerSpeed);
		String feedValves = textField_24.getText();
		String doors = textField_25.getText();
		String feedValvesOpenPercent = textField_26.getText();
		double feedValveDouble = convertToDouble(feedValvesOpenPercent);
		String zone1Setting = textField_27.getText();
		double zone1Double = convertToDouble(zone1Setting);
		String zone1Actual = textField_28.getText();
		double zone1ActualDouble = convertToDouble(zone1Actual);
		String zone2Setting = textField_29.getText();
		double zone2Double = convertToDouble(zone2Setting);
		String zone2Actual = textField_30.getText();
		double zone2ActualDouble = convertToDouble(zone2Actual);
		String zone3Setting = textField_31.getText();
		double zone3Double = convertToDouble(zone3Setting);
		String zone3Actual = textField_32.getText();
		double zone3ActualDouble = convertToDouble(zone3Actual);
		String zone4Setting = textField_33.getText();
		double zone4Double = convertToDouble(zone4Setting);
		String zone4Actual = textField_34.getText();
		double zone4ActualDouble = convertToDouble(zone4Actual);
		String zone5Setting = textField_35.getText();
		double zone5Double = convertToDouble(zone5Setting);
		String zone5Actual = textField_36.getText();
		double zone5ActualDouble = convertToDouble(zone5Actual);
		String zone6Setting = textField_37.getText();
		double zone6Double = convertToDouble(zone6Setting);
		String zone6Actual = textField_38.getText();
		double zone6ActualDouble = convertToDouble(zone6Actual);
		String zone7aSetting = textField_39.getText();
		double zone7aDouble = convertToDouble(zone7aSetting);
		String zone7aActual = textField_40.getText();
		double zone7aActualDouble = convertToDouble(zone7aActual);
		String zone7bSetting = textField_41.getText();
		double zone7bDouble = convertToDouble(zone7bSetting);
		String zone7bActual = textField_42.getText();
		double zone7bActualDouble = convertToDouble(zone7bActual);
		String zone7cSetting = textField_43.getText();
		double zone7cDouble = convertToDouble(zone7cSetting);
		String zone7cActual = textField_44.getText();
		double zone7cActualDouble = convertToDouble(zone7cActual);
		String zone8Setting = textField_45.getText();
		double zone8Double = convertToDouble(zone8Setting);
		String zone8Actual = textField_46.getText();
		double zone8ActualDouble = convertToDouble(zone8Actual);
		String zone9Setting = textField_47.getText();
		double zone9Double = convertToDouble(zone9Setting);
		String zone9Actual = textField_48.getText();
		double zone9ActualDouble = convertToDouble(zone9Actual);
		String zone10Setting = textField_49.getText();
		double zone10Double = convertToDouble(zone10Setting);
		String zone10Actual = textField_50.getText();
		double zone10ActualDouble = convertToDouble(zone10Actual);
		String comments = textArea.getText();
		String coreOutDiameterPrimary = textField_51.getText();
		double coreOutDiameterPrimaryDouble = convertToDouble(coreOutDiameterPrimary);
		String rollLengthPrimary = textField_53.getText();
		double rollLengthDouble = convertToDouble(rollLengthPrimary);
		String endRollWarningPrimary = textField_54.getText();
		double endRolLWarningPrimaryDouble = convertToDouble(endRollWarningPrimary);
		String endRollTransferPrimary = textField_55.getText();
		double endRolLTransferPrimaryDouble = convertToDouble(endRollTransferPrimary);
		String forceSetPointPrimary = textField_56.getText();
		double forceSetPointPrimaryDouble = convertToDouble(forceSetPointPrimary);
		String drumToNipTrimPrimary = textField_57.getText();
		double drumToNipTrimPrimaryDouble = convertToDouble(drumToNipTrimPrimary);
		String coreOutDiameterSecondary = textField_52.getText();
		double coreOutDiameterSecondaryDouble = convertToDouble(coreOutDiameterSecondary);
		String rollLengthPrimarySecondary = textField_58.getText();
		double rollLengthPrimarySecondaryDouble = convertToDouble(rollLengthPrimarySecondary);
		String endRollWarningSecondary = textField_59.getText();
		double endRollWarningSecondaryDouble = convertToDouble(endRollWarningSecondary);
		String endRollTransferSecondary = textField_60.getText();
		double endRollTransferSecondaryDouble = convertToDouble(endRollTransferSecondary);
		String forceSetPointSecondary = textField_61.getText();
		double forceSetPointSecondaryDouble = convertToDouble(forceSetPointSecondary);
		String drumToNipTrimSecondary = textField_62.getText();
		double drumToNipTrimSecondaryDouble = convertToDouble(drumToNipTrimSecondary);
		try {
			Statement statement = weights.conn.createStatement();
			statement.setQueryTimeout(30); // set timeout to 30 sec.

			statement.executeUpdate("INSERT INTO ArrProcessConditions VALUES("
					+ "'"
					+ dateTime
					+ "'"
					+ ", "
					+ "'"
					// + workStation
					+ "'"
					+ ","
					+ gaugeDec
					+ ","
					+ formulaInt
					+ ","
					+ piwDouble
					+ ","
					+ rollLengthInt
					+ ","
					+ "'"
					+ shift
					+ "'"
					+ ","
					+ primeNipSpeedDouble
					+ ","
					+ secondaryNipDouble
					+ ","
					+ primeWinderDouble
					+ ","
					+ secondaryWinderDouble
					+ ","
					+ screwDouble
					+ ","
					+ rbDouble
					+ ","
					+ screenDouble
					+ ","
					+ extruderDouble
					+ ","
					+ PSIdouble
					+ ","
					+ scrapDouble
					+ ","
					+ airRingDouble
					+ ","
					+ ringTempDouble
					+ ","
					+ winderNipDouble
					+ ","
					+ mixDropDouble
					+ ","
					+ plenumDouble
					+ ","
					+ plenumSpeedDouble
					+ ","
					+ airRingGapDouble
					+ ","
					+ trimPullerDouble
					+ ","
					+ "'"
					+ feedValves
					+ "'"
					+ ","
					+ "'"
					+ doors
					+ "'"
					+ ","
					+ feedValveDouble
					+ ","
					+ zone1Double
					+ ","
					+ zone1ActualDouble
					+ ","
					+ zone2Double
					+ ","
					+ zone2ActualDouble
					+ ","
					+ zone3Double
					+ ","
					+ zone3ActualDouble
					+ ","
					+ zone4Double
					+ ","
					+ zone4ActualDouble
					+ ","
					+ zone5Double
					+ ","
					+ zone5ActualDouble
					+ ","
					+ zone6Double
					+ ","
					+ zone6ActualDouble
					+ ","
					+ zone7aDouble
					+ ","
					+ zone7aActualDouble
					+ ","
					+ zone7bDouble
					+ ","
					+ zone7bActualDouble
					+ ","
					+ zone7cDouble
					+ ","
					+ zone7cActualDouble
					+ ","
					+ zone8Double
					+ ","
					+ zone8ActualDouble
					+ ","
					+ zone9Double
					+ ","
					+ zone9ActualDouble
					+ ","
					+ zone10Double
					+ ","
					+ zone10ActualDouble
					+ ","
					+ "'"
					+ comments
					+ "'"
					+ ","
					+ coreOutDiameterPrimaryDouble
					+ ","
					+ rollLengthDouble
					+ ","
					+ endRolLWarningPrimaryDouble
					+ ","
					+ endRolLTransferPrimaryDouble
					+ ","
					+ forceSetPointPrimaryDouble
					+ ","
					+ drumToNipTrimPrimaryDouble
					+ ","
					+ coreOutDiameterSecondaryDouble
					+ ","
					+ rollLengthPrimarySecondaryDouble
					+ ","
					+ endRollWarningSecondaryDouble
					+ ","
					+ endRollTransferSecondaryDouble
					+ ","
					+ forceSetPointSecondaryDouble
					+ ","
					+ drumToNipTrimSecondaryDouble + ")");
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
}
