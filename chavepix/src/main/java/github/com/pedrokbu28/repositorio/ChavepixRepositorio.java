package github.com.pedrokbu28.repositorio;

//import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import github.com.pedrokbu28.model.ChavepixApplication;



public interface ChavepixRepositorio extends JpaRepository<ChavepixApplication, Long> {
    
    //public Optional<ChavepixApplication> findById(Long id);

}
