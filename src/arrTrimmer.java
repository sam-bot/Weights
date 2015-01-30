import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;

import net.miginfocom.swing.MigLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import java.awt.BorderLayout;

import javax.swing.JButton;

public class arrTrimmer {

	private JFrame frame;
	private JTextField operatorField;
	private JTextField dateTimeField;
	private JTextField workOrderField;
	private JTextField itemNumberField;
	private JTextField coreTagNumberField;
	private JTextField piwField;
	private JTextField formulaField;
	private JTextField gaugeField;
	private JTextField lengthField;
	private JTextField lowWeightField;
	private JTextField targetWeightField;
	private JTextField highWeightField;
	private JTextField coreWeightField;
	private JTextField finishedWidthField;
	private JTextField extrudedItemNumberField;
	private JTable table;
	static DefaultTableModel model3 = new DefaultTableModel();
	private JTextField sequenceNumberField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					arrTrimmer window = new arrTrimmer();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application. Stored in plant server. 
	 */
	public arrTrimmer() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Trimmer");
		frame.setBounds(100, 100, 668, 410);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(
				new MigLayout("", "[grow][grow][grow][grow]", "[][grow][][][63.00,grow][grow]"));

		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, "cell 0 0 4 1");
		panel.setLayout(new MigLayout("", "[][][30][][][30][][]", "[][]"));

		String[] trimmerLines = { "", "FCV340001", "FCV340002" };
		
				JLabel lblWorkstation = new JLabel("Workstation");
				panel.add(lblWorkstation, "cell 0 0");
		JComboBox workstationBox = new JComboBox(trimmerLines);
		panel.add(workstationBox, "cell 1 0,growx");

		JLabel lblOperator = new JLabel("Operator");
		panel.add(lblOperator, "cell 3 0");

		operatorField = new JTextField();
		panel.add(operatorField, "cell 4 0,growx");
		operatorField.setColumns(10);
				
						JLabel lblNewLabel = new JLabel("Work Order");
						panel.add(lblNewLabel, "cell 6 0");
		
				workOrderField = new JTextField();
				panel.add(workOrderField, "cell 7 0,growx");
				workOrderField.setColumns(10);

		JLabel lblShift = new JLabel("Shift");
		panel.add(lblShift, "cell 0 1");
		String[] shifts = { "", "A", "B", "C", "D" };
		JComboBox shiftBox = new JComboBox(shifts);
		panel.add(shiftBox, "cell 1 1,growx");

		JLabel lblDatetime = new JLabel("DateTime");
		panel.add(lblDatetime, "cell 3 1");

		dateTimeField = new JTextField();
		panel.add(dateTimeField, "cell 4 1,growx");
		dateTimeField.setColumns(10);
				
						JLabel lblItemNumber = new JLabel("Item Number");
						panel.add(lblItemNumber, "cell 6 1");
		
				itemNumberField = new JTextField();
				panel.add(itemNumberField, "cell 7 1,growx");
				itemNumberField.setColumns(10);
		
		JPanel extrudedRollPanel = new JPanel();
		extrudedRollPanel.setBackground(Color.BLACK);
		frame.getContentPane().add(extrudedRollPanel, "cell 1 1,grow");
		
				JLabel lblExtrudedRoll = new JLabel("Extruded Roll");
				lblExtrudedRoll.setForeground(Color.WHITE);
				extrudedRollPanel.add(lblExtrudedRoll);

		coreTagNumberField = new JTextField();
		frame.getContentPane().add(coreTagNumberField, "cell 2 1 2 1,growx");
		coreTagNumberField.setColumns(10);

		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, "cell 0 1 1 5,grow");
		panel_1.setLayout(new MigLayout("", "[grow][]", "[][][][][][][][grow][]"));

		JLabel lblPiw = new JLabel("PIW");
		panel_1.add(lblPiw, "cell 0 0,alignx center");

		piwField = new JTextField();
		panel_1.add(piwField, "cell 1 0");
		piwField.setColumns(10);

		JLabel lblFormula = new JLabel("Formula");
		panel_1.add(lblFormula, "cell 0 1,alignx center");

		formulaField = new JTextField();
		panel_1.add(formulaField, "cell 1 1");
		formulaField.setColumns(10);

		JLabel lblGauge = new JLabel("Gauge");
		panel_1.add(lblGauge, "cell 0 2,alignx center");

		gaugeField = new JTextField();
		panel_1.add(gaugeField, "cell 1 2");
		gaugeField.setColumns(10);

		JLabel lblLength = new JLabel("Length");
		panel_1.add(lblLength, "cell 0 3,alignx center");

		lengthField = new JTextField();
		panel_1.add(lengthField, "cell 1 3");
		lengthField.setColumns(10);

		JLabel lblCoreWeight = new JLabel("Core Weight");
		panel_1.add(lblCoreWeight, "cell 0 4,alignx center");

		coreWeightField = new JTextField();
		panel_1.add(coreWeightField, "cell 1 4");
		coreWeightField.setColumns(10);

		JLabel lblFinishedWidth = new JLabel("Finished Width");
		panel_1.add(lblFinishedWidth, "cell 0 5,alignx center");

		finishedWidthField = new JTextField();
		panel_1.add(finishedWidthField, "cell 1 5");
		finishedWidthField.setColumns(10);

		JLabel lblExtrudedItemNumber = new JLabel("Extruded JNumber");
		panel_1.add(lblExtrudedItemNumber, "cell 0 6,alignx center");

		extrudedItemNumberField = new JTextField();
		panel_1.add(extrudedItemNumberField, "cell 1 6");
		extrudedItemNumberField.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		panel_1.add(btnSubmit, "cell 1 8");
		
		JButton btnNextSequenceRoll = new JButton("Next Sequence Roll Number");
		frame.getContentPane().add(btnNextSequenceRoll, "cell 1 2,alignx center");
		
		sequenceNumberField = new JTextField();
		frame.getContentPane().add(sequenceNumberField, "cell 2 2,growx");
		sequenceNumberField.setColumns(10);
		
		JButton btnResetSequencer = new JButton("Reset Sequencer");
		frame.getContentPane().add(btnResetSequencer, "cell 3 2,alignx center");

		JPanel panel_2 = new JPanel();
		frame.getContentPane().add(panel_2, "cell 1 4 3 1,grow");
		panel_2.setLayout(new MigLayout("", "[][grow][grow][grow]", "[grow][][][]"));
		
		JPanel weightTolerancePanel = new JPanel();
		weightTolerancePanel.setBackground(Color.BLACK);
		panel_2.add(weightTolerancePanel, "cell 0 0 4 1,grow");
		
				JLabel lblWeights = new JLabel("Weight Tolerances");
				lblWeights.setForeground(Color.WHITE);
				weightTolerancePanel.add(lblWeights);

		JLabel lblNewLabel_1 = new JLabel("Low");
		panel_2.add(lblNewLabel_1, "cell 1 2,alignx center");

		JLabel lblTarget = new JLabel("Target");
		panel_2.add(lblTarget, "cell 2 2,alignx center");

		JLabel lblHigh = new JLabel("High");
		panel_2.add(lblHigh, "cell 3 2,alignx center");

		lowWeightField = new JTextField();
		panel_2.add(lowWeightField, "cell 1 3,growx");
		lowWeightField.setColumns(10);

		targetWeightField = new JTextField();
		panel_2.add(targetWeightField, "cell 2 3,growx");
		targetWeightField.setColumns(10);

		highWeightField = new JTextField();
		panel_2.add(highWeightField, "cell 3 3,growx");
		highWeightField.setColumns(10);

		JScrollPane scrollPane = new JScrollPane();
		frame.getContentPane().add(scrollPane, "cell 1 5 3 1,grow");
		table = new JTable(arrTrimmer.model3);
		arrTrimmer.model3.addColumn("Lot Code Out");
		arrTrimmer.model3.addColumn("Lot Code In");
		arrTrimmer.model3.addColumn("Date / Time");
		arrTrimmer.model3.addColumn("Wgt");
		arrTrimmer.model3.addColumn("Set#");
		scrollPane.setViewportView(table);
	}

}
