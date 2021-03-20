package com.project.ssl.projectbank.rest;

import com.project.ssl.projectbank.model.User;
import com.project.ssl.projectbank.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/users")
@RestController
public class UserController {


    @Autowired
    private UserServiceImpl userServiceImpl;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<User> findAll(){
        return userServiceImpl.findAllUsers();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{id}")
    public User findOne(@PathParam("id") Long id){
        return userServiceImpl.findUserById(id);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void create(User user){
        userServiceImpl.save(user);
        System.out.println("Creado Correctamente");
    }


    @DELETE
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("{id}")
    public void deleteById(@PathParam("id") Long id) {
        userServiceImpl.deleteById(id);
        System.out.println("Borrado Correctamente");
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("{id}")
    public void update(@PathParam("id") Long id, User user) {
        userServiceImpl.update(id,user);
        System.out.println("Actualizado Correctamente");
    }


}