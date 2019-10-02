/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import university.service.Usuario;

/**
 * REST Web Service
 *
 * @author DANIELAROSERO
 */
@Path("student")
public class studentResource {
    @Context
    private UriInfo context;

    /**
     * Creates a new instance of studentResource
     */
    public studentResource() {

    }

    /**
     * Retrieves representation of an instance of university.studentResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getText() {    
                return "my name is Gaby";
    }

    /**
     * PUT method for updating or creating an instance of studentResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.TEXT_PLAIN)
    public void putText(String content) {
    }
    
    
    @Path("list")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String  getListUsuario(){
      Usuario user=new  Usuario();
      return user.ListUsuario();
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
