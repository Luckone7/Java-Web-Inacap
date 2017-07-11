package cl.Negocio;

import cl.accesodato.Conexion;

public class Curso {

    private int id;
    private String name;
    private String description;
    private String created_at;
    private String state;
    Conexion cn;

    public Curso() {
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    public void Save(){
        String sql="Insert into courses(name,description,created_at,state)"
                + "value('"+this.getName()+"','"+this.getDescription()+"',Now(),'activo')";
        cn.setInsertar(sql);
    }
}
