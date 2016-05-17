
package basededatos;

import com.mysql.jdbc.Connection;
import java.sql.*;
import javax.swing.JOptionPane;

  

public class basededatos{
    
public String db="swhosp";       //conexion base de datos
public String url="jdbc:mysql://localhost/"+db;  //Donde se encuentra la base de datos
public String user="root";//usuario base de datos
public String pass="";//Contraseña de la base de datos

public basededatos(){
    
this.db ="swhosp"; //para llamar la base de datos desde xammp

}
    public Connection Conectar(){

    Connection link =null;
    try {
    
    Class.forName("com.mysql.jdbc.Driver");
    link= (Connection) DriverManager.getConnection(this.url, this.user, this.pass);
    }
    catch(ClassNotFoundException | SQLException e){
    
        JOptionPane.showMessageDialog(null, e);
    }
    return link;
}
    
}
