package github.com.pedrokbu28.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import github.com.pedrokbu28.model.ChavepixApplication;
import org.springframework.stereotype.Repository;

@Repository
public interface ChavepixRepositorio extends JpaRepository<ChavepixApplication, Long> {
    
}
