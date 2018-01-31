package com.greenfox.pallidaexam;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.greenfox.pallidaexam.models.LicencePlate;
import com.greenfox.pallidaexam.models.LicencePlateDTO;
import com.greenfox.pallidaexam.services.LicencePlateService;
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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = PallidaExamApplication.class)
@WebAppConfiguration
@EnableWebMvc
public class PallidaExamApplicationTests {

	private MockMvc mockMvc;

	@Autowired
	private WebApplicationContext webApplicationContext;

	@Autowired
	LicencePlateService licencePlateService;

	@Before
	public void setup() throws Exception {
		this.mockMvc = webAppContextSetup(webApplicationContext).build();
	}

	@Test
	public void restControllerTest() throws Exception {
		String brand = "Audi";
		LicencePlateDTO testTDO = new LicencePlateDTO();
		testTDO.setResult("ok");

		LicencePlate testCarOne = new LicencePlate();
		testCarOne.setCarBrand("Audi");
		testCarOne.setCarModel("R8");
		testCarOne.setColor("White");
		testCarOne.setYear("2011");
		testCarOne.setPlate("RB99-01");

		LicencePlate testCarTwo = new LicencePlate();
		testCarTwo.setCarBrand("Audi");
		testCarTwo.setCarModel("S4");
		testCarTwo.setColor("Indigo");
		testCarTwo.setYear("2013");
		testCarTwo.setPlate("KNV-421");

		testTDO.setData(licencePlateService.getAllByCarBrand("Audi"));

		mockMvc.perform(
						get("/api/search/" + brand)
		)
						.andExpect(status().isOk())
						.andExpect(content().contentType("application/json;charset=UTF-8"))
						.andExpect(jsonPath("$.result", is(testTDO.getResult())))
						.andExpect(jsonPath("$.data").isNotEmpty())
						.andExpect(jsonPath("$.data[0].plate", is(testCarOne.getPlate())))
						.andExpect(jsonPath("$.data[0].year", is(testCarOne.getYear())))
						.andExpect(jsonPath("$.data[0].color", is(testCarOne.getColor())))
						.andExpect(jsonPath("$.data[0].car_model", is(testCarOne.getCarModel())))
						.andExpect(jsonPath("$.data[0].car_brand", is(testCarOne.getCarBrand())))

						.andExpect(jsonPath("$.data[1].plate", is(testCarTwo.getPlate())))
						.andExpect(jsonPath("$.data[1].year", is(testCarTwo.getYear())))
						.andExpect(jsonPath("$.data[1].color", is(testCarTwo.getColor())))
						.andExpect(jsonPath("$.data[1].car_model", is(testCarTwo.getCarModel())))
						.andExpect(jsonPath("$.data[1].car_brand", is(testCarTwo.getCarBrand())));
	}
}
