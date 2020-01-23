package com.rest_session.demo;
import org.apache.catalina.User;

import javax.ws.rs.*;
import java.util.Collections;
@Path("/apis")
public class Employe{
    @GET
    @Produces("Application/json")
    public String[] get(){
        String str[]={"Vikas","is learning"};
        return str;
    }
    @PUT
    @Path("/put")
    @Produces("Applications/json")
    public String[] Putuser(String name){
             if(User_Database.user.contains(name)){
                 return new String[]{"User already exists"};
             }
             User_Database.user.add(name);
             Collections.sort(User_Database.user);
        return User_Database.user.toArray(new String[User_Database.user.size()]);
    }
    @POST
    @Path("/{name}")
    @Produces("Applications/json")
    public String postuser(@PathParam("name") String name){
        return name;
    }
    @DELETE
    @Produces("Applications/json")
   public String[] Deluser(String name) {
               if(User_Database.user.contains(name)){
                 User_Database.user.remove(name);
                 Collections.sort(User_Database.user);
                 return User_Database.user.toArray(new String[User_Database.user.size()]);}
               else{
                   return new String[]{"User to be deleted not Found :("};
               }
    }
}