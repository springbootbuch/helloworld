package de.springbootbuch.helloworld;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@WebMvcTest
public class ApplicationTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void helloWorldShouldWork() throws Exception {
		this.mockMvc
			.perform(
				get("/hello").param("name", "World"))
			.andExpect(status().isOk())
			.andExpect(
				content().string("Hello, World\n"));
	}
}
