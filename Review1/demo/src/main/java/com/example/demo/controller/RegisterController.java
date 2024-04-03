package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Register;
import com.example.demo.service.RegisterService;
@RestController
public class RegisterController {
    @Autowired
    RegisterService ms;
    @PostMapping("/api/register")
    public ResponseEntity<Register>addelements(@RequestBody Register m)
    {
        Register mm=ms.create(m);
        return new ResponseEntity<>(mm,HttpStatus.CREATED);
    }
    @GetMapping("/api/registers")
    public ResponseEntity<List<Register>> showinfo()
    {
        return new ResponseEntity<>(ms.getAll(),HttpStatus.OK);
    }
    
    @PutMapping("/api/register/{userId}")
    public ResponseEntity<Register> putMethodName(@PathVariable("userId") int id, @RequestBody Register m) {
        if(ms.updateDetails(id,m) == true)
        {
            return new ResponseEntity<>(m,HttpStatus.OK);
        }
        
        return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
    }
@DeleteMapping("/api/register/{userId}")
    public ResponseEntity<Boolean> delete(@PathVariable("userId") int id)
    {
        if(ms.deleteDetails(id) == true)
        {
            return new ResponseEntity<>(true,HttpStatus.OK);
        }
        return new ResponseEntity<>(false,HttpStatus.NOT_FOUND);
    }
}

