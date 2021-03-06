package com.springBootTemel.demo.advice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

@ControllerAdvice
@RestController
@Slf4j
public class IMExceptionHandler  extends ResponseEntityExceptionHandler{

    //Bu class ile service ile alınan tüm hatalarda bu classa düşer bunun ile hata aldığımızda nasıl davranacagımıza kara vermiştik
    @ExceptionHandler(Exception.class)
    public final ResponseEntity<?> handleExceptions(Exception ex, WebRequest request){
        log.info("IMExceptionHandler -> ExceptionHandler ->" +ex);
        ExceptionResponse exceptionResponse = new ExceptionResponse(new Date(),ex.getMessage());
        return  new ResponseEntity<>(exceptionResponse, HttpStatus.EXPECTATION_FAILED);
    }

}
