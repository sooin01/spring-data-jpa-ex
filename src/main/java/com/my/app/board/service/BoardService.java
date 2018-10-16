package com.my.app.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.my.app.board.model.Board;
import com.my.app.board.repository.BoardRepository;

@Service
public class BoardService {

	@Autowired
	private BoardRepository boardRepository;

	@Transactional(readOnly = true)
	public List<Board> findAll() {
		return boardRepository.findAll();
	}

}
