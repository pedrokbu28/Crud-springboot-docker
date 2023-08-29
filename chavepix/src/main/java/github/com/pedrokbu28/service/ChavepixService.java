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
    

    public List<ChavepixApplication> listar() {
        return chavepixRepositorio.findAll();
    }

    public ChavepixApplication salvar(ChavepixApplication chavepixapplication) {
        if (chavepixapplication.getId() == null && chavepixapplication.getTelefone() == null && chavepixapplication.getEmail() == null &&
           chavepixapplication.getCpf() == null && chavepixapplication.getChaveAleatoria() == null) {
            throw new IllegalArgumentException("Pelo menos um dos campos (telefone, email, cpf ou chaveAleatoria) deve ser preenchido.");
        }else{
            return chavepixRepositorio.save(chavepixapplication);  
        }  
    }

    public ChavepixApplication alterar(ChavepixApplication chavepixapplication) {
        if(chavepixapplication.getId() > 0) {
            return chavepixRepositorio.save(chavepixapplication);
        }else {
            return null;
        }
        
    }

    public void delete(ChavepixApplication chavepixapplication) {
        if(chavepixapplication.getId() > 0)
            chavepixRepositorio.delete(chavepixapplication);
    }

    public Object assertNotNull(Long id) {
        return null;
    }   

}

    