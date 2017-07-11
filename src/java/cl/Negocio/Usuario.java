package cl.Negocio;

import cl.accesodato.Conexion;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Usuario {

    private int id;
    private String name;
    private String apepat;
    private String apemat;
    private String created_at;
    private String status;
    private String username;
    private String password;
    Conexion cn;

    public Usuario() {
        cn = new Conexion();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApepat() {
        return apepat;
    }

    public void setApepat(String apepat) {
        this.apepat = apepat;
    }

    public String getApemat() {
        return apemat;
    }

    public void setApemat(String apemat) {
        this.apemat = apemat;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean Validar() {
        String sql = "Select * from users where username='" + this.getUsername() + "'";
        cn.setSql(sql);
        try {
            while (cn.getRs().next()) {
                if (cn.getRs().getString("password").equals(this.getPassword())) {
                    return true;
                } else {
                    return false;
                }
            }
        } catch (SQLException ex) {
            System.out.println("ERROR " + ex.getMessage());
        }
        return false;
    }
    public void Save(){
        String slq="insert into users(name,apepat,apemat,username,password,created_at,state) "
                + "value('"+this.getName()+"','"+this.getApepat()+"','"+this.getApemat()+"','"+this.getUsername()+"','"+this.getPassword()+"',Now(),'activo')";
        cn.setInsertar(slq);
    }
}
