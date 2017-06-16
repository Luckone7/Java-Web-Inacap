
package cl.accesodato;
import java.sql.*;

public class Conexion {
   Connection con=null;
   private String Driver="com.mysql.jdbc.Driver";
   private String url="jdbc:mysql://localhost:3306/inacap";
   private String user="root";
   private String password="megaboy2";
   private Statement stmt=null;
   private ResultSet rss=null;
   
   public Conexion(){
        try{
          Class.forName(Driver);
          con=DriverManager.getConnection(url, user, password);
            System.out.println("USUARIO CONECTADO");
        }catch(Exception ex){
            System.out.println("ERROR"+ex.getMessage());
        }
    }
   public void setInsertar(String sql){
       try{
           stmt=con.createStatement();
           stmt.executeUpdate(sql);
       }catch(Exception ex){
           System.out.println("ERROR"+ex.getMessage());
       }
   }
}

