package github.com.pedrokbu28.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import github.com.pedrokbu28.model.ChavepixApplication;
import github.com.pedrokbu28.repositorio.ChavePixRepositorio;


@RestController
@RequestMapping("/ChavepixApplication")
public class controladorChavepix {
    
    
    @Autowired
    private ChavePixRepositorio repositorio;
        

    @GetMapping
    public List<ChavepixApplication> listar() {   
        return repositorio.findAll();
    }

    @PostMapping
     public ChavepixApplication adicionar (@RequestBody ChavepixApplication chavepix){
        return repositorio.save(chavepix);
     }

    @PutMapping
     public ChavepixApplication alterar (@RequestBody ChavepixApplication chavepix){
        if(chavepix.getId() > 0)
            return repositorio.save(chavepix);
        return null;
    }

    @DeleteMapping
     public String deletar (@RequestBody ChavepixApplication chavepix){
           if(chavepix.getId() > 0)
            repositorio.delete(chavepix);
        return "Deletado com sucesso";
    }   
   
}