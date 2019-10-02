/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university;
import java.util.ArrayList;
import java.util.Collection;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Cristina
 */
@Path("students")
public class EstudianteResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of RegisterResource
     */
    public EstudianteResource() {
    }

    /**
     * Retrieves representation of an instance of Register.RegisterResource
     * @return an instance of java.lang.String
     */
    
    
    
  
    @Path("{id}/{name}")   
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Estudiante  getEstudiante(@PathParam("id") String idcourse,@PathParam("name") String name) {
           String instructor="Edison";
           String course="2958";
           String schedule="10-14";
           Estudiante estudiante=new  Estudiante( name, instructor,  course,  schedule);
       if(idcourse.equals(course)){
           estudiante.setInstructor("Edison Lascano");
           estudiante.setSchedule("12pm a 14am");
           estudiante.RegisterDataBase(name, instructor, idcourse+"Programacion Avanzada", schedule);
       } 
        return estudiante;
    }
@Path("list")
@GET
@Produces(MediaType.APPLICATION_JSON)
public String  getListEstudiante(){
    Estudiante estu=new  Estudiante();
    return estu.ListEstudiante();
}
    /**
     * PUT method for updating or creating an instance of RegisterResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
