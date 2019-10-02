package university;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import javax.swing.JOptionPane;

/**
 *
 * @author Cristina
 */

public class Estudiante {
    private String name;
    private String instructor;
    private String course;
    private String schedule;
public Estudiante(){
    
}
  public static void main(String[] args){
 
    }
    private Conexion conexion = new Conexion();
    public Estudiante(String name,String instructor, String course, String schedule) {
       this.name =name;
        this.instructor = instructor;
        this.course = course;
        this.schedule = schedule;
    }
  public void RegisterDataBase( String name,String instructor, String course, String schedule){
       Connection con = conexion.getConnection();
        Statement st;
        //Creamos las sentenia sql
        String sql = "INSERT INTO student(student,course,schedule,instructor) "
                + "VALUES ('" + name+ "','" +course+ "','" + schedule+ "','" + instructor + "')";
        //Ejecutamos la sentencia SQL
        try {
            st = con.createStatement();
            st.executeUpdate(sql);
            //Cerramos las conexiones 
            st.close();
            con.close();
        }    catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error no se puse registrar.");
        }
  }
  
  public String  ListEstudiante(){
   Connection con = conexion.getConnection();
        Statement st;
        ResultSet rs;
        String sql = "SELECT * FROM student";
        System.out.println("bbb");
        String list="";
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
               list=list+("Student:" + rs.getString(1) + " Profesor:" + rs.getString(2) + " Materia:" + rs.getString(3) + " Nota:" + rs.getString(4)+"\n");

            }
            rs.close();
            st.close();
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se puede acceder a los datos de Alumnos");
        }
        return list;
}

    /**
     * @return the instrictor
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the instrictor to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * @return the instrictor
     */
    public String getInstructor() {
        return instructor;
    }

    /**
     * @param instrictor the instrictor to set
     */
    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    /**
     * @return the course
     */
    public String getCourse() {
        return course;
    }

    /**
     * @param course the course to set
     */
    public void setCourse(String course) {
        this.course = course;
    }

    /**
     * @return the schedule
     */
    public String getSchedule() {
        return schedule;
    }

    /**
     * @param schedule the schedule to set
     */
    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }


}
