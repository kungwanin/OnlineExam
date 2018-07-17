
package Eexam;


import java.sql.*;
import java.util.Properties;
import java.io.InputStream;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DBConnection {

    private static Connection con;
    private static Statement st;
    private static int totalquestions=10;
    static {      
        try {     
            Properties p = new Properties();
                                                             
            InputStream in = DBConnection.class.getResourceAsStream(
                    "Settings.properties");
            if (in == null) {
                throw new Error("Inputstream Not Found");
            }
            p.load(in);  
            String userName = p.getProperty("username");
            String password = p.getProperty("password");
            String url = p.getProperty("url");
            String drivername = p.getProperty("drivername");
            totalquestions=Integer.parseInt(p.getProperty("totalquestions"));
            System.out.println(userName + " " + password + " " + url + " " + drivername);
            Class.forName(drivername).newInstance();
            con = DriverManager.getConnection(url, userName, password);
            st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            con.setAutoCommit(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Unable to Connect YAAR" + e.toString());
        }
    }
 public static int getTotalQuestions(){ return totalquestions; }
    public static void close() {
        try {
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Unable to Close" + e.toString());
        }
    }

    public static ResultSet executeQuery(String sql)  
            throws SQLException {
        ResultSet rs = st.executeQuery(sql);
        return rs;
    }
    public static int executeUpdate(String sql) throws SQLException {
        return st.executeUpdate(sql);
    }
    public static void commit() throws SQLException
    {
        con.commit();  
    }
    public static DefaultTableModel prepareTable(ResultSet rs)
            throws SQLException {

        DefaultTableModel d;
        d = new DefaultTableModel();    
        ResultSetMetaData metadata = rs.getMetaData();
        int colCount = metadata.getColumnCount();
        String[ ] colNames = new String[colCount];
        for (int i = 1; i <= colCount; i++) 
        {
            colNames[i - 1] = metadata.getColumnName(i);
        }
        d.setColumnIdentifiers(colNames);
        while (rs.next()) 
        {
            String[ ] rowData = new String[colCount];
            for (int i = 0; i < colCount; i++) {
                rowData[ i ] = rs.getString(i+1);
            }
            d.addRow(rowData);
        }
        return d;
    }   
} 
