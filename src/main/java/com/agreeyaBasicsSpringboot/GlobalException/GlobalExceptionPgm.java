package com.agreeyaBasicsSpringboot.GlobalException;

import com.agreeyaBasicsSpringboot.ModelPackage.ErrorModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import java.util.Date;

@ControllerAdvice
public class GlobalExceptionPgm {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<?> HandleResourceNotFound(ResourceNotFoundException rnfe, WebRequest wr)
    {
        ErrorModel em=new ErrorModel(rnfe.getMessage(),wr.getDescription(false),new Date());
        return new ResponseEntity(em, HttpStatus.NOT_FOUND);
    }
}
