package com.javierrodriguez.academyc.teachers.ui;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.javierrodriguez.academyc.AcademycApplication;
import com.javierrodriguez.academyc.app.application.services.IDniService;
import com.javierrodriguez.academyc.teachers.domain.entities.Teacher;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.UUID;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes= AcademycApplication.class)
@AutoConfigureMockMvc
public class TeacherControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private IDniService dniMock;

    @Autowired
    private WebApplicationContext context;

      @Before("")
      public void setup(){
          mvc = MockMvcBuilders
                   .webAppContextSetup(context)
                  .build();
      }

      @Test
      public void home() throws Exception{
          mvc.perform(get("/teachers").contentType(MediaType.APPLICATION_JSON))
                  .andDo(print())
                  .andExpect(status().isOk());
      }

      @Test
     public void CreateTeacher() throws Exception{


             when(dniMock.checkDni("1234567")).thenReturn(true);
             Teacher teacher = new Teacher(UUID.randomUUID(), "prueba","prueba","1234567");
             mvc.perform(post("/teachers").contentType(MediaType.APPLICATION_JSON).content(this.toJson(teacher)))
                     .andDo(print())
                     .andExpect(status().isOk())
                     .andExpect(jsonPath("$.name").value(teacher.getName()));
     }


    static byte[] toJson(Object object) throws Exception
    {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").create();

        return gson.toJson(object).getBytes();
    }

}
