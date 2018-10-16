package com.my.app.board.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.my.app.board.model.Board;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/spring/root-context.xml" })
public class BoardServiceTest {

	@Autowired
	private BoardService boardService;

	@Test
	public void testFindAll() {
		for (Board board : boardService.findAll()) {
			System.out.println(board);
		}
	}

}
