package Project;
import java.sql.*;
import javax.swing.JOptionPane;

// Used to create new Tables
public class Tables {
    public static void main(String[] args) {
        Connection con = null;
        Statement st = null;
        try {
            con = ConnectionProvider.getCon();
            st = con.createStatement();
            st.executeUpdate(
                "CREATE TABLE Customer (" +
                "customerName VARCHAR(100), " +
                "customerAge INT, " +
                "customerEmail VARCHAR(100), " +
                "customerGender VARCHAR(50), " +
                "customerNIC VARCHAR(50), " +
                "customerAddress VARCHAR(200), " +
                "customerCheckindate VARCHAR(100), " +
                "roomNo INT)"
            );            
            JOptionPane.showMessageDialog(null, "Table Created Successfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        finally {
            try {
                con.close();
                st.close(); 
            }
            catch(Exception e) {
                
            }
        }
    }
}
