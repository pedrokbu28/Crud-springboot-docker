package github.com.pedrokbu28;

import java.util.List;


import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import github.com.pedrokbu28.controller.controladorChavepix;
import github.com.pedrokbu28.model.ChavepixApplication;
import github.com.pedrokbu28.repositorio.ChavePixRepositorio;

@WebMvcTest(controllers = controladorChavepix.class)
@AutoConfigureMockMvc
@SpringBootTest
public class controladorChavepixTest {
    
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    ChavePixRepositorio repositorio;


    @Test
    void salvarChavepix() throws Exception {
        ChavepixApplication chavepixApplication = new ChavepixApplication();
        chavepixApplication.setEmail("pedro@gmail.com");
        chavepixApplication.setCpf(123456789-12);

        Mockito.when(repositorio.save(Mockito.any()).thenReturn(List.of(chavepixApplication)));

        this.mockMvc.perform(post("/ChavepixApplication"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.email").value("pedro@hotmail.com"))
                .andExpect(content().json("[{'id':null,'telefone':null,'email':pedro@gmail.com,'cpf':12345678900, 'chaveAleatorio':null}]"));

    }

    @Test
    void buscarChavepix() throws Exception {
        var chavepixApplication = new ChavepixApplication();
        chavepixApplication.setEmail("pedro@gmail.com");

        Mockito.when(repositorio.findAll()).thenReturn(List.of(chavepixApplication));

        this.mockMvc.perform(get("/ChavepixApplication"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().json("[{'id':null,'telefone':null,'email':pedro@gmail.com,'cpf':12345678900, 'chaveAleatorio':null}]"));

    }

    @Test
    void deletarChavepix() throws Exception {
        var chavepixApplication = new ChavepixApplication();
        chavepixApplication.setCpf(123456789-12);

        Mockito.when(repositorio.delete(chavepixApplication)).thenReturn(List.of(chavepixApplication))
        this.mockMvc.perform(delete("/ChavepixApplication"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().json("[{'id':null,'telefone':null,'email':pedro@gmail.com,'cpf':null, 'chaveAleatorio':null}]"));
    }
}















