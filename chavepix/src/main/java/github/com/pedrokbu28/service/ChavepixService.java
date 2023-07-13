package github.com.pedrokbu28.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import github.com.pedrokbu28.model.ChavepixApplication;
import github.com.pedrokbu28.repositorio.ChavepixRepositorio;

@Service
public class ChavepixService {
    
    @Autowired
    private ChavepixRepositorio chavepixRepositorio;

    
    public List<ChavepixApplication> findAll() {
        List<ChavepixApplication> result = chavepixRepositorio.findAll();
        return result;
    }


    public void delete(ChavepixApplication chavepixapplication) {
    }


    public ChavepixApplication save(ChavepixApplication chavepixapplication) {
        return chavepixapplication;
    }


}
