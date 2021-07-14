package kr.ac.kpu.metoring7_14.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import kr.ac.kpu.metoring7_14.dto.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@Slf4j
@WebMvcTest(RestApiController.class)
class RestApiControllerTest {

    @Autowired
    private MockMvc mvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void post_test() throws Exception {
        String id = "JIMI";
        String pw = "USok";
        String email = "subin@naver.com";
        //given
        User user = User.builder().id(id).pw(pw).email(email).build();
        final ResultActions actions =
                mvc.perform(MockMvcRequestBuilders.post("/api/post")
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON)
                        .characterEncoding("UTF-8")
                        .content(objectMapper.writeValueAsString(user)));
        //when
        actions.andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.id").value(id))
                .andExpect(MockMvcResultMatchers.jsonPath("$.pw").value(pw))
                .andExpect(MockMvcResultMatchers.jsonPath("$.email").value(email));
    }

}