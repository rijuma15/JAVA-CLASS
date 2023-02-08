
package unit4;
import java.sql.*;
public class JDBCDemo {
    public static void main(String[] args) throws SQLException {
        Connection conn;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/db_nccsB";
            String username = "root";
            String password = "";
         
            conn =  DriverManager.getConnection(url,username,password);
            System.out.println("connected");
            Statement st = conn.createStatement();
            //query to create table
//            String tblQuery = "Create table tbl_emp (id int primary key,"
//                    +"name varchar(50),address varchar(50),gender varchar(50),"
//                    +"position varchar(50), salary varchar(50))";
//            st.execute(tblQuery);
//            System.out.println("table created");

             //insert data the table
            String tblQuery = "Insert into  tbl_emp values (4,'ram','teku','female','HR',80000)";
            int res = st.executeUpdate(tblQuery);
            if(res>=1){
                System.out.println(res+ "data inserted");
            }
             
            
            
        }catch(ClassNotFoundException e){
            System.out.println(e);
        }catch(SQLException s){
            System.out.println(s);
        }
                
    }

   
}


