package ec.edu.espe.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.edu.espe.demo.imp.Student;
import ec.edu.espe.demo.imp.Teacher;
import ec.edu.espe.demo.util.IPerson;

@RestController
@RequestMapping("api/example")
public class RestExampleController{

    @Autowired
    @Qualifier("Student")
    IPerson person1;

    @GetMapping("hello")
    public String hello(){
        return "Hola Gaby, aqui estan los servicios";
    }

    @GetMapping("student")
    public String student(){
        return person1.hello();
    }

    @GetMapping("teacher")
    public String teacher(){
        return person1.hello();
    }

}