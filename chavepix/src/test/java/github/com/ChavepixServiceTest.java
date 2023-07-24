// package github.com;
// import static org.junit.jupiter.api.Assertions.assertEquals;
// //import static org.junit.jupiter.api.Assertions.assertEquals;
// import static org.junit.jupiter.api.Assertions.assertNotNull;

// import org.junit.jupiter.api.Test;
// import org.junit.jupiter.api.extension.ExtendWith;
// import org.mockito.InjectMocks;
// import org.mockito.Mock;
// import org.mockito.junit.jupiter.MockitoExtension;

// import org.mockito.Mockito;

// import github.com.pedrokbu28.model.ChavepixApplication;
// import github.com.pedrokbu28.repositorio.ChavepixRepositorio;
// import github.com.pedrokbu28.service.ChavepixService;

// @ExtendWith(MockitoExtension.class)
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
        
//         ChavepixApplication chavepixApplication2 = new ChavepixApplication();
//         chavepixApplication2.getId();
//         chavepixApplication2.getCpf();

//         //when = quando = Execução
//         Mockito.when(chavepixRepositorio.save(Mockito.any())).thenReturn(chavepixApplication);

//         //then = então = Verificação
//         assertNotNull(chavepixApplication.getId() );
//         assertNotNull(chavepixApplication.getCpf() );
//         assertEquals(chavepixApplication2, chavepixApplication);

       


//     }

// }
    





