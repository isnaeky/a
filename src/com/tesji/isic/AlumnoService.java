package com.tesji.isic;

import java.util.ArrayList;
import java.util.List;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
@Path("/alumnos")
public class AlumnoService {
	
List<Alumno> alumnos;
public AlumnoService(){
	alumnos=new ArrayList<>();
	Alumno isai =new Alumno(14230426,"isai","Trejo Matias","Sistemas");
	Alumno sara =new Alumno(14230596,"Sara","Cruz Martinez","Sistemas");
	alumnos.add(isai);
	alumnos.add(sara);
}

@GET
@Produces(MediaType.TEXT_XML)
@Path("/xml")
public List<Alumno> getAlumnos(){
	return alumnos;
}
@GET
@Produces(MediaType.APPLICATION_JSON)
//@Produces(MediaType.APPLICATION_JSON)
@Path("/json")
public List<Alumno> getAlumnoJson(){
	return alumnos;
	
}


}
