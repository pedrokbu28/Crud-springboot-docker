// package github.com.pedrokbu28;

// import github.com.pedrokbu28.model.ChavepixApplication;
// import github.com.pedrokbu28.service.ChavepixService;

// import org.junit.jupiter.api.Test;
// import org.mockito.Mockito;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
// import org.springframework.boot.test.context.SpringBootTest;
// import org.springframework.boot.test.mock.mockito.MockBean;
// import org.springframework.http.MediaType;
// import org.springframework.test.web.servlet.MockMvc;

// import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

// import com.fasterxml.jackson.databind.ObjectMapper;

// import java.util.List;

// import static org.mockito.ArgumentMatchers.any;
// import static org.mockito.Mockito.when;
// import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
// import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
// import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

// @SpringBootTest
// @AutoConfigureMockMvc
// public class ControladorChavepixTest {
    
//     ObjectMapper mapper = new ObjectMapper();

//     @Autowired
//     private MockMvc mockMvc;

//     @MockBean
//     ChavepixService chavepixService;


//     @Test
//     public void deveBuscarChavepix() throws Exception {
//         ChavepixApplication chavepixEsperado = new ChavepixApplication();
//         chavepixEsperado.setEmail("pedro@gmail.com");

//         Mockito.when(chavepixService.findAll()).thenReturn(List.of(chavepixEsperado));

//         mockMvc
//             .perform(MockMvcRequestBuilders.get("/Chavepix"))
//             .andDo(print())
//             .andExpect((status()).isOk());
//     }


//     @Test
//     public void deveCriarChavepix() throws Exception {
//         ChavepixApplication chavepixSalvar = new ChavepixApplication();
//         chavepixSalvar.setTelefone("34 991910000");
//         chavepixSalvar.setEmail("pedro@gmail.com");
//         chavepixSalvar.setCpf("12345678900");

//         when(chavepixService.save(any(ChavepixApplication.class))).thenReturn(chavepixSalvar);

//         mockMvc
//             .perform(post("/Chavepix")
//             .content(mapper.writeValueAsString(chavepixSalvar))
//             .contentType(MediaType.APPLICATION_JSON))
//             .andDo(print())
//             .andExpect((status()).isOk());

//     }

// }







