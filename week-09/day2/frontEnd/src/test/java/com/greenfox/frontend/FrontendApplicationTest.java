package com.greenfox.frontend;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.Arrays;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = FrontendApplication.class)
@WebAppConfiguration
@EnableWebMvc
public class FrontendApplicationTest {

  private MockMvc mockMvc;

  @Autowired
  private WebApplicationContext webApplicationContext;

  @Before
  public void setup() throws Exception {
    this.mockMvc = webAppContextSetup(webApplicationContext).build();
  }


  // EXERCISE 2 (NORMAL CASE)
  @Test
  public void doublingTest_normalCase() throws Exception {
    int input = 15;
    mockMvc.perform(
            get("/doubling?input=" + input)
    )
            .andExpect(status().isOk())
            .andExpect(content().contentType("application/json;charset=UTF-8"))
            .andExpect(jsonPath("$.received", is(15)))
            .andExpect(jsonPath("$.result", is(30)));
  }

  // EXERCISE 2 (ERROR HANDLING)
  @Test
  public void doublingErrorHandlingTest_forMissingInput() throws Exception {
    mockMvc.perform(
            get("/doubling")
    )
            .andExpect(status().isOk())
            .andExpect(content().contentType("application/json;charset=UTF-8"))
            .andExpect(jsonPath("$.error", is("Please provide an input!")));
  }

  //EXERCISE 3 (NORMAL CASE)
  @Test
  public void greeterTest_normalCase() throws Exception {
    String name = "Petike";
    String title = "student";
    mockMvc.perform(get("/greeter?name=" + name + "&title=" + title)
    )
            .andExpect(status().isOk())
            .andExpect(content().contentType("application/json;charset=UTF-8"))
            .andExpect(jsonPath("$.welcome_message", is("Oh, hi there Petike, " +
                    "my dear " + "student!")));
  }

  //EXERCISE 3 (ERROR HANDLING for missing title)
  @Test
  public void greeterErrorHandlingTest_forMissingTitle() throws Exception {
    String name = "Petike";
    mockMvc.perform(get("/greeter?name=" + name)
    )
            .andExpect(status().isOk())
            .andExpect(content().contentType("application/json;charset=UTF-8"))
            .andExpect(jsonPath("$.error", is("Please provide a title!")));
  }

  //EXERCISE 3 (ERROR HANDLING for missing name)
  @Test
  public void greeterErrorHandlingTest_forMissingName() throws Exception {
    String title = "student";
    mockMvc.perform(get("/greeter?title=" + title)
    )
            .andExpect(status().isOk())
            .andExpect(content().contentType("application/json;charset=UTF-8"))
            .andExpect(jsonPath("$.error", is("Please provide a name!")));
  }

  //EXERCISE 4 (NORMAL CASE)
  @Test
  public void appendTest_normalCase() throws Exception {
    String inputParameter = "kuty";
    mockMvc.perform(get("/appenda/" + inputParameter)
    )
            .andExpect(status().isOk())
            .andExpect(content().contentType("application/json;charset=UTF-8"))
            .andExpect(jsonPath("$.appended", is(inputParameter + "a")));
  }

  //EXERCISE 4 (ERROR HANDLING for missing input)
  @Test
  public void appendErrorHandlingTest_forMissingInput() throws Exception {
    mockMvc.perform(get("/appenda/")
    )
            .andExpect(status().is4xxClientError());
  }

  //EXERCISE 5 (NORMAL CASE)
  @Test
  public void doUntilSumTest_normalCase() throws Exception {
    mockMvc.perform(
            post("/dountil/sum")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content("{\"until\": 5}")
    )
            .andExpect(status().isOk())
            .andExpect(content().contentType("application/json;charset=UTF-8"))
            .andExpect(jsonPath("$.result", is(15)));
  }

  //EXERCISE 5 (ERROR HANDLING for missing number input)
  @Test
  public void doUntilSumErrorHandlingTest_forMissingNumberInput() throws Exception {
    mockMvc.perform(
            post("/dountil/sum")
                    .contentType(MediaType.APPLICATION_JSON)
    )
            .andExpect(status().isOk())
            .andExpect(content().contentType("application/json;charset=UTF-8"))
            .andExpect(jsonPath("$.error", is("Please provide a number!")));
  }

  //EXERCISE 6 (NORMAL CASE - SUM)
  @Test
  public void arrayHandlerTest_normalCase_SUM() throws Exception {
    mockMvc.perform(
            post("/arrays")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content("{\"what\": \"sum\", \"numbers\": [1, 2, 5, 10]}")
    )
            .andExpect(status().isOk())
            .andExpect(content().contentType("application/json;charset=UTF-8"))
            .andExpect(jsonPath("$.result", is(18)));
  }

  //EXERCISE 6 (NORMAL CASE - MULTIPLY)
  @Test
  public void arrayHandlerTest_normalCase_MULTIPLY() throws Exception {
    mockMvc.perform(
            post("/arrays")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content("{\"what\": \"multiply\", \"numbers\": [1, 2, 5, 10]}")
    )
            .andExpect(status().isOk())
            .andExpect(content().contentType("application/json;charset=UTF-8"))
            .andExpect(jsonPath("$.result", is(100)));
  }

  //EXERCISE 6 (NORMAL CASE - DOUBLE)
  @Test
  public void arrayHandlerTest_normalCase_DOUBLE() throws Exception {
    mockMvc.perform(
            post("/arrays")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content("{\"what\": \"double\", \"numbers\": [1, 2, 5, 10]}")
    )
            .andExpect(status().isOk())
            .andExpect(content().contentType("application/json;charset=UTF-8"))
            .andExpect(jsonPath("$.result", is(Arrays.asList(2, 4, 10, 20))));
  }
}
