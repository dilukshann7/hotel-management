package Project;
import java.sql.*;
import javax.swing.JOptionPane;

public class InsertUpdateDelete {
    public static void setData(String Query, String msg) {
        Connection con = null;
        Statement st = null;
        try {
            con = ConnectionProvider.getCon();
            st = con.createStatement();
            st.executeUpdate(Query);
            if(!msg.equals("")) {
                JOptionPane.showMessageDialog(null, msg);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, msg);
        }
        finally {
            try {
                
            } catch (Exception e) {
            }
        }
    }
    public static void setDataSilent(String Query) {
        Connection con = null;
        Statement st = null;
        try {
            con = ConnectionProvider.getCon();
            st = con.createStatement();
            st.executeUpdate(Query);
        } catch (Exception e) {
            
        }
        finally {
            try {
                
            } catch (Exception e) {
            }
        }
    }
}
