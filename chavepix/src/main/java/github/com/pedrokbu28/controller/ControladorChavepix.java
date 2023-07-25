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
    public List<ChavepixApplication> selecionar() {
        return chavepixService.listar();
    }

    @PostMapping
    public ChavepixApplication adicionar (@RequestBody ChavepixApplication chavepixapplication){
        return chavepixService.salvar(chavepixapplication);
    }

    @PutMapping
    public ChavepixApplication alterar (@RequestBody ChavepixApplication chavepixapplication){
        return chavepixService.alterar(chavepixapplication);
    }

    @DeleteMapping
    public String deletar (@RequestBody ChavepixApplication chavepixapplication){
            chavepixService.delete(chavepixapplication);
        return "Deletado com sucesso";
    }   
   
}