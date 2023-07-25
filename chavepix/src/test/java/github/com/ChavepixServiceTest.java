 package github.com;
// import static org.junit.jupiter.api.Assertions.assertEquals;
// //import static org.junit.jupiter.api.Assertions.assertEquals;
// import static org.junit.jupiter.api.Assertions.assertNotNull;

// import org.junit.jupiter.api.Test;
// import org.junit.jupiter.api.extension.ExtendWith;
// import org.mockito.InjectMocks;
// import org.mockito.Mock;
// import org.mockito.junit.jupiter.MockitoExtension;
// import org.springframework.test.context.junit.jupiter.SpringExtension;
// import org.mockito.Mockito;

// import github.com.pedrokbu28.model.ChavepixApplication;
// import github.com.pedrokbu28.repositorio.ChavepixRepositorio;
// import github.com.pedrokbu28.service.ChavepixService;

// @ExtendWith(SpringExtension.class)
// public class ChavepixServiceTest {

//     @Mock
//     private ChavepixRepositorio chavepixRepositorio;

//     @InjectMocks
//     private ChavepixService chavepixService;
   
    
//     @Test
//     public void saveChavepix() throws Exception {

//         //given = dados = Cenario
//         ChavepixApplication chavepixApplication = new ChavepixApplication();
//         chavepixApplication.setId(1L);
//         chavepixApplication.setCpf("12345678908");
        
//         // ChavepixApplication chavepixApplication2 = new ChavepixApplication();
//         // chavepixApplication2.getId();
//         // chavepixApplication2.getCpf();

//         //when = quando = Execução
//         Mockito.when(chavepixRepositorio.save(Mockito.any())).thenReturn(chavepixApplication);
//         var result = chavepixService.

//         //then = então = Verificação
//         assertNotNull(chavepixApplication.getId() );
//         assertNotNull(chavepixApplication.getCpf() );
//         assertEquals(chavepixApplication2, chavepixApplication);

//     }

// }


import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import github.com.pedrokbu28.model.ChavepixApplication;
import github.com.pedrokbu28.repositorio.ChavepixRepositorio;
import github.com.pedrokbu28.service.ChavepixService;

@ExtendWith(SpringExtension.class)
public class ChavepixServiceTest {

    @InjectMocks
    private ChavepixService chavepixService;

    @Mock
    private ChavepixRepositorio chavepixRepositorio;

    @Test
    public void testSalvarComCamposPreenchidos() {
        //given = dados = Cenario
        // Tentativa de salvar com campos preenchidos
        ChavepixApplication chavepixApplication = new ChavepixApplication();
        chavepixApplication.setCpf("12345678900");
        chavepixApplication.setEmail("Pedro@gmail.com");

        //when = quando = Execução
        // Configurar o mock para retornar o objeto salvo
        when(chavepixRepositorio.save(any())).thenReturn(chavepixApplication);

        // Chamar o método a ser testado
        ChavepixApplication savedChavepix = chavepixService.salvar(chavepixApplication);

        //then = então = Verificação
        // Verificar se o objeto retornado é o esperado
        assertEquals(chavepixApplication, savedChavepix);

        // Verificar se o método save foi chamado no repositório
        verify(chavepixRepositorio, times(1)).save(chavepixApplication);
    }
}

    





