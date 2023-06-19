package github.com.pedrokbu28.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import github.com.pedrokbu28.model.ChavepixApplication;

public interface ChavePixRepositorio extends JpaRepository<ChavepixApplication, Long> {
    
}
