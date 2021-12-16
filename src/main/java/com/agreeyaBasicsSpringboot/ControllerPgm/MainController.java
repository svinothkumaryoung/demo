package com.agreeyaBasicsSpringboot.ControllerPgm;

import com.agreeyaBasicsSpringboot.ModelPackage.StudentInfo;
import com.agreeyaBasicsSpringboot.repositoryPgm.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.web.bind.annotation.*;
import com.agreeyaBasicsSpringboot.GlobalException.ResourceNotFoundException;

import java.util.Optional;


@RestController
@RequestMapping("/mainController")
public class MainController {

    @Autowired
    StudentRepo studentRepo;
    @PostMapping("/addStudent")
   public StudentInfo addStudent(@RequestBody StudentInfo studentInfo)
   {
     return studentRepo.save(studentInfo);
   }

   @GetMapping("/viewStudent/{id}")
    public StudentInfo viewStudent(@PathVariable ("id") Integer id)
   {
    return this.studentRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("Ur record not found"));
   }
}
