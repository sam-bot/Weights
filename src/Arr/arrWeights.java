package Arr;

import javax.swing.JOptionPane;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
import java.io.FileInputStream;

public class arrWeights {

	static Connection conn;

	public arrWeights() {
	}

	public static void sqlConnection() {
		try {
			Properties properties = new Properties();
			properties.load(new FileInputStream("lib/config.properties"));
			String userName = properties.getProperty("jdbc.username");
			String password = properties.getProperty("jdbc.password");
			String url = properties.getProperty("jdbc.url");
			Class.forName(properties.getProperty("jdbc.driver"));
			conn = DriverManager.getConnection(url, userName, password);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}

	}

}
