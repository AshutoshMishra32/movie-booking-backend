package com.cg.movie;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.cg.movie.dao.TheatreRepository;
import com.cg.movie.entities.Theatre;
import com.cg.movie.services.TheatreServiceImpl;

@SpringBootTest
class TheatreTest {

	@Autowired
	TheatreServiceImpl theatreService;

	@MockBean
	TheatreRepository theatreRepo;

	@Test
	public void addTheatreTest() {
		Theatre theatre = new Theatre(new Long(1), "Xion", 5, "Mohit", 7973657728L);
		when(theatreRepo.save(theatre)).thenReturn(theatre);
		assertEquals(theatre, theatreService.addTheatre(theatre));
	}

}
