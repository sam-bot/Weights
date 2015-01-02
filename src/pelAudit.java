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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class pelAudit {

	private JFrame frame;
	private JComboBox textField;
	private JComboBox textField_6;
	private JComboBox comboBox_2;
	private JTextField comboBox_3;
	private JComboBox comboBox_4;
	private JComboBox comboBox_5;
	private JComboBox comboBox_1;
	private JComboBox textField_7;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pelAudit window = new pelAudit();
					window.getFrame().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * 
	 * @wbp.parser.entryPoint
	 */
	public pelAudit() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setFrame(new JFrame("Pellet Inspection"));
		getFrame().setBounds(100, 100, 495, 335);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		getFrame().getContentPane().setLayout(gridBagLayout);

		String[] compounds = { "", "CRMF", "Omni", "PWGS", "PS", "SB", "SBT",
				"HT", "HWR", "LWJ", "BLG", "LGK", "Vitawrap F", "Omni MT",
				"PWMF", "MTR", "DS", "RCR", "RLGK", "SBX" };
		JLabel lblWorkOrderNumber = new JLabel("Compound");
		GridBagConstraints gbc_lblWorkOrderNumber = new GridBagConstraints();
		gbc_lblWorkOrderNumber.anchor = GridBagConstraints.EAST;
		gbc_lblWorkOrderNumber.insets = new Insets(0, 0, 5, 5);
		gbc_lblWorkOrderNumber.gridx = 0;
		gbc_lblWorkOrderNumber.gridy = 0;
		frame.getContentPane().add(lblWorkOrderNumber, gbc_lblWorkOrderNumber);

		textField_6 = new JComboBox(compounds);
		textField_6.setEditable(true);
		GridBagConstraints gbc_textField_6 = new GridBagConstraints();
		gbc_textField_6.insets = new Insets(0, 0, 5, 0);
		gbc_textField_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_6.gridx = 1;
		gbc_textField_6.gridy = 0;
		frame.getContentPane().add(textField_6, gbc_textField_6);

		JLabel lblWorkOrder = new JLabel("Color");
		GridBagConstraints gbc_lblWorkOrder = new GridBagConstraints();
		gbc_lblWorkOrder.anchor = GridBagConstraints.EAST;
		gbc_lblWorkOrder.insets = new Insets(0, 0, 5, 5);
		gbc_lblWorkOrder.gridx = 0;
		gbc_lblWorkOrder.gridy = 1;
		frame.getContentPane().add(lblWorkOrder, gbc_lblWorkOrder);

		String[] colors = { "", "clear", "blue", "green", "orange", "yellow",
				"silver" };
		textField_7 = new JComboBox(colors);
		textField_7.setEditable(true);
		GridBagConstraints gbc_textField_7 = new GridBagConstraints();
		gbc_textField_7.insets = new Insets(0, 0, 5, 0);
		gbc_textField_7.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_7.gridx = 1;
		gbc_textField_7.gridy = 1;
		frame.getContentPane().add(textField_7, gbc_textField_7);

		JLabel lblActualWidth = new JLabel("Shape");
		GridBagConstraints gbc_lblActualWidth = new GridBagConstraints();
		gbc_lblActualWidth.insets = new Insets(0, 0, 5, 5);
		gbc_lblActualWidth.anchor = GridBagConstraints.EAST;
		gbc_lblActualWidth.gridx = 0;
		gbc_lblActualWidth.gridy = 2;
		getFrame().getContentPane().add(lblActualWidth, gbc_lblActualWidth);
		String[] shapes = { "", "round", "oblong", "spaghetti" };
		textField = new JComboBox(shapes);

		textField.setEditable(true);
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 2;
		getFrame().getContentPane().add(textField, gbc_textField);

		JLabel lblCoreCentering = new JLabel("Size");
		GridBagConstraints gbc_lblCoreCentering = new GridBagConstraints();
		gbc_lblCoreCentering.anchor = GridBagConstraints.EAST;
		gbc_lblCoreCentering.insets = new Insets(0, 0, 5, 5);
		gbc_lblCoreCentering.gridx = 0;
		gbc_lblCoreCentering.gridy = 3;
		getFrame().getContentPane().add(lblCoreCentering, gbc_lblCoreCentering);

		String[] pelletSize = { "", "small", "large" };
		comboBox_1 = new JComboBox(pelletSize);
		GridBagConstraints gbc_comboBox_1 = new GridBagConstraints();
		gbc_comboBox_1.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_1.gridx = 1;
		gbc_comboBox_1.gridy = 3;
		getFrame().getContentPane().add(comboBox_1, gbc_comboBox_1);
		comboBox_1.setEditable(true);

		JLabel lblSilo = new JLabel("Silo Number");
		GridBagConstraints gbc_lblCoreQuality = new GridBagConstraints();
		gbc_lblCoreQuality.anchor = GridBagConstraints.EAST;
		gbc_lblCoreQuality.insets = new Insets(0, 0, 5, 5);
		gbc_lblCoreQuality.gridx = 0;
		gbc_lblCoreQuality.gridy = 4;
		getFrame().getContentPane().add(lblSilo, gbc_lblCoreQuality);

		String[] siloNumber = { "", "1", "2", "3", "4", "5", "6", "7", "8",
				"9", "10" };
		comboBox_2 = new JComboBox(siloNumber);
		GridBagConstraints gbc_comboBox_2 = new GridBagConstraints();
		gbc_comboBox_2.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_2.gridx = 1;
		gbc_comboBox_2.gridy = 4;
		getFrame().getContentPane().add(comboBox_2, gbc_comboBox_2);
		comboBox_2.setEditable(true);

		JLabel lblWrinkles = new JLabel("Batch Number");
		GridBagConstraints gbc_lblWrinkles = new GridBagConstraints();
		gbc_lblWrinkles.anchor = GridBagConstraints.EAST;
		gbc_lblWrinkles.insets = new Insets(0, 0, 5, 5);
		gbc_lblWrinkles.gridx = 0;
		gbc_lblWrinkles.gridy = 5;
		getFrame().getContentPane().add(lblWrinkles, gbc_lblWrinkles);

		comboBox_3 = new JTextField();
		GridBagConstraints gbc_comboBox_3 = new GridBagConstraints();
		gbc_comboBox_3.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_3.gridx = 1;
		gbc_comboBox_3.gridy = 5;
		getFrame().getContentPane().add(comboBox_3, gbc_comboBox_3);
		comboBox_3.setEditable(true);

		JLabel lblDieLines = new JLabel("Burning");
		GridBagConstraints gbc_lblDieLines = new GridBagConstraints();
		gbc_lblDieLines.anchor = GridBagConstraints.EAST;
		gbc_lblDieLines.insets = new Insets(0, 0, 5, 5);
		gbc_lblDieLines.gridx = 0;
		gbc_lblDieLines.gridy = 6;
		getFrame().getContentPane().add(lblDieLines, gbc_lblDieLines);

		String[] dieLines = { "", "none", "yes-isolated in box", "yes-in silo" };
		comboBox_4 = new JComboBox(dieLines);
		GridBagConstraints gbc_comboBox_4 = new GridBagConstraints();
		gbc_comboBox_4.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_4.gridx = 1;
		gbc_comboBox_4.gridy = 6;
		getFrame().getContentPane().add(comboBox_4, gbc_comboBox_4);
		comboBox_4.setEditable(true);

		JLabel lblColdFlow = new JLabel("Rework Added");
		GridBagConstraints gbc_lblColdFlow = new GridBagConstraints();
		gbc_lblColdFlow.anchor = GridBagConstraints.EAST;
		gbc_lblColdFlow.insets = new Insets(0, 0, 5, 5);
		gbc_lblColdFlow.gridx = 0;
		gbc_lblColdFlow.gridy = 7;
		getFrame().getContentPane().add(lblColdFlow, gbc_lblColdFlow);

		String[] rework = { "", "yes", "no" };
		comboBox_5 = new JComboBox(rework);
		GridBagConstraints gbc_comboBox_5 = new GridBagConstraints();
		gbc_comboBox_5.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_5.gridx = 1;
		gbc_comboBox_5.gridy = 7;
		getFrame().getContentPane().add(comboBox_5, gbc_comboBox_5);
		comboBox_5.setEditable(true);

		String[] color = { "", "color in spec", "not in spec-green",
				"not in spec-blue", "not in spec-metallic", "not in spec-clear" };

		JLabel lblComments = new JLabel("Comments");
		GridBagConstraints gbc_lblComments = new GridBagConstraints();
		gbc_lblComments.anchor = GridBagConstraints.EAST;
		gbc_lblComments.insets = new Insets(0, 0, 5, 5);
		gbc_lblComments.gridx = 0;
		gbc_lblComments.gridy = 8;
		getFrame().getContentPane().add(lblComments, gbc_lblComments);

		textArea = new JTextArea();
		GridBagConstraints gbc_textArea = new GridBagConstraints();
		gbc_textArea.insets = new Insets(0, 0, 5, 0);
		gbc_textArea.fill = GridBagConstraints.BOTH;
		gbc_textArea.gridx = 1;
		gbc_textArea.gridy = 8;
		frame.getContentPane().add(textArea, gbc_textArea);

		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					submitQASQL();
					JOptionPane.showMessageDialog(null,
							"Pelletizer Audit submitted");
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
		gbc_btnSubmit.gridy = 9;
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
		String workOrder1 = (String) textField_6.getSelectedItem();
		String workOrder2 = (String) textField_7.getSelectedItem();
		String width = (String) textField.getSelectedItem();
		String coreCentering = (String) comboBox_1.getSelectedItem();
		String coreQuality = (String) comboBox_2.getSelectedItem();
		String wrinkles = (String) comboBox_3.getText();
		String dieLines = (String) comboBox_4.getSelectedItem();
		String coldFlow = (String) comboBox_5.getSelectedItem();
		String comments = textArea.getText().trim();

		weights.sqlConnection();
		try {
			CallableStatement cs = null;
			cs = weights.conn
					.prepareCall("{call InsertCalPelAudit(?,?,?,?,?,?,?,?,?,?)}");
			cs.setString(1, dateTime);
			cs.setString(2, workOrder1);
			cs.setString(3, workOrder2);
			cs.setString(4, width);
			cs.setString(5, coreCentering);
			cs.setString(6, coreQuality);
			cs.setString(7, wrinkles);
			cs.setString(8, dieLines);
			cs.setString(9, coldFlow);
			cs.setString(10, comments);
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
