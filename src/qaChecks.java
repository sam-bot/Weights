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
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JComboBox comboBox;
	private JComboBox comboBox_2;
	private JComboBox comboBox_3;
	private JComboBox comboBox_4;
	private JComboBox comboBox_5;
	private JComboBox comboBox_6;
	private JComboBox comboBox_7;
	private JComboBox comboBox_8;
	private JComboBox comboBox_9;
	private JComboBox comboBox_10;
	private JComboBox comboBox_1;
	private JTextField textField_7;
	private JTextArea textArea;

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

		textField_5 = new JTextField("1");
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.insets = new Insets(0, 0, 5, 0);
		gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_5.gridx = 1;
		gbc_textField_5.gridy = 0;
		frame.getContentPane().add(textField_5, gbc_textField_5);
		textField_5.setColumns(10);

		JLabel lblWorkOrderNumber = new JLabel("Work Order 1");
		GridBagConstraints gbc_lblWorkOrderNumber = new GridBagConstraints();
		gbc_lblWorkOrderNumber.anchor = GridBagConstraints.EAST;
		gbc_lblWorkOrderNumber.insets = new Insets(0, 0, 5, 5);
		gbc_lblWorkOrderNumber.gridx = 0;
		gbc_lblWorkOrderNumber.gridy = 1;
		frame.getContentPane().add(lblWorkOrderNumber, gbc_lblWorkOrderNumber);

		textField_6 = new JTextField();
		GridBagConstraints gbc_textField_6 = new GridBagConstraints();
		gbc_textField_6.insets = new Insets(0, 0, 5, 0);
		gbc_textField_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_6.gridx = 1;
		gbc_textField_6.gridy = 1;
		frame.getContentPane().add(textField_6, gbc_textField_6);
		textField_6.setColumns(10);

		JLabel lblWorkOrder = new JLabel("Work Order 2");
		GridBagConstraints gbc_lblWorkOrder = new GridBagConstraints();
		gbc_lblWorkOrder.anchor = GridBagConstraints.EAST;
		gbc_lblWorkOrder.insets = new Insets(0, 0, 5, 5);
		gbc_lblWorkOrder.gridx = 0;
		gbc_lblWorkOrder.gridy = 2;
		frame.getContentPane().add(lblWorkOrder, gbc_lblWorkOrder);

		textField_7 = new JTextField();
		GridBagConstraints gbc_textField_7 = new GridBagConstraints();
		gbc_textField_7.insets = new Insets(0, 0, 5, 0);
		gbc_textField_7.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_7.gridx = 1;
		gbc_textField_7.gridy = 2;
		frame.getContentPane().add(textField_7, gbc_textField_7);
		textField_7.setColumns(10);

		JLabel lblActualWidth = new JLabel("Actual Width");
		GridBagConstraints gbc_lblActualWidth = new GridBagConstraints();
		gbc_lblActualWidth.insets = new Insets(0, 0, 5, 5);
		gbc_lblActualWidth.anchor = GridBagConstraints.EAST;
		gbc_lblActualWidth.gridx = 0;
		gbc_lblActualWidth.gridy = 3;
		getFrame().getContentPane().add(lblActualWidth, gbc_lblActualWidth);

		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 3;
		getFrame().getContentPane().add(textField, gbc_textField);
		textField.setColumns(10);
		String[] ends = { "", "smooth", "fuzzy", "uneven", "beveled", "bulging" };
		JLabel lblRollEnds = new JLabel("Roll Ends");
		GridBagConstraints gbc_lblRollEnds = new GridBagConstraints();
		gbc_lblRollEnds.anchor = GridBagConstraints.EAST;
		gbc_lblRollEnds.insets = new Insets(0, 0, 5, 5);
		gbc_lblRollEnds.gridx = 0;
		gbc_lblRollEnds.gridy = 4;
		getFrame().getContentPane().add(lblRollEnds, gbc_lblRollEnds);

		comboBox = new JComboBox(ends);
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 1;
		gbc_comboBox.gridy = 4;
		getFrame().getContentPane().add(comboBox, gbc_comboBox);
		comboBox.setEditable(true);

		JLabel lblCoreCentering = new JLabel("Core Centering");
		GridBagConstraints gbc_lblCoreCentering = new GridBagConstraints();
		gbc_lblCoreCentering.anchor = GridBagConstraints.EAST;
		gbc_lblCoreCentering.insets = new Insets(0, 0, 5, 5);
		gbc_lblCoreCentering.gridx = 0;
		gbc_lblCoreCentering.gridy = 5;
		getFrame().getContentPane().add(lblCoreCentering, gbc_lblCoreCentering);

		String[] coreCentering = { "", "centered", "not centered" };
		comboBox_1 = new JComboBox(coreCentering);
		GridBagConstraints gbc_comboBox_1 = new GridBagConstraints();
		gbc_comboBox_1.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_1.gridx = 1;
		gbc_comboBox_1.gridy = 5;
		getFrame().getContentPane().add(comboBox_1, gbc_comboBox_1);
		comboBox_1.setEditable(true);

		JLabel lblCoreQuality = new JLabel("Core Quality");
		GridBagConstraints gbc_lblCoreQuality = new GridBagConstraints();
		gbc_lblCoreQuality.anchor = GridBagConstraints.EAST;
		gbc_lblCoreQuality.insets = new Insets(0, 0, 5, 5);
		gbc_lblCoreQuality.gridx = 0;
		gbc_lblCoreQuality.gridy = 6;
		getFrame().getContentPane().add(lblCoreQuality, gbc_lblCoreQuality);

		String[] coreQuality = { "", "cores in spec", "length short",
				"length long", "varying length", "uneven length" };
		comboBox_2 = new JComboBox(coreQuality);
		GridBagConstraints gbc_comboBox_2 = new GridBagConstraints();
		gbc_comboBox_2.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_2.gridx = 1;
		gbc_comboBox_2.gridy = 6;
		getFrame().getContentPane().add(comboBox_2, gbc_comboBox_2);
		comboBox_2.setEditable(true);

		JLabel lblWrinkles = new JLabel("Wrinkles");
		GridBagConstraints gbc_lblWrinkles = new GridBagConstraints();
		gbc_lblWrinkles.anchor = GridBagConstraints.EAST;
		gbc_lblWrinkles.insets = new Insets(0, 0, 5, 5);
		gbc_lblWrinkles.gridx = 0;
		gbc_lblWrinkles.gridy = 7;
		getFrame().getContentPane().add(lblWrinkles, gbc_lblWrinkles);

		String[] wrinkles = { "", "none", "few", "many", "near edge",
				"warped roll" };
		comboBox_3 = new JComboBox(wrinkles);
		GridBagConstraints gbc_comboBox_3 = new GridBagConstraints();
		gbc_comboBox_3.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_3.gridx = 1;
		gbc_comboBox_3.gridy = 7;
		getFrame().getContentPane().add(comboBox_3, gbc_comboBox_3);
		comboBox_3.setEditable(true);

		JLabel lblDieLines = new JLabel("Die Lines");
		GridBagConstraints gbc_lblDieLines = new GridBagConstraints();
		gbc_lblDieLines.anchor = GridBagConstraints.EAST;
		gbc_lblDieLines.insets = new Insets(0, 0, 5, 5);
		gbc_lblDieLines.gridx = 0;
		gbc_lblDieLines.gridy = 8;
		getFrame().getContentPane().add(lblDieLines, gbc_lblDieLines);

		String[] dieLines = { "", "none", "yes-not splitting", "yes-splitting" };
		comboBox_4 = new JComboBox(dieLines);
		GridBagConstraints gbc_comboBox_4 = new GridBagConstraints();
		gbc_comboBox_4.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_4.gridx = 1;
		gbc_comboBox_4.gridy = 8;
		getFrame().getContentPane().add(comboBox_4, gbc_comboBox_4);
		comboBox_4.setEditable(true);

		JLabel lblColdFlow = new JLabel("Cold Flow");
		GridBagConstraints gbc_lblColdFlow = new GridBagConstraints();
		gbc_lblColdFlow.anchor = GridBagConstraints.EAST;
		gbc_lblColdFlow.insets = new Insets(0, 0, 5, 5);
		gbc_lblColdFlow.gridx = 0;
		gbc_lblColdFlow.gridy = 9;
		getFrame().getContentPane().add(lblColdFlow, gbc_lblColdFlow);

		String[] coldFlow = { "", "yes", "no" };
		comboBox_5 = new JComboBox(coldFlow);
		GridBagConstraints gbc_comboBox_5 = new GridBagConstraints();
		gbc_comboBox_5.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_5.gridx = 1;
		gbc_comboBox_5.gridy = 9;
		getFrame().getContentPane().add(comboBox_5, gbc_comboBox_5);
		comboBox_5.setEditable(true);

		JLabel lblHoles = new JLabel("Holes");
		GridBagConstraints gbc_lblHoles = new GridBagConstraints();
		gbc_lblHoles.anchor = GridBagConstraints.EAST;
		gbc_lblHoles.insets = new Insets(0, 0, 5, 5);
		gbc_lblHoles.gridx = 0;
		gbc_lblHoles.gridy = 10;
		getFrame().getContentPane().add(lblHoles, gbc_lblHoles);

		String[] holes = { "", "none", "few", "many" };
		comboBox_6 = new JComboBox(holes);
		GridBagConstraints gbc_comboBox_6 = new GridBagConstraints();
		gbc_comboBox_6.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_6.gridx = 1;
		gbc_comboBox_6.gridy = 10;
		getFrame().getContentPane().add(comboBox_6, gbc_comboBox_6);
		comboBox_6.setEditable(true);

		JLabel lblGelsparticles = new JLabel("Gels/Particles");
		GridBagConstraints gbc_lblGelsparticles = new GridBagConstraints();
		gbc_lblGelsparticles.anchor = GridBagConstraints.EAST;
		gbc_lblGelsparticles.insets = new Insets(0, 0, 5, 5);
		gbc_lblGelsparticles.gridx = 0;
		gbc_lblGelsparticles.gridy = 11;
		getFrame().getContentPane().add(lblGelsparticles, gbc_lblGelsparticles);

		comboBox_7 = new JComboBox(holes);
		GridBagConstraints gbc_comboBox_7 = new GridBagConstraints();
		gbc_comboBox_7.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox_7.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_7.gridx = 1;
		gbc_comboBox_7.gridy = 11;
		getFrame().getContentPane().add(comboBox_7, gbc_comboBox_7);
		comboBox_7.setEditable(true);

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
		comboBox_8 = new JComboBox(color);
		GridBagConstraints gbc_comboBox_8 = new GridBagConstraints();
		gbc_comboBox_8.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox_8.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_8.gridx = 1;
		gbc_comboBox_8.gridy = 12;
		getFrame().getContentPane().add(comboBox_8, gbc_comboBox_8);
		comboBox_8.setEditable(true);

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
		comboBox_9 = new JComboBox(packaging);
		GridBagConstraints gbc_comboBox_9 = new GridBagConstraints();
		gbc_comboBox_9.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox_9.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_9.gridx = 1;
		gbc_comboBox_9.gridy = 13;
		getFrame().getContentPane().add(comboBox_9, gbc_comboBox_9);
		comboBox_9.setEditable(true);

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
		comboBox_10 = new JComboBox(pallet);
		GridBagConstraints gbc_comboBox_10 = new GridBagConstraints();
		gbc_comboBox_10.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox_10.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_10.gridx = 1;
		gbc_comboBox_10.gridy = 14;
		getFrame().getContentPane().add(comboBox_10, gbc_comboBox_10);
		comboBox_10.setEditable(true);

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

		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 0);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 16;
		getFrame().getContentPane().add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);

		JLabel lblCenterStand = new JLabel("Center Stand");
		GridBagConstraints gbc_lblCenterStand = new GridBagConstraints();
		gbc_lblCenterStand.anchor = GridBagConstraints.EAST;
		gbc_lblCenterStand.insets = new Insets(0, 0, 5, 5);
		gbc_lblCenterStand.gridx = 0;
		gbc_lblCenterStand.gridy = 17;
		getFrame().getContentPane().add(lblCenterStand, gbc_lblCenterStand);

		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 0);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 1;
		gbc_textField_2.gridy = 17;
		getFrame().getContentPane().add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);

		JLabel lblWinder = new JLabel("Winder");
		GridBagConstraints gbc_lblWinder = new GridBagConstraints();
		gbc_lblWinder.anchor = GridBagConstraints.EAST;
		gbc_lblWinder.insets = new Insets(0, 0, 5, 5);
		gbc_lblWinder.gridx = 0;
		gbc_lblWinder.gridy = 18;
		getFrame().getContentPane().add(lblWinder, gbc_lblWinder);

		textField_3 = new JTextField();
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(0, 0, 5, 0);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 1;
		gbc_textField_3.gridy = 18;
		getFrame().getContentPane().add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);

		JLabel lblCollapserTemperature = new JLabel("Collapser Temperature");
		GridBagConstraints gbc_lblCollapserTemperature = new GridBagConstraints();
		gbc_lblCollapserTemperature.anchor = GridBagConstraints.EAST;
		gbc_lblCollapserTemperature.insets = new Insets(0, 0, 5, 5);
		gbc_lblCollapserTemperature.gridx = 0;
		gbc_lblCollapserTemperature.gridy = 19;
		getFrame().getContentPane().add(lblCollapserTemperature,
				gbc_lblCollapserTemperature);

		textField_4 = new JTextField();
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.insets = new Insets(0, 0, 5, 0);
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.gridx = 1;
		gbc_textField_4.gridy = 19;
		getFrame().getContentPane().add(textField_4, gbc_textField_4);
		textField_4.setColumns(10);

		JLabel lblComments = new JLabel("Comments");
		GridBagConstraints gbc_lblComments = new GridBagConstraints();
		gbc_lblComments.insets = new Insets(0, 0, 5, 5);
		gbc_lblComments.gridx = 0;
		gbc_lblComments.gridy = 20;
		getFrame().getContentPane().add(lblComments, gbc_lblComments);

		textArea = new JTextArea();
		GridBagConstraints gbc_textArea = new GridBagConstraints();
		gbc_textArea.insets = new Insets(0, 0, 5, 0);
		gbc_textArea.fill = GridBagConstraints.BOTH;
		gbc_textArea.gridx = 1;
		gbc_textArea.gridy = 20;
		frame.getContentPane().add(textArea, gbc_textArea);

		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					submitQASQL();
					// increment set number
					String num = textField_5.getText();
					int num2 = Integer.valueOf(num);
					num2++;
					num = Integer.toString(num2);
					textField_5.setText(num);
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
		String setNumber = textField_5.getText().trim();
		int setInt = convertToInt(setNumber);
		String workOrder1 = textField_6.getText().trim();
		String workOrder2 = textField_7.getText().trim();
		int workInt1 = convertToInt(workOrder1);
		int workInt2 = convertToInt(workOrder2);
		String width = textField.getText();
		String rollEnds = (String) comboBox.getSelectedItem();
		String coreCentering = (String) comboBox_1.getSelectedItem();
		String coreQuality = (String) comboBox_2.getSelectedItem();
		String wrinkles = (String) comboBox_3.getSelectedItem();
		String dieLines = (String) comboBox_4.getSelectedItem();
		String coldFlow = (String) comboBox_5.getSelectedItem();
		String holes = (String) comboBox_6.getSelectedItem();
		String gels = (String) comboBox_7.getSelectedItem();
		String rollColor = (String) comboBox_8.getSelectedItem();
		String packaging = (String) comboBox_9.getSelectedItem();
		String pallet = (String) comboBox_10.getSelectedItem();
		String collapserTension = textField_1.getText().trim();
		String centerStandTension = textField_2.getText().trim();
		String winderTension = textField_3.getText().trim();
		String collapserTemperature = textField_4.getText().trim();
		String comments = textArea.getText().trim();

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
