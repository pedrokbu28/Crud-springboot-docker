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
        //mensagem.setMensagem("Salvo com sucesso");
        return chavepixRepositorio.save(chavepixapplication);
    }
    
    public ChavepixApplication alterar(ChavepixApplication chavepixApplication) {
        if(chavepixApplication.getId() > 0) {
            //mensagem.setMensagem("Alterado com sucesso");
        return chavepixRepositorio.save(chavepixApplication);
        }else {
            return null;
        }
    }

    public void delete(ChavepixApplication chavepixapplication) {
        if(chavepixapplication.getId() > 0)
            chavepixRepositorio.delete(chavepixapplication);
    }

}




    