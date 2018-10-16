package com.my.app.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.my.app.board.model.Board;

@Repository
public interface BoardRepository extends JpaRepository<Board, Long> {

}
