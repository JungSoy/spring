package com.carshop.board;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class BoardRepositoryImpl implements BoardRepository {

	private List<BoardDTO> listOfBoards = new ArrayList<BoardDTO>();
	
	public BoardRepositoryImpl() {
		
		BoardDTO board1 = new BoardDTO("가","소나타","aaa","2023-02-25");
		BoardDTO board2 = new BoardDTO("나","그랜저","bbb","2023-02-26");
		BoardDTO board3 = new BoardDTO("다","아반테","ccc","2023-02-27");
		
		listOfBoards.add(board1);
		listOfBoards.add(board2);
		listOfBoards.add(board3);
		
	}
	
	@Override
	public List<BoardDTO> getAllBoardList() {
		
		return listOfBoards;
	}

}
