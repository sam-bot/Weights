import java.awt.EventQueue;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;

public class arrExtrusion {

	private JFrame frame;
	private ArrayList<JTextField> fieldList;
	private JComboBox<String> workStationBox;
	private JTextField operatorField;
	private JTextField workOrderField;
	private JComboBox<String> shiftBox;
	private JTextField dateTimeField;
	private JTextField itemNumberField;
	private JLabel fgCoreTagNumberField;
	private JPanel panel_1;
	private JLabel lblWorkOrder;
	private JLabel lblItemNumber_1;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JTextField itemNumberOne;
	private JTextField workOrderOneField;
	private JTextField workOrderTwoField;
	private JTextField itemNumberTwo;
	private JTextField workOrderThreeField;
	private JTextField itemNumberThree;
	private JTextField workOrderFourField;
	private JTextField itemNumberFour;
	private JLabel lblCoreWeight;
	private JLabel lblProductionWidth;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					arrExtrusion window = new arrExtrusion();
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
	public arrExtrusion() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Extrusion");
		frame.setBounds(100, 100, 531, 347);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(
				new MigLayout("", "[grow][][grow][grow]",
						"[][grow][][][63.00,grow][grow]"));

		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, "cell 0 0 4 1");
		panel.setLayout(new MigLayout("", "[][][30][][][30][][]", "[][]"));

		String[] extrusionLines = { "", "FEX340001", "FEX340002", "FEX340003",
				"FEX340004", "FEX340006", "FEX340007", "FEX340008" };

		fieldList = new ArrayList<JTextField>();
		JLabel lblWorkstation = new JLabel("Workstation");
		panel.add(lblWorkstation, "cell 0 0");
		workStationBox = new JComboBox(extrusionLines);
		panel.add(workStationBox, "cell 1 0,growx");

		JLabel lblOperator = new JLabel("Operator");
		panel.add(lblOperator, "cell 3 0");

		operatorField = new JTextField();
		panel.add(operatorField, "cell 4 0,growx");
		operatorField.setColumns(10);
		fieldList.add(operatorField);

		JLabel lblNewLabel = new JLabel("Work Order");
		panel.add(lblNewLabel, "cell 6 0");

		workOrderField = new JTextField();
		fieldList.add(workOrderField);
		workOrderField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				fgCoreTagNumberField.setText(workOrderField.getText() + "0001");
			}
		});
		panel.add(workOrderField, "cell 7 0,growx");
		workOrderField.setColumns(10);

		JLabel lblShift = new JLabel("Shift");
		panel.add(lblShift, "cell 0 1");
		String[] shifts = { "", "A", "B", "C", "D" };
		shiftBox = new JComboBox(shifts);
		panel.add(shiftBox, "cell 1 1,growx");

		JLabel lblDatetime = new JLabel("Date");
		panel.add(lblDatetime, "cell 3 1");

		dateTimeField = new JTextField();
		fieldList.add(dateTimeField);
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/YYYY");
		Calendar cal = Calendar.getInstance();
		String dateTime = dateFormat.format(cal.getTime());
		dateTimeField.setText(dateTime);
		panel.add(dateTimeField, "cell 4 1,growx");
		dateTimeField.setColumns(10);

		JLabel lblItemNumber = new JLabel("Item Number");
		panel.add(lblItemNumber, "cell 6 1");

		itemNumberField = new JTextField();
		fieldList.add(itemNumberField);
		panel.add(itemNumberField, "cell 7 1,growx");
		itemNumberField.setColumns(10);

		panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, "cell 0 1 4 3,grow");
		panel_1.setLayout(new MigLayout("", "[][][][][][][][]", "[][][][][]"));

		lblWorkOrder = new JLabel("Work Order");
		panel_1.add(lblWorkOrder, "cell 1 0,alignx center");

		lblItemNumber_1 = new JLabel("Item Number");
		panel_1.add(lblItemNumber_1, "cell 3 0,alignx center");

		lblCoreWeight = new JLabel("Core Weight");
		panel_1.add(lblCoreWeight, "cell 5 0,alignx center");

		lblProductionWidth = new JLabel("Production Width");
		panel_1.add(lblProductionWidth, "cell 7 0");

		label = new JLabel("#1");
		panel_1.add(label, "cell 0 1,alignx trailing");

		workOrderOneField = new JTextField();
		panel_1.add(workOrderOneField, "cell 1 1");
		workOrderOneField.setColumns(10);

		itemNumberOne = new JTextField();
		panel_1.add(itemNumberOne, "cell 3 1");
		itemNumberOne.setColumns(10);

		label_1 = new JLabel("#2");
		panel_1.add(label_1, "cell 0 2,alignx trailing");

		workOrderTwoField = new JTextField();
		workOrderTwoField.setColumns(10);
		panel_1.add(workOrderTwoField, "cell 1 2");

		itemNumberTwo = new JTextField();
		panel_1.add(itemNumberTwo, "cell 3 2");
		itemNumberTwo.setColumns(10);

		label_2 = new JLabel("#3");
		panel_1.add(label_2, "cell 0 3,alignx trailing");

		workOrderThreeField = new JTextField();
		panel_1.add(workOrderThreeField, "cell 1 3");
		workOrderThreeField.setColumns(10);

		itemNumberThree = new JTextField();
		panel_1.add(itemNumberThree, "cell 3 3");
		itemNumberThree.setColumns(10);

		label_3 = new JLabel("#4");
		panel_1.add(label_3, "cell 0 4,alignx trailing");

		workOrderFourField = new JTextField();
		panel_1.add(workOrderFourField, "cell 1 4");
		workOrderFourField.setColumns(10);

		itemNumberFour = new JTextField();
		panel_1.add(itemNumberFour, "cell 3 4");
		itemNumberFour.setColumns(10);
	}

}
