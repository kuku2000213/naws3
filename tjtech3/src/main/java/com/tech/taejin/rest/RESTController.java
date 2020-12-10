package com.tech.taejin.rest;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tech.taejin.rest.Entity.Board;

import lombok.extern.java.Log;

@Log
@RestController
@RequestMapping("/boards")
public class RESTController {

	@RequestMapping(value = "", method = RequestMethod.GET)
	public ResponseEntity<List<Board>>list(){
		
		log.info("[ LOG ] : RESTController/ResponseEntity");
		
		List<Board> boardList = new ArrayList<>();
		
		Board board = new Board();
		
		board.setBoardNo(1);
		board.setTitle("향수");
		board.setContent("넓은 벌 동쪽 끝으로");
		board.setWriter("hongkd");
		board.setRegDate(new Date());
		
		boardList.add(board);
		
		board = new Board();
		
		board.setBoardNo(2);
		board.setTitle("첫 마움");
		board.setContent("날마다 새러우며 깊어지고 넓어진다");
		board.setWriter("choi");
		board.setRegDate(new Date());
		
		boardList.add(board);
		
		ResponseEntity<List<Board>> entity = new ResponseEntity<>(boardList, HttpStatus.OK);
		
		return entity;
		
	}
	
}
