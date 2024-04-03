package com.example.demo.service;





import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Register;
import com.example.demo.repository.RegisterRepo;


@Service
public class RegisterService {
    @Autowired
    RegisterRepo mr;
    public Register create (Register mm)
    {
        return mr.save(mm);
    }
    public List<Register> getAll()
    {
        return mr.findAll();
    }
    public Register getMe(int id)
    {
        return mr.findById(id).orElse(null);
    }
    public boolean updateDetails(int id,Register mm)
        {
            if(this.getMe(id)==null)
            {
                return false;
            }
            try{
                mr.save(mm);
            }
            catch(Exception e)
            {
                return false;
            }
            return true;
        }
public boolean deleteDetails(int id)
        {
            if(this.getMe(id) == null)
            {
                return false;
            }
            mr.deleteById(id);
            return true;
        }

}
    

