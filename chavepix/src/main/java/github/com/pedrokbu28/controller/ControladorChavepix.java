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
import github.com.pedrokbu28.service.ChavepixService;

@RestController
@RequestMapping("/Chavepix")
public class ControladorChavepix {
    
    
    @Autowired
    private ChavepixService chavepixService; 
        

    @GetMapping
    public List<ChavepixApplication> findAll() {
        List<ChavepixApplication> result = chavepixService.findAll();
        return result;
    }

    @PostMapping
     public ChavepixApplication adicionar (@RequestBody ChavepixApplication chavepixapplication){
        return chavepixService.save(chavepixapplication);
     }

    @PutMapping
     public ChavepixApplication alterar (@RequestBody ChavepixApplication chavepixapplication){
        if(chavepixapplication.getId() > 0)
            return chavepixService.save(chavepixapplication);
        return null;
    }

    @DeleteMapping
     public String deletar (@RequestBody ChavepixApplication chavepixapplication){
           if(chavepixapplication.getId() > 0)
            chavepixService.delete(chavepixapplication);
        return "Deletado com sucesso";
    }   
   
}