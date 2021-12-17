package com.agreeyaBasicsSpringboot.ControllerPgm;

import com.agreeyaBasicsSpringboot.ModelPackage.StudentInfo;
import com.agreeyaBasicsSpringboot.repositoryPgm.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.agreeyaBasicsSpringboot.GlobalException.ResourceNotFoundException;

import javax.persistence.criteria.CriteriaBuilder;
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

   //Delete Records
    @DeleteMapping("/deleteRecords/{id}")
    public ResponseEntity<StudentInfo> DeleteRecord( @PathVariable ("id") Integer regis)
    {
        StudentInfo si=this.studentRepo.findById(regis)
                .orElseThrow(()->new ResourceNotFoundException("Student Records Not Found"));
        this.studentRepo.delete(si);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/UpdateRecords/{id}")
    public  StudentInfo updateRecords(@RequestBody StudentInfo studentInfo, @PathVariable("id") Integer registerNo)
    {
        StudentInfo si=this.studentRepo.findById(registerNo)
                //.stream().peek(System.out::println())
                .orElseThrow(()->new ResourceNotFoundException("Student Records Not Found"));
        System.out.println(si);
        si.setName(studentInfo.getName());
        si.setAddress(studentInfo.getAddress());
        si.setCountry(studentInfo.getCountry());
        si.setCity(studentInfo.getCity());
        si.setZipcode(studentInfo.getZipcode());
        return this.studentRepo.save(si);

    }
}
