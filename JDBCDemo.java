import java.sql.*;

public class JDBCDemo {
	
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/sdmcet?characterEncoding=utf8";

	// Database credentials
	static final String USER = "root";
	static final String PASS = "123456";

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		try {
			// STEP 1: Register JDBC driver (Load JDBC driver into JVM)
			Class.forName("com.mysql.jdbc.Driver");

			// STEP 2: Open a connection
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);

			// STEP 3: Execute a query
			System.out.println("Connected to " + conn.getCatalog());
			System.out.println("Creating statement...");
			stmt = conn.createStatement();
			String sql;
			sql = "SELECT * FROM student";
			ResultSet rs = stmt.executeQuery(sql);

			// STEP 4: Extract data from result set
			while (rs.next()) {
				// Retrieve by column name
				int roll_no = rs.getInt("rollno");
				String usn = rs.getString("usn");
				String name = rs.getString("name");

				// Display values
				System.out.print("Roll No.: " + roll_no);
				System.out.print(", USN: " + usn);
				System.out.println(", Name: " + name);
			}
			
			// STEP 5: Clean-up environment
			rs.close();
			stmt.close();
			conn.close();
		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		} finally {
			// finally block used to close resources
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException se2) {
			} // nothing we can do
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			} // end finally try
		} // end try
		System.out.println("Goodbye!");
	}// end main
}// end JDBCDemo